package jp.gr.java_conf.ko_aoki.common.service;

import jp.gr.java_conf.ko_aoki.common.mapper.MUserMapper;

public interface MntMUserService {

	/**
	 * M_USERテーブルのマッパークラスを取得します。
	 * @return M_USERテーブルのマッパークラス
	 */
	public MUserMapper getmUserMapper();
	/**
	 * M_USERテーブルのマッパークラスを設定します。
	 * @param mUserMapper M_USERテーブルのマッパークラス
	 */
	public void setmUserMapper(MUserMapper mUserMapper);

}
