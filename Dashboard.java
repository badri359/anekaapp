
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author badri
 */
public class Dashboard extends javax.swing.JFrame {
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        bgsplashscreen = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        bgsplashscreen.setBackground(new java.awt.Color(32, 178, 245));
        bgsplashscreen.setMinimumSize(new java.awt.Dimension(1440, 1024));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N

        loading.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(242, 242, 242));
        loading.setText("Loading...");

        loadingvalue.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        loadingvalue.setForeground(new java.awt.Color(242, 242, 242));
        loadingvalue.setText("0%");

        javax.swing.GroupLayout bgsplashscreenLayout = new javax.swing.GroupLayout(bgsplashscreen);
        bgsplashscreen.setLayout(bgsplashscreenLayout);
        bgsplashscreenLayout.setHorizontalGroup(
            bgsplashscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgsplashscreenLayout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(logo)
                .addContainerGap(544, Short.MAX_VALUE))
            .addGroup(bgsplashscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgsplashscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgsplashscreenLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(loading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadingvalue)
                        .addGap(36, 36, 36))
                    .addComponent(LoadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgsplashscreenLayout.setVerticalGroup(
            bgsplashscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgsplashscreenLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addGroup(bgsplashscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loading)
                    .addComponent(loadingvalue))
                .addGap(18, 18, 18)
                .addComponent(LoadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(bgsplashscreen);
        bgsplashscreen.setBounds(0, 0, 1440, 1020);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           Dashboard sp = new Dashboard();
           sp.setVisible(true);
           Start S= new Start();
           S.setVisible(false);
           
           
           try {
            for(int i=0;i<=100;i++){
                Thread.sleep(110);
                sp.loadingvalue.setText(i+"%");
                 sp.LoadingBar.setValue(i);
                
                if(i==20){
                sp.loading.setText("Processing...");
                }
                if(i==50){
                 sp.loading.setText("Connecting to Server...");
                }
                 if(i==70){
                 sp.loading.setText("Connecting Successful...");
                }
                 if(i==80){
                 sp.loading.setText("Launching Application...");
                }
                if(i==100){
                sp.setVisible(false);
                S.setVisible(true);
                
                }
            }
            
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
        /* Create and display the form */
           }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JPanel bgsplashscreen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loadingvalue;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
