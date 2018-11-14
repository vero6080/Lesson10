package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultListModel;

public class StudentSort extends javax.swing.JFrame {

    DefaultListModel data;
    ISSStudent iss[] = new ISSStudent[100];

    public StudentSort() {
        initComponents();
        data = new DefaultListModel();
        //connect to list
        studentlist.setModel(data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentlist = new javax.swing.JList<>();
        btnopen = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(studentlist);

        btnopen.setText("Open File");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnsort.setText("Sort by Name");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnopen)
                .addGap(18, 18, 18)
                .addComponent(btnsort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        data.clear();
        try {
            FileReader f = new FileReader("src\\Searching\\studata.txt");
            BufferedReader b = new BufferedReader(f);
            for (int i = 0; i < 100; i++) {
                String nm, ad;
                int id;
                nm = b.readLine();
                ad = b.readLine();
                id = Integer.parseInt(b.readLine());
                iss[i] = new ISSStudent(nm, ad, id);
            }
            b.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        //will list names in original file order (sorted by id, not by name)
        for (ISSStudent s : iss) {
            data.addElement(s.getName());
        }
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        data.clear();
        selectionSort(iss);
        //redisplay in list
        for (ISSStudent s : iss) {
            data.addElement(s.getName());
        }
    }//GEN-LAST:event_btnsortActionPerformed

    public static void selectionSort(ISSStudent[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(ISSStudent[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i].compareTo(a[minIndex]) < 1) {
                minIndex = i;
            }
        }
        return minIndex;
    }

//supporting swap method (same as bubble sort swap)
    public static void swap(ISSStudent[] a, int x, int y) {
        ISSStudent temp = a[x];
        a[x] = a[y];
        a[y] = temp;
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
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnsort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> studentlist;
    // End of variables declaration//GEN-END:variables
}
