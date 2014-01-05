package jp.gr.java_conf.ko_aoki.common.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.bean.MntMUserBean;
import jp.gr.java_conf.ko_aoki.common.form.MntMUserForm;
import jp.gr.java_conf.ko_aoki.common.service.MntMUserService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
* 単純なコントローラ。
*/
@Controller
@RequestMapping("/mntMUser")
public class MntMUserController {

	private static final String FORM_NAME = "mntMUserForm";
	@Autowired
	MntMUserService mntMUserService;

	// ①command の初期オブジェクトの取得
	@ModelAttribute(FORM_NAME)
	public MntMUserForm createInitForm() {
		MntMUserForm form = new MntMUserForm();
	return form;
	}

	// ②初期値の設定
	@RequestMapping(method=RequestMethod.GET)
	public void setupForm(Model model) {
		MntMUserForm form = createInitForm();
		model.addAttribute(FORM_NAME, form);
	}

	// ③post で送られた場合
	@RequestMapping(method=RequestMethod.POST, params="find")
	public ModelAndView find(@ModelAttribute(FORM_NAME) MntMUserForm form,
	BindingResult bindingResult) {
//		// command の各項目のエラーチェック
//		if(StringUtils.isEmpty(form.getUserId())) {
//			bindingResult.rejectValue("userId", "error.required");
//		}
//
//		// 共通のエラーチェック
//		if(bindingResult.hasErrors()) {
//			bindingResult.reject("error.message");
//		}
		//エラーがある場合（もとの画面へ戻る）
		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView();
			mav.getModel().putAll(bindingResult.getModel());
			return mav;
		}

		Map<String,String> prm = new HashMap<String,String>();
		if (StringUtils.isNotEmpty(form.getUserNm())) {
			prm.put("userNm", "%" + form.getUserNm() + "%");
		}
		prm.put("targetDate",getFormatCurDateString());
		if (StringUtils.isNotEmpty(form.getDeptId1())) {
			prm.put("pDeptId", form.getDeptId1());
		}
		if (StringUtils.isNotEmpty(form.getDeptId1())) {
			prm.put("deptId", form.getDeptId2());
		}
		if (StringUtils.isNotEmpty(form.getRoleId())) {
			prm.put("roleId", form.getRoleId());
		}
		List<MntMUserBean> UserList = mntMUserService.getmUserMapper().selectMntMUserList(prm);

		List<MntMUserForm.MeiMntMUserForm> recs = new ArrayList<MntMUserForm.MeiMntMUserForm>();
		for (MntMUserBean m : UserList) {
            MntMUserForm.MeiMntMUserForm rec = form.new MeiMntMUserForm();
            rec.setUserIdM(m.getUserId());
            rec.setUserNmM(m.getUserNm());
            rec.setpDeptIdM(m.getpDeptId());
            rec.setpDeptNmM(m.getpDeptNm());
            rec.setDeptIdM(m.getDeptId());
            rec.setDeptNmM(m.getDeptNm());
            rec.setRoleIdM(m.getRoleId());
            rec.setRoleNmM(m.getRoleNm());
            recs.add(rec);
        }
		form.setMei(recs);
		ModelAndView mav = new ModelAndView();
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

    private String getFormatCurDateString() {
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    return sdf.format(date);
    }

    //	@RequestMapping(method=RequestMethod.POST)
//	public String find(
//			@Valid MntMUserForm form, Errors errors) {
//
//		MUserExample mUserExample = new MUserExample();
//		mUserExample.createCriteria()
//		.andUserIdEqualTo(form.getUserId())
//		.andPasswordEqualTo(form.getPwd());
//
//		Map<String,String> prm = new HashMap<String,String>();
//		prm.put("userId", form.getUserId());
//		prm.put("password", form.getPwd());
//		int cnt = mntMUserService.getmUserMapper().countMUserMntMUser(prm);
//
//		if (errors.hasErrors()) {
//			errors.reject("error.message");
//			return "mntMUser";
//		}
//
//		return "mntMUser";
//	}

}