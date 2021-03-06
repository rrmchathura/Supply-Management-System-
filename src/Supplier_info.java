


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Supplier_info extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    public Supplier_info()
    {
        initComponents();
        update_table();
    }

    public void close()
    {
        WindowEvent winclosingevent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);
    }

    public void currentdate()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        date.setText("Date-"+day+"/"+(month+1)+"/"+year);
        int second=cal.get(Calendar.SECOND);
        int mn=cal.get(Calendar.MINUTE);
        int hr=cal.get(Calendar.HOUR);

    }
    
    private void update_table() {
        
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String sql="select id,name,address,contact,datee from client_info";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            client_table.setModel(DbUtils.resultSetToTableModel(rs));
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
    
   
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_pro_name = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, -1, 259));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supplier Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 143, -1, -1));

        client_table.setModel(new javax.swing.table.DefaultTableModel(
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
        client_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(client_table);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 840, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serach Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(153, 204, 255));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 17, 200, 34));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, 60));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 196, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 196, -1));
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 196, -1));
        getContentPane().add(txt_pro_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 196, -1));
        getContentPane().add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 196, 21));

        txt_date.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 196, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contact");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pro. Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Supplier ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        jLabel7.setText("Supplier Infomation");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 480, 50));

        save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/add.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 90, 40));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/close.png"))); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("delete the selected row");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 90, 40));

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/update.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 100, 50));

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/clear.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 100, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 80, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgonline-com-ua-ReplaceColor-hgMWcqNo5oH9B.jpg"))); // NOI18N
        jPanel4.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 530));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            //String sql="insert into client_info values(?,?,?,?)";
            String val=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
            String sql="insert into client_info(id,name,address,contact,datee) values (NULL,'" + txt_name.getText() + "','" + txt_address.getText() + "','" + txt_contact.getText() + "','"+val+ "')";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        update_table();

    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int p=JOptionPane.showConfirmDialog(null, "Do you really want to delete","delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            PreparedStatement pst;

            DataBase_connect  obj=new DataBase_connect();

            Connection conn=obj.Open();
            String sql="delete from client_info where id=?";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "deleted");
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }

            update_table();

        }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String val=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
            String sql="update client_info set name='" + txt_name.getText() + "',address='" + txt_address.getText() + "',contact='" + txt_contact.getText() +"',datee='" +val+ "' where id='" + txt_id.getText()  + "'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        update_table();

    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txt_id.setText("");
        txt_name.setText("");
        txt_address.setText("");
        txt_contact.setText("");
        txt_date.setDate(null);

    }//GEN-LAST:event_clearActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{

            String sql="select * from client_info where name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("id");
                txt_id.setText(add1);
                String add2=rs.getString("name");
                txt_name.setText(add2);
                String add3=rs.getString("address");
                txt_address.setText(add3);
                String add4=rs.getString("contact");
                txt_contact.setText(add4);
                
            }
        }catch(Exception e){
            
        }

        try{
            String sql="select * from  client_info where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("id");
                txt_id.setText(add1);
                String add2=rs.getString("name");
                txt_name.setText(add2);
                String add3=rs.getString("address");
                txt_address.setText(add3);
                String add4=rs.getString("contact");
                txt_contact.setText(add4);
                
            }
        }catch(Exception e){
            
        } finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_searchKeyReleased

    private void client_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_tableMouseClicked

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            int row=client_table.getSelectedRow();
            String table_click=client_table.getModel().getValueAt(row, 0).toString();
            String sql="select * from client_info where id ='"+table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("id");
                txt_id.setText(add1);
                String add2=rs.getString("name");
                txt_name.setText(add2);
                String add3=rs.getString("address");
                txt_address.setText(add3);
                String add4=rs.getString("contact");
                txt_contact.setText(add4);

                String ad=rs.getObject("datee").toString();
                java.util.Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(ad);
                txt_date.setDate(dat);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                conn.close();System.out.println("disconnected");
            } catch (SQLException ex) {
                Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        update_table();

    }//GEN-LAST:event_client_tableMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new client_info().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new Delivery().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        this.dispose();

        new MyCalender().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
               // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTable client_table;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private rojerusan.RSLabelImage rSLabelImage2;
    private javax.swing.JButton save;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contact;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pro_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
