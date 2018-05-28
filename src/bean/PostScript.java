package bean;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PostScript {

	//名前とパスの変数設定
		private String newName;
		private String newPAss;
		private String fileName;

		//コンストラクタ
		public PostScript() {

		}

		public void setFileName(String filename) {
			this.fileName = filename;
		}







		//引数のnameをファイルに出力
		public void setData(String data) {
			try {
				//出力先を作成する
				FileWriter fw = new FileWriter("C:\\Users\\onishi-yasumasa\\Documents\\csv\\"+fileName, true);
				PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

				//内容を指定する
				pw.print(data);
				pw.print(",");

				//ファイルに書き出す
				pw.close();
			} catch (IOException ex) {
				//例外時処理
				ex.printStackTrace();
			}

		}

}
