/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.shopmanagebill;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author devra
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     * @param user
     */
    
    Connection con;
    Statement stm,stm1;
    public mainpage(String user) {
        initComponents();
        userlb.setText(user);
       
           try {
            String hotelInfo = "Pizza, Burger, Pasta, Momos, Paneer Tikka, Soup Varieties...";
            ImageIcon my=new ImageIcon("myphoto.jpg");

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(hotelInfo+my, BarcodeFormat.QR_CODE, 250, 250);

            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
            
            qrlb.setIcon(new ImageIcon(qrImage));
            qrlb.setText("");
           
                                              
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   
           try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmanage","root","");
              
                             stm=con.createStatement();
                     stm1=con.createStatement();
               
                   String dele="delete from billing;";
                                                 try{
                                                   stm1.executeUpdate(dele);
                                          }catch(SQLException |NullPointerException ob){
                                                  msglb.setText("fetching in refresh data");

                                                    }
           }catch(ClassNotFoundException | SQLException ob){
           System.out.println("some problem"+ob);
        }
        
    }

    private mainpage() {
      initComponents();
       cashier cash= new cashier();
        cash.setBounds(250,30,1000,800);
        cash.setVisible(true);
      try {
            String hotelInfo = "Pizza, Burger, Pasta, Momos, Paneer Tikka, Soup Varieties...";

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(hotelInfo, BarcodeFormat.QR_CODE, 250, 250);

            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
            
            qrlb.setIcon(new ImageIcon(qrImage));
            qrlb.setText("");
            
           
             try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmanage","root","");
              
               stm=con.createStatement();
                              stm1=con.createStatement();

               String dele="delete from billing;";
                                                 try{
                                                   stm1.executeUpdate(dele);
                                          }catch(SQLException |NullPointerException ob){
                                                  msglb.setText("fetching in refresh data");

                                                    }
            
           }catch(ClassNotFoundException | SQLException ob){
           System.out.println("some problem"+ob);
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        qrpl = new javax.swing.JPanel();
        qrlb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userlb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selebt = new javax.swing.JButton();
        billbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comit = new javax.swing.JComboBox<>();
        userchlb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodlt = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderlt = new javax.swing.JList<>();
        msglb = new javax.swing.JLabel();
        orderbt = new javax.swing.JButton();
        menu = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("food");
        setIconImages(null);
        setSize(new java.awt.Dimension(990, 700));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qrpl.setBackground(new java.awt.Color(51, 255, 204));
        qrpl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qrlb.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        qrlb.setText("QR");
        qrpl.add(qrlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 271, 250));

        getContentPane().add(qrpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 208, -1, 261));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 70)); // NOI18N
        jLabel1.setText("Hotel FunFee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, -1));

        userlb.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        userlb.setForeground(new java.awt.Color(255, 0, 204));
        jPanel1.add(userlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 78, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, 980, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel4.setText("   Scan Me For All Items");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 157, 255, 45));

        selebt.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        selebt.setText("add in order");
        selebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selebtActionPerformed(evt);
            }
        });
        getContentPane().add(selebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 180, 40));

        billbt.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        billbt.setText("Bill ");
        billbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbtActionPerformed(evt);
            }
        });
        getContentPane().add(billbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, 42));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Food Item");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 206, 29));

        comit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comit.setMaximumRowCount(10);
        comit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Fast Food", "Street Food", "Nasta", "Gujarati", "Punjabi", "South Indian", "Chinese", "Italian", "Desserts", "Rajasthani", "Bengali", "Maharashtrian", "North Indian", "Seafood", "Beverages" }));
        comit.setToolTipText("");
        comit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comit.setMinimumSize(new java.awt.Dimension(101, 50));
        comit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comitMouseClicked(evt);
            }
        });
        comit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comitActionPerformed(evt);
            }
        });
        getContentPane().add(comit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 313, 52));

        userchlb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userchlb.setForeground(new java.awt.Color(255, 102, 0));
        userchlb.setText("Your choice :");
        getContentPane().add(userchlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 280, 30));

        foodlt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        foodlt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        foodlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(foodlt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 170, 180));

        orderlt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        orderlt.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jScrollPane2.setViewportView(orderlt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 180));

        msglb.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        msglb.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(msglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 380, 40));

        orderbt.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        orderbt.setText("Order");
        orderbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderbtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderbtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderbtMouseExited(evt);
            }
        });
        orderbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbtActionPerformed(evt);
            }
        });
        getContentPane().add(orderbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 120, 40));

        menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 102, 0));
        menu.setText("Selected items");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, 30));

        menu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menu1.setForeground(new java.awt.Color(255, 102, 0));
        menu1.setText("Menu");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

                DefaultListModel<String> order1=new DefaultListModel<>();        

    
    
    private void selebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selebtActionPerformed

       
         Object[] selectedItems = foodlt.getSelectedValues();
     
            for (Object item : selectedItems) {
                  
                String z=item.toString();
             String mainz=priceadd(z);
              
             if(!order1.contains(mainz)){
                order1.addElement(mainz);
                
                        add(mainz,z);

                }
             }
            
            orderlt.setModel(order1);
                       
      
    }//GEN-LAST:event_selebtActionPerformed

    
    
    
    
    
   public String priceadd(String z){
      switch (z) {
    case "Burger":
        z = z + "  Rs " + "120";
        break;
    case "Pizza":
        z = z + "  Rs " + "150";
        break;
    case "French Fries":
        z = z + "  Rs " + "80";
        break;
    case "Sandwich":
        z = z + "  Rs " + "60";
        break;
    case "Tea":
        z = z + "  Rs " + "15";
        break;
    case "Coffee":
        z = z + "  Rs " + "20";
        break;
    case "Cold Coffee":
        z = z + "  Rs " + "40";
        break;
    case "Biscuit":
        z = z + "  Rs " + "10";
        break;
    case "Pani Puri":
        z = z + "  Rs " + "30";
        break;
    case "Chaat":
        z = z + "  Rs " + "50";
        break;
    case "Vada Pav":
        z = z + "  Rs " + "20";
        break;
    case "Samosa":
        z = z + "  Rs " + "15";
        break;
    case "Aloo Tikki":
        z = z + "  Rs " + "25";
        break;
    case "Dhokla":
        z = z + "  Rs " + "40";
        break;
    case "Khandvi":
        z = z + "  Rs " + "35";
        break;
    case "Fafda":
        z = z + "  Rs " + "30";
        break;
    case "Undhiyu":
        z = z + "  Rs " + "70";
        break;
    case "Thepla":
        z = z + "  Rs " + "25";
        break;
    case "Butter Chicken":
        z = z + "  Rs " + "180";
        break;
    case "Chole Bhature":
        z = z + "  Rs " + "80";
        break;
    case "Paneer Tikka":
        z = z + "  Rs " + "120";
        break;
    case "Dal Makhani":
        z = z + "  Rs " + "100";
        break;
    case "Amritsari Kulcha":
        z = z + "  Rs " + "60";
        break;
    case "Dosa":
        z = z + "  Rs " + "50";
        break;
    case "Idli":
        z = z + "  Rs " + "30";
        break;
    case "Vada":
        z = z + "  Rs " + "25";
        break;
    case "Sambar":
        z = z + "  Rs " + "30";
        break;
    case "Uttapam":
        z = z + "  Rs " + "60";
        break;
    case "Noodles":
        z = z + "  Rs " + "80";
        break;
    case "Manchurian":
        z = z + "  Rs " + "90";
        break;
    case "Spring Roll":
        z = z + "  Rs " + "70";
        break;
    case "Fried Rice":
        z = z + "  Rs " + "100";
        break;
    case "Chow Mein":
        z = z + "  Rs " + "90";
        break;
    case "Pasta":
        z = z + "  Rs " + "100";
        break;
    case "Lasagna":
        z = z + "  Rs " + "160";
        break;
    case "Risotto":
        z = z + "  Rs " + "140";
        break;
    case "Tiramisu":
        z = z + "  Rs " + "150";
        break;
    case "Gulab Jamun":
        z = z + "  Rs " + "20";
        break;
    case "Rasgulla":
        z = z + "  Rs " + "25";
        break;
    case "Ice Cream":
        z = z + "  Rs " + "40";
        break;
    case "Brownie":
        z = z + "  Rs " + "60";
        break;
    case "Jalebi":
        z = z + "  Rs " + "30";
        break;
    case "Dal Baati Churma":
        z = z + "  Rs " + "90";
        break;
    case "Gatte Ki Sabzi":
        z = z + "  Rs " + "70";
        break;
    case "Laal Maas":
        z = z + "  Rs " + "180";
        break;
    case "Ker Sangri":
        z = z + "  Rs " + "60";
        break;
    case "Pyaaz Kachori":
        z = z + "  Rs " + "20";
        break;
    case "Rosogolla":
        z = z + "  Rs " + "25";
        break;
    case "Mishti Doi":
        z = z + "  Rs " + "30";
        break;
    case "Fish Curry":
        z = z + "  Rs " + "150";
        break;
    case "Sandesh":
        z = z + "  Rs " + "35";
        break;
    case "Luchi":
        z = z + "  Rs " + "25";
        break;
    case "Pav Bhaji":
        z = z + "  Rs " + "80";
        break;
    case "Poha":
        z = z + "  Rs " + "30";
        break;
    case "Puran Poli":
        z = z + "  Rs " + "25";
        break;
    case "Misal Pav":
        z = z + "  Rs " + "50";
        break;
    case "Roti":
        z = z + "  Rs " + "10";
        break;
    case "Paneer Butter Masala":
        z = z + "  Rs " + "110";
        break;
    case "Rajma Chawal":
        z = z + "  Rs " + "80";
        break;
    case "Aloo Paratha":
        z = z + "  Rs " + "40";
        break;
    case "Kadhi Pakora":
        z = z + "  Rs " + "60";
        break;
    case "Prawn Curry":
        z = z + "  Rs " + "180";
        break;
    case "Fish Fry":
        z = z + "  Rs " + "140";
        break;
    case "Crab Masala":
        z = z + "  Rs " + "200";
        break;
    case "Lobster":
        z = z + "  Rs " + "300";
        break;
    case "Fish Tikka":
        z = z + "  Rs " + "150";
        break;
    case "Masala Chai":
        z = z + "  Rs " + "15";
        break;
    case "Lassi":
        z = z + "  Rs " + "30";
        break;
    case "Fruit Juice":
        z = z + "  Rs " + "40";
        break;
    default:
        z=z+"rate not present";
        break;
}
     
       return z;
    }
   
   
   public void add(String z,String item){
      
     try{
         
         
         String rs =z.replaceAll("[^0-9]","");
           
       
      String datas="insert into billing(items,price)values('"+item+"','"+Integer.valueOf(rs)+"');";

       
          
            stm.executeUpdate(datas);
            
                    msglb.setText("add to billing list");

        } catch (SQLException ex) {
            
            msglb.setText("error to update");
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NumberFormatException | NullPointerException ob){
                        msglb.setText("error in update to"+ob);
                     System.out.print(ob);
        }
   }
   
    
    
    
    
    private void comitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comitActionPerformed
         
        userchlb.setText("Your choice: "+comit.getSelectedItem()+"");
        String select=""+comit.getSelectedItem();
        
        DefaultListModel<String> mod=new DefaultListModel<>();        
        

        
   switch(select){
        
    case "select": 
        mod.addElement("");
         break;
         
    case "Fast Food":
        mod.addElement("Burger");
        mod.addElement("Pizza");
        mod.addElement("French Fries");
        mod.addElement("Sandwich");
        break;
    case "Nasta":
        mod.addElement("Tea");
        mod.addElement("Coffee");
        mod.addElement("Cold Coffee");
        mod.addElement("Biscuit");
        break;   
    case "Street Food":
        mod.addElement("Pani Puri");
        mod.addElement("Chaat");
        mod.addElement("Vada Pav");
        mod.addElement("Samosa");
        mod.addElement("Aloo Tikki");
        break;

    case "Gujarati":
        mod.addElement("Dhokla");
        mod.addElement("Khandvi");
        mod.addElement("Fafda");
        mod.addElement("Undhiyu");
        mod.addElement("Thepla");
        break;

    case "Punjabi":
        mod.addElement("Butter Chicken");
        mod.addElement("Chole Bhature");
        mod.addElement("Paneer Tikka");
        mod.addElement("Dal Makhani");
        mod.addElement("Amritsari Kulcha");
        break;

    case "South Indian":
        mod.addElement("Dosa");
        mod.addElement("Idli");
        mod.addElement("Vada");
        mod.addElement("Sambar");
        mod.addElement("Uttapam");
        break;

    case "Chinese":
        mod.addElement("Noodles");
        mod.addElement("Manchurian");
        mod.addElement("Spring Roll");
        mod.addElement("Fried Rice");
        mod.addElement("Chow Mein");
        break;

    case "Italian":
        mod.addElement("Pasta");
        mod.addElement("Lasagna");
        mod.addElement("Risotto");
        mod.addElement("Pizza");
        mod.addElement("Tiramisu");
        break;

    case "Desserts":
        mod.addElement("Gulab Jamun");
        mod.addElement("Rasgulla");
        mod.addElement("Ice Cream");
        mod.addElement("Brownie");
        mod.addElement("Jalebi");
        break;

    case "Rajasthani":
        mod.addElement("Dal Baati Churma");
        mod.addElement("Gatte Ki Sabzi");
        mod.addElement("Laal Maas");
        mod.addElement("Ker Sangri");
        mod.addElement("Pyaaz Kachori");
        break;

    case "Bengali":
        mod.addElement("Rosogolla");
        mod.addElement("Mishti Doi");
        mod.addElement("Fish Curry");
        mod.addElement("Sandesh");
        mod.addElement("Luchi");
        break;

    case "Maharashtrian":
        mod.addElement("Pav Bhaji");
        mod.addElement("Vada Pav");
        mod.addElement("Poha");
        mod.addElement("Puran Poli");
        mod.addElement("Misal Pav");
        break;

    case "North Indian":
        mod.addElement("Roti");
        mod.addElement("Paneer Butter Masala");
        mod.addElement("Rajma Chawal");
        mod.addElement("Aloo Paratha");
        mod.addElement("Kadhi Pakora");
        break;

    case "Seafood":
        mod.addElement("Prawn Curry");
        mod.addElement("Fish Fry");
        mod.addElement("Crab Masala");
        mod.addElement("Lobster");
        mod.addElement("Fish Tikka");
        break;

    case "Beverages":
        mod.addElement("Masala Chai");
        mod.addElement("Coffee");
        mod.addElement("Lassi");
        mod.addElement("Cold Coffee");
        mod.addElement("Fruit Juice");
        break;

    default:
        // Optional: handle unknown cuisine types
                mod.addElement("kuch nhi ");

        break;
}
           

        foodlt.setModel(mod);
        
     
    }//GEN-LAST:event_comitActionPerformed

    private void comitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comitMouseClicked

    private void orderbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderbtMouseClicked
        // TODO add your handling code here:
                orderbt.setForeground(Color.GRAY);

    }//GEN-LAST:event_orderbtMouseClicked

    private void orderbtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderbtMouseEntered
              orderbt.setBackground(Color.red);

    }//GEN-LAST:event_orderbtMouseEntered

    private void orderbtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderbtMouseExited
      
        orderbt.setBackground(Color.ORANGE);
    }//GEN-LAST:event_orderbtMouseExited

    @SuppressWarnings("IncompatibleEquals")
    private void orderbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbtActionPerformed
        
         if(order1.isEmpty()){ 
          
                    msglb.setText("your are not select food");

      }else{
          
          
               int user=JOptionPane.showConfirmDialog(rootPane," you want to oder all items  ","order",JOptionPane.YES_NO_CANCEL_OPTION);
          
          if(user==JOptionPane.YES_OPTION){
              
              order1.removeAllElements();
              JOptionPane.showMessageDialog(rootPane, " your order is confirm");
                msglb.setText("Order Done");
                
                

          }
          if(user==JOptionPane.NO_OPTION ){
              msglb.setText("add more items");
          }
           if(user==JOptionPane.CANCEL_OPTION || user==JOptionPane.CLOSED_OPTION ){
           
                                         int us=JOptionPane.showConfirmDialog(rootPane,"are you cancel your order","cancel",JOptionPane.YES_NO_CANCEL_OPTION);
          
                                            if(us==JOptionPane.YES_OPTION){
              
                                            JOptionPane.showMessageDialog(rootPane, " your are order cancel");
                                         msglb.setText("cancel order");
                                                 order1.removeAllElements();

                                              String dele="delete from billing;";
                                                 try{
                                                     stm1=con.createStatement();
                                                   stm1.executeUpdate(dele);
                                          }catch(SQLException |NullPointerException ob){
                                                  msglb.setText("fetching in refresh data");

                                                    }
                                                }
                                             if(us==JOptionPane.NO_OPTION ){
                                                msglb.setText("add more items");
            
                                                    }
            }
    }
    }//GEN-LAST:event_orderbtActionPerformed

    private void billbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbtActionPerformed
      
        cashier cash= new cashier();
        cash.setBounds(250,30,1000,800);
        cash.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_billbtActionPerformed
   
     

   
    
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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainpage m1=new mainpage();
                   m1.setVisible(true);
                m1.setBounds(10,20,990,700);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billbt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comit;
    private javax.swing.JList<String> foodlt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel msglb;
    private javax.swing.JButton orderbt;
    private javax.swing.JList<String> orderlt;
    private javax.swing.JLabel qrlb;
    private javax.swing.JPanel qrpl;
    private javax.swing.JButton selebt;
    private javax.swing.JLabel userchlb;
    private javax.swing.JLabel userlb;
    // End of variables declaration//GEN-END:variables
}
