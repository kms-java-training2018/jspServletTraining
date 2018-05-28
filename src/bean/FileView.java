package bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileView {

	//AllayList
	private ArrayList<String> list = new ArrayList<String>();
	private String name;

	//コンストラクタ
	public FileView() {

	}

	public FileView(String name) {
		setPath(name);
	}

	public ArrayList<String> getPath() {
		return list;
	}

	public void setPath(String name) {
		try {
			this.name = name;

			File f = new File("C:\\Users\\onishi-yasumasa\\Documents\\csv\\"
					+ this.name);
			BufferedReader br = new BufferedReader(new FileReader(f));

			String line;

			// 1行ずつCSVファイルを読み込む
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",", 0); // 行をカンマ区切りで配列に変換

				for (String elem : data) {
					list.add(elem);
				}
			}
			br.close();

		} catch (IOException e) {

		}
	}
}
