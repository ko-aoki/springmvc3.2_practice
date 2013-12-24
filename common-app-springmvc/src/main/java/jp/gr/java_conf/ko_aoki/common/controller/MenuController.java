package jp.gr.java_conf.ko_aoki.common.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.base.MenuHandler;
import jp.gr.java_conf.ko_aoki.common.bean.HierarchicalMenuBean;
import jp.gr.java_conf.ko_aoki.common.bean.MenuBean;
import jp.gr.java_conf.ko_aoki.common.service.MenuService;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* 単純なコントローラ。
*/
@Controller
public class MenuController {

	@Autowired
	MenuService menuService;

	@RequestMapping("/menu")
	public String menu(Model model) {
		Map<String,String> prm = new HashMap<String,String>();
		List<HierarchicalMenuBean> menuList = menuService.getmMenuMapper().selectHierarchicalMenu(prm);
		MenuHandler handler = new MenuHandler();
		ArrayList<String> paths = new ArrayList<String>();
		for(HierarchicalMenuBean bean : menuList) {
            String menu = bean.getPath() + (bean.getUrl() == null ? "" : ":" + bean.getUrl());
			paths.add(menu);
		}

		ArrayList<MenuBean> menus = handler.createMenu(paths);

        ObjectMapper om = new ObjectMapper();
        String menuJson = "";
        try {
            menuJson = om.writeValueAsString(menus);
            System.out.println(menuJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
		}

		model.addAttribute("menuJson",menuJson);
		return null;
	}


}