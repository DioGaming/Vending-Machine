 import java.util.Scanner;
 import javax.swing.JOptionPane;
 import java.io.*;
 
/**
 *
 * @author Mehtab
 */
public class GUI extends javax.swing.JFrame {    
    /*
    Variables
    */
    Scanner sc = new Scanner(System.in);
    double moneyinsert = 0;
    double changedue = 0;
    double getchange;
    int nicklecount = 10;
    int dimecount = 10;
    int quartercount = 10;
    int looniecount = 10;
    int tooniecount = 10;
    int pepsicount = 0;
    int lemonadecount = 0;
    int watercount = 0;
    int tooniesdue;
    int looniesdue;
    double quartersdue;
    double dimesdue;
    double nicklesdue;
    
    /**
     * Creates new form Window1
     */
    public GUI() {
        initComponents();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        resetB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();
        purchaseB = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        moneyinsertL = new javax.swing.JLabel();
        nickleB = new javax.swing.JButton();
        dimeB = new javax.swing.JButton();
        quarterB = new javax.swing.JButton();
        loonieB = new javax.swing.JButton();
        toonieB = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        itemselectL = new javax.swing.JLabel();
        pepsiB = new javax.swing.JButton();
        lemonadeB = new javax.swing.JButton();
        waterB = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        changedueL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nickledispL = new javax.swing.JLabel();
        dimedispL = new javax.swing.JLabel();
        quarterdispL = new javax.swing.JLabel();
        looniedispL = new javax.swing.JLabel();
        tooniedispL = new javax.swing.JLabel();
        pepsidispL = new javax.swing.JLabel();
        lemonadedispL = new javax.swing.JLabel();
        waterdispL = new javax.swing.JLabel();
        getchangeL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);

        Header.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setLabelFor(this);
        Header.setText("VENDING MACHINE");
        Header.setPreferredSize(new java.awt.Dimension(600, 16));

