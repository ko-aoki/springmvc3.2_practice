package jp.gr.java_conf.ko_aoki.common.service.impl.code;

import jp.gr.java_conf.ko_aoki.common.mapper.MDeptMapper;
import jp.gr.java_conf.ko_aoki.common.service.code.CodeDeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeDeptServiceImpl implements CodeDeptService{

	/** M_DEPTテーブルのマッパークラス */
	@Autowired
	private MDeptMapper mDeptMapper;

	@Override
	public MDeptMapper getmDeptMapper() {
		return this.mDeptMapper;
	}

	@Override
	public void setmdeptMapper(MDeptMapper mDeptMapper) {
		this.mDeptMapper = mDeptMapper;
	}


}
