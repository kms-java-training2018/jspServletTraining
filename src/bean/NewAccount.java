package bean;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewAccount {

	//名前とパスの変数設定
	private String newName;
	private String newPAss;

	//コンストラクタ
	public NewAccount() {

	}




	//csvからUserNameを読み込む


	//csvからPasswordを読み込む


	//引数のnameをファイルに出力
	public void setName(String name) {
		try {
			//出力先を作成する
			FileWriter fw = new FileWriter("C:\\Users\\onishi-yasumasa\\Documents\\csv\\login\\Username.csv", true);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			//内容を指定する
			pw.print(name);
			pw.print(",");

			//ファイルに書き出す
			pw.close();
		} catch (IOException ex) {
			//例外時処理
			ex.printStackTrace();
		}

	}

	//引数のnameをファイルに出力
	public void setPass(String pass) {
		try {
			//出力先を作成する
			FileWriter fw = new FileWriter("C:\\Users\\onishi-yasumasa\\Documents\\csv\\login\\Password.csv", true);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			//内容を指定する
			pw.print(pass);
			pw.print(",");

			//ファイルに書き出す
			pw.close();
		} catch (IOException ex) {
			//例外時処理
			ex.printStackTrace();
		}

	}
}
