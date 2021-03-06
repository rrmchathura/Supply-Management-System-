
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

public class Delivery extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /** Creates new form StockEntry */
    public Delivery() {
        initComponents();
        update_table();
    }

    private void update_table() {

        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String sql="select * from delivery_table";
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        delivery_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_truck = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_place = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_remark = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        txt_height = new javax.swing.JTextField();
        txt_width = new javax.swing.JTextField();
        txt_length = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        rSLabelImage2 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        delivery_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delivery_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delivery_tableMouseEntered(evt);
            }
        });
        delivery_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                delivery_tableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(delivery_table);

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 850, 190));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Delivery Report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print32.png"))); // NOI18N
        jButton10.setText("Print");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton10.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton10.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, -1));

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
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

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
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

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
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Client ID :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, -1));

        txt_name.setEditable(false);
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Client Name :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Truck Number :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));
        getContentPane().add(txt_truck, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 180, -1));
        getContentPane().add(txt_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Description :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Loading Place :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 17));
        getContentPane().add(txt_place, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 180, -1));

        txt_date.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Delivery Date :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Length :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Width :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Height :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ammount :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Rate :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Remarks :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));
        getContentPane().add(txt_remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 159, -1));
        getContentPane().add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 159, -1));
        getContentPane().add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 159, -1));
        getContentPane().add(txt_height, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 159, -1));
        getContentPane().add(txt_width, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 159, -1));
        getContentPane().add(txt_length, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 159, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/add.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 91, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/update.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 100, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 91, 50));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/close.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 100, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/print-icon.png"))); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 200, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 90, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgonline-com-ua-ReplaceColor-hgMWcqNo5oH9B.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

        setSize(new java.awt.Dimension(1226, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();
        double amount=Double.parseDouble(txt_amount.getText());
        double rate=Double.parseDouble(txt_rate.getText());
        double delivery=amount*rate;
         PreparedStatement pst;
        double tot=0,tot1=0;
        try{

            String sql="select total_delivery from client_info where id='"+txt_id.getText()+"'";

            Statement statement = (Statement) conn.createStatement();
            ResultSet rs=statement.executeQuery(sql);

            while(rs.next()){
                tot=rs.getDouble(1);
            }
            tot+=delivery;
            sql="update client_info set total_delivery='" + tot +"' where id='"+txt_id.getText()+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            //sql="insert into client_info(id,name,address,contact,datee) values (NULL,'" + txt_name.getText() + "','" + txt_address.getText() + "','" + txt_contact.getText() + "','"+val+ "')";



           // JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            //String sql="insert into client_info values(?,?,?,?)";
            String val=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();

            amount=Double.parseDouble(txt_amount.getText());
            rate=Double.parseDouble(txt_rate.getText());
            double mul=amount*rate;
            String s=""+mul;
            
            String sql="select total_paid_amount from client_info where id='"+txt_id.getText()+"'";

            Statement statement = (Statement) conn.createStatement();
            ResultSet rs=statement.executeQuery(sql);

            while(rs.next()){
                tot1=rs.getDouble(1);
            }
            double due =tot-tot1;
            String du=""+due;
            String tot_delivery=""+tot;
            String ad="0";
            //String sql="insert into client_info(id,name,address,contact,datee) values (NULL,'" + txt_name.getText() + "','" + txt_address.getText() + "','" + txt_contact.getText() + "','"+val+ "')";
            if(due>=0)
                sql="insert into delivery_table values(null,'"+txt_id.getText()+"','"+txt_name.getText()+"','"+txt_truck.getText()+"','"+txt_description.getText()+"','"+txt_place.getText()+"','"+val+"','"+txt_length.getText()+"','"+txt_width.getText()+"','"+txt_height.getText()+"','"+txt_amount.getText()+"','"+txt_rate.getText()+"','"+s+"','"+tot_delivery+"','"+du+"','"+ad+"','"+txt_remark.getText()+"')";
            else {
                due*=(-1);
                ad=""+due;
                sql="insert into delivery_table values(null,'"+txt_id.getText()+"','"+txt_name.getText()+"','"+txt_truck.getText()+"','"+txt_description.getText()+"','"+txt_place.getText()+"','"+val+"','"+txt_length.getText()+"','"+txt_width.getText()+"','"+txt_height.getText()+"','"+txt_amount.getText()+"','"+txt_rate.getText()+"','"+s+"','"+tot_delivery+"','"+du+"','"+ad+"','"+txt_remark.getText()+"')";
            }
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

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
        System.out.println("sfdfsd");
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();
        try{
        String id=txt_id.getText();
            System.out.println("fds : "+id);
        String sql="select name from client_info where id='"+id+"'";

        Statement statement = (Statement) conn.createStatement();

        ResultSet rs=statement.executeQuery(sql);
        //System.out.println("gffg");
        String nme;
        double t_paid_amount,t_discount,t_delivery,cal;
           // System.out.println(""+rs.next());
            if(rs.next()==false){
                System.out.println("sfd");
                txt_name.setText("");
            }
            else{

               nme=rs.getString(1);
               txt_name.setText(nme);
            }

            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txt_idKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txt_id.setText("");
        txt_name.setText("");
        txt_amount.setText("");
        txt_description.setText("");
        txt_date.setDate(null);
        txt_height.setText("");
        txt_length.setText("");
        txt_truck.setText("");
        txt_remark.setText("");
        txt_place.setText("");
        txt_width.setText("");
        txt_rate.setText("");
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void delivery_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delivery_tableMouseClicked
     
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            int row=delivery_table.getSelectedRow();rowf=row;
            String table_click=delivery_table.getModel().getValueAt(row, 0).toString();
            String sql="select * from delivery_table where serial_no ='"+table_click+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("id");
                txt_id.setText(add1);
                String add2=rs.getString("name");
                txt_name.setText(add2);
                String add3=rs.getString("truck_number");
                txt_truck.setText(add3);
                String add4=rs.getString("description");
                txt_description.setText(add4);

                String add5=rs.getString("loading_place");
                txt_place.setText(add5);

                String add6=rs.getObject("delivery_date").toString();
                java.util.Date dat = new SimpleDateFormat("yyyy-MM-dd").parse(add6);
                txt_date.setDate(dat);

                String add7=rs.getString("length");
                txt_length.setText(add7);

                String add8=rs.getString("width");
                txt_width.setText(add8);

                 String add9=rs.getString("height");
                txt_height.setText(add9);

                String add10=rs.getString("amount");
                txt_amount.setText(add10);

                String add11=rs.getString("rate");
                txt_rate.setText(add11);

                 String add12=rs.getString("remarks");
                txt_remark.setText(add12);
                

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
    }//GEN-LAST:event_delivery_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PreparedStatement pst;

        DataBase_connect  obj=new DataBase_connect();

        Connection conn=obj.Open();

        try{
            String table_click=delivery_table.getModel().getValueAt(rowf, 0).toString();

            String val1=txt_id.getText();
            String val10=txt_amount.getText();
            String val11=txt_rate.getText();
            double v1=Double.parseDouble(val10);
            double v2=Double.parseDouble(val11);
            double v=v1*v2;

            //trunsaction
            String sql="select total_amount from delivery_table where serial_no='"+table_click+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            double dub1=0,dub2=0,dub;
            if(rs.next())
            {
                dub1=rs.getDouble(1);
            }

            sql="select total_delivery from client_info where id='"+val1+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                dub2=rs.getDouble(1);
            }
            dub=dub2-dub1+v;
            sql="update client_info set total_delivery='"+dub+"' where id='"+val1+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();

            String val2=txt_name.getText();
            String val3=txt_truck.getText();
            String val4=txt_description.getText();

            String val5=txt_place.getText();
            String val6=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
            String val7=txt_length.getText();
            String val8=txt_width.getText();
            String val9=txt_height.getText();
            
            String val12=""+v;
            String val13=txt_remark.getText();

            sql="update delivery_table set id ='"+val1+"',name='"+val2+"',truck_number='"+val3+"',description='"+val4+"',loading_place='"+val5+"',delivery_date='"+val6+"',length='"+val7+"',width='"+val8+"',height='"+val9+"',amount='"+val10+"',rate='"+val11+"',total_amount='"+val12+"',remarks='"+val13+"' "+"where serial_no ='"+table_click+"'";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "updated");
            update_table();
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

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int p=JOptionPane.showConfirmDialog(null, "Do you really want to delete","delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            PreparedStatement pst;

            DataBase_connect  obj=new DataBase_connect();

            Connection conn=obj.Open();
            String sql="delete from delivery_table where serial_no=?";
            try{
                int row=rowf;
                System.out.println("row "+row);
                String table_click=delivery_table.getModel().getValueAt(row, 0).toString();
                pst=(PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, table_click);
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            delivery_table.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void delivery_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delivery_tableKeyPressed
       
    }//GEN-LAST:event_delivery_tableKeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new client_info().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        new Collection_tab().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        this.dispose();

        new MyCalender().setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void delivery_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delivery_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delivery_tableMouseEntered

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new Client_page().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Delivery frm=new Delivery();
                frm.setVisible(true);
                //frm.setSize(1020, 680);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable delivery_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private javax.swing.JTextField txt_amount;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_height;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_length;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_place;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_remark;
    private javax.swing.JTextField txt_truck;
    private javax.swing.JTextField txt_width;
    // End of variables declaration//GEN-END:variables
    int rowf;
}
