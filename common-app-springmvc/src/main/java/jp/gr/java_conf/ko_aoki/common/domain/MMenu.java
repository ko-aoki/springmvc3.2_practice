package jp.gr.java_conf.ko_aoki.common.domain;

public class MMenu extends MMenuKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SADB.M_MENU.MENU_NM
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    private String menuNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SADB.M_MENU.URL
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SADB.M_MENU.MENU_NM
     *
     * @return the value of SADB.M_MENU.MENU_NM
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    public String getMenuNm() {
        return menuNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SADB.M_MENU.MENU_NM
     *
     * @param menuNm the value for SADB.M_MENU.MENU_NM
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SADB.M_MENU.URL
     *
     * @return the value of SADB.M_MENU.URL
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SADB.M_MENU.URL
     *
     * @param url the value for SADB.M_MENU.URL
     *
     * @mbggenerated Wed Dec 11 22:21:06 JST 2013
     */
    public void setUrl(String url) {
        this.url = url;
    }
}