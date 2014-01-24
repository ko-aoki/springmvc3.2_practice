package jp.gr.java_conf.ko_aoki.common.controller;

import jp.gr.java_conf.ko_aoki.common.form.MntMUserRegForm;
import jp.gr.java_conf.ko_aoki.common.service.MntMUserRegService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
* ユーザマスタメンテ画面コントローラクラス。
*/
@Controller
@RequestMapping("/mntMUserReg")
public class MntMUserRegController {

	public static final String FORM_NAME = "mntMUserRegForm";

	@Autowired
	MntMUserRegService mntMUserRegService;

	@ModelAttribute(FORM_NAME)
	public MntMUserRegForm createInitForm() {
		MntMUserRegForm form = new MntMUserRegForm();
		return form;
	}

	@RequestMapping(method=RequestMethod.GET)
	public void setupForm(Model model) {
		MntMUserRegForm form = createInitForm();
		model.addAttribute(FORM_NAME, form);
	}

	@RequestMapping(method=RequestMethod.POST, params="confirm")
	public ModelAndView confirm(@ModelAttribute(FORM_NAME) MntMUserRegForm form,
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

//		mntMUserRegService.updateMUser(form);

		ModelAndView mav = new ModelAndView("/mntMUserRegConfirm");
		mav.getModelMap().addAttribute(FORM_NAME, form);
		return mav;
	}

	@RequestMapping(method=RequestMethod.POST, params="register")
	public ModelAndView register(@ModelAttribute(FORM_NAME) MntMUserRegForm form,
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

		mntMUserRegService.updateMUser(form);

		ModelAndView mav = new ModelAndView("/mntMUserRegConfirm");
		mav.getModelMap().addAttribute(FORM_NAME, form);
		mav.addObject("messageNormal","登録終了しました。");
		return mav;
	}

}