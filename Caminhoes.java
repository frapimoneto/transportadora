/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

/**
 *
 * @author Francisco
 */
public class Caminhoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Caminhoes
     */
    public Caminhoes() {
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

        jLabel1 = new javax.swing.JLabel();
        jlNumeroCaminhao = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlQuilometragem = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(552, 558));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Caminhões");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        jlNumeroCaminhao.setText("Número");
        getContentPane().add(jlNumeroCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jlMarca.setText("Marca");
        getContentPane().add(jlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jlQuilometragem.setText("Quilometragem");
        getContentPane().add(jlQuilometragem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jlTipo.setText("Tipo");
        getContentPane().add(jlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 350, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 350, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 350, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 350, 30));

        jbPesquisar.setText("Pesquisar");
        getContentPane().add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButton2.setText("Salvar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jButton3.setText("Fechar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlNumeroCaminhao;
    private javax.swing.JLabel jlQuilometragem;
    private javax.swing.JLabel jlTipo;
    // End of variables declaration//GEN-END:variables
}
