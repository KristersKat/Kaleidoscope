import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;



public class kaleidoskops extends javax.swing.JFrame {

    public kaleidoskops() {
        initComponents();
    }
    public void nsturis(double xc, double yc, double r, int n){
        double al=Math.PI/n*2;
        Graphics g=this.getGraphics();
        for(int i=0;i<n;i++){
        g.drawLine((int)(xc+r*Math.cos(al*i)),
            (int)(yc-r*Math.sin(al*i)), 
            (int)(xc+r*Math.cos(al*(i+1))),
            (int)(yc-r*Math.sin(al*(i+1))));
        g.drawLine((int)(xc+r*Math.cos(al*i)),
            (int)(yc-r*Math.sin(al*i)),
            (int) xc,
            (int) yc);
   }
 }
    public void tsturis(double xc, double yc, double r, int n){
        Graphics g=this.getGraphics();
        Random rand=new Random();
        double sa=0;
        double al=Math.PI/n*2;
        double be=al*Math.random();
        double[] x=new double[3];
        double[] y=new double[3];
        double r0=r*Math.random();
        double r1=r*Math.random();
        double r2=r*Math.cos(al/2)/Math.cos(al/2-be);
        Color c=new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        g.setColor(c);
        for(int j=0;j<n;j++){
            sa=al*j;
            if(j%2==0){
                x[0]=xc+r0*Math.cos(sa);y[0]=yc-r0*Math.sin(sa);
                x[1]=xc+r1*Math.cos(sa+al);y[1]=yc-r1*Math.sin(sa+al);
                x[2]=xc+r2*Math.cos(sa+be);y[2]=yc-r2*Math.sin(sa+be);
            }
            else{
                x[0]=xc+r1*Math.cos(sa);y[0]=yc-r1*Math.sin(sa);
                x[1]=xc+r0*Math.cos(sa+al);y[1]=yc-r0*Math.sin(sa+al);
                x[2]=xc+r2*Math.cos(sa+al-be);y[2]=yc-r2*Math.sin(sa+al-be);
            }
            Polygon p=new Polygon();
            for(int i=0;i<3;i++){
                p.addPoint((int)x[i],(int)y[i]);
            }
            g.fillPolygon(p);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(6, 4, 16, 2));

        jButton1.setText("Zimet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("stūris");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 472, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int v;
        v = (int) jSpinner1.getValue();
        nsturis(250, 250, 200, v);
        tsturis(250, 250, 200, v);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(kaleidoskops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kaleidoskops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kaleidoskops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kaleidoskops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kaleidoskops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
