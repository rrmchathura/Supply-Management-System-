
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Client_information.java
 *
 * Created on Sep 18, 2012, 3:20:48 AM
 */

/**
 *
 * @author Vish
 */
public class Collection extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    private void update_table() {

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String sql="select * from collection_table";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            collection_table1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                conn.close();
                System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Collection() {

        initComponents();

        update_table();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        collection_table1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_due1 = new javax.swing.JTextField();
        txt_advance1 = new javax.swing.JTextField();
        txt_discount1 = new javax.swing.JTextField();
        txt_paidAmmount1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_date1 = new com.toedter.calendar.JDateChooser();
        txt_remark1 = new javax.swing.JTextField();
        txt_name1 = new javax.swing.JTextField();
        txt_id1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_remarks1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        button_done9 = new javax.swing.JButton();
        button_done10 = new javax.swing.JButton();
        button_done11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Collection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, -1, -1));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Calendar-icon.png"))); // NOI18N
        jButton6.setText("Calender");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 60));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print32.png"))); // NOI18N
        jButton5.setText("Print");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton5.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton5.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 10, 80, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Collection-2-icon.png"))); // NOI18N
        jButton4.setText("Collection");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/money-icon.png"))); // NOI18N
        jButton3.setText("Transaction");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 10, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/new32.png"))); // NOI18N
        jButton2.setText("New Client");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/1-Normal-Home-icon.png"))); // NOI18N
        jButton8.setText("Home");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        collection_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        collection_table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collection_table1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                collection_table1MouseEntered(evt);
            }
        });
        collection_table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                collection_table1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(collection_table1);

        jScrollPane1.setViewportView(jScrollPane3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 840, 160));

        jLabel8.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        jLabel8.setText("Recent Collections");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        txt_due1.setText("0");
        jPanel1.add(txt_due1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 197, -1));

        txt_advance1.setText("0");
        txt_advance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_advanceActionPerformed(evt);
            }
        });
        jPanel1.add(txt_advance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 197, -1));

        txt_discount1.setText("0");
        jPanel1.add(txt_discount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 197, -1));

        txt_paidAmmount1.setText("0");
        jPanel1.add(txt_paidAmmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 197, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Paid Amount :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Discount :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Advance :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total Due :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        txt_date1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txt_date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 204, 18));

        txt_remark1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_id1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_id1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id1KeyTyped(evt);
            }
        });
        jPanel1.add(txt_remark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 204, -1));
        jPanel1.add(txt_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 204, -1));

        txt_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel1.add(txt_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 204, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Client ID :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Name :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        txt_remarks1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_remarks1.setText("Des. :");
        jPanel1.add(txt_remarks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Date :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        button_done9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_done9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/done1.png"))); // NOI18N
        button_done9.setText("Done");
        button_done9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_doneActionPerformed(evt);
            }
        });
        jPanel1.add(button_done9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, 50));

        button_done10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_done10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/clear.png"))); // NOI18N
        button_done10.setText("Clear");
        button_done10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_done1ActionPerformed(evt);
            }
        });
        jPanel1.add(button_done10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, -1, 50));

        button_done11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_done11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print-icon.png"))); // NOI18N
        button_done11.setText("Print");
        button_done11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_done2ActionPerformed(evt);
            }
        });
        jPanel1.add(button_done11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 170, 40));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search-icon.png"))); // NOI18N
        jButton7.setText("Search");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton7.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton7.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 80, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgonline-com-ua-ReplaceColor-hgMWcqNo5oH9B.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 500));

        setSize(new java.awt.Dimension(1171, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new Delivery().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new client_info().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        this.dispose();

        new MyCalender().setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void due_calculation()
    {
        double t_tk = 0,t_delivery = 0,t_discount = 0;
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            
            String sql="select total_paid_amount,total_delivery,total_discount from client_info where id='"+txt_id1.getText()+"'";
            System.out.println("sd");
            Statement statement = (Statement) conn.createStatement();
            
            ResultSet rs=statement.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("df");
                t_tk=rs.getDouble(1);
                t_delivery=rs.getDouble(2);
                t_discount=rs.getDouble(3);
            }
            double due =t_tk-t_delivery-t_discount;
            String du=""+due;
            System.out.println("due");
            if(due>=0)
            {
                txt_due1.setText(du);
                txt_advance1.setText("0");
            }
            else {

                due=-1*due;
                du=""+due;
                txt_due1.setText("0");
                txt_advance1.setText(du);

            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"asd");
        }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return;
    }

    public void takin_input_from_table()
    {

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            int row=collection_table1.getSelectedRow();
            rowf=row;
            String table_click=collection_table1.getModel().getValueAt(row, 0).toString();
            String sql="select * from collection_table where serial_no ='"+table_click+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()) {
                String add1=rs.getString("id");
                txt_id1.setText(add1);
                String add2=rs.getString("name");
                txt_name1.setText(add2);
                String add3=rs.getString("description");
                txt_remark1.setText(add3);

                String add6=rs.getObject("collection_date").toString();
                java.util.Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(add6);
                txt_date1.setDate(dat);

                String add7=rs.getString("discount");
                txt_discount1.setText(add7);

                String add8=rs.getString("taka");
                txt_paidAmmount1.setText(add8);

                due_calculation();

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e+" fd");
        }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        update_table();
    }

    private void txt_id1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id1KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_txt_id1KeyTyped

    private void txt_id1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id1KeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_txt_id1KeyReleased

    private void txt_id1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id1KeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_id1KeyPressed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped

}//GEN-LAST:event_txt_idKeyTyped

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();
        try{
            String id=txt_id1.getText();

            String sql="select name,total_paid_amount,total_discount,total_delivery from client_info where id='"+id+"'";

            Statement statement = (Statement) conn.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            System.out.println("gffg");
            String nme;
            double t_paid_amount,t_discount,t_delivery,cal;
            if(rs.next()){

                nme=rs.getString(1);
                t_paid_amount=rs.getDouble(2);
                t_discount=rs.getDouble(3);
                t_delivery=rs.getDouble(4);
                txt_name1.setText(nme);
                cal=t_delivery-t_paid_amount-t_discount;

                if(cal>=0) {
                    String s=""+cal;
                    txt_due1.setText(s);
                } else {
                    cal=cal*(-1);
                    String s=""+cal;
                    txt_advance1.setText(s);
                }

            }else{
                txt_name1.setText("");
                txt_due1.setText("0");
                txt_advance1.setText("0");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt_idKeyReleased

    private void txt_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyPressed

}//GEN-LAST:event_txt_idKeyPressed

    private void txt_advanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_advanceActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_advanceActionPerformed

    private void button_done2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_done2ActionPerformed

        MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            collection_table1.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){

        }
    }//GEN-LAST:event_button_done2ActionPerformed

    private void button_done1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_done1ActionPerformed

        txt_name1.setText("");
        txt_id1.setText("");
        txt_remark1.setText("");
        txt_date1.setDate(null);

        txt_discount1.setText("0");
        txt_advance1.setText("0");
        txt_due1.setText("0");
        txt_paidAmmount1.setText("0");

    }//GEN-LAST:event_button_done1ActionPerformed

    private void button_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_doneActionPerformed

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();
        double total_taka=0,tot1=0;String id = null;
        try{
            double dub=Double.parseDouble(txt_paidAmmount1.getText());

            String sql="select total_paid_amount from client_info where id='"+txt_id1.getText()+"'";

            Statement statement = (Statement) conn.createStatement();

            ResultSet rs=statement.executeQuery(sql);

            while(rs.next()){
                total_taka=rs.getDouble(1);
            }
            total_taka+=dub;

            dub=Double.parseDouble(txt_discount1.getText());

            sql="select total_discount from client_info where id='"+txt_id1.getText()+"'";

            rs=statement.executeQuery(sql);

            while(rs.next()){
                tot1=rs.getDouble(1);
            }
            tot1+=dub;

            id=txt_id1.getText();

            String total_tk="" +total_taka;

            String val=((JTextField)txt_date1.getDateEditor().getUiComponent()).getText();

            sql="insert into collection_table(id,name,taka,total_taka,discount,collection_date, description) values ('" + txt_id1.getText() + "','" + txt_name1.getText() + "','" + txt_paidAmmount1.getText() + "','"+ total_tk+ "','" + txt_discount1.getText() +"','" + val +"','" + txt_remark1.getText() + "')";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();

            // JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            String sql="update client_info set total_paid_amount='" + total_taka +"',total_discount='"+tot1+"' where id='"+id+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Done");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        update_table();

        txt_id1.setText("");
        txt_name1.setText("");
        txt_remark1.setText("");
        txt_discount1.setText("0");
        txt_paidAmmount1.setText("0");
        txt_advance1.setText("0");
        txt_due1.setText("0");
        txt_date1.setDate(null);
    }//GEN-LAST:event_button_doneActionPerformed

    private void collection_table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection_table1MouseClicked

        takin_input_from_table();
}//GEN-LAST:event_collection_table1MouseClicked

    private void collection_table1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collection_table1MouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_collection_table1MouseEntered

    private void collection_table1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_collection_table1KeyPressed

}//GEN-LAST:event_collection_table1KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {

                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                     //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(StockEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(StockEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(StockEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(StockEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

                new Collection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_done10;
    private javax.swing.JButton button_done11;
    private javax.swing.JButton button_done9;
    private javax.swing.JTable collection_table1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private javax.swing.JTextField txt_advance1;
    private com.toedter.calendar.JDateChooser txt_date1;
    private javax.swing.JTextField txt_discount1;
    private javax.swing.JTextField txt_due1;
    private javax.swing.JTextField txt_id1;
    private javax.swing.JTextField txt_name1;
    private javax.swing.JTextField txt_paidAmmount1;
    private javax.swing.JTextField txt_remark1;
    private javax.swing.JLabel txt_remarks1;
    // End of variables declaration//GEN-END:variables
    int rowf;
}
