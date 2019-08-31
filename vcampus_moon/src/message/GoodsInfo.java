package message;

import java.io.Serializable;

public class GoodsInfo implements Serializable {
    private String Goods_id;
    private String Goods_name;
    private int Goods_price;
    private int Goods_quantity;
    private int Goods_sales;

    public int getGoods_sales() {
        return Goods_sales;
    }

    public void setGoods_sales(int goods_sales) {
        Goods_sales = goods_sales;
    }

    public void setGoods_id(String goods_id) {
        Goods_id = goods_id;
    }

    public void setGoods_name(String goods_name) {
        Goods_name = goods_name;
    }

    public void setGoods_price(int goods_price) {
        Goods_price = goods_price;
    }

    public void setGoods_quantity(int goods_quantity) {
        Goods_quantity = goods_quantity;
    }

    public int getGoods_price() {
        return Goods_price;
    }

    public int getGoods_quantity() {
        return Goods_quantity;
    }


    public String getGoods_id() {
        return Goods_id;
    }

    public String getGoods_name() {
        return Goods_name;
    }
}
