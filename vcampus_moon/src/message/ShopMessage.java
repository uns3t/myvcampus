package message;

/**
 * 类 {@code ShopMessage} 商品信息消息类.
 *
 * <p> 传输商品相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;
import java.util.ArrayList;

public class ShopMessage implements Serializable {

        /** Message类型 {@value} */
        private String type = "Shop";

        /** 商品对象列表 {@value} */
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
        /**
         * @see {@link Message}
         * @see {@link GoodsInfo}
         */
}
