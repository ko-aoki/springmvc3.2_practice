package jp.gr.java_conf.ko_aoki.common.form;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

public class LoginForm implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** ユーザID */
	@NotBlank
	private String userId;

	/** パスワード */
	@NotBlank
    private String pwd;


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


	/**
	 * ユーザIDを取得します。
	 * @return ユーザID
	 */
	public String getUserId() {
	    return userId;
	}


	/**
	 * ユーザIDを設定します。
	 * @param userid ユーザID
	 */
	public void setUserId(String userId) {
	    this.userId = userId;
	}


	/**
	 * パスワードを取得します。
	 * @return パスワード
	 */
	public String getPwd() {
	    return pwd;
	}


	/**
	 * パスワードを設定します。
	 * @param pwd パスワード
	 */
	public void setPwd(String pwd) {
	    this.pwd = pwd;
	}

}