        resetB.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        resetB.setText("Reset");
        resetB.setToolTipText("");
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });

        closeB.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        closeB.setText("Close");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        purchaseB.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        purchaseB.setText("Purchase");
        purchaseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setText("MONEY INSERTED");

        moneyinsertL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        moneyinsertL.setLabelFor(label1);
        moneyinsertL.setText("$0.00");

        nickleB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\nickle.jpg")); // NOI18N
        nickleB.setAutoscrolls(true);
        nickleB.setPreferredSize(new java.awt.Dimension(40, 40));
        nickleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickleBActionPerformed(evt);
            }
        });

        dimeB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\dime.jpg")); // NOI18N
        dimeB.setPreferredSize(new java.awt.Dimension(40, 40));
        dimeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimeBActionPerformed(evt);
            }
        });

        quarterB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\quarter.jpg")); // NOI18N
        quarterB.setPreferredSize(new java.awt.Dimension(40, 40));
        quarterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quarterBActionPerformed(evt);
            }
        });

        loonieB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\loonie.jpg")); // NOI18N
        loonieB.setPreferredSize(new java.awt.Dimension(40, 40));
        loonieB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loonieBActionPerformed(evt);
            }
        });

        toonieB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\toonie.jpg")); // NOI18N
        toonieB.setPreferredSize(new java.awt.Dimension(40, 40));
        toonieB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toonieBActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label2.setText("ITEM SELECTED");

        itemselectL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        itemselectL.setLabelFor(label2);
        itemselectL.setText("NO ITEM SELECTED");
        itemselectL.setToolTipText("");

        pepsiB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pepsiB.setForeground(new java.awt.Color(240, 240, 240));
        pepsiB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\pepsi.png")); // NOI18N
        pepsiB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pepsiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiBActionPerformed(evt);
            }
        });

        lemonadeB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lemonadeB.setForeground(new java.awt.Color(240, 240, 240));
        lemonadeB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\lemonade.png")); // NOI18N
        lemonadeB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        lemonadeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeBActionPerformed(evt);
            }
        });

        waterB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        waterB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mehtab\\Dropbox\\Vending Machine\\pictures\\water.png")); // NOI18N
        waterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterBActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label3.setText("CHANGE DUE:");

        changedueL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        changedueL.setLabelFor(label3);
        changedueL.setText("$0.00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("$1.50");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("$2.00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("$3.00");
        jLabel3.setToolTipText("");

        nickledispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nickledispL.setLabelFor(nickleB);
        nickledispL.setText("10");

        dimedispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dimedispL.setLabelFor(dimeB);
        dimedispL.setText("10");

        quarterdispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quarterdispL.setLabelFor(quarterB);
        quarterdispL.setText("10");

        looniedispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        looniedispL.setLabelFor(loonieB);
        looniedispL.setText("10");

        tooniedispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tooniedispL.setLabelFor(toonieB);
        tooniedispL.setText("10");

        pepsidispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pepsidispL.setLabelFor(pepsiB);
        pepsidispL.setText("0");

        lemonadedispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lemonadedispL.setLabelFor(lemonadeB);
        lemonadedispL.setText("0");

        waterdispL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        waterdispL.setLabelFor(waterB);
        waterdispL.setText("0");

        getchangeL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getchangeL.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pepsidispL)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nickleB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nickledispL)
                                        .addGap(198, 198, 198)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dimeB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dimedispL))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quarterdispL)
                                    .addComponent(quarterB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(purchaseB)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(closeB, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(resetB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(lemonadeB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lemonadedispL))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(waterB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(waterdispL)))))
                            .addComponent(pepsiB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addComponent(itemselectL)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loonieB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(looniedispL))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tooniedispL)
                                    .addComponent(toonieB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addComponent(label1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(moneyinsertL)
                                    .addComponent(changedueL)
                                    .addComponent(getchangeL))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(closeB)
                                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(purchaseB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(moneyinsertL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addGap(1, 1, 1)
                                .addComponent(itemselectL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addComponent(changedueL))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pepsiB)
                                    .addComponent(lemonadeB, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(waterB, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pepsidispL)
                                    .addComponent(lemonadedispL)
                                    .addComponent(waterdispL))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(getchangeL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loonieB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toonieB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dimeB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nickleB, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quarterB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nickledispL)
                    .addComponent(dimedispL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quarterdispL)
                        .addComponent(tooniedispL)
                        .addComponent(looniedispL)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ITEMSELECTION() {
        
        // CREATES LABEL TEXT BASED ON WHICH ITEMS ARE SELECTED
        
        if (pepsicount == 0 && lemonadecount == 0 && watercount == 0) {
            itemselectL.setText("NO ITEM SELECTED");
        } else if (pepsicount > 0 && lemonadecount == 0 && watercount == 0) {
            itemselectL.setText("PEPSI");
        } else if (pepsicount == 0 && lemonadecount > 0 && watercount == 0) {
            itemselectL.setText("LEMONADE");
        } else if (pepsicount == 0 && lemonadecount == 0 && watercount > 0) {
            itemselectL.setText("WATER");
        } else if (pepsicount > 0 && lemonadecount > 0 && watercount == 0) {
            itemselectL.setText("PEPSI AND LEMONADE");
        } else if (pepsicount > 0 && lemonadecount == 0 && watercount > 0) {
            itemselectL.setText("PEPSI AND WATER");
        } else if (pepsicount == 0 && lemonadecount > 0 && watercount > 0) {
            itemselectL.setText("LEMONADE AND WATER");
        } else if (pepsicount > 0 && lemonadecount > 0 && watercount > 0) {
            itemselectL.setText("PEPSI, LEMONADE, AND WATER");
        } 
    }
    
    public void RESET() {
        // full reset
        moneyinsert = 0;
        moneyinsertL.setText("$" + moneyinsert + "0");
        itemselectL.setText("NO ITEM SELECTED");
        changedue = 0;
        changedueL.setText("$" + changedue +"0");                
        nicklecount = 10;
        nickledispL.setText(Integer.toString(nicklecount));
        dimecount = 10;
        dimedispL.setText(Integer.toString(dimecount));
        quartercount = 10;
        quarterdispL.setText(Integer.toString(quartercount));
        looniecount = 10;
        looniedispL.setText(Integer.toString(looniecount));
        tooniecount = 10;
        tooniedispL.setText(Integer.toString(tooniecount));
        pepsicount = 0;
        pepsidispL.setText(Integer.toString(pepsicount));
        lemonadecount = 0;
        lemonadedispL.setText(Integer.toString(lemonadecount));
        watercount = 0;
        waterdispL.setText(Integer.toString(watercount));
        getchange = 0;
        tooniesdue = 0;
        looniesdue = 0;
        quartersdue = 0;
        dimesdue = 0;
        nicklesdue = 0;
    }
    
    public void RESETLIMIT(){
        // limited reset for change maker method
        moneyinsert = 0;
        moneyinsertL.setText("$" + moneyinsert + "0");
        itemselectL.setText("NO ITEM SELECTED");
        changedue = 0;
        changedueL.setText("$" + changedue +"0");          
        pepsicount = 0;
        pepsidispL.setText(Integer.toString(pepsicount));
        lemonadecount = 0;
        lemonadedispL.setText(Integer.toString(lemonadecount));
        watercount = 0;
        waterdispL.setText(Integer.toString(watercount));
        tooniesdue = 0;
        looniesdue = 0;
        quartersdue = 0;
        dimesdue = 0;
        nicklesdue = 0;
    }
    
    public void ROUNDING() {
        // rounds value of money the vending machine owes you
        getchange = moneyinsert - changedue;
        getchangeL.setText(Double.toString(getchange));
        getchange = getchange*100; // rounding code
        getchange = Math.round(getchange);
    }
    
    public void CHANGEMAKER() {
        
        // CALCULATES HOW MUCH CHANGE AND WHICH COINS TO GIVE 
        // calculates value in cents not dollars 
        
        // for unknown reason all values must be multiplied by 100
        // values in cents
        int nickleval = 5;
        int dimeval = 10;
        int quarterval = 25;
        int loonieval = 100;
        int toonieval = 200;
        
        // logic
        if (moneyinsert - changedue < 0) {
            // message for insufficient money put in machine
            getchange = moneyinsert * 100;
            
            // logic for coin refund on failed purchase
            while (getchange >= toonieval && tooniecount > tooniesdue) {
               getchange -= toonieval;
               tooniesdue += 1; 
            }
            while (getchange >= loonieval && looniecount > looniesdue) {
                getchange -= loonieval;
                looniesdue += 1;
            }
            while (getchange >= quarterval && quartercount > quartersdue) {
                getchange -= quarterval;
                quartersdue += 1;                
            }
            while (getchange >= dimeval && dimecount > dimesdue) {
                getchange -= dimeval; 
                dimesdue += 1;               
            }
            while (getchange >= nickleval && nicklecount > nicklesdue) {
                getchange -= nickleval;    
                nicklesdue += 1;                            
            }
            
            // sets value of coins due
            tooniecount -= tooniesdue;
            looniecount -= looniesdue;
            quartercount -= quartersdue;
            dimecount -= dimesdue;   
            nicklecount -= nicklesdue; 
            
            UPDATEL(); // updates labels
            RESETLIMIT(); // allows machine to work after failed purchase
            JOptionPane.showMessageDialog(this, "Sorry, insufficient change inserted.");
        } else if (moneyinsert - changedue >= 0) {
            ROUNDING();
            
            // logic for coin refund on successful purchase
            while (getchange >= toonieval && tooniecount > tooniesdue) {
               getchange -= toonieval;
               tooniesdue += 1; 
            }
            while (getchange >= loonieval && looniecount > looniesdue) {
                getchange -= loonieval;
                looniesdue += 1;
            }
            while (getchange >= quarterval && quartercount > quartersdue) {
                getchange -= quarterval;
                quartersdue += 1;                
            }
            while (getchange >= dimeval && dimecount > dimesdue) {
                getchange -= dimeval; 
                dimesdue += 1;               
            }
            while (getchange >= nickleval && nicklecount > nicklesdue) {
                getchange -= nickleval;    
                nicklesdue += 1;                            
            }
            
            // sets value of coins due
            tooniecount -= tooniesdue;
            looniecount -= looniesdue;
            quartercount -= quartersdue;
            dimecount -= dimesdue;   
            nicklecount -= nicklesdue;       
            
            UPDATEL(); // updates labels
            // gives back coins
            JOptionPane.showMessageDialog(this, tooniesdue + " toonies " + looniesdue + " loonies " + (int)quartersdue + " quarters " + (int)dimesdue + " dimes " + (int)nicklesdue + " nickles");
            RESETLIMIT(); // allows machine to be used again after purchase
        }      
        UPDATEL();
    }
        
    public void UPDATEL() {
        nickledispL.setText(Integer.toString(nicklecount));
        dimedispL.setText(Integer.toString(dimecount));
        quarterdispL.setText(Integer.toString(quartercount));
        looniedispL.setText(Integer.toString(looniecount));
        tooniedispL.setText(Integer.toString(tooniecount));
        moneyinsertL.setText("$" + Double.toString(moneyinsert) + "0");
    }
    
    private void resetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBActionPerformed
        // resets the program
        RESET();        
    }//GEN-LAST:event_resetBActionPerformed

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        // Closes form        
        System.exit(0);        
    }//GEN-LAST:event_closeBActionPerformed

    private void purchaseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBActionPerformed
        // Purchases item        
        CHANGEMAKER();        
    }//GEN-LAST:event_purchaseBActionPerformed

    private void dimeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimeBActionPerformed
        // inserts 1 dime per button click
       
        dimecount += 1; // adds one dime to the machine
        moneyinsert += 0.10; // adds 10 cents to the machine
        moneyinsert = moneyinsert*100; //rounding code
        moneyinsert = Math.round(moneyinsert);
        moneyinsert = moneyinsert /100; // rounding code
        moneyinsertL.setText("$" + moneyinsert); // updates change inserted label
        UPDATEL(); // updates display counter
        
    }//GEN-LAST:event_dimeBActionPerformed

    private void toonieBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toonieBActionPerformed
        // inserts 1 toonie
        
        tooniecount += 1; // adds one toonie to the machine
        moneyinsert += 2; // adds 2 dollars to the machine
        moneyinsert = moneyinsert*100; // rounding code
        moneyinsert = Math.round(moneyinsert);
        moneyinsert = moneyinsert /100; // rounding code
        moneyinsertL.setText("$" + moneyinsert); // updates change inserted label
        UPDATEL(); // updates display counter
        
    }//GEN-LAST:event_toonieBActionPerformed

    private void nickleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickleBActionPerformed
        // inserts 1 nickle into the machine
        
        nicklecount += 1; // adds one nickle to the machine
        moneyinsert += 0.05; // 5 cents to the machine
        moneyinsert = moneyinsert*100; // rounding code
        moneyinsert = Math.round(moneyinsert);
        moneyinsert = moneyinsert /100; // rounding code
        moneyinsertL.setText("$" + moneyinsert); // updates change inerted label
        UPDATEL(); // updates dislay counter
    }//GEN-LAST:event_nickleBActionPerformed

    private void quarterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quarterBActionPerformed
        // inserts 1 quarter into the machine
        
        quartercount += 1; // adds one quarter to the machine
        moneyinsert += 0.25; // adds 25 cents to the machine
        moneyinsert = moneyinsert*100; // rounding code
        moneyinsert = Math.round(moneyinsert);
        moneyinsert = moneyinsert /100; // rounding code
        moneyinsertL.setText("$" + moneyinsert); // updates change inserted label
        UPDATEL(); //updates display counter
        
    }//GEN-LAST:event_quarterBActionPerformed

    private void loonieBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loonieBActionPerformed
        // inserts 1 loonie into the machine
        
        looniecount += 1; // adds one loonie to the machine
        moneyinsert += 1; // adds 1 dollar to the machine
        moneyinsert = moneyinsert*100; // rounding code
        moneyinsert = Math.round(moneyinsert);
        moneyinsert = moneyinsert /100; // rounding code
        moneyinsertL.setText("$" + moneyinsert); // updates change inserted label
        UPDATEL(); // updates display counter
        
    }//GEN-LAST:event_loonieBActionPerformed

    private void pepsiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiBActionPerformed
        // selects pepsi
        
        changedue += 1.50; // adds $1.50 to change due
        changedue = changedue*100; // rounding code
        changedue = Math.round(changedue);
        changedue = changedue /100; // rounding code
        changedueL.setText("$" + changedue + "0"); // updates change due label
        pepsicount += 1; // adds 1 pepsi to que
        pepsidispL.setText(Integer.toString(pepsicount)); // updates display counter  
        ITEMSELECTION();
                       
    }//GEN-LAST:event_pepsiBActionPerformed

    private void lemonadeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeBActionPerformed
        // selects lemonade
        
        changedue += 2; // adds $2 to change due
        changedue = changedue*100; // rounding code
        changedue = Math.round(changedue);
        changedue = changedue /100; // rounding code
        changedueL.setText("$" + changedue + "0"); // updates change due label
        lemonadecount += 1; // adds 1 lemonade to que 
        lemonadedispL.setText(Integer.toString(lemonadecount)); // updates display counter
        ITEMSELECTION();
                       
    }//GEN-LAST:event_lemonadeBActionPerformed

    private void waterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterBActionPerformed
        // selects water
               
        changedue += 3; // adds $3 to change due
        changedue = changedue*100; // rounding code
        changedue = Math.round(changedue);
        changedue = changedue /100; // rounding code
        changedueL.setText("$" + changedue + "0"); // updates change due label
        watercount += 1; // adds 1 water to que
        waterdispL.setText(Integer.toString(watercount)); // updates display counter 
        ITEMSELECTION();
                
    }//GEN-LAST:event_waterBActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JLabel changedueL;
    private javax.swing.JButton closeB;
    private javax.swing.JButton dimeB;
    private javax.swing.JLabel dimedispL;
    private javax.swing.JLabel getchangeL;
    private javax.swing.JLabel itemselectL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JButton lemonadeB;
    private javax.swing.JLabel lemonadedispL;
    private javax.swing.JButton loonieB;
    private javax.swing.JLabel looniedispL;
    private javax.swing.JLabel moneyinsertL;
    private javax.swing.JButton nickleB;
    private javax.swing.JLabel nickledispL;
    private javax.swing.JButton pepsiB;
    private javax.swing.JLabel pepsidispL;
    private javax.swing.JButton purchaseB;
    private javax.swing.JButton quarterB;
    private javax.swing.JLabel quarterdispL;
    private javax.swing.JButton resetB;
    private javax.swing.JButton toonieB;
    private javax.swing.JLabel tooniedispL;
    private javax.swing.JButton waterB;
    private javax.swing.JLabel waterdispL;
    // End of variables declaration//GEN-END:variables
}
