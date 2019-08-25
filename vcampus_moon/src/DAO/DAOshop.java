package DAO;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import message.*;
import java.util.ArrayList;

public class DAOshop {
    private static Connection con;
    private static PreparedStatement sql=null;
    private static ResultSet result=null;
    public void setcon(Connection c){
        this.con=c;
    }

    public boolean addShop(String goods_id,String goods_name,String goods_price,String goods_quantity) throws Exception{
        sql = con.prepareStatement("insert into Shoptbl (Goods_id, Goods_name, Goods_price,Goods_quantity) values (?, ?, ?,?)");

        sql.setString(1, goods_id);
        sql.setString(2, goods_name);
        sql.setString(3, goods_price);
        sql.setString(4, goods_quantity);
        sql.executeUpdate();
        return true;
    }

    public void deleteShop(String shop_id) throws Exception {
        System.out.println("删除"+shop_id);
        sql=con.prepareStatement("DELETE FROM Shoptbl WHERE Goods_id"+"="+"'"+shop_id+"'");
        sql.executeUpdate();
    }

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
            goodslist.add(temp);
        }
        return goodslist;
    }

    public void buygoods(String goods_id) throws Exception{
        sql=con.prepareStatement("select * from Shoptbl where Goods_id="+"'"+goods_id+"'");
        result=sql.executeQuery();
        int goods_num=result.getInt("Goods_quantity");
        if(goods_num>0){
            goods_num--;
            sql=con.prepareStatement("update Shoptbl set Goods_quantity=? where Goods_id=?");
            sql.setString(1,goods_num+"");
            sql.setString(2,goods_id);
            sql.executeUpdate();
        }
    }


}
