package bean;

public class NewEmployeeBean {
    /*
     * privateフィールド宣言
     */
    private String name;
    /*
     * その直後にget,setメソッド
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /*
     * 同様にprivateフィールド宣言
     */
    private int id;
    /*
     * 直後にget,setメソッド
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
