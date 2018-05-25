package task2;

public class LoginCollation {

	//パスワード認証をここで設定
	/**private String correctName = "abc";
	private String correctPassword = "yasumasa";
	*/
	//nameとpassの定義
	private String name;
	private String password;
	String value = "0";

	public String getName() {

		return name;
	/**	if (correctName.equals(name)) {

			value = "1";
			return value;
		} else
			value = "0";
		return value;
	}*/
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {

		return password;
		/**	if (correctPassword.equals(password)) {
			value = "1";
			return value;
		} else
			value = "0";
			return value;
	}*/
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
