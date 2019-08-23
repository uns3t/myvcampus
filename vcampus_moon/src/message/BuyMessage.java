package message;

import java.io.Serializable;

public class BuyMessage implements Serializable {
    private String Goods_name;
    private String Goods_id;
    private String Buyer_name;
    private String Buyer_id;
    private double Goods_price;
    private String type = "BuyMessage";

    public void setGoods_price(double goods_price) {
        Goods_price = goods_price;
    }

    public void setGoods_name(String goods_name) {
        Goods_name = goods_name;
    }

    public void setGoods_id(String goods_id) {
        Goods_id = goods_id;
    }

    public void setBuyer_id(String buyer_id) {
        Buyer_id = buyer_id;
    }

    public void setBuyer_name(String buyer_name) {
        Buyer_name = buyer_name;
    }

    public String getType() {
        return type;
    }

    public String getGoods_name() {
        return Goods_name;
    }

    public String getGoods_id() {
        return Goods_id;
    }

    public double getGoods_price() {
        return Goods_price;
    }

    public String getBuyer_id() {
        return Buyer_id;
    }

    public String getBuyer_name() {
        return Buyer_name;
    }
}
