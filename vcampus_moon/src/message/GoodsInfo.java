package message;


/**
 * 类 {@code GoodsInfo} 课程对象.
 *
 * <p> 存储课程相关信息
 *
 * @since 2019/8/19
 */
import java.io.Serializable;

public class GoodsInfo implements Serializable {

    /** 商品编号 {@value} */
    private String Goods_id;

    /** 商品名称 {@value} */
    private String Goods_name;

    /** 商品价格 {@value} */
    private int Goods_price;

    /** 商品数量 {@value} */
    private int Goods_quantity;

    /** 已售商品数量 {@value} */
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
    /**
     *
     * @see {@link ShopMessage}
     */
}
