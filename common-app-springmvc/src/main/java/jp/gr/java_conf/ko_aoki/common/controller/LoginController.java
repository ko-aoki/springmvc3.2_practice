package jp.gr.java_conf.ko_aoki.common.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import jp.gr.java_conf.ko_aoki.common.form.LoginForm;
import jp.gr.java_conf.ko_aoki.common.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
* 単純なコントローラ。
*/
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	// ①command の初期オブジェクトの取得
	@ModelAttribute("loginForm")
	public LoginForm createInitForm() {
		LoginForm form = new LoginForm();
	return form;
	}

	// ②初期値の設定
	@RequestMapping(method=RequestMethod.GET)
	public void setupForm(Model model) {
		LoginForm form = createInitForm();
		model.addAttribute("loginForm", form);
	}

	// ③post で送られた場合
//	@RequestMapping(method=RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("loginForm") LoginForm form,
//	BindingResult bindingResult) {
////		// command の各項目のエラーチェック
////		if(StringUtils.isEmpty(form.getUserId())) {
////			bindingResult.rejectValue("userId", "error.required");
////		}
////
////		// 共通のエラーチェック
////		if(bindingResult.hasErrors()) {
////			bindingResult.reject("error.message");
////		}
//		//エラーがある場合（もとの画面へ戻る）
//		if(bindingResult.hasErrors()) {
//			ModelAndView mav = new ModelAndView();
//			mav.getModel().putAll(bindingResult.getModel());
//			return mav;
//		}
////		ModelAndView mav = new ModelAndView("forward:/menu.jsp");
//		ModelAndView mav = new ModelAndView("forward:/login.jsp");
//		return mav;
//	}

	@RequestMapping(method=RequestMethod.POST)
	public String login(
			@Valid LoginForm form, Errors errors) {

		Map<String,String> prm = new HashMap<String,String>();
		prm.put("userId", form.getUserId());
		prm.put("password", form.getPwd());
		int cnt = loginService.getmUserMapper().countMUserLogin(prm);

		if (errors.hasErrors()) {
			errors.reject("error.message");
			return "login";
		}

		return "login";
	}

}