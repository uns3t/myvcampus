package message;

import java.io.Serializable;

public class GoodsInfo implements Serializable {
    private String Goods_id;
    private String Goods_name;
    private String Goods_category;
    private double Goods_price;
    private int Goods_quantity;

    public void setGoods_category(String goods_category) {
        Goods_category = goods_category;
    }

    public void setGoods_id(String goods_id) {
        Goods_id = goods_id;
    }

    public void setGoods_name(String goods_name) {
        Goods_name = goods_name;
    }

    public void setGoods_price(double goods_price) {
        Goods_price = goods_price;
    }

    public void setGoods_quantity(int goods_quantity) {
        Goods_quantity = goods_quantity;
    }

    public double getGoods_price() {
        return Goods_price;
    }

    public int getGoods_quantity() {
        return Goods_quantity;
    }

    public String getGoods_category() {
        return Goods_category;
    }

    public String getGoods_id() {
        return Goods_id;
    }

    public String getGoods_name() {
        return Goods_name;
    }
}