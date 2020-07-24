


import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;
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


public class client_info extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public client_info()
    {
        initComponents();

        set_client_id();

        update_table();


    }
    public void close(){
        WindowEvent winclosingevent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);
    }

    private void set_client_id()
    {

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try {

            String sql="select max_id from variable_table";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            System.out.println("aaaaaaa");
            rs=pst.executeQuery(sql);
            System.out.println("cfjl");
            if(rs.next())
            {
                int num=rs.getInt(1) + 1;
                txt_id.setText(""+num);
            }
        }catch(Exception e) {
            System.out.println("max id te exception "+e);
        }

        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(client_info.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    public void Searching(){

         int flg=0;

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{

            String sql="select * from client_info where name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs=pst.executeQuery();
            if(rs.next() ){
                flg=1;
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
            else {
                set_client_id();

                txt_name.setText("");
                txt_address.setText("");
                txt_contact.setText("");
                txt_date.setDate(null);
            }
        }catch(Exception e){

        }

        try{
            String sql="select * from  client_info where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs=pst.executeQuery();
            if(rs.next() && flg==0){
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
            else if(flg==0){
                flg=1;
                set_client_id();

                txt_name.setText("");
                txt_address.setText("");
                txt_contact.setText("");
                txt_date.setDate(null);
            }

        }catch(Exception e){

        } finally {
            try {
                conn.close();System.out.println("disconnected");
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 550, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serach", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(153, 204, 255));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 19, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/search-icon.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 210, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Client ID");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, 49));

        txt_contact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contact");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        txt_date.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 170, 30));

        jLabel7.setFont(new java.awt.Font("Trajan Pro 3", 1, 24)); // NOI18N
        jLabel7.setText("Client Information");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, 40));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/add.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 100, 50));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/close.png"))); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("delete the selected row");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 50));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/update.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 100, 50));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/clear.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 100, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print-icon.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 210, 40));

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
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, 60));

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
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, -1));

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
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/money-icon.png"))); // NOI18N
        jButton3.setText("Transaction");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/new32.png"))); // NOI18N
        jButton2.setText("New Client");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

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
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

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
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 100, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgonline-com-ua-ReplaceColor-hgMWcqNo5oH9B.jpg"))); // NOI18N
        jPanel4.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1170, 520));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 520));

        setSize(new java.awt.Dimension(1189, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            //max_id upadate

            String sql="select max_id from variable_table";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery(sql);
            int num=0;
            if(rs.next())
            {
                num=rs.getInt(1)+1;
                sql="UPDATE variable_table SET max_id='" + num +"'";
                pst=(PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
            }
            num++;
            

            String val=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
            sql="insert into client_info(id,name,address,contact,datee) values (NULL,'" + txt_name.getText() + "','" + txt_address.getText() + "','" + txt_contact.getText() + "','"+val+ "')";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

            txt_id.setText(""+num);            //String sql="insert into client_info values(?,?,?,?)";
            txt_name.setText("");
            txt_address.setText("");
            txt_contact.setText("");
            txt_date.setDate(null);
            
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

        set_client_id();

        txt_name.setText("");
        txt_address.setText("");
        txt_contact.setText("");
        txt_date.setDate(null);

    }//GEN-LAST:event_clearActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            client_table.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();

        new Delivery().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.dispose();

        new Collection_tab().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        new Delivery().setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        this.dispose();

        new MyCalender().setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();

        new Client_page().setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
         Searching();
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTable client_table;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
