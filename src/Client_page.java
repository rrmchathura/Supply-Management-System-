

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Client_page.java
 *
 * Created on Sep 21, 2012, 1:56:01 PM
 */

/**
 *
 * @author Vish
 */
public class Client_page extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    public Client_page() {
        initComponents();
        update_table("0");

        //txt_name.setComponentPopupMenu(new JTextField("khsdfkshfkh"));
    }

    public void printing()
    {
        MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
           delivery_table.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){

        }
        return ;
    }

    private void update_table(String id_num) {

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String val1=((JTextField)txt_datef.getDateEditor().getUiComponent()).getText();
            String val2=((JTextField)txt_datet.getDateEditor().getUiComponent()).getText();
            String sql="SELECT serial_no AS serial, truck_number, description, loading_place, delivery_date AS date, length, width, height, amount, rate, total_amount AS total FROM delivery_table where id ='" + id_num
                    +"' and delivery_date between '"+val1+"' and '" +  val2+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            delivery_table.setModel(DbUtils.resultSetToTableModel(rs));
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


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        txt_address = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        delivery_table = new javax.swing.JTable();
        txt_name = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_datef = new com.toedter.calendar.JDateChooser();
        txt_datet = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        search1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        txt_address.setText(".");
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 184, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delivery_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(delivery_table);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 760, 270));

        txt_name.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        txt_name.setText("Serch Client");
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 300, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print32.png"))); // NOI18N
        jButton15.setText("Print");
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton15.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton15.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 80, -1));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Search-icon (1).png"))); // NOI18N
        jButton16.setText("Search");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton16.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton16.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 80, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_datef.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txt_datef, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 19, 113, -1));

        txt_datet.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txt_datet, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 19, 112, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("From");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 19, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 330, 63));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serach Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search1.setBackground(new java.awt.Color(153, 204, 255));
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        jPanel4.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 19, 159, 23));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search-icon.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 240, 60));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search-icon.png"))); // NOI18N
        jButton13.setText("Search");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton13.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton13.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 80, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Calendar-icon.png"))); // NOI18N
        jButton11.setText("Calender");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print32.png"))); // NOI18N
        jButton10.setText("Print");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton10.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton10.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Collection-2-icon.png"))); // NOI18N
        jButton9.setText("Collection");
        jButton9.setToolTipText("Ctrl + C");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/money-icon.png"))); // NOI18N
        jButton7.setText("Transaction");
        jButton7.setToolTipText("Ctrl + T");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/new32.png"))); // NOI18N
        jButton3.setText("New Client");
        jButton3.setToolTipText("Ctrl + N");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/1-Normal-Home-icon.png"))); // NOI18N
        jButton8.setText("Home");
        jButton8.setToolTipText("Ctrl + H");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgonline-com-ua-ReplaceColor-hgMWcqNo5oH9B.jpg"))); // NOI18N
        jPanel2.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 530));

        setSize(new java.awt.Dimension(1166, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new client_info().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        new Collection_tab().setVisible(true);
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        this.dispose();

        new MyCalender().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased


    }//GEN-LAST:event_search1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        this.dispose();

        new Delivery().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

//        try{
//
//            String sql="select * from client_info where name=?";
//            pst=(PreparedStatement) conn.prepareStatement(sql);
//            pst.setString(1, search1.getText());
//            rs=pst.executeQuery();
//
//            if(rs.next())
//            {
//                String add2=rs.getString("name");
//                txt_name.setText(add2);
//                String add3=rs.getString("address");
//                txt_address.setText(add3);
//                String add4=rs.getString("contact");
//                txt_contact.setText(add4);
//
//            }
//            else {
//                set_client_id();
//                txt_name.setText("");
//                txt_address.setText("");
//                txt_contact.setText("");
//            }
//        }catch(Exception e){
//
//        }

        try{
            String sql="select * from  client_info where id=?";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add2=rs.getString("name");
                txt_name.setText(add2);
                String add3=rs.getString("address");
                String add4=rs.getString("contact");
                txt_address.setText("Address :  " +add3 + "   Contact: "+ add4);
                update_table(search1.getText());

                String ad=rs.getObject("datee").toString();
                java.util.Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(ad);
                //txt_date.setDate(dat);

            }
            else {
                txt_name.setText("No Client Found");
                txt_address.setText(".");
                update_table("bal");
            }

        }catch(Exception e){

        } finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        printing();

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable delivery_table;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private javax.swing.JTextField search1;
    private javax.swing.JLabel txt_address;
    private com.toedter.calendar.JDateChooser txt_datef;
    private com.toedter.calendar.JDateChooser txt_datet;
    private javax.swing.JLabel txt_name;
    // End of variables declaration//GEN-END:variables



}
