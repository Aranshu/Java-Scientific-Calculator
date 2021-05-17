package Calculator;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
public class HomePage extends javax.swing.JFrame {

    String FirstVal = "0", SecondVal = "0", Operator = "";
    double result = 0;

    /**
     * Creates new form NewJFrame
     */
    public HomePage() {
    	setTitle("Calculator");
    	getContentPane().setBackground(Color.WHITE);
    	getContentPane().setForeground(Color.WHITE);
    	setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton18.setBackground(UIManager.getColor("Button.background"));
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        screen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("/");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("del");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("7");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("0");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText(".");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("5");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("8");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jButton15.setText("-");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setText("6");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setText("+");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton20.setText("9");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton10.setText(" √x ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Traditional Arabic", 2, 18)); // NOI18N
        jButton18.setText("Sin");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton22.setText("x!");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton23.setText("Cos");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton24.setText("Log");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton25.setText("Tan");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton26.setText("π");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton27.setText("Ans");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(screen, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jButton22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton26, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton24, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton25, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
        					.addGap(44)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
        						.addComponent(jButton10, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(32)
        							.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
        					.addGap(29)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jButton27, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))))
        			.addGap(30))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(screen, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jButton25, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(1)
        							.addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jButton8, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        							.addComponent(jButton9, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton26, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jButton27, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        			.addGap(78))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        FirstVal = screen.getText();
        screen.setText("");
        Operator = "/";        // TODO add your handling code here:
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        screen.setText(screen.getText() + "7");        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        screen.setText(screen.getText() + "4");        // TODO add your handling code here:
    }                                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "2");        // TODO add your handling code here:
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "5");        // TODO add your handling code here:
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "6");        // TODO add your handling code here:
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "3");        // TODO add your handling code here:
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FirstVal = screen.getText();
        screen.setText("");
        Operator = "-";        // TODO add your handling code here:
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FirstVal = screen.getText();
        screen.setText("");
        Operator = "Sin";


        // TODO add your handling code here:
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        FirstVal = screen.getText();
        screen.setText("");
        Operator = "+";
    }                                         

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        screen.setText(screen.getText() + "1");
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        screen.setText(screen.getText() + "0");        // TODO add your handling code here:
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        screen.setText(screen.getText() + ".");        // TODO add your handling code here:
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "8");        // TODO add your handling code here:
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screen.setText(screen.getText() + "9");        // TODO add your handling code here:
    }                                         

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        FirstVal = screen.getText();
        //screen.setText("");
        Operator = "del";
        String str = screen.getText();
        int i = str.length();
        str = str.substring(0, i - 1);
        screen.setText(str);



        // TODO add your handling code here:
    }                                        

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        SecondVal = screen.getText();
        if (!FirstVal.equals("")) {
            if (Operator.equals("+")) {
                result = Double.parseDouble(FirstVal) + Double.parseDouble(SecondVal);
                screen.setText("" + result);
            }
            if (Operator.equals("-")) {
                result = Double.parseDouble(FirstVal) - Double.parseDouble(SecondVal);
                screen.setText("" + result);
            }
            
        
            if (Operator.equals("X")) {
                result = Double.parseDouble(FirstVal) * Double.parseDouble(SecondVal);
                screen.setText("" + result);
            }
            if (Operator.equals("/")) {
                result = Double.parseDouble(FirstVal) / Double.parseDouble(SecondVal);
                screen.setText("" + result);
            }
            if (Operator.equals("Sin")) {
                result = Math.sin(Double.parseDouble(FirstVal));
                screen.setText("" + result);
            }
            if (Operator.equals("Cos")) {
                result = Math.cos(Double.parseDouble(FirstVal));
                screen.setText("" + result);
            }
            if (Operator.equals("Tan")) {
                result = Math.tan(Double.parseDouble(FirstVal));
                screen.setText("" + result);
            }
            if (Operator.equals("π")) {
                result = Double.parseDouble(FirstVal) * 3.1412;
                screen.setText("" + result);
            }
            if (Operator.equals("x!")) {
                int FirstVal, c, fact = 1;
                FirstVal = Integer.parseInt(screen.getText());
                if (FirstVal > 0) {
                    for (c = 1; c <= FirstVal; c++) {
                        fact = fact * c;
                    }
                }
                screen.setText(""+fact);
            }
            if (Operator.equals(" √x ")) {

                result = Math.sqrt(Double.parseDouble(FirstVal));
                screen.setText("" + result);

            }
            if (Operator.equals(" Log ")) {

                result = Math.log(Double.parseDouble(FirstVal));
                screen.setText("" + result);

            }
            
        }
    }                                         

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        FirstVal = screen.getText();
        screen.setText("");
        Operator = "c";        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        FirstVal = screen.getText();
        screen.setText("");
        Operator = "X";            // TODO add your handling code here:
    }                                        

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        FirstVal = screen.getText();
        screen.setText("");
        Operator = "Cos";
        // TODO add your handling code here:
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          


        FirstVal = screen.getText();
        screen.setText("");
        Operator = "Tan";// TODO add your handling code here:
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          


        FirstVal = screen.getText();
        screen.setText("");
        Operator = "π";// TODO add your handling code here:
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FirstVal = screen.getText();
        //screen.setText("");
        Operator = "x!";


        // TODO add your handling code here:
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
FirstVal=screen.getText();
screen.setText("");
        Operator = " √x ";        
        
        // TODO add your handling code here:
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        FirstVal=screen.getText();
screen.setText("");
        Operator = " Log "; 
        
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField screen;
    // End of variables declaration                   
}




