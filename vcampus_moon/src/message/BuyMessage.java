package message;

import java.io.Serializable;

public class BuyMessage implements Serializable {
    private String Goods_id;
    private String Buyer_id;
    private int Goods_price;
    private String type = "BuyMessage";

    public void setGoods_price(int goods_price) {
        Goods_price = goods_price;
    }


    public void setGoods_id(String goods_id) {
        Goods_id = goods_id;
    }

    public void setBuyer_id(String buyer_id) {
        Buyer_id = buyer_id;
    }


    public String getType() {
        return type;
    }


    public String getGoods_id() {
        return Goods_id;
    }

    public int getGoods_price() {
        return Goods_price;
    }

    public String getBuyer_id() {
        return Buyer_id;
    }

}
