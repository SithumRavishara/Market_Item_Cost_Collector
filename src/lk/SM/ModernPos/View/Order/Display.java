/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.SM.ModernPos.View.Order;

import lk.SM.ModernPos.View.Customer.AddCustomerForm;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.SM.ModernPos.Controller.CustomerController;
import lk.SM.ModernPos.Controller.PlaceOrderController;
import lk.SM.ModernPos.Controller.SuperCustomer;
import lk.SM.ModernPos.Model.Customer;
import lk.SM.ModernPos.Model.PlaceOrder;

/**
 *
 * @author Sithum Ravishara
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    double quntity;
    double unit;
    String sum;
    double Total;
    double sumoftotal=0;
    DefaultTableModel dtm;
    
    public Display() {
        initComponents();
        initComponents();
        dtm=(DefaultTableModel) table.getModel();
        getCustomerID();
        getItemID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderdatetxt = new javax.swing.JTextField();
        destxt = new javax.swing.JTextField();
        cusnametxt = new javax.swing.JTextField();
        codecom = new javax.swing.JComboBox<>();
        newbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cusidcom = new javax.swing.JComboBox<>();
        unittxt = new javax.swing.JTextField();
        qtytxt = new javax.swing.JTextField();
        ordridtxt = new javax.swing.JTextField();
        qtyontxt = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();
        plcbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        totaltxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order Form");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel1.setText("Customer Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 30));

        jLabel2.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel2.setText("Order Date :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, 30));

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel3.setText("Place Order Form");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 210, 40));

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel4.setText("Description");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 120, 40));

        jLabel5.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel5.setText("Order ID :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 30));

        orderdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderdatetxtActionPerformed(evt);
            }
        });
        jPanel1.add(orderdatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 170, 30));

        destxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destxtActionPerformed(evt);
            }
        });
        jPanel1.add(destxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, 30));

        cusnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(cusnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 170, 30));

        codecom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codecomItemStateChanged(evt);
            }
        });
        codecom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codecomActionPerformed(evt);
            }
        });
        jPanel1.add(codecom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 30));

        newbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newbtn.setText("New");
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });
        jPanel1.add(newbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Total :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, 40));

        jLabel7.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel7.setText("Unit Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, 40));

        jLabel8.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel8.setText("Qty.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 50, 40));

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel9.setText("Code :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 40));

        jLabel10.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel10.setText("Qty. On Hand");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, 40));

        cusidcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cusidcom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cusidcomItemStateChanged(evt);
            }
        });
        cusidcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusidcomActionPerformed(evt);
            }
        });
        jPanel1.add(cusidcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 30));

        unittxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unittxtActionPerformed(evt);
            }
        });
        jPanel1.add(unittxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 130, 30));

        qtytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtytxtActionPerformed(evt);
            }
        });
        jPanel1.add(qtytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 110, 30));

        ordridtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordridtxtActionPerformed(evt);
            }
        });
        jPanel1.add(ordridtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, 30));

        qtyontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyontxtActionPerformed(evt);
            }
        });
        jPanel1.add(qtyontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 130, 30));

        removebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });
        jPanel1.add(removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 100, 30));

        plcbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plcbtn.setText("Place Order");
        plcbtn.setBorder(null);
        plcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plcbtnActionPerformed(evt);
            }
        });
        jPanel1.add(plcbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 140, 40));

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Description", "Qty.", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 830, 170));

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel11.setText("Customer ID :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, 30));

        totaltxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totaltxt.setForeground(new java.awt.Color(255, 0, 0));
        totaltxt.setBorder(null);
        totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaltxtActionPerformed(evt);
            }
        });
        jPanel1.add(totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderdatetxtActionPerformed

    private void destxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destxtActionPerformed

    private void cusnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusnametxtActionPerformed

    private void unittxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unittxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unittxtActionPerformed

    private void qtytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtytxtActionPerformed

    private void ordridtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordridtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordridtxtActionPerformed

    private void qtyontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyontxtActionPerformed
        quntity = Double.parseDouble(qtyontxt.getText());
        unit = Double.parseDouble(unittxt.getText());
        sum = String.format("%.0f",quntity * unit);
        qtytxt.setText(sum);
        
        
    }//GEN-LAST:event_qtyontxtActionPerformed

    private void codecomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codecomActionPerformed
        
    }//GEN-LAST:event_codecomActionPerformed

    private void codecomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codecomItemStateChanged
        String itemCode=codecom.getSelectedItem().toString();
        
        PlaceOrder item = null;
        try {
            item = PlaceOrderController.searchitem(itemCode);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        destxt.setText(item.getdescription());
        unittxt.setText(""+item.getunitPrice());
        qtytxt.setText(item.getqtyOnHand()+"");
    }//GEN-LAST:event_codecomItemStateChanged

    private void cusidcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusidcomActionPerformed
        
    }//GEN-LAST:event_cusidcomActionPerformed

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
        AddCustomerForm b = new AddCustomerForm();
        b.setVisible(true);
    }//GEN-LAST:event_newbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
         
        // table of itemdetail is viewed
        try {
            ArrayList<PlaceOrder> allitem = PlaceOrderController.getAllitems();
            DefaultTableModel dtm= (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            for(PlaceOrder item : allitem){
                Object[] rowData={item.getcode(),item.getdescription(),item.getqty(),item.getunitPrice(),item.getTotal()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //add item details for the table of itemdetail in db
        try {
            String code = (String) codecom.getSelectedItem();
            String description = destxt.getText();
            double unitPrice = Double.parseDouble(unittxt.getText());
            double qty = Double.parseDouble(qtytxt.getText());
            Total = unitPrice*qty;
            sumoftotal=sumoftotal+Total;
            
            PlaceOrder customer = new PlaceOrder(code,description, (int) qty,unitPrice,Total);
            
            boolean isAdded = PlaceOrderController.additem(customer);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Addedd Success");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //qtyOnHand values updated
        try {
            PlaceOrder qtyOnHand=new PlaceOrder((int) Double.parseDouble(qtytxt.getText()));
            boolean isUpdated = PlaceOrderController.updateqtyonhand(qtyOnHand);
            if(isUpdated){
                JOptionPane.showMessageDialog(this, "Updated qtyOnHand..");
            }else{
                JOptionPane.showMessageDialog(this, "Update fail");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        totaltxt.setText(String.valueOf(sumoftotal));
    }//GEN-LAST:event_addbtnActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        
        
        destxt.setText(null);
        qtyontxt.setText(null);
        qtytxt.setText(null);
        unittxt.setText(null);
        totaltxt.setText(null);
        sumoftotal = 0;
        
        
        // delete all fields of table
        try {
            ArrayList<PlaceOrder> allitem = PlaceOrderController.deleteAllitems();
            DefaultTableModel dtm= (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            for(PlaceOrder item : allitem){
                Object[] rowData={item.getcode(),item.getdescription(),item.getqty(),item.getunitPrice(),item.getTotal()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        destxt.setText(null);
        qtyontxt.setText(null);
        qtytxt.setText(null);
        unittxt.setText(null);
        
    }//GEN-LAST:event_removebtnActionPerformed

    private void totaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltxtActionPerformed

    private void plcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plcbtnActionPerformed
       totaltxt.setText(String.valueOf(sumoftotal));
       //add details for orders table
        try {
            
            String Orderid = ordridtxt.getText();
            String date = orderdatetxt.getText();
            String cusid = cusidcom.getItemAt(5);
           
            
            PlaceOrder order = new PlaceOrder(Orderid, date,cusid);
            
            boolean isAdded = PlaceOrderController.addorder(order);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Place Ordered");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // add details for item detail table
        try {
            
            String Orderid = ordridtxt.getText();
            String code = (String) codecom.getSelectedItem();
            int qty =  (int) Double.parseDouble(qtytxt.getText());
            double unitPrice =  Double.parseDouble(unittxt.getText());
            
            PlaceOrder order = new PlaceOrder(Orderid, code,qty,unitPrice);
            
            boolean isAdded = PlaceOrderController.additemdetails(order);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Place Ordered");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
        
    }//GEN-LAST:event_plcbtnActionPerformed

    private void cusidcomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cusidcomItemStateChanged
        String cusID=cusidcom.getSelectedItem().toString();
        try {
            SuperCustomer temp1 = new CustomerController();
            Customer cust= temp1.searchCustomer(cusID);
            cusnametxt.setText(cust.getName());
        } catch (SQLException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cusidcomItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> codecom;
    private javax.swing.JComboBox<String> cusidcom;
    private javax.swing.JTextField cusnametxt;
    private javax.swing.JTextField destxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newbtn;
    private javax.swing.JTextField orderdatetxt;
    private javax.swing.JTextField ordridtxt;
    private javax.swing.JButton plcbtn;
    private javax.swing.JTextField qtyontxt;
    private javax.swing.JTextField qtytxt;
    private javax.swing.JButton removebtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField totaltxt;
    private javax.swing.JTextField unittxt;
    // End of variables declaration//GEN-END:variables

private void getCustomerID() {
        
        try {
            SuperCustomer temp1 = new CustomerController();
            ArrayList<Customer> cusList= temp1.getAllCustomers();
            for (Customer customer : cusList) {
                cusidcom.addItem(customer.getId());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void getItemID() {
              try {
            ArrayList<PlaceOrder> itemList=PlaceOrderController.getAllitems();
            for (PlaceOrder item : itemList) {
                codecom.addItem(item.getcode());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }  
    private String setDate(Date date) {
          SimpleDateFormat stf= new SimpleDateFormat("yyyy-MM-dd");
          return stf.format(date);
    }
}