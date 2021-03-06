/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.SM.ModernPos.DAO;

import java.util.ArrayList;
import lk.SM.ModernPos.Model.Customer;

/**
 *
 * @author Sithum Ravishara
 */
public interface SuperDAO<T> {
    public boolean add(T entity)throws Exception;
    public boolean delete(String id)throws Exception;
    public boolean update(T entity)throws Exception;
    public T search(String id)throws Exception;
    public ArrayList<T> getAll()throws Exception;
}
