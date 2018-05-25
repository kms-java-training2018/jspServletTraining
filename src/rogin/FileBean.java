package rogin;

import java.util.ArrayList;

public class FileBean {
    // Fileの中身の情報を入れておくよ
    ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

    // リストを返す
    public ArrayList<ArrayList<String>> getList() {
        return list;
    }

    // リスト追加
    public void setList(ArrayList<String> list) {
        this.list.add(list);
    }
}
