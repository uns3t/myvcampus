package message;

import java.io.Serializable;
import java.util.ArrayList;

public class ShopMessage implements Serializable {
    private String type = "Shop";
    private ArrayList<GoodsInfo> goodsInfo = null;

    public ShopMessage(){
        goodsInfo = new ArrayList<GoodsInfo>();
    }
    public void addGoodsInfo(GoodsInfo g){
        goodsInfo.add(g);
    }

    public String getType() {
        return type;
    }
}
