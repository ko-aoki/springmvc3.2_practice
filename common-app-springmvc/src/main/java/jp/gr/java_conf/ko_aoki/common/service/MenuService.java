package jp.gr.java_conf.ko_aoki.common.service;

import jp.gr.java_conf.ko_aoki.common.mapper.MMenuMapper;

public interface MenuService {

	/**
	 * M_MENUテーブルのマッパークラスを取得します。
	 * @return M_MENUテーブルのマッパークラス
	 */
	public MMenuMapper getmMenuMapper();
	/**
	 * M_MENUテーブルのマッパークラスを設定します。
	 * @param mMenuMapper M_MENUテーブルのマッパークラス
	 */
	public void setmMenuMapper(MMenuMapper mMenuMapper);

}
