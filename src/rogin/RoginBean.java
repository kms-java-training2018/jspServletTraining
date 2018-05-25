package rogin;

import java.util.ArrayList;

public class RoginBean{
    // ログイン情報
    // ログインしているかどうかの情報？
    // パスワードの中身を入れておくよ
    ArrayList<String> listId = new ArrayList<String>();

    // パスワードの中身を入れておくよ
    ArrayList<String> listPass = new ArrayList<String>();

    // リストを返す
    public ArrayList<String> getListPass() {
        return listPass;
    }

    // リスト追加
    public void setListPass(String list) {
        this.listPass.add(list);
    }
    // リストを返す
    public ArrayList<String> getListId() {
        return listId;
    }

    // リスト追加
    public void setListId(String list) {
        this.listId.add(list);
    }

}
