package DAO;
/**
 * 类 {@code shopDAO} 管理goodstbl的类.
 *
 * <p> 管理goodstbl
 *
 * @since 2019/8/19
 */
import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class shopDAO {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    /**
     *
     * <p>
     *     添加商品
     * </p>
     * @param goods_id 货物编号
     * @param goods_name 货物名称
     * @param goods_price 货物价格
     * @param goods_quantity 货物数量
     * @param good_sales 已售数量
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean addShop(String goods_id,String goods_name,String goods_price,String goods_quantity,String good_sales) throws Exception{
        sql = con.prepareStatement("insert into Shoptbl (Goods_id, Goods_name, Goods_price,Goods_quantity,Goods_sales) values (?,?, ?, ?,?)");

        sql.setString(1, goods_id);
        sql.setString(2, goods_name);
        sql.setString(3, goods_price);
        sql.setString(4, goods_quantity);
        sql.setString(5, good_sales);
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     更新商品
     * </p>
     * @param goods_id 货物编号
     * @param goods_name 货物名称
     * @param goods_price 货物价格
     * @param goods_quantity 货物数量
     * @param good_sales 已售数量
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean updateShop(String goods_id,String goods_name,String goods_price,String goods_quantity,String good_sales) throws Exception{
        sql = con.prepareStatement("update Shoptbl set Goods_id=?, Goods_name=?, Goods_price=?,Goods_quantity=?,Goods_sales=? where Goods_id=?");

        sql.setString(1, goods_id);
        sql.setString(2, goods_name);
        sql.setString(3, goods_price);
        sql.setString(4, goods_quantity);
        sql.setString(5, good_sales);
        sql.setString(6, goods_id);
        sql.executeUpdate();
        return true;
    }

    /**
     *
     * <p>
     *     删除商品
     * </p>
     * @param shop_id 货物编号
     * @throws Exception sql异常
     */
    public void deleteShop(String shop_id) throws Exception {
        System.out.println("删除"+shop_id);
        sql=con.prepareStatement("DELETE FROM Shoptbl WHERE Goods_id"+"="+"'"+shop_id+"'");
        sql.executeUpdate();
    }

    /**
     *
     * <p>
     *     获得货物列表
     * </p>
     * @return 货物列表
     * @throws Exception sql异常
     */
    public ArrayList<GoodsInfo> listShop() throws Exception{
        ArrayList<GoodsInfo> goodslist=new ArrayList<GoodsInfo>();
        sql=con.prepareStatement("select * from Shoptbl");
        result=sql.executeQuery();
        while (result.next()){
            GoodsInfo temp=new GoodsInfo();
            temp.setGoods_name(result.getString("Goods_name"));
            temp.setGoods_id(result.getString("Goods_id"));
            temp.setGoods_price(result.getInt("Goods_price"));
            temp.setGoods_quantity(result.getInt("Goods_quantity"));
            temp.setGoods_sales(result.getInt("Goods_sales"));
            goodslist.add(temp);
        }
        return goodslist;
    }

    /**
     *
     * <p>
     *     购买货物
     * </p>
     * @param goods_id 货物编号
     * @param buy_num 购买数量
     * @param theusr 用户ID
     * @return 是否成功
     * @throws Exception sql异常
     */
    public boolean buygoods(String goods_id,int buy_num,String theusr) throws Exception{
        System.out.println("goods: "+goods_id);
        int goods_num=0;
        int goods_sales=0;
        sql=con.prepareStatement("select * from Shoptbl where Goods_id="+"'"+goods_id+"'");
        result=sql.executeQuery();
        while (result.next()){
            goods_num=result.getInt("Goods_quantity");
            goods_sales=result.getInt("Goods_sales");
        }

        if(goods_num-buy_num>0){
            goods_num-=buy_num;
            goods_sales+=buy_num;
            sql=con.prepareStatement("update Shoptbl set Goods_quantity=? where Goods_id=?");
            sql.setString(1,goods_num+"");
            sql.setString(2,goods_id);
            sql.executeUpdate();

            sql=con.prepareStatement("update Shoptbl set Goods_sales=? where Goods_id=?");
            sql.setString(1,goods_sales+"");
            sql.setString(2,goods_id);
            sql.executeUpdate();

            sql=con.prepareStatement("insert into Buytbl (Usr_id, Goods_id, Goods_num) values (?,?, ?)");
            sql.setString(1,theusr);
            sql.setString(2,goods_id);
            sql.setString(3,buy_num+"");
            sql.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }
/**
 * @see {@link ToAccess}
 */

}
