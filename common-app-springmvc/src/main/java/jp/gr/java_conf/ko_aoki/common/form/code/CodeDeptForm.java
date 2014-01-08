package jp.gr.java_conf.ko_aoki.common.form.code;

import java.io.Serializable;
import java.util.List;

public class CodeDeptForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ページ番号 */
    private Integer pageNumber = 0;
	/** 親部門ID */
    private String pDeptId;
	/** 親部門名称 */
    private String pDeptNm;
	/** 部門ID */
    private String deptId;
	/** 部門名称 */
    private String deptNm;
    /** 明細 */
    private List<MeiCodeDeptForm> mei;

    public class MeiCodeDeptForm {

    	/** 親部門ID */
        private String pDeptId;
    	/** 親部門名称 */
        private String pDeptNm;
    	/** 部門ID */
        private String deptId;
    	/** 部門名称 */
        private String deptNm;
    	/**
    	 * 親部門IDを取得します。
    	 * @return 親部門ID
    	 */
    	public String getpDeptId() {
    	    return pDeptId;
    	}

    	/**
    	 * 親部門IDを設定します。
    	 * @param pDeptId 親部門ID
    	 */
    	public void setpDeptId(String pDeptId) {
    	    this.pDeptId = pDeptId;
    	}

    	/**
    	 * 親部門名称を取得します。
    	 * @return 親部門名称
    	 */
    	public String getpDeptNm() {
    	    return pDeptNm;
    	}

    	/**
    	 * 親部門名称を設定します。
    	 * @param pDeptNm 親部門名称
    	 */
    	public void setpDeptNm(String pDeptNm) {
    	    this.pDeptNm = pDeptNm;
    	}

    	/**
    	 * 部門IDを取得します。
    	 * @return 部門ID
    	 */
    	public String getDeptId() {
    	    return deptId;
    	}

    	/**
    	 * 部門IDを設定します。
    	 * @param deptId 部門ID
    	 */
    	public void setDeptId(String deptId) {
    	    this.deptId = deptId;
    	}

    	/**
    	 * 部門名称を取得します。
    	 * @return 部門名称
    	 */
    	public String getDeptNm() {
    	    return deptNm;
    	}

    	/**
    	 * 部門名称を設定します。
    	 * @param deptNm 部門名称
    	 */
    	public void setDeptNm(String deptNm) {
    	    this.deptNm = deptNm;
    	}

    }

	/**
	 * ページ番号を取得します。
	 * @return ページ番号
	 */
	public Integer getPageNumber() {
	    return pageNumber;
	}

	/**
	 * ページ番号を設定します。
	 * @param pageNumber ページ番号
	 */
	public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	}

	/**
	 * 親部門IDを取得します。
	 * @return 親部門ID
	 */
	public String getpDeptId() {
	    return pDeptId;
	}

	/**
	 * 親部門IDを設定します。
	 * @param pDeptId 親部門ID
	 */
	public void setpDeptId(String pDeptId) {
	    this.pDeptId = pDeptId;
	}

	/**
	 * 親部門名称を取得します。
	 * @return 親部門名称
	 */
	public String getpDeptNm() {
	    return pDeptNm;
	}

	/**
	 * 親部門名称を設定します。
	 * @param pDeptNm 親部門名称
	 */
	public void setpDeptNm(String pDeptNm) {
	    this.pDeptNm = pDeptNm;
	}

	/**
	 * 部門IDを取得します。
	 * @return 部門ID
	 */
	public String getDeptId() {
	    return deptId;
	}

	/**
	 * 部門IDを設定します。
	 * @param deptId 部門ID
	 */
	public void setDeptId(String deptId) {
	    this.deptId = deptId;
	}

	/**
	 * 部門名称を取得します。
	 * @return 部門名称
	 */
	public String getDeptNm() {
	    return deptNm;
	}

	/**
	 * 部門名称を設定します。
	 * @param deptNm 部門名称
	 */
	public void setDeptNm(String deptNm) {
	    this.deptNm = deptNm;
	}

	/**
	 * 明細を取得します。
	 * @return 明細
	 */
	public List<MeiCodeDeptForm> getMei() {
	    return mei;
	}

	/**
	 * 明細を設定します。
	 * @param mei 明細
	 */
	public void setMei(List<MeiCodeDeptForm> mei) {
	    this.mei = mei;
	}

}
