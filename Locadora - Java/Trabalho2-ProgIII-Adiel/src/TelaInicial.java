/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adiel
 */
public class TelaInicial extends javax.swing.JFrame {

    public static int buscaCliente(ArrayList<Cliente> list, int cpf) {
        int i = 0;
        for (Cliente c : list) {
            if (c.getCpf() == cpf) {

                return i;
            }
            i++;
        }
        return -1;
    }

    public static int buscaCarro(ArrayList<Carro> list, String placa) {
        int i = 0;
        for (Carro c : list) {
            if (c.getPlaca().equals(placa)) {
                return i;
            }
            i++;
        }

        return -1;

    }

    public static int buscaAluguel(ArrayList<Aluguel> list, int cpf, String placa) {
        int i = 0;
        for (Aluguel a : list) {
            if (a.getCpf() == cpf && a.getPlaca().equals(placa)) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static int buscaAluguelCPF(ArrayList<Aluguel> list, int cpf) {
        int i = 0;
        for (Aluguel a : list) {
            if (a.getCpf() == cpf) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static int buscaAluguelPLACA(ArrayList<Aluguel> list,String placa) {
        int i = 0;
        for (Aluguel a : list) {
            if (a.getPlaca().equals(placa)) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
        static ManipularArquivo arq = new ManipularArquivo();
        static ArrayList<Cliente> listaCliente = new ArrayList();
        static ArrayList<Carro> listaCarro = new ArrayList();
        static ArrayList<Aluguel> listaAluguel = new ArrayList();
        
        public static void salvaDados() throws IOException{
                    arq.escritorCliente("cliente.txt", listaCliente);
                    arq.escritorCarro("carro.txt", listaCarro);
                    arq.escritorAluguel("aluguel.txt", listaAluguel);
            
        }     
        public static void carregaDadosCliente() throws IOException{
            File arquivo = new File("cliente.txt");
            if (arquivo.exists()) {
                listaCliente = arq.leitorCliente("cliente.txt", listaCliente);
            }
        }
        public static void carregaDadosCarro() throws IOException{
            File arquivo = new File("carro.txt");
            arquivo = new File("carro.txt");
            if (arquivo.exists()) {
                listaCarro = arq.leitorCarro("carro.txt", listaCarro);
            }
        }
        public static void carregaDadosAluguel() throws IOException{
            File arquivo = new File("alugue.txt");
            arquivo = new File("aluguel.txt");
            if (arquivo.exists()) {
                listaAluguel = arq.leitorAluguel("aluguel.txt", listaAluguel);
            }
        }

    public TelaInicial() throws IOException {
        if(listaCliente.isEmpty()){
            carregaDadosCliente();
        }
        if(listaCarro.isEmpty()){
            carregaDadosCarro();
        }
        if(listaAluguel.isEmpty()){
            carregaDadosAluguel();
        }

        initComponents();
        this.setLocation(450,150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastroCarro = new javax.swing.JButton();
        labelTelaInicial = new javax.swing.JLabel();
        fazerAluguel = new javax.swing.JButton();
        botaoCadastroCliente = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        botaoDevolucao = new javax.swing.JButton();
        botaoBuscas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoCadastroCarro.setText("Cadastro Carro");
        botaoCadastroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroCarroActionPerformed(evt);
            }
        });

        labelTelaInicial.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        labelTelaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTelaInicial.setText("Tela Inicial");

        fazerAluguel.setText("Fazer Aluguel");
        fazerAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerAluguelActionPerformed(evt);
            }
        });

        botaoCadastroCliente.setText("Cadastro Cliente");
        botaoCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroClienteActionPerformed(evt);
            }
        });

        botaoRelatorios.setText("Relatorios");
        botaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatoriosActionPerformed(evt);
            }
        });

        botaoDevolucao.setText("Devolver Carro");
        botaoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDevolucaoActionPerformed(evt);
            }
        });

        botaoBuscas.setText("Pagamento");
        botaoBuscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastroCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(fazerAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoBuscas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadastroCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fazerAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroCarroActionPerformed
        this.dispose();
        new TelaCadastroCarro().setVisible(true);
    }//GEN-LAST:event_botaoCadastroCarroActionPerformed

    private void fazerAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerAluguelActionPerformed
        this.dispose();
        new TelaFazerAluguel().setVisible(true);
    }//GEN-LAST:event_fazerAluguelActionPerformed

    private void botaoCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroClienteActionPerformed
        this.dispose();
        new TelaCadastroCliente().setVisible(true);    
    }//GEN-LAST:event_botaoCadastroClienteActionPerformed

    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        this.dispose();
        new TelaRelatorios().setVisible(true);
    }//GEN-LAST:event_botaoRelatoriosActionPerformed

    private void botaoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDevolucaoActionPerformed
        this.dispose();
        new TelaDevolucao().setVisible(true);
    }//GEN-LAST:event_botaoDevolucaoActionPerformed

    private void botaoBuscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscasActionPerformed
        this.dispose();
        new TelaBuscas().setVisible(true);
    }//GEN-LAST:event_botaoBuscasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaInicial().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    salvaDados();
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscas;
    private javax.swing.JButton botaoCadastroCarro;
    private javax.swing.JButton botaoCadastroCliente;
    private javax.swing.JButton botaoDevolucao;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton fazerAluguel;
    private javax.swing.JLabel labelTelaInicial;
    // End of variables declaration//GEN-END:variables
}
