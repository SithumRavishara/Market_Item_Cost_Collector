/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.SM.ModernPos.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.SM.ModernPos.DBConnection.DBConnection;
import lk.SM.ModernPos.Model.PlaceOrder;

/**
 *
 * @author Sithum Ravishara
 */
public class PlaceOrderController {
    public static PlaceOrder searchitem(String code) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From item where code='" + code + "'");
        if (rst.next()) {
            PlaceOrder customer = new PlaceOrder(rst.getString("description"),rst.getDouble("unitprice"),rst.getInt("qtyOnHand"));
            return customer;
        } else {
            return null;
        }
        
    }
    public static PlaceOrder searchcustomer(String ID) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From customer where ID='" + ID + "'");
        if (rst.next()) {
            PlaceOrder customer = new PlaceOrder(rst.getString("NAME"));
            return customer;
        } else {
            return null;
        }
        
    }
     public static ArrayList<PlaceOrder> getAllitems() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From addItem");
        ArrayList <PlaceOrder>customerList=new ArrayList<>();
        while(rst.next()){
            PlaceOrder addItem = new PlaceOrder(rst.getString("code"), rst.getString("description"),rst.getInt("qty"), rst.getDouble("unitPrice"),rst.getDouble("Total"));
            customerList.add(addItem);
        }
        return customerList;
    }
    public static boolean additem(PlaceOrder item) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("insert into addItem Values(?,?,?,?,?)");
        stm.setObject(1, item.getcode());
        stm.setObject(2, item.getdescription());
        stm.setObject(3, item.getqty());
        stm.setObject(4, item.getunitPrice());
        stm.setObject(5, item.getTotal());
        int res = stm.executeUpdate();
        return res > 0;
    }
    public static boolean updateqtyonhand(PlaceOrder qtyOnHand) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update item set qtyOnHand=? where code=?");
        stm.setObject(1, qtyOnHand.getqtyOnHand());
        int res = stm.executeUpdate();
        return res > 0;
    }
    
     public static ArrayList<PlaceOrder> deleteAllitems() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Delete * From addItem");
        ArrayList <PlaceOrder>customerList=new ArrayList<>();
        while(rst.next()){
            PlaceOrder addItem = new PlaceOrder(rst.getString("code"), rst.getString("description"),rst.getInt("qty"), rst.getDouble("unitPrice"),rst.getDouble("Total"));
            customerList.add(addItem);
        }
        return customerList;
    }
     public static boolean addorder(PlaceOrder order) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("insert into orders Values(?,?,?)");
        stm.setObject(1, order.getOrderid());
        stm.setObject(2, order.getdate());
        stm.setObject(3, order.getcusid());
        int res = stm.executeUpdate();
        return res > 0;
    }
     
     public static boolean additemdetails(PlaceOrder order) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("insert into orders Values(?,?,?)");
        stm.setObject(1, order.getOrderid());
        stm.setObject(2, order.getcode());
        stm.setObject(3, order.getqty());
        stm.setObject(3, order.getunitPrice());
        int res = stm.executeUpdate();
        return res > 0;
    }
     
     
}
