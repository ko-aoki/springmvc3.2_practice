package jp.gr.java_conf.ko_aoki.common.base.bean;

public class PageBean {

	/** 現在ページ */
	private int curPage;
	/** 全体ページ */
	private int totalPage;
	/** 全体件数 */
	private int totalNum;
	/** ページ内件数 */
	private int numByPage;
	/** ページ内開始件数 */
	private int startNum;
	/** ページ内終了件数 */
	private int endNum;
	/** 表示ページ数 */
	private int dispPageNum;
	/** 表示開始ページ */
	private int dispStartPage;
	/** 表示終了ページ */
	private int dispEndPage;

	/**
	 * 現在ページを取得します。
	 * @return 現在ページ
	 */
	public int getCurPage() {
	    return curPage;
	}
	/**
	 * 現在ページを設定します。
	 * @param curPage 現在ページ
	 */
	public void setCurPage(int curPage) {
	    this.curPage = curPage;
	}
	/**
	 * 全体ページを取得します。
	 * @return 全体ページ
	 */
	public int getTotalPage() {
	    return totalPage;
	}
	/**
	 * 全体ページを設定します。
	 * @param totalPage 全体ページ
	 */
	public void setTotalPage(int totalPage) {
	    this.totalPage = totalPage;
	}
	/**
	 * 全体件数を取得します。
	 * @return 全体件数
	 */
	public int getTotalNum() {
	    return totalNum;
	}
	/**
	 * 全体件数を設定します。
	 * @param totalNum 全体件数
	 */
	public void setTotalNum(int totalNum) {
	    this.totalNum = totalNum;
	}
	/**
	 * ページ内件数を取得します。
	 * @return ページ内件数
	 */
	public int getNumByPage() {
	    return numByPage;
	}
	/**
	 * ページ内件数を設定します。
	 * @param numByPage ページ内件数
	 */
	public void setNumByPage(int numByPage) {
	    this.numByPage = numByPage;
	}
	/**
	 * ページ内開始件数を取得します。
	 * @return ページ内開始件数
	 */
	public int getStartNum() {
	    return startNum;
	}
	/**
	 * ページ内開始件数を設定します。
	 * @param startNum ページ内開始件数
	 */
	public void setStartNum(int startNum) {
	    this.startNum = startNum;
	}
	/**
	 * ページ内終了件数を取得します。
	 * @return ページ内終了件数
	 */
	public int getEndNum() {
	    return endNum;
	}
	/**
	 * ページ内終了件数を設定します。
	 * @param endNum ページ内終了件数
	 */
	public void setEndNum(int endNum) {
	    this.endNum = endNum;
	}
	/**
	 * 表示ページ数を取得します。
	 * @return 表示ページ数
	 */
	public int getDispPageNum() {
	    return dispPageNum;
	}
	/**
	 * 表示ページ数を設定します。
	 * @param dispPageNum 表示ページ数
	 */
	public void setDispPageNum(int dispPageNum) {
	    this.dispPageNum = dispPageNum;
	}
	/**
	 * 表示開始ページを取得します。
	 * @return 表示開始ページ
	 */
	public int getDispStartPage() {
	    return dispStartPage;
	}
	/**
	 * 表示開始ページを設定します。
	 * @param dispStartPage 表示開始ページ
	 */
	public void setDispStartPage(int dispStartPage) {
	    this.dispStartPage = dispStartPage;
	}
	/**
	 * 表示終了ページを取得します。
	 * @return 表示終了ページ
	 */
	public int getDispEndPage() {
	    return dispEndPage;
	}
	/**
	 * 表示終了ページを設定します。
	 * @param dispEndPage 表示終了ページ
	 */
	public void setDispEndPage(int dispEndPage) {
	    this.dispEndPage = dispEndPage;
	}

}
