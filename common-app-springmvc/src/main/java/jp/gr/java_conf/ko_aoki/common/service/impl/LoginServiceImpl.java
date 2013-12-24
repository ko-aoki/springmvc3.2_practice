package jp.gr.java_conf.ko_aoki.common.service.impl;

import jp.gr.java_conf.ko_aoki.common.mapper.MUserMapper;
import jp.gr.java_conf.ko_aoki.common.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

	/** M_USERテーブルのマッパークラス */
	@Autowired
	private MUserMapper mUserMapper;

	/**
	 * M_USERテーブルのマッパークラスを取得します。
	 * @return M_USERテーブルのマッパークラス
	 */
	public MUserMapper getmUserMapper() {
	    return mUserMapper;
	}

	/**
	 * M_USERテーブルのマッパークラスを設定します。
	 * @param mUserMapper M_USERテーブルのマッパークラス
	 */
	public void setmUserMapper(MUserMapper mUserMapper) {
	    this.mUserMapper = mUserMapper;
	}

}
