/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.SM.ModernPos.Controller;

import java.util.ArrayList;
import lk.SM.ModernPos.Model.Customer;

/**
 *
 * @author Sithum Ravishara
 */
public interface SuperCustomer {
    public boolean addCustomer(Customer customer)throws Exception;
    public boolean deleteCustomer(String id)throws Exception;
    public boolean updateCustomer(Customer customer)throws Exception;
    public Customer searchCustomer(String id)throws Exception;
    public ArrayList<Customer> getAllCustomers()throws Exception;
}
