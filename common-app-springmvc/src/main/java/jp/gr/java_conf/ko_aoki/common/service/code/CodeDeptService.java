package jp.gr.java_conf.ko_aoki.common.service.code;

import jp.gr.java_conf.ko_aoki.common.mapper.MDeptMapper;

public interface CodeDeptService {

	/**
	 * M_UDEPTテーブルのマッパークラスを取得します。
	 * @return M_DEPTテーブルのマッパークラス
	 */
	public MDeptMapper getmDeptMapper();
	/**
	 * M_USERテーブルのマッパークラスを設定します。
	 * @param mUserMapper M_USERテーブルのマッパークラス
	 */
	public void setmdeptMapper(MDeptMapper mDeptMapper);

}
