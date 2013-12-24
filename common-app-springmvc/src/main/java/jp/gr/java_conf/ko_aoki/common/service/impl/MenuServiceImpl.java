package jp.gr.java_conf.ko_aoki.common.service.impl;

import jp.gr.java_conf.ko_aoki.common.mapper.MMenuMapper;
import jp.gr.java_conf.ko_aoki.common.service.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{

	/** M_MENUテーブルのマッパークラス */
	@Autowired
	private MMenuMapper mMenuMapper;

	/**
	 * M_MENUテーブルのマッパークラスを取得します。
	 * @return M_MENUテーブルのマッパークラス
	 */
	public MMenuMapper getmMenuMapper() {
	    return mMenuMapper;
	}

	/**
	 * M_MENUテーブルのマッパークラスを設定します。
	 * @param mMenuMapper M_MENUテーブルのマッパークラス
	 */
	public void setmMenuMapper(MMenuMapper mMenuMapper) {
	    this.mMenuMapper = mMenuMapper;
	}

}
