package bean;

import java.io.File;
import java.util.ArrayList;



public class FileList {

	//ArrayListの設定

	private ArrayList<String> fileList = new ArrayList<String>();
	private ArrayList<String> dirList = new ArrayList<String>();

	//コンストラクタ
	public FileList() {
		setFileList();
	}



	public ArrayList<String> getFileList() {
		return fileList;
	}

	public ArrayList<String> getDirList() {
		return dirList;
	}

	public void setFileList(){
		File dir = new File("C:\\Users\\onishi-yasumasa\\Documents\\csv\\");

        //listFilesメソッドを使用して一覧を取得する
        File[] list = dir.listFiles();

        if(list != null) {

            for(int i=0; i<list.length; i++) {

                //ファイルの場合
                if(list[i].isFile() && list[i].getName().contains(".csv")) {
                	fileList.add(list[i].getName());


                //ディレクトリの場合
                }else if(list[i].isDirectory()) {
                    dirList.add(list[i].getName());
                }
            }
        } else {

	}



	}
	}


