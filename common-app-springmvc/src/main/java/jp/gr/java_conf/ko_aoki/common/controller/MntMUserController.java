package jp.gr.java_conf.ko_aoki.common.controller;

import jp.gr.java_conf.ko_aoki.common.form.MeiMntMUserForm;
import jp.gr.java_conf.ko_aoki.common.form.MntMUserForm;
import jp.gr.java_conf.ko_aoki.common.form.MntMUserRegForm;
import jp.gr.java_conf.ko_aoki.common.service.MntMUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
* ユーザマスタメンテ画面コントローラクラス。
*/
@Controller
@RequestMapping("/mntMUser")
public class MntMUserController {

	private static final String FORM_NAME = "mntMUserForm";

	@Autowired
	MntMUserService mntMUserService;

	@ModelAttribute(FORM_NAME)
	public MntMUserForm createInitForm() {
		MntMUserForm form = new MntMUserForm();
		return form;
	}

	@RequestMapping(method=RequestMethod.GET)
	public void setupForm(Model model) {
		MntMUserForm form = createInitForm();
		model.addAttribute(FORM_NAME, form);
	}

	@RequestMapping(method=RequestMethod.POST, params="find")
	public ModelAndView find(@ModelAttribute(FORM_NAME) MntMUserForm form,
	BindingResult bindingResult) {

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

		mntMUserService.selectMntMUserList(form);

		ModelAndView mav = new ModelAndView();
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

	@RequestMapping(method=RequestMethod.POST, params="modify")
	public ModelAndView modify(@RequestParam(value="meiCount") Integer meiCount, @ModelAttribute(FORM_NAME) MntMUserForm form,
	BindingResult bindingResult) {

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

		ModelAndView mav = new ModelAndView("mntMUserReg");
		MntMUserRegForm rForm = new MntMUserRegForm();
		MeiMntMUserForm mei = form.getMei().get(meiCount);
		rForm.setUserId(mei.getUserIdM());
		String[] userNm = mei.getUserNmM().split(" ");
		rForm.setUserNmSei(userNm[0]);
		rForm.setUserNmMei(userNm[1]);
		rForm.setDeptId(mei.getDeptIdM());
		rForm.setDeptNm(mei.getDeptNmM());
		rForm.setRoleId(mei.getRoleIdM());
		rForm.setStartDate(mei.getStartDateM());
		rForm.setEndDate(mei.getEndDateM());
		mav.getModelMap().addAttribute(MntMUserRegController.FORM_NAME, rForm);
		return mav;
	}

	@RequestMapping(method=RequestMethod.POST, params="register")
	public ModelAndView register(@ModelAttribute(FORM_NAME) MntMUserForm form,
	BindingResult bindingResult) {

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

		ModelAndView mav = new ModelAndView();
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

}