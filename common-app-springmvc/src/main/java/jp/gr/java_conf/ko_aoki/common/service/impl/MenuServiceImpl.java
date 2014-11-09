package jp.gr.java_conf.ko_aoki.common.service.impl;

import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.bean.HierarchicalMenuBean;
import jp.gr.java_conf.ko_aoki.common.mapper.MMenuMapper;
import jp.gr.java_conf.ko_aoki.common.service.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MenuServiceImpl implements MenuService{

	/** M_MENUテーブルのマッパークラス */
	@Autowired
	private MMenuMapper mapper;

	public List<HierarchicalMenuBean> selectHierarchicalMenu(Map<String,String> prm) {
		return mapper.selectHierarchicalMenu(prm);
	}

}
