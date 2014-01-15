package jp.gr.java_conf.ko_aoki.common.controller.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import jp.gr.java_conf.ko_aoki.common.base.PageBuilder;
import jp.gr.java_conf.ko_aoki.common.base.bean.PageBean;
import jp.gr.java_conf.ko_aoki.common.bean.code.CodeDeptBean;
import jp.gr.java_conf.ko_aoki.common.form.code.CodeDeptForm;
import jp.gr.java_conf.ko_aoki.common.service.code.CodeDeptService;
import jp.gr.java_conf.ko_aoki.common.util.DateUtil;

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
@RequestMapping("/code/codeDept")
public class CodeDeptController {

	private static final String FORM_NAME = "codeDeptForm";
	@Autowired
	CodeDeptService codeDeptService;

	// ①command の初期オブジェクトの取得
	@ModelAttribute("codeDeptForm")
	public CodeDeptForm createInitForm() {
		CodeDeptForm form = new CodeDeptForm();
	return form;
	}

	// ②初期値の設定
	@RequestMapping(method=RequestMethod.GET)
	public void setupForm(Model model) {
		CodeDeptForm form = createInitForm();
		model.addAttribute("codeDeptForm", form);
	}

	// ③post で送られた場合
	@RequestMapping(method=RequestMethod.POST, params="find")
	public ModelAndView find(
			@Valid CodeDeptForm form, 	BindingResult bindingResult) {

		PageBean pb = new PageBean();
		pb.setCurPage(1);
		form.setPage(pb);
		List<CodeDeptForm.MeiCodeDeptForm> recs = findDeptList(form);
		form.setMei(recs);

		if(bindingResult.hasErrors()) {
			bindingResult.reject("error.message");
			ModelAndView mav = new ModelAndView();
			mav.getModel().putAll(bindingResult.getModel());
			return mav;
		}

		ModelAndView mav = new ModelAndView();
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

	@RequestMapping(params="pageJump")
	public ModelAndView pageJump(
			@Valid CodeDeptForm form, 	BindingResult bindingResult) {

		List<CodeDeptForm.MeiCodeDeptForm> recs = findDeptList(form);
		form.setMei(recs);

		if(bindingResult.hasErrors()) {
			bindingResult.reject("error.message");
			ModelAndView mav = new ModelAndView();
			mav.getModel().putAll(bindingResult.getModel());
			return mav;
		}

		ModelAndView mav = new ModelAndView();
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

	private List<CodeDeptForm.MeiCodeDeptForm> findDeptList(CodeDeptForm form) {
		Map<String,Object> prm = new HashMap<String,Object>();
		prm.put("targetDate", DateUtil.getFormatCurDateString());
		if (StringUtils.isNotEmpty(form.getDeptId())) {
			prm.put("deptId", form.getDeptId());
		}
		if (StringUtils.isNotEmpty(form.getpDeptId())) {
			prm.put("pDeptId", form.getpDeptId());
		}
		if (StringUtils.isNotEmpty(form.getpDeptNm())) {
			prm.put("pDeptNm", "%" + form.getpDeptNm() + "%");
		}
		if (StringUtils.isNotEmpty(form.getDeptNm())) {
			prm.put("deptNm", "%" + form.getDeptNm()+ "%") ;
		}

		int cnt = codeDeptService.getmDeptMapper().selectCountLevel1to2Dept(prm);
		PageBuilder pb = new PageBuilder();
		PageBean page = pb.build(form.getPage().getCurPage(), 5, cnt, 3);
		prm.put("page", page);
		List<CodeDeptBean> list = codeDeptService.getmDeptMapper().selectLevel1to2DeptList(prm);

		form.setPage(page);
		List<CodeDeptForm.MeiCodeDeptForm> recs = new ArrayList<CodeDeptForm.MeiCodeDeptForm>();
		for (CodeDeptBean m : list) {
            CodeDeptForm.MeiCodeDeptForm rec = form.new MeiCodeDeptForm();
            rec.setpDeptId(m.getpDeptId());
            rec.setpDeptNm(m.getpDeptNm());
            rec.setDeptId(m.getDeptId());
            rec.setDeptNm(m.getDeptNm());
            recs.add(rec);
		}
		return recs;
	}

}