package jp.gr.java_conf.ko_aoki.common.bean;

public class HierarchicalMenuBean {

	/** ロールID */
	private String roleId;
	/** メニューID */
	private String menuId;
	/** 親メニューID */
	private String pMenuId;
	/** メニュー名 */
	private String menuNm;
	/** パス */
	private String path;
	/** url */
	private String url;

//    public HierarchicalMenuBean(String menuId, String path, String url){
//        this.menuId = menuId;
//        this.path = path;
//        this.url = url;
//    }

	/**
	 * ロールIDを取得します。
	 * @return ロールID
	 */
	public String getRoleId() {
	    return roleId;
	}
	/**
	 * ロールIDを設定します。
	 * @param roleId ロールID
	 */
	public void setRoleId(String roleId) {
	    this.roleId = roleId;
	}
	/**
	 * メニューIDを取得します。
	 * @return メニューID
	 */
	public String getMenuId() {
	    return menuId;
	}
	/**
	 * メニューIDを設定します。
	 * @param menuId メニューID
	 */
	public void setMenuId(String menuId) {
	    this.menuId = menuId;
	}
	/**
	 * 親メニューIDを取得します。
	 * @return 親メニューID
	 */
	public String getpMenuId() {
	    return pMenuId;
	}
	/**
	 * 親メニューIDを設定します。
	 * @param pMenuId 親メニューID
	 */
	public void setpMenuId(String pMenuId) {
	    this.pMenuId = pMenuId;
	}
	/**
	 * メニュー名を取得します。
	 * @return メニュー名
	 */
	public String getMenuNm() {
	    return menuNm;
	}
	/**
	 * メニュー名を設定します。
	 * @param menuNm メニュー名
	 */
	public void setMenuNm(String menuNm) {
	    this.menuNm = menuNm;
	}
	/**
	 * パスを取得します。
	 * @return パス
	 */
	public String getPath() {
	    return path;
	}
	/**
	 * パスを設定します。
	 * @param path パス
	 */
	public void setPath(String path) {
	    this.path = path;
	}
	/**
	 * urlを取得します。
	 * @return url
	 */
	public String getUrl() {
	    return url;
	}
	/**
	 * urlを設定します。
	 * @param url url
	 */
	public void setUrl(String url) {
	    this.url = url;
	}


}
