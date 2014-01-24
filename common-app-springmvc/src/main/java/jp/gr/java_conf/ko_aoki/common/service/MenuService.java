package jp.gr.java_conf.ko_aoki.common.service;

import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.bean.HierarchicalMenuBean;

public interface MenuService {

	List<HierarchicalMenuBean> selectHierarchicalMenu(Map<String,String> prm);

}
