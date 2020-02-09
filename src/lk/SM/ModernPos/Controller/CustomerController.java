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
import lk.SM.ModernPos.DAO.CustomerDAO;
import lk.SM.ModernPos.DAO.SuperDAO;
import lk.SM.ModernPos.DBConnection.DBConnection;
import lk.SM.ModernPos.Model.Customer;

/**
 *
 * @author niroth
 */
public class CustomerController implements SuperCustomer{

    @Override
    public boolean addCustomer(Customer customer) throws Exception {
        SuperDAO<Customer> temp = new CustomerDAO();
        return temp.add(customer);
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        
        SuperDAO<Customer> temp = new CustomerDAO();
        return temp.delete(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        SuperDAO<Customer> temp = new CustomerDAO();
        return temp.update(customer);
    }

    @Override
    public Customer searchCustomer(String id) throws Exception {
         SuperDAO<Customer> temp = new CustomerDAO();
        return temp.search(id);
    }

    @Override
    public ArrayList<Customer> getAllCustomers() throws Exception {
         SuperDAO<Customer> temp = new CustomerDAO();
        return temp.getAll();
    }

   
}
