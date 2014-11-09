package jp.gr.java_conf.ko_aoki.common.service.impl;

import jp.gr.java_conf.ko_aoki.common.domain.MUser;
import jp.gr.java_conf.ko_aoki.common.form.MntMUserRegForm;
import jp.gr.java_conf.ko_aoki.common.mapper.MUserMapper;
import jp.gr.java_conf.ko_aoki.common.service.MntMUserRegService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MntMUserRegServiceImpl implements MntMUserRegService{

	/** M_USERテーブルのマッパークラス */
	@Autowired
	private MUserMapper mapper;

	@Override
	public void insertMUser(MntMUserRegForm form) {
		MUser et = new MUser();
		convFormToEntity(form, et);
		mapper.insert(et);
	}

	@Override
	public void updateMUser(MntMUserRegForm form) {
		MUser et = new MUser();
		convFormToEntity(form, et);
		mapper.updateByPrimaryKey(et);
	}

	private void convFormToEntity(MntMUserRegForm form, MUser et) {
		et.setUserId(form.getUserId());
		et.setUsernmSei(form.getUserNmSei());
		et.setUsernmMei(form.getUserNmMei());
		et.setRoleId(form.getRoleId());
		et.setDeptId(form.getDeptId());
		et.setStartDate(form.getStartDate());
		et.setEndDate(form.getEndDate());
	}

}
