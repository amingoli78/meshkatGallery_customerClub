package amingoli.meshkatgallery.coustomerclub.activity.ListOrder;

public class ModelListOrder {
    private int id;
    private String no,price,date,desc;

    public ModelListOrder(int id, String no, String price, String date, String desc) {
        this.id = id;
        this.no = no;
        this.price = price;
        this.date = date;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
