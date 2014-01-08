package jp.gr.java_conf.ko_aoki.common.controller.code;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import jp.gr.java_conf.ko_aoki.common.form.code.CodeDeptForm;
import jp.gr.java_conf.ko_aoki.common.service.code.CodeDeptService;

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
@RequestMapping("/code/codeDept")
public class CodeDeptController {

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
	@RequestMapping(method=RequestMethod.POST)
	public String find(
			@Valid CodeDeptForm form, Errors errors) {

		Map<String,String> prm = new HashMap<String,String>();
//		prm.put("userId", form.getUserId());
//		prm.put("password", form.getPwd());
//		int cnt = codeDeptService.getmUserMapper().countMUserLogin(prm);

		if (errors.hasErrors()) {
			errors.reject("error.message");
			return "";
		}

		return "";
	}

}