/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptochat.gui;

import java.awt.Color;

/**
 *
 * @author raka
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setTitle("Prijava");
        this.setLocationRelativeTo(null);
        neuspjesnoLogovanjeLabel.setText("");
        neuspjesnoLogovanjeLabel.setForeground(Color.red);
        //komentar test git
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lozinkaPasswordField = new javax.swing.JPasswordField();
        korisnickoImeTextField = new javax.swing.JTextField();
        korisnickoImeLabel = new javax.swing.JLabel();
        lozinkaLabel = new javax.swing.JLabel();
        prijavaNaSistemLabel = new javax.swing.JLabel();
        neuspjesnoLogovanjeLabel = new javax.swing.JLabel();
        prijavaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        korisnickoImeLabel.setText("Korisničko ime:");

        lozinkaLabel.setText("Lozinka: ");

        prijavaNaSistemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        prijavaNaSistemLabel.setText("PRIJAVA NA SISTEM");

        neuspjesnoLogovanjeLabel.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        neuspjesnoLogovanjeLabel.setText("jLabel1");

        prijavaButton.setText("Prijava");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prijavaButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(korisnickoImeLabel)
                                    .addComponent(lozinkaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(korisnickoImeTextField)
                                    .addComponent(lozinkaPasswordField)
                                    .addComponent(neuspjesnoLogovanjeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(prijavaNaSistemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(prijavaNaSistemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(korisnickoImeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(korisnickoImeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lozinkaLabel)
                    .addComponent(lozinkaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(neuspjesnoLogovanjeLabel)
                .addGap(18, 18, 18)
                .addComponent(prijavaButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * 
     * @param args the command line arguments
     * 
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel korisnickoImeLabel;
    private javax.swing.JTextField korisnickoImeTextField;
    private javax.swing.JLabel lozinkaLabel;
    private javax.swing.JPasswordField lozinkaPasswordField;
    private javax.swing.JLabel neuspjesnoLogovanjeLabel;
    private javax.swing.JButton prijavaButton;
    private javax.swing.JLabel prijavaNaSistemLabel;
    // End of variables declaration//GEN-END:variables
}
