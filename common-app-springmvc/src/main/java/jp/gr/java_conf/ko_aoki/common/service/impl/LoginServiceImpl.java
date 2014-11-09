package jp.gr.java_conf.ko_aoki.common.service.impl;

import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.mapper.MUserMapper;
import jp.gr.java_conf.ko_aoki.common.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class LoginServiceImpl implements LoginService{

	/** M_USERテーブルのマッパークラス */
	@Autowired
	private MUserMapper mapper;

	public int countMUserLogin(Map<String,String> prm) {
		return mapper.countMUserLogin(prm);
	}

}
