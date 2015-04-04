/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

/**
 *
 * @author Dell
 */
public class RealEstate extends javax.swing.JFrame {

    /**
     * Creates new form RealEstate
     */
     HouseFile housefile=new HouseFile();
     SortedList sortedList=SortedList.getInstantOf();
     int printerindex;
    public RealEstate() {
        initComponents();
       
    }
    
    
    
    void clear(){
                txtLotNumber.setText("");
                 txtFirstName.setText("");
                txtLastName.setText("");
                txtNoOfRoom.setText("");
                txtPrice.setText("");
                txtSqrt.setText("");
                  lblMsg.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFind = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAddrecord = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoOfRoom = new javax.swing.JTextField();
        txtLotNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSqrt = new javax.swing.JTextField();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, -1));

        btnAddrecord.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddrecord.setText("Add");
        btnAddrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddrecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 70, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 70, -1));

        txtDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(txtDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 70, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Price");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Lot Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("No Of Rooms");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Square Feet");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(txtNoOfRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, -1));
        getContentPane().add(txtLotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, -1));
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 180, -1));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));
        getContentPane().add(txtSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, -1));
        getContentPane().add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddrecordActionPerformed

 ListHouse list=new ListHouse();
 list.setLotNumber(Integer.parseInt(txtLotNumber.getText().trim()));
   
        if (sortedList.isAvalbible(list)) {
            lblMsg.setText("Record All Ready Available");
            return;
        }
 
  
  
 list.setFirstName(txtFirstName.getText().trim());
 list.setLastName(txtLastName.getText().trim());
 list.setPrice(Double.parseDouble(txtPrice.getText().trim()));
 list.setNoOFBedRooms(Integer.parseInt(txtNoOfRoom.getText().trim()));
 list.setSquareFeet(Integer.parseInt(txtSqrt.getText().trim()));
 sortedList.insert(list);
        
         lblMsg.setText("Record Added");
        
 

 
    }//GEN-LAST:event_btnAddrecordActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
     try {
            
            
            
           int lotnumber=Integer.parseInt(txtLotNumber.getText().trim());
          ListHouse listHouse= sortedList.find(lotnumber);
            
         
            if (listHouse==null) {
                lblMsg.setText("No Record Dispaly");
                return;
            }
             
                         
          String FirstName=null;
          String LastName=null;
          int NoOFBedRooms=0;
          double Price=0;
          int SquareFeet=0;
          
                if (listHouse!=null) {
                    
                
                FirstName=listHouse.getFirstName();
                LastName=listHouse.getLastName();
                NoOFBedRooms=listHouse.getNoOFBedRooms();
                Price=listHouse.getPrice();
                SquareFeet=listHouse.getSquareFeet();
                }
            
        
     
            
                txtFirstName.setText(FirstName);
                txtLastName.setText(LastName);
                txtNoOfRoom.setText(""+NoOFBedRooms);
                txtPrice.setText(""+Price);
                txtSqrt.setText(""+SquareFeet);
            
        }catch(NullPointerException ex){
            ex.printStackTrace();
            
        }catch(NumberFormatException ex){
            lblMsg.setText("Enter Lot No");
        } catch (Exception e) {
         e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
           
        
              int lotnumber=Integer.parseInt(txtLotNumber.getText());
          
            for (ListHouse object : sortedList.theArray) {
            
                if (object!=null) {
                    
                
                if (object.getLotNumber()==lotnumber) {
                    sortedList.remove(object);
                    
                }
                }
                
        }
            lblMsg.setText("Record Delete");
         
        
        
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        Dispaly(printerindex);
        ++printerindex;
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      housefile.Work_With_JSONWrite(sortedList.theArray);
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           Dispaly(0);
           this.printerindex=1;
           lblMsg.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEstate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddrecord;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLotNumber;
    private javax.swing.JTextField txtNoOfRoom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSqrt;
    // End of variables declaration//GEN-END:variables

 
    void Dispaly(int index){
        
          ListHouse[] listHouse = sortedList.bubbleSort();
        if (listHouse.length<=index) {
           
             return;
        }
        
          int LotNumber=0;
          String FirstName=null;
          String LastName=null;
          int NoOFBedRooms=0;
          double Price=0;
          int SquareFeet=0;
        
        
          for (int i = 0; i <= index ; i++) {
            
        
                if (listHouse!=null) {
                    
                LotNumber=listHouse[i].getLotNumber();
                FirstName=listHouse[i].getFirstName();
                LastName=listHouse[i].getLastName();
                NoOFBedRooms=listHouse[i].getNoOFBedRooms();
                Price=listHouse[i].getPrice();
                SquareFeet=listHouse[i].getSquareFeet();
                }
              
                
                
           }
    
                txtLotNumber.setText(""+LotNumber);
                txtFirstName.setText(FirstName);
                txtLastName.setText(LastName);
                txtNoOfRoom.setText(""+NoOFBedRooms);
                txtPrice.setText(""+Price);
                txtSqrt.setText(""+SquareFeet);
    
    
    
        
        
    }










}
