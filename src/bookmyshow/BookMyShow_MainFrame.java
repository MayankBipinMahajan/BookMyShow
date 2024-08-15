
package bookmyshow;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 

public class BookMyShow_MainFrame extends javax.swing.JFrame {
    float GSTAmount = 0.0f , GrossAmount = 0.0f ;
    String user_name , check_gross , seat_type,no_seats,food_item,no_food,GSTstring,GrossString,icon_path;
    public BookMyShow_MainFrame(String user_name) {
        this.user_name = user_name;
        initComponents();
        ScaleImgFun();
        movie_poster_function1();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);        
        welcome_lbl.setText("Welcome "+getUser_name());
    }

    public BookMyShow_MainFrame(String seat_type, String no_seats, String food_item, String no_food, String GSTstring, String GrossString, String icon_path) {
        this.seat_type = seat_type;
        this.no_seats = no_seats;
        this.food_item = food_item;
        this.no_food = no_food;
        this.GSTstring = GSTstring;
        this.GrossString = GrossString;
        this.icon_path = icon_path;
        
        initComponents();
        ScaleImgFun();
        movie_poster_function1();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);        
        welcome_lbl.setText("Welcome "+getUser_name());
        info_setup();
    }
    private void info_setup(){
            poster_setup();
            combo_box_setup();

    } 
    //combo box setup
    private void combo_box_setup(){
        fun_cb_seat_type();
        no_of_seats();
        food_item();
        no_of_food();
    }
  //seat type setup
    private void  fun_cb_seat_type(){
        if(seat_type.equals("300")){
            CB_Seat_Type.setSelectedIndex(1);
        }else if(seat_type.equals("250")){
            CB_Seat_Type.setSelectedIndex(2);
        }else if(seat_type.equals("150")){
            CB_Seat_Type.setSelectedIndex(3);
        }else if(seat_type.equals("80")){
            CB_Seat_Type.setSelectedIndex(4);
        }
    }
 // number of seat setup
    private void no_of_seats(){
        CB_No_Seats.setSelectedIndex(Integer.parseInt(no_seats));
    }
 // food item setup
    private void food_item(){
           if(seat_type.equals("300")){
            CB_Food_Item.setSelectedIndex(1);
        }else if(seat_type.equals("250")){
            CB_Food_Item.setSelectedIndex(2);
        }else if(seat_type.equals("150")){
            CB_Food_Item.setSelectedIndex(3);
        }else if(seat_type.equals("580")){
            CB_Food_Item.setSelectedIndex(4);
        }else{
            CB_Food_Item.setSelectedIndex(0);
        }     
    }
 //no of food item
    private void no_of_food(){
        CB_No_Food_item.setSelectedIndex(Integer.parseInt(no_food));
    }    

   //Poster Setup ==> 
    private void poster_setup(){
        if( icon_path.equals("resources/Gym.jpeg")){
            movie_poster_1();
        }else if(icon_path.equals("resources/The Blackout (2019).jpeg")){
            movie_poster_2();
        }else if(icon_path.equals("resources/Extraction.jpeg")){
            movie_poster_3();
        }else if(icon_path.equals("resources/Volkswagen_ Hello Confidence • Ads of the World™ _ Part of The Clio Network.jpeg")){
            movie_poster_4();
        }
    }
    public float getGrossAmount() {
        return GrossAmount;
    }

    public void setGrossAmount(float GrossAmount) {
        this.GrossAmount = GrossAmount;
    }
    
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    public BookMyShow_MainFrame() {
        initComponents();
        ScaleImgFun();
        movie_poster_function1();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    private void ScaleImgFun(){
        mainFrameIcon.setIcon(new ImageIcon(new ImageIcon("resources/ai-generated-8848753.jpg").getImage().getScaledInstance(mainFrameIcon.getWidth(),mainFrameIcon.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }
    private void movie_poster_function1(){
        movie_poster_1.setIcon(new ImageIcon(new ImageIcon("resources/Gym.jpeg").getImage().getScaledInstance(movie_poster_1.getWidth(),movie_poster_1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        movie_poster_2.setIcon(new ImageIcon(new ImageIcon("resources/The Blackout (2019).jpeg").getImage().getScaledInstance(movie_poster_2.getWidth(),movie_poster_2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        movie_poster_3.setIcon(new ImageIcon(new ImageIcon("resources/Extraction.jpeg").getImage().getScaledInstance(movie_poster_3.getWidth(),movie_poster_3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        movie_poster_4.setIcon(new ImageIcon(new ImageIcon("resources/Volkswagen_ Hello Confidence • Ads of the World™ _ Part of The Clio Network.jpeg").getImage().getScaledInstance(movie_poster_4.getWidth(),movie_poster_4.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }
    private void funGSTAmount(){
        //int total = Integer.parseInt(lbl_seat_type.getText()) * Integer.parseInt(lbl_no_seats.getText());
        
        GSTAmount =( (( Integer.parseInt(lbl_seat_type.getText()) * Integer.parseInt(lbl_no_seats.getText())) + (Integer.parseInt(lbl_food_item.getText()) * Integer.parseInt(lbl_no_food.getText().trim()))) * (0.18f));
 //      System.out.println("Output = " + GSTAmount);
        lbl_gst_amount.setText(String.format("%.2f",GSTAmount));
    }
    private void funGrossAmount(){
       GSTAmount =( ( Integer.parseInt(lbl_seat_type.getText()) * Integer.parseInt(lbl_no_seats.getText())) + (Integer.parseInt(lbl_food_item.getText()) * Integer.parseInt(lbl_no_food.getText())) + GSTAmount );
        lbl_gross_amount.setText(String.format("%.2f",GSTAmount));
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_result = new javax.swing.JLabel();
        welcome_lbl = new javax.swing.JLabel();
        btn_payment = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lbl_gst_amount = new javax.swing.JLabel();
        lbl_gross_amount = new javax.swing.JLabel();
        lbl_gross = new javax.swing.JLabel();
        lbl_seat_type = new javax.swing.JLabel();
        lbl_no_seats = new javax.swing.JLabel();
        lbl_food_item = new javax.swing.JLabel();
        lbl_no_food = new javax.swing.JLabel();
        lbl_gst = new javax.swing.JLabel();
        CB_Food_Item = new javax.swing.JComboBox<>();
        CB_Seat_Type = new javax.swing.JComboBox<>();
        CB_No_Seats = new javax.swing.JComboBox<>();
        CB_No_Food_item = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        selected_movie = new javax.swing.JLabel();
        movie_poster_4 = new javax.swing.JLabel();
        movie_poster_2 = new javax.swing.JLabel();
        movie_poster_3 = new javax.swing.JLabel();
        movie_poster_1 = new javax.swing.JLabel();
        mainFrameIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_result.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_result.setForeground(new java.awt.Color(255, 255, 255));
        lbl_result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 630, 480, 40));

        welcome_lbl.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        welcome_lbl.setForeground(new java.awt.Color(255, 255, 255));
        welcome_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(welcome_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 70));

        btn_payment.setBackground(new java.awt.Color(153, 255, 153));
        btn_payment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_payment.setText("Payment");
        btn_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_paymentMouseClicked(evt);
            }
        });
        getContentPane().add(btn_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 680, 230, 40));

        btn_new.setBackground(new java.awt.Color(102, 255, 255));
        btn_new.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        getContentPane().add(btn_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 680, 230, 40));

        btn_cancel.setBackground(new java.awt.Color(255, 102, 102));
        btn_cancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 680, 230, 40));

        lbl_gst_amount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_gst_amount.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gst_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_gst_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 530, 160, 40));

        lbl_gross_amount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_gross_amount.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gross_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_gross_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 580, 160, 40));

        lbl_gross.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_gross.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_gross.setText("Gross Amount");
        getContentPane().add(lbl_gross, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 580, 160, 40));

        lbl_seat_type.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_seat_type.setForeground(new java.awt.Color(255, 255, 255));
        lbl_seat_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_seat_type.setEnabled(false);
        getContentPane().add(lbl_seat_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 430, 110, 40));

        lbl_no_seats.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_no_seats.setForeground(new java.awt.Color(255, 255, 255));
        lbl_no_seats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_no_seats.setEnabled(false);
        getContentPane().add(lbl_no_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 480, 110, 40));

        lbl_food_item.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_food_item.setForeground(new java.awt.Color(255, 255, 255));
        lbl_food_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_food_item.setEnabled(false);
        getContentPane().add(lbl_food_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 530, 110, 40));

        lbl_no_food.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_no_food.setForeground(new java.awt.Color(255, 255, 255));
        lbl_no_food.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_no_food.setEnabled(false);
        getContentPane().add(lbl_no_food, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 580, 110, 40));

        lbl_gst.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_gst.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_gst.setText("GST (18%)");
        getContentPane().add(lbl_gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 530, 160, 40));

        CB_Food_Item.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CB_Food_Item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food Item", "Pizza - Rs 300", "Burger - Rs 250", "Donuts - Rs 150", "Chicken Nuggets - Rs 580" }));
        CB_Food_Item.setEnabled(false);
        CB_Food_Item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CB_Food_ItemMouseClicked(evt);
            }
        });
        CB_Food_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Food_ItemActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Food_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 310, 40));

        CB_Seat_Type.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CB_Seat_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat Type", "Platinum - Rs 300", "Gold - Rs 250", "Silver - Rs 150", "Bronze - Rs 80" }));
        CB_Seat_Type.setEnabled(false);
        CB_Seat_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Seat_TypeActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Seat_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 310, 40));

        CB_No_Seats.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CB_No_Seats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select No. of Seats", "1", "2", "3", "4", "5", "6", "7" }));
        CB_No_Seats.setEnabled(false);
        CB_No_Seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_No_SeatsActionPerformed(evt);
            }
        });
        getContentPane().add(CB_No_Seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 310, 40));

        CB_No_Food_item.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CB_No_Food_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select No. Food of Items", "1", "2", "3", "4", "5", "6", "7" }));
        CB_No_Food_item.setEnabled(false);
        CB_No_Food_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_No_Food_itemActionPerformed(evt);
            }
        });
        getContentPane().add(CB_No_Food_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, 310, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        selected_movie.setBackground(new java.awt.Color(102, 255, 102));
        selected_movie.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        selected_movie.setForeground(new java.awt.Color(255, 255, 0));
        selected_movie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selected_movie.setText("Select Your Favorite Movie ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(selected_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(selected_movie)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 945, 60));

        movie_poster_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookmyshow/Volkswagen_ Hello Confidence • Ads of the World™ _ Part of The Clio Network.jpeg"))); // NOI18N
        movie_poster_4.setEnabled(false);
        movie_poster_4.setMaximumSize(new java.awt.Dimension(225, 333));
        movie_poster_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_poster_4MouseClicked(evt);
            }
        });
        getContentPane().add(movie_poster_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 20, 225, 333));

        movie_poster_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookmyshow/The Blackout (2019).jpeg"))); // NOI18N
        movie_poster_2.setEnabled(false);
        movie_poster_2.setMaximumSize(new java.awt.Dimension(225, 333));
        movie_poster_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_poster_2MouseClicked(evt);
            }
        });
        getContentPane().add(movie_poster_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 225, 333));

        movie_poster_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookmyshow/Vijay Sethupathi Blood Soaked As Maharaja.jpeg"))); // NOI18N
        movie_poster_3.setEnabled(false);
        movie_poster_3.setMaximumSize(new java.awt.Dimension(225, 333));
        movie_poster_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_poster_3MouseClicked(evt);
            }
        });
        getContentPane().add(movie_poster_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, 225, 333));

        movie_poster_1.setIcon(new javax.swing.ImageIcon("D:\\All In one PROGRAM file\\JAVA PROGRAMS\\JAVA nextech\\NetBeansProject\\BookMyShow\\resources\\Gym.jpeg")); // NOI18N
        movie_poster_1.setEnabled(false);
        movie_poster_1.setMaximumSize(new java.awt.Dimension(225, 333));
        movie_poster_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_poster_1MouseClicked(evt);
            }
        });
        getContentPane().add(movie_poster_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 225, 333));

        mainFrameIcon.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mainFrameIcon.setName(""); // NOI18N
        getContentPane().add(mainFrameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2310, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movie_poster_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_poster_1MouseClicked
        // TODO add your handling code here:
        movie_poster_1();
    }//GEN-LAST:event_movie_poster_1MouseClicked
    private void movie_poster_1(){
         movie_poster_1.setEnabled(true);
        movie_poster_2.setEnabled(false);
        movie_poster_3.setEnabled(false);
        movie_poster_4.setEnabled(false);
        CB_Seat_Type.setEnabled(true);
        icon_path = "resources/Gym.jpeg";       
    }
    private void movie_poster_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_poster_2MouseClicked
        // TODO add your handling code here:
        movie_poster_2();
    }//GEN-LAST:event_movie_poster_2MouseClicked
    private void movie_poster_2(){
        movie_poster_1.setEnabled(false);
        movie_poster_2.setEnabled(true);
        movie_poster_3.setEnabled(false);
        movie_poster_4.setEnabled(false);
        CB_Seat_Type.setEnabled(true);
        icon_path = "resources/The Blackout (2019).jpeg";       
    }
    private void movie_poster_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_poster_3MouseClicked
        // TODO add your handling code here:
        movie_poster_3();
    }//GEN-LAST:event_movie_poster_3MouseClicked
    private void movie_poster_3(){
        movie_poster_1.setEnabled(false);
        movie_poster_2.setEnabled(false);
        movie_poster_3.setEnabled(true);
        movie_poster_4.setEnabled(false);
        CB_Seat_Type.setEnabled(true);
        icon_path = "resources/Extraction.jpeg";        
    }
    private void movie_poster_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_poster_4MouseClicked
        // TODO add your handling code here:
        movie_poster_4();
    }//GEN-LAST:event_movie_poster_4MouseClicked
    private void movie_poster_4(){
        movie_poster_1.setEnabled(false);
        movie_poster_2.setEnabled(false);
        movie_poster_3.setEnabled(false);
        movie_poster_4.setEnabled(true);
        CB_Seat_Type.setEnabled(true);
        icon_path = "resources/Volkswagen_ Hello Confidence • Ads of the World™ _ Part of The Clio Network.jpeg";        
    }
    private void CB_No_SeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_No_SeatsActionPerformed
        // TODO add your handling code here:
           if(CB_No_Seats.getSelectedItem().toString().equals("Select No. of Seats")){
            lbl_gross_amount.setText("0");
            lbl_gst_amount.setText("0");
            lbl_no_seats.setText("0");
            lbl_food_item.setText("0");
            lbl_no_food.setText("0");
            lbl_no_seats.setVisible(false);
            lbl_food_item.setVisible(false);
            lbl_no_food.setVisible(false);   
//             lbl_seat_type.setText("0");
//             lbl_seat_type.setVisible(false);
            
            
            CB_Food_Item.setSelectedIndex(0);
            CB_No_Food_item.setSelectedIndex(0);
   //         CB_No_Seats.setEnabled(false);
            CB_Food_Item.setEnabled(false);
            CB_No_Food_item.setEnabled(false);
            lbl_no_seats.setText("0");
            lbl_food_item.setText("0");
            lbl_no_food.setText("0");
            lbl_no_seats.setVisible(false);
            lbl_food_item.setVisible(false);
            lbl_no_food.setVisible(false);    
           funGSTAmount();
           funGrossAmount();  
   //           JOptionPane.showMessageDialog(BookMyShow_MainFrame.this,"Please select No. of Seats" );
           }else{
               CB_Food_Item.setEnabled(true);
               lbl_food_item.setText("0");
               lbl_no_food.setText("0");
               lbl_no_food.setVisible(false);
               lbl_food_item.setVisible(false);
               lbl_no_seats.setVisible(true);
               lbl_no_seats.setEnabled(true);
                 if(CB_No_Seats.getSelectedItem().toString().equals("1") ){
                     lbl_no_seats.setText("1");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("2") ){
                     lbl_no_seats.setText("2");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("3") ){
                     lbl_no_seats.setText("3");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("4") ){
                     lbl_no_seats.setText("4");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("5") ){
                     lbl_no_seats.setText("5");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("6") ){
                     lbl_no_seats.setText("6");
                 }else if(CB_No_Seats.getSelectedItem().toString().equals("7") ){
                     lbl_no_seats.setText("7");
                 }
//               System.out.println("Combo Selected = " + CB_No_Seats.getSelectedItem().toString() );
//               System.out.println("Conform Selected = " + lbl_no_seats.getText() );
                 
                 if ( ! CB_No_Seats.getSelectedItem().toString().equals("Select No. of Seats") )    {
                     lbl_no_seats.setText(CB_No_Seats.getSelectedItem().toString());            
                 }   
            lbl_food_item.setText("0");
            lbl_no_food.setText("0");

            lbl_food_item.setVisible(false);
            lbl_no_food.setVisible(false);
           funGSTAmount();
           funGrossAmount();                 

           }
    }//GEN-LAST:event_CB_No_SeatsActionPerformed

    private void CB_Seat_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Seat_TypeActionPerformed
        // TODO add your handling code here:
       if(CB_Seat_Type.getSelectedItem().toString().equals("Select Seat Type")){
  //          JOptionPane.showMessageDialog(BookMyShow_MainFrame.this,"Please select Seat Type" );
            lbl_gross_amount.setText("0.00");
            lbl_gst_amount.setText("0.00");
            lbl_seat_type.setText("0");
            lbl_no_seats.setText("0");
            lbl_food_item.setText("0");
            lbl_no_food.setText("0");
            CB_No_Seats.setSelectedIndex(0);
            CB_Food_Item.setSelectedIndex(0);
            CB_No_Food_item.setSelectedIndex(0);
            CB_No_Seats.setEnabled(false);
            CB_Food_Item.setEnabled(false);
            CB_No_Food_item.setEnabled(false);
            lbl_seat_type.setText("0");
            lbl_no_seats.setText("0");
            lbl_food_item.setText("0");
            lbl_no_food.setText("0");
            lbl_seat_type.setVisible(false);
            lbl_no_seats.setVisible(false);
            lbl_food_item.setVisible(false);
            lbl_no_food.setVisible(false);
        }else {
           CB_No_Seats.setEnabled(true);
           lbl_seat_type.setEnabled(true);
           lbl_seat_type.setVisible(true);
            if(CB_Seat_Type.getSelectedItem().toString().equals("Platinum - Rs 300") ){
                lbl_seat_type.setText("300");
            }else if(CB_Seat_Type.getSelectedItem().toString().equals("Gold - Rs 250") ){
                lbl_seat_type.setText("250");
            }else if(CB_Seat_Type.getSelectedItem().toString().equals("Silver - Rs 150") ){
                lbl_seat_type.setText("150");
            }else if(CB_Seat_Type.getSelectedItem().toString().equals("Bronze - Rs 80") ){
                lbl_seat_type.setText("80");
            }
       }
    }//GEN-LAST:event_CB_Seat_TypeActionPerformed

    private void CB_Food_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Food_ItemActionPerformed
        // TODO add your handling code here:
               if(CB_Food_Item.getSelectedItem().toString().equals("Select Food Item") ){
                   

                    CB_No_Food_item.setSelectedIndex(0);
                    CB_No_Food_item.setEnabled(false);
                    lbl_food_item.setText("0");
                    lbl_no_food.setText("0");    
                    lbl_food_item.setVisible(false);
                    lbl_no_food.setVisible(false);
                    funGSTAmount();
                    funGrossAmount();
 //                  JOptionPane.showMessageDialog(BookMyShow_MainFrame.this,"Select Food Item  if you want..." );
               }else{
                   


                   CB_No_Food_item.setEnabled(true);
                   lbl_food_item.setEnabled(true);
                    lbl_food_item.setVisible(true);
                     if(CB_Food_Item.getSelectedItem().toString().equals("Pizza - Rs 300") ){
                         lbl_food_item.setText("300");
                     }else if(CB_Food_Item.getSelectedItem().toString().equals("Burger - Rs 250") ){
                         lbl_food_item.setText("250");
                     }else if(CB_Food_Item.getSelectedItem().toString().equals("Donuts - Rs 150") ){
                         lbl_food_item.setText("150");
                     }else if(CB_Food_Item.getSelectedItem().toString().equals("Chicken Nuggets - Rs 580") ){
                         lbl_food_item.setText("580");
                     }                   
                    funGSTAmount();
                    funGrossAmount();                   
                   
                   if(CB_No_Food_item.getSelectedItem().toString().equals("Select No. Food of Items") ){
  //                    JOptionPane.showMessageDialog(BookMyShow_MainFrame.this,"Please Select the No. Food of Items" ); 
                   }
               }
    }//GEN-LAST:event_CB_Food_ItemActionPerformed

    private void CB_No_Food_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_No_Food_itemActionPerformed
        // TODO add your handling code here:
                   if(CB_No_Food_item.getSelectedItem().toString().equals("Select No. Food of Items") ){
//                      JOptionPane.showMessageDialog(BookMyShow_MainFrame.this,"Please Select the No. Food of Items" ); 
                         lbl_no_food.setText("0"); 
                         lbl_no_food.setVisible(false);
                            funGSTAmount();
                            funGrossAmount(); 
                   }else{
                            lbl_no_food.setVisible(true);
                            lbl_no_food.setEnabled(true);
                             if(CB_No_Food_item.getSelectedItem().toString().equals("1") ){
                                 lbl_no_food.setText("1");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("2") ){
                                 lbl_no_food.setText("2");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("3") ){
                                 lbl_no_food.setText("3");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("4") ){
                                 lbl_no_food.setText("4");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("5") ){
                                 lbl_no_food.setText("5");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("6") ){
                                 lbl_no_food.setText("6");
                             }else if(CB_No_Food_item.getSelectedItem().toString().equals("7") ){
                                 lbl_no_food.setText("7");
                             }  
                            funGSTAmount();
                            funGrossAmount();                 
                   }
    }//GEN-LAST:event_CB_No_Food_itemActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        CB_Seat_Type.setSelectedIndex(0);
        CB_Seat_Type.setEnabled(false);
        movie_poster_1.setEnabled(false);
        movie_poster_2.setEnabled(false);
        movie_poster_3.setEnabled(false);
        movie_poster_4.setEnabled(false);
        
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paymentMouseClicked
        // TODO add your handling code here:
        GSTAmount = Float.parseFloat(lbl_gst_amount.getText());
        GrossAmount = Float.parseFloat(lbl_gross_amount.getText());
 //       System.out.print(" "+GSTAmount+" "+GrossAmount);
        check_gross = lbl_gross_amount.getText();
        if(lbl_gross_amount.getText().toString().equals("") || check_gross.toString().equals("0.00")){
            lbl_result.setText("Fill the information to proceed");
        }else{
            lbl_result.setText("");
            seat_type = lbl_seat_type.getText();
            no_seats = lbl_no_seats.getText();
            no_food  = lbl_no_food.getText();
            food_item = lbl_food_item.getText();
            GSTstring = lbl_gst_amount.getText();
            GrossString = lbl_gross_amount.getText();
            new paymentPage(seat_type,no_seats,food_item,no_food,GSTstring,GrossString,icon_path).show();
            this.dispose();
        }
    }//GEN-LAST:event_btn_paymentMouseClicked

    private void CB_Food_ItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_Food_ItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Food_ItemMouseClicked


    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMyShow_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Food_Item;
    private javax.swing.JComboBox<String> CB_No_Food_item;
    private javax.swing.JComboBox<String> CB_No_Seats;
    private javax.swing.JComboBox<String> CB_Seat_Type;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_payment;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_food_item;
    private javax.swing.JLabel lbl_gross;
    private javax.swing.JLabel lbl_gross_amount;
    private javax.swing.JLabel lbl_gst;
    private javax.swing.JLabel lbl_gst_amount;
    private javax.swing.JLabel lbl_no_food;
    private javax.swing.JLabel lbl_no_seats;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JLabel lbl_seat_type;
    private javax.swing.JLabel mainFrameIcon;
    private javax.swing.JLabel movie_poster_1;
    private javax.swing.JLabel movie_poster_2;
    private javax.swing.JLabel movie_poster_3;
    private javax.swing.JLabel movie_poster_4;
    private javax.swing.JLabel selected_movie;
    private javax.swing.JLabel welcome_lbl;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
