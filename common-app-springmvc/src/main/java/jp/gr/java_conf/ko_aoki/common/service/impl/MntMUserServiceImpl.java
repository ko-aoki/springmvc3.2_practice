package jp.gr.java_conf.ko_aoki.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.bean.MntMUserBean;
import jp.gr.java_conf.ko_aoki.common.form.MeiMntMUserForm;
import jp.gr.java_conf.ko_aoki.common.form.MntMUserForm;
import jp.gr.java_conf.ko_aoki.common.mapper.MUserMapper;
import jp.gr.java_conf.ko_aoki.common.service.MntMUserService;
import jp.gr.java_conf.ko_aoki.common.util.DateUtil;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MntMUserServiceImpl implements MntMUserService{

	/** M_USERテーブルのマッパークラス */
	@Autowired
	private MUserMapper mapper;

	public void selectMntMUserList(MntMUserForm form) {
		Map<String,String> prm = new HashMap<String,String>();
		if (StringUtils.isNotEmpty(form.getUserNm())) {
			prm.put("userNm", "%" + form.getUserNm() + "%");
		}
		prm.put("targetDate", DateUtil.getFormatCurDateString());
		if (StringUtils.isNotEmpty(form.getDeptId1())) {
			prm.put("pDeptId", form.getDeptId1());
		}
		if (StringUtils.isNotEmpty(form.getDeptId1())) {
			prm.put("deptId", form.getDeptId2());
		}
		if (StringUtils.isNotEmpty(form.getRoleId())) {
			prm.put("roleId", form.getRoleId());
		}
		List<MntMUserBean> UserList = mapper.selectMntMUserList(prm);

		List<MeiMntMUserForm> recs = new ArrayList<MeiMntMUserForm>();
		for (MntMUserBean m : UserList) {
            MeiMntMUserForm rec = new MeiMntMUserForm();
            rec.setUserIdM(m.getUserId());
            rec.setUserNmM(m.getUserNm());
            rec.setpDeptIdM(m.getpDeptId());
            rec.setpDeptNmM(m.getpDeptNm());
            rec.setDeptIdM(m.getDeptId());
            rec.setDeptNmM(m.getDeptNm());
            rec.setRoleIdM(m.getRoleId());
            rec.setRoleNmM(m.getRoleNm());
            rec.setStartDateM(m.getStartDate());
            rec.setEndDateM(m.getEndDate());
            recs.add(rec);
        }
		form.setMei(recs);
	}

}
