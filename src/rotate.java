
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gonephishing
 */
public class rotate extends javax.swing.JFrame {

    /**
     * Creates new form rotate
     */
    public rotate() {
        initComponents();
        init_name();
        allot_name();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rotate");
        setBackground(java.awt.Color.cyan);
        setName("Rotate"); // NOI18N

        b1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=5;
            b1.setEnabled(false);
            b3.setEnabled(false);
            b7.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=9;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b7.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==6)
            {
                int temp = rand_num[5];
                rand_num[5]=rand_num[4];
                rand_num[4]=rand_num[7];
                rand_num[7]=rand_num[8];
                rand_num[8]=temp;
            }
            else if(prev==8)
            {
                int temp = rand_num[7];
                rand_num[7]=rand_num[4];
                rand_num[4]=rand_num[5];
                rand_num[5]=rand_num[8];
                rand_num[8]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=1;
            b1.setEnabled(false);
            b3.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==2)
            {
                int temp=rand_num[1];
                rand_num[1]=rand_num[4];
                rand_num[4]=rand_num[3];
                rand_num[3]=rand_num[0];
                rand_num[0]=temp;
            }
            else if(prev==4)
            {
                int temp=rand_num[3];
                rand_num[3]=rand_num[4];
                rand_num[4]=rand_num[1];
                rand_num[1]=rand_num[0];
                rand_num[0]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=2;
            b2.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==1)
            {
                int temp=rand_num[1];
                rand_num[1]=rand_num[0];
                rand_num[0]=rand_num[3];
                rand_num[3]=rand_num[4];
                rand_num[4]=temp;
            }
            else if(prev==5)
            {
                int temp=rand_num[4];
                rand_num[4]=rand_num[5];
                rand_num[5]=rand_num[2];
                rand_num[2]=rand_num[1];
                rand_num[1]=temp;
            }
            else if(prev==3)
            {
                int temp=rand_num[2];
                rand_num[2]=rand_num[5];
                rand_num[5]=rand_num[4];
                rand_num[4]=rand_num[1];
                rand_num[1]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=3;
            b1.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==2)
            {
                int temp=rand_num[1];
                rand_num[1]=rand_num[4];
                rand_num[4]=rand_num[5];
                rand_num[5]=rand_num[2];
                rand_num[2]=temp;
            }
            else if(prev==6)
            {
                int temp=rand_num[5];
                rand_num[5]=rand_num[4];
                rand_num[4]=rand_num[1];
                rand_num[1]=rand_num[2];
                rand_num[2]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=4;
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==1)
            {
                int temp = rand_num[0];
                rand_num[0]=rand_num[1];
                rand_num[1]=rand_num[4];
                rand_num[4]=rand_num[3];
                rand_num[3]=temp;
            }
            else if(prev==5)
            {
                int temp=rand_num[4];
                rand_num[4]=rand_num[1];
                rand_num[1]=rand_num[0];
                rand_num[0]=rand_num[3];
                rand_num[3]=temp;
            }
            else if(prev==7)
            {
                int temp=rand_num[3];
                rand_num[3]=rand_num[6];
                rand_num[6]=rand_num[7];
                rand_num[7]=rand_num[4];
                rand_num[4]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=6;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==3)
            {
                int temp=rand_num[2];
                rand_num[2]=rand_num[1];
                rand_num[1]=rand_num[4];
                rand_num[4]=rand_num[5];
                rand_num[5]=temp;
            }
            else if(prev==5)
            {
                int temp=rand_num[4];
                rand_num[4]=rand_num[7];
                rand_num[7]=rand_num[8];
                rand_num[8]=rand_num[5];
                rand_num[5]=temp;
            }
            else if(prev==9)
            {
                int temp = rand_num[5];
                rand_num[5]=rand_num[8];
                rand_num[8]=rand_num[7];
                rand_num[7]=rand_num[4];
                rand_num[4]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=7;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b9.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==4)
            {
                int temp = rand_num[3];
                rand_num[3]=rand_num[4];
                rand_num[4]=rand_num[7];
                rand_num[7]=rand_num[6];
                rand_num[6]=temp;
            }
            else if(prev==8)
            {
                int temp = rand_num[6];
                rand_num[6]=rand_num[7];
                rand_num[7]=rand_num[4];
                rand_num[4]=rand_num[3];
                rand_num[3]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
            prev=8;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b8.setEnabled(false);
        }
        else if(count==2)
        {
            count=0;
            if(prev==5)
            {
                int temp=rand_num[4];
                rand_num[4]=rand_num[3];
                rand_num[3]=rand_num[6];
                rand_num[6]=rand_num[7];
                rand_num[7]=temp;
            }
            else if(prev==7)
            {
                int temp = rand_num[7];
                rand_num[7]=rand_num[6];
                rand_num[6]=rand_num[3];
                rand_num[3]=rand_num[4];
                rand_num[4]=temp;
            }
            else if(prev==9)
            {
                int temp = rand_num[7];
                rand_num[7]=rand_num[8];
                rand_num[8]=rand_num[5];
                rand_num[5]=rand_num[4];
                rand_num[4]=temp;
            }
            allot_name();
            check_sol();
            enable_all();
        }
    }//GEN-LAST:event_b8ActionPerformed
    
    private void check_sol()
    {
        if(rand_num[0]==1)
        {
            if(rand_num[1]==2)
            {
                if(rand_num[2]==3)
                {
                    if(rand_num[3]==4)
                    {
                        if(rand_num[4]==5)
                        {
                            if(rand_num[5]==6)
                            {
                                if(rand_num[6]==7)
                                {
                                    if(rand_num[7]==8)
                                    {
                                        if(rand_num[8]==9)
                                        {
                                            JOptionPane.showMessageDialog(this, "Victory was never this easy...");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void enable_all()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
    }
    
    private void init_name()
    {
        for(int i=0;i<9;i++)
        {
            rand_num[i] = i+1;
        }
        int temp =0;
        for(int i=8;i>=1;i--)
        {
            
            int rand = 1 + (int)(Math.random()*(i-1) + 1);
            temp = rand_num[i];
            rand_num[i]=rand_num[rand];
            rand_num[rand]=temp;
        }
//        for(int i=0;i<9;i++)
//        {
//            System.out.println(""+rand_num[i]);
//        }
    }
    public void allot_name()
    {
        b1.setText(""+rand_num[0]);
        b2.setText(""+rand_num[1]);
        b3.setText(""+rand_num[2]);
        b4.setText(""+rand_num[3]);
        b5.setText(""+rand_num[4]);
        b6.setText(""+rand_num[5]);
        b7.setText(""+rand_num[6]);
        b8.setText(""+rand_num[7]);
        b9.setText(""+rand_num[8]);   
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
            java.util.logging.Logger.getLogger(rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rotate().setVisible(true);
            }
        });
    }
    int count =0;
    int prev =0;
    static int rand_num[] = new int[9];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton b1;
    private static javax.swing.JButton b2;
    private static javax.swing.JButton b3;
    private static javax.swing.JButton b4;
    private static javax.swing.JButton b5;
    private static javax.swing.JButton b6;
    private static javax.swing.JButton b7;
    private static javax.swing.JButton b8;
    private static javax.swing.JButton b9;
    // End of variables declaration//GEN-END:variables

}
