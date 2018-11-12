package Sorting;

import javax.swing.DefaultListModel;

public class SortingGUI extends javax.swing.JFrame {

    int listnum[] = new int[50000];

    public SortingGUI() {
        initComponents();
        btnquick.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        btngenerate = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnselection = new javax.swing.JButton();
        btninsertion = new javax.swing.JButton();
        btnquick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtoutput.setEditable(false);
        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble Sort");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselection.setText("Selection Sort");
        btnselection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectionActionPerformed(evt);
            }
        });

        btninsertion.setText("Insertion Sort");
        btninsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertionActionPerformed(evt);
            }
        });

        btnquick.setText("Quick Sort");
        btnquick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnselection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnquick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btngenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngenerate)
                        .addGap(18, 18, 18)
                        .addComponent(btnbubble)
                        .addGap(18, 18, 18)
                        .addComponent(btnselection)
                        .addGap(18, 18, 18)
                        .addComponent(btninsertion)
                        .addGap(18, 18, 18)
                        .addComponent(btnquick)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        int k = 0;
        boolean exchangeMade = true;

        while ((k < listnum.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int i = 0; i < listnum.length - k; i++) {
                if (listnum[i] > listnum[i + 1]) {
                    swap(listnum, i, i + 1);
                    exchangeMade = true;
                }
            }
        }
        clear();
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        /*
        DefaultListModel list = new DefaultListModel();
        for (int i = 0; i < listnum.length; i++) {
            list.addElement(Math.random()*50000 + 1);
        }
         */
        for (int i = 0; i < listnum.length; i++) {
            listnum[i] = (int) (Math.random() * 50000 + 1);
            txtoutput.append(listnum[i] + "\n");
        }
    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnselectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectionActionPerformed
        for (int i = 0; i < listnum.length - 1; i++) {
            int minIndex = findMinimum(listnum, i);
            if (minIndex != i) {
                swap(listnum, i, minIndex);
            }
        }

        clear();
    }//GEN-LAST:event_btnselectionActionPerformed

    private void btninsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertionActionPerformed
        int itemToInsert, j;
        boolean stillLooking;

        for (int i = 1; i < listnum.length; i++) {
            itemToInsert = listnum[i];
            j = i - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < listnum[j]) {
                    listnum[j + 1] = listnum[j];
                    j--;
                } else {
                    stillLooking = false;
                    listnum[j + 1] = itemToInsert;
                }
            }
        }

        clear();
    }//GEN-LAST:event_btninsertionActionPerformed

    private void btnquickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquickActionPerformed

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static int findMinimum(int a[], int first) {
        int minIndex = first;
        for (int i = first; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void clear() {
        txtoutput.setText("");
        for (int i = 0; i < listnum.length; i++) {
            txtoutput.append(listnum[i] + "\n");
        }
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
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsertion;
    private javax.swing.JButton btnquick;
    private javax.swing.JButton btnselection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}