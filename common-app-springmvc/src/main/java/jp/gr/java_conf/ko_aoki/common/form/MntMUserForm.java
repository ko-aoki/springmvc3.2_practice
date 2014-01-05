package jp.gr.java_conf.ko_aoki.common.form;

import java.io.Serializable;
import java.util.List;

public class MntMUserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userNm;
    private String userId;
    private String deptNm1;
    private String deptId1;
    private String deptNm2;
    private String deptId2;
    private String roleId;

    private List<MeiMntMUserForm> mei;

    public class MeiMntMUserForm implements Serializable {

		private String userNmM;
        private String userIdM;
        private String deptNmM;
        private String deptIdM;
        private String pDeptNmM;
        private String pDeptIdM;
        private String roleIdM;
        private String roleNmM;
        private String startDateM;
        private String endDateM;

        public String getUserNmM() {
			return userNmM;
		}
		public void setUserNmM(String userNmM) {
			this.userNmM = userNmM;
		}
		public String getUserIdM() {
			return userIdM;
		}
		public void setUserIdM(String userIdM) {
			this.userIdM = userIdM;
		}
		public String getDeptNmM() {
			return deptNmM;
		}
		public void setDeptNmM(String deptNmM) {
			this.deptNmM = deptNmM;
		}
		public String getDeptIdM() {
			return deptIdM;
		}
		public void setDeptIdM(String deptIdM) {
			this.deptIdM = deptIdM;
		}
		public String getpDeptNmM() {
			return pDeptNmM;
		}
		public void setpDeptNmM(String pDeptNmM) {
			this.pDeptNmM = pDeptNmM;
		}
		public String getpDeptIdM() {
			return pDeptIdM;
		}
		public void setpDeptIdM(String pDeptIdM) {
			this.pDeptIdM = pDeptIdM;
		}
		public String getRoleIdM() {
			return roleIdM;
		}
		public void setRoleIdM(String roleIdM) {
			this.roleIdM = roleIdM;
		}
		public String getRoleNmM() {
			return roleNmM;
		}
		public void setRoleNmM(String roleNmM) {
			this.roleNmM = roleNmM;
		}
		public String getStartDateM() {
			return startDateM;
		}
		public void setStartDateM(String startDateM) {
			this.startDateM = startDateM;
		}
		public String getEndDateM() {
			return endDateM;
		}
		public void setEndDateM(String endDateM) {
			this.endDateM = endDateM;
		}
    }

	/**
	 * userNmを取得します。
	 * @return userNm
	 */
	public String getUserNm() {
	    return userNm;
	}

	/**
	 * userNmを設定します。
	 * @param userNm userNm
	 */
	public void setUserNm(String userNm) {
	    this.userNm = userNm;
	}

	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public String getUserId() {
	    return userId;
	}

	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(String userId) {
	    this.userId = userId;
	}

	/**
	 * deptNm1を取得します。
	 * @return deptNm1
	 */
	public String getDeptNm1() {
	    return deptNm1;
	}

	/**
	 * deptNm1を設定します。
	 * @param deptNm1 deptNm1
	 */
	public void setDeptNm1(String deptNm1) {
	    this.deptNm1 = deptNm1;
	}

	/**
	 * deptId1を取得します。
	 * @return deptId1
	 */
	public String getDeptId1() {
	    return deptId1;
	}

	/**
	 * deptId1を設定します。
	 * @param deptId1 deptId1
	 */
	public void setDeptId1(String deptId1) {
	    this.deptId1 = deptId1;
	}

	/**
	 * deptNm2を取得します。
	 * @return deptNm2
	 */
	public String getDeptNm2() {
	    return deptNm2;
	}

	/**
	 * deptNm2を設定します。
	 * @param deptNm2 deptNm2
	 */
	public void setDeptNm2(String deptNm2) {
	    this.deptNm2 = deptNm2;
	}

	/**
	 * deptId2を取得します。
	 * @return deptId2
	 */
	public String getDeptId2() {
	    return deptId2;
	}

	/**
	 * deptId2を設定します。
	 * @param deptId2 deptId2
	 */
	public void setDeptId2(String deptId2) {
	    this.deptId2 = deptId2;
	}

	/**
	 * roleIdを取得します。
	 * @return roleId
	 */
	public String getRoleId() {
	    return roleId;
	}

	/**
	 * roleIdを設定します。
	 * @param roleId roleId
	 */
	public void setRoleId(String roleId) {
	    this.roleId = roleId;
	}

	/**
	 * meiを取得します。
	 * @return mei
	 */
	public List<MeiMntMUserForm> getMei() {
	    return mei;
	}

	/**
	 * meiを設定します。
	 * @param mei mei
	 */
	public void setMei(List<MeiMntMUserForm> mei) {
	    this.mei = mei;
	}
}
