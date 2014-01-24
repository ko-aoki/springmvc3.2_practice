package jp.gr.java_conf.ko_aoki.common.service.impl.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.gr.java_conf.ko_aoki.common.base.PageBuilder;
import jp.gr.java_conf.ko_aoki.common.base.bean.PageBean;
import jp.gr.java_conf.ko_aoki.common.bean.code.CodeDeptBean;
import jp.gr.java_conf.ko_aoki.common.form.code.CodeDeptForm;
import jp.gr.java_conf.ko_aoki.common.mapper.MDeptMapper;
import jp.gr.java_conf.ko_aoki.common.service.code.CodeDeptService;
import jp.gr.java_conf.ko_aoki.common.util.DateUtil;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeDeptServiceImpl implements CodeDeptService{

	/** M_DEPTテーブルのマッパークラス */
	@Autowired
	private MDeptMapper mapper;

	public void findDeptList(CodeDeptForm form) {
		Map<String,Object> prm = new HashMap<String,Object>();
		prm.put("targetDate", DateUtil.getFormatCurDateString());
		if (StringUtils.isNotEmpty(form.getDeptId())) {
			prm.put("deptId", form.getDeptId());
		}
		if (StringUtils.isNotEmpty(form.getpDeptId())) {
			prm.put("pDeptId", form.getpDeptId());
		}
		if (StringUtils.isNotEmpty(form.getpDeptNm())) {
			prm.put("pDeptNm", "%" + form.getpDeptNm() + "%");
		}
		if (StringUtils.isNotEmpty(form.getDeptNm())) {
			prm.put("deptNm", "%" + form.getDeptNm()+ "%") ;
		}

		int cnt = mapper.selectCountLevel1to2Dept(prm);
		PageBuilder pb = new PageBuilder();
		PageBean page = pb.build(form.getPage().getCurPage(), 5, cnt, 3);
		prm.put("page", page);
		List<CodeDeptBean> list = mapper.selectLevel1to2DeptList(prm);

		form.setPage(page);
		List<CodeDeptForm.MeiCodeDeptForm> recs = new ArrayList<CodeDeptForm.MeiCodeDeptForm>();
		for (CodeDeptBean m : list) {
            CodeDeptForm.MeiCodeDeptForm rec = form.new MeiCodeDeptForm();
            rec.setpDeptId(m.getpDeptId());
            rec.setpDeptNm(m.getpDeptNm());
            rec.setDeptId(m.getDeptId());
            rec.setDeptNm(m.getDeptNm());
            recs.add(rec);
		}
		form.setMei(recs);
	}

}
