
package projetofinal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas Ramon
 */
public class Prin extends javax.swing.JFrame {

    ArrayList<Quadro>ListQuad;
    String situacao;
    
    
    public void CarregaTabela(){
             
             
             DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","CPF","Data_Nasc","Sexo","Cargo"},0);
                          
             
             for(int i=0;i<ListQuad.size();i++)
             {
                 Object linha[]= new Object[]{ListQuad.get(i).getNome(),
                                             ListQuad.get(i).getCPF(),
                                            ListQuad.get(i).getData_Nasc(),
                                            ListQuad.get(i).getSexo(),
                                            ListQuad.get(i).getCargo()};
                 modelo.addRow(linha);

             }
             Table_funcionarios.getColumnModel().getColumn(0).setPreferredWidth(50);
             Table_funcionarios.getColumnModel().getColumn(1).setPreferredWidth(50);
             Table_funcionarios.getColumnModel().getColumn(2).setPreferredWidth(50);
             Table_funcionarios.getColumnModel().getColumn(3).setPreferredWidth(50);
             Table_funcionarios.getColumnModel().getColumn(4).setPreferredWidth(50);
        Table_funcionarios.setModel(modelo);
        
    }
    public Prin() {
        initComponents();
        ListQuad= new ArrayList();
        situacao= "Navegacao";
        Interage();
        
        
        
        
    }
    public void Interage(){
        switch (situacao){
            case "Navegacao":
                btn_funcionarios_salvar.setEnabled(false);
                btn_funcionarios_cancelar.setEnabled(false);
                c_funcionarios_nome.setEnabled(false);
                c_funcionarios_cpf.setEnabled(false);
                c_funcionarios_data.setEnabled(false);
                c_funcionarios_sexo.setEnabled(false);
                c_funcionarios_cargo.setEditable(false);
                btn_funcionarios_novo.setEnabled(true);
                btn_funcionarios_editar.setEnabled(false);
                btn_funcionarios_excluir.setEnabled(false);
               
                
                break;
            case "Novo":
                btn_funcionarios_salvar.setEnabled(true);
                btn_funcionarios_cancelar.setEnabled(true);
                c_funcionarios_nome.setEnabled(true);
                c_funcionarios_cpf.setEnabled(true);
                c_funcionarios_data.setEnabled(true);
                c_funcionarios_sexo.setEnabled(true);
                c_funcionarios_cargo.setEditable(true);
                btn_funcionarios_novo.setEnabled(false);
                btn_funcionarios_editar.setEnabled(false);
                btn_funcionarios_excluir.setEnabled(false);
                
                break;
            case "Editar":
                btn_funcionarios_salvar.setEnabled(true);
                btn_funcionarios_cancelar.setEnabled(true);
                c_funcionarios_nome.setEnabled(true);
                c_funcionarios_cpf.setEnabled(true);
                c_funcionarios_data.setEnabled(true);
                c_funcionarios_sexo.setEnabled(true);
                c_funcionarios_cargo.setEditable(true);
                btn_funcionarios_novo.setEnabled(true);
                btn_funcionarios_editar.setEnabled(false);
                btn_funcionarios_excluir.setEnabled(false);
                
                break;
            case "Excluir":
                btn_funcionarios_salvar.setEnabled(false);
                btn_funcionarios_cancelar.setEnabled(false);
                c_funcionarios_nome.setEnabled(false);
                c_funcionarios_cpf.setEnabled(false);
                c_funcionarios_data.setEnabled(false);
                c_funcionarios_sexo.setEnabled(false);
                c_funcionarios_cargo.setEditable(false);
                btn_funcionarios_novo.setEnabled(true);
                btn_funcionarios_editar.setEnabled(false);
                btn_funcionarios_excluir.setEnabled(false);
            case "Clique":
                btn_funcionarios_salvar.setEnabled(false);
                btn_funcionarios_cancelar.setEnabled(false);
                c_funcionarios_nome.setEnabled(false);
                c_funcionarios_cpf.setEnabled(false);
                c_funcionarios_data.setEnabled(false);
                c_funcionarios_sexo.setEnabled(false);
                c_funcionarios_cargo.setEditable(false);
                btn_funcionarios_novo.setEnabled(true);
                btn_funcionarios_editar.setEnabled(true);
                btn_funcionarios_excluir.setEnabled(true);
                
                
                break;
            default: System.out.println("Operação inválda");
            
            
            
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_funcionarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_funcionarios_salvar = new javax.swing.JButton();
        btn_funcionarios_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c_funcionarios_nome = new javax.swing.JTextField();
        c_funcionarios_cpf = new javax.swing.JTextField();
        c_funcionarios_data = new javax.swing.JTextField();
        c_funcionarios_sexo = new javax.swing.JTextField();
        c_funcionarios_cargo = new javax.swing.JTextField();
        btn_funcionarios_novo = new javax.swing.JButton();
        btn_funcionarios_editar = new javax.swing.JButton();
        btn_funcionarios_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                *****LISTA DE FUNCIONARIOS ZETTA*****");

        Table_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data Nasc", "Sexo", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_funcionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_funcionarios);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro "));

