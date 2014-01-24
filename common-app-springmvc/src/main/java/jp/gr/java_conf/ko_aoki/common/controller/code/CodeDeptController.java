package jp.gr.java_conf.ko_aoki.common.controller.code;

import javax.validation.Valid;

import jp.gr.java_conf.ko_aoki.common.base.bean.PageBean;
import jp.gr.java_conf.ko_aoki.common.form.code.CodeDeptForm;
import jp.gr.java_conf.ko_aoki.common.service.code.CodeDeptService;

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

		//ページ込みで明細取得
		PageBean pb = new PageBean();
		pb.setCurPage(1);
		form.setPage(pb);
		this.codeDeptService.findDeptList(form);

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

		//ページ込みで明細取得
		this.codeDeptService.findDeptList(form);

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

}