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
    public void setGoodslist(ArrayList<GoodsInfo> goodslist){
        goodsInfo=goodslist;
    }
    public ArrayList<GoodsInfo> getGoodsInfo(){
        return goodsInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