        btn_funcionarios_salvar.setText("Salvar");
        btn_funcionarios_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarios_salvarActionPerformed(evt);
            }
        });

        btn_funcionarios_cancelar.setText("Cancelar");
        btn_funcionarios_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarios_cancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data de Nasc :");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Cargo:");

        c_funcionarios_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_funcionarios_nomeActionPerformed(evt);
            }
        });

        c_funcionarios_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_funcionarios_cargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_funcionarios_salvar)
                        .addGap(77, 77, 77)
                        .addComponent(btn_funcionarios_cancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_funcionarios_nome)
                            .addComponent(c_funcionarios_cpf)
                            .addComponent(c_funcionarios_data)
                            .addComponent(c_funcionarios_sexo)
                            .addComponent(c_funcionarios_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_funcionarios_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_funcionarios_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_funcionarios_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_funcionarios_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_funcionarios_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_funcionarios_salvar)
                    .addComponent(btn_funcionarios_cancelar)))
        );

        btn_funcionarios_novo.setText("Novo");
        btn_funcionarios_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarios_novoActionPerformed(evt);
            }
        });

        btn_funcionarios_editar.setText("Editar");
        btn_funcionarios_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarios_editarActionPerformed(evt);
            }
        });

        btn_funcionarios_excluir.setText("Excluir");
        btn_funcionarios_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarios_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_funcionarios_novo)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_funcionarios_editar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_funcionarios_excluir)))
                            .addGap(49, 49, 49))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_funcionarios_novo)
                    .addComponent(btn_funcionarios_editar)
                    .addComponent(btn_funcionarios_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_funcionarios_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarios_editarActionPerformed
        situacao="Editar" ;
        Interage();
         
    }//GEN-LAST:event_btn_funcionarios_editarActionPerformed

    private void btn_funcionarios_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarios_excluirActionPerformed
        int index = Table_funcionarios.getSelectedRow();
        if(index>=0 && index<ListQuad.size()){
            ListQuad.remove(index);
        }
        CarregaTabela();
        situacao="Navegacao";
        Interage();
        
       
    }//GEN-LAST:event_btn_funcionarios_excluirActionPerformed

    private void c_funcionarios_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_funcionarios_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_funcionarios_nomeActionPerformed

    private void c_funcionarios_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_funcionarios_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_funcionarios_cargoActionPerformed

    private void btn_funcionarios_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarios_cancelarActionPerformed
        c_funcionarios_nome.setText("");
        c_funcionarios_cpf.setText("");
        c_funcionarios_data.setText("");
        c_funcionarios_sexo.setText("");
        c_funcionarios_cargo.setText("");
        situacao="Navegacao";
        Interage();
       
        
        
    }//GEN-LAST:event_btn_funcionarios_cancelarActionPerformed

    private void btn_funcionarios_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarios_novoActionPerformed
        c_funcionarios_nome.setText("");
        c_funcionarios_cpf.setText("");
        c_funcionarios_data.setText("");
        c_funcionarios_sexo.setText("");
        c_funcionarios_cargo.setText("");
        situacao="Novo";
        Interage();
        
          
    }//GEN-LAST:event_btn_funcionarios_novoActionPerformed

    private void btn_funcionarios_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarios_salvarActionPerformed
        
    if(situacao.equals("Novo")){
     Quadro D = new Quadro(c_funcionarios_nome.getText(),c_funcionarios_cpf.getText(),c_funcionarios_data.getText(),c_funcionarios_sexo.getText(),c_funcionarios_cargo.getText());
     
     ListQuad.add(D);
    }
    else if(situacao.equals("Editar")){
        int index = Table_funcionarios.getSelectedRow();
        ListQuad.get(index).setNome(c_funcionarios_nome.getText());
        ListQuad.get(index).setCPF(c_funcionarios_cpf.getText());
        ListQuad.get(index).setData_Nasc(c_funcionarios_data.getText());
        ListQuad.get(index).setSexo(c_funcionarios_sexo.getText());
         ListQuad.get(index).setCargo(c_funcionarios_cargo.getText());

    }
     
     CarregaTabela();
     situacao="Navegacao";
     
     
     Interage();
     c_funcionarios_nome.setText("");
        c_funcionarios_cpf.setText("");
        c_funcionarios_data.setText("");
        c_funcionarios_sexo.setText("");
        c_funcionarios_cargo.setText("");
        
     
      
    }//GEN-LAST:event_btn_funcionarios_salvarActionPerformed

    private void Table_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_funcionariosMouseClicked
        int index = Table_funcionarios.getSelectedRow();
        if (index>=0 && index<ListQuad.size())
        {
            Quadro D = ListQuad.get(index);
            c_funcionarios_nome.setText(D.getNome());
            c_funcionarios_cpf.setText(D.getCPF());
            c_funcionarios_data.setText(D.getData_Nasc());
            c_funcionarios_sexo.setText(D.getSexo());
            c_funcionarios_cargo.setText(D.getCargo());
            situacao="Clique";
            Interage();    
    }//GEN-LAST:event_Table_funcionariosMouseClicked
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
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_funcionarios;
    private javax.swing.JButton btn_funcionarios_cancelar;
    private javax.swing.JButton btn_funcionarios_editar;
    private javax.swing.JButton btn_funcionarios_excluir;
    private javax.swing.JButton btn_funcionarios_novo;
    private javax.swing.JButton btn_funcionarios_salvar;
    private javax.swing.JTextField c_funcionarios_cargo;
    private javax.swing.JTextField c_funcionarios_cpf;
    private javax.swing.JTextField c_funcionarios_data;
    private javax.swing.JTextField c_funcionarios_nome;
    private javax.swing.JTextField c_funcionarios_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
