package jp.gr.java_conf.ko_aoki.common.form;

import java.io.Serializable;

public class MntMUserRegForm  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String userNmSei;

    private String userNmMei;

    private String deptId;

    private String deptNm;

    private String roleId;

    private String startDate;

    private String endDate;

    private String confirm;

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
	 * userNmSeiを取得します。
	 * @return userNmSei
	 */
	public String getUserNmSei() {
	    return userNmSei;
	}

	/**
	 * userNmSeiを設定します。
	 * @param userNmSei userNmSei
	 */
	public void setUserNmSei(String userNmSei) {
	    this.userNmSei = userNmSei;
	}

	/**
	 * userNmMeiを取得します。
	 * @return userNmMei
	 */
	public String getUserNmMei() {
	    return userNmMei;
	}

	/**
	 * userNmMeiを設定します。
	 * @param userNmMei userNmMei
	 */
	public void setUserNmMei(String userNmMei) {
	    this.userNmMei = userNmMei;
	}

	/**
	 * deptIdを取得します。
	 * @return deptId
	 */
	public String getDeptId() {
	    return deptId;
	}

	/**
	 * deptIdを設定します。
	 * @param deptId deptId
	 */
	public void setDeptId(String deptId) {
	    this.deptId = deptId;
	}

	/**
	 * deptNmを取得します。
	 * @return deptNm
	 */
	public String getDeptNm() {
	    return deptNm;
	}

	/**
	 * deptNmを設定します。
	 * @param deptNm deptNm
	 */
	public void setDeptNm(String deptNm) {
	    this.deptNm = deptNm;
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
	 * startDateを取得します。
	 * @return startDate
	 */
	public String getStartDate() {
	    return startDate;
	}

	/**
	 * startDateを設定します。
	 * @param startDate startDate
	 */
	public void setStartDate(String startDate) {
	    this.startDate = startDate;
	}

	/**
	 * endDateを取得します。
	 * @return endDate
	 */
	public String getEndDate() {
	    return endDate;
	}

	/**
	 * endDateを設定します。
	 * @param endDate endDate
	 */
	public void setEndDate(String endDate) {
	    this.endDate = endDate;
	}

	/**
	 * confirmを取得します。
	 * @return confirm
	 */
	public String getConfirm() {
	    return confirm;
	}

	/**
	 * confirmを設定します。
	 * @param confirm confirm
	 */
	public void setConfirm(String confirm) {
	    this.confirm = confirm;
	}
}
