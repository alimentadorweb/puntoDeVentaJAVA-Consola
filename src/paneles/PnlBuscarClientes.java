package paneles;

import clases.Cliente;
import clases.ModelTablaClientes;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author puntodeventa-jlat
 */
public class PnlBuscarClientes extends javax.swing.JPanel {

    /**
     * Creates new form PnlBuscarClientes
     */
    private Cliente nuevoCliente = null;   
    private JOptionPane op;
    private ModelTablaClientes mdlCliente;
    public PnlBuscarClientes() {
        initComponents();
        mdlCliente = new ModelTablaClientes();
        this.tblClientes.setModel(mdlCliente);
        this.tblClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bntSeleccionar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbShow = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        bntSeleccionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntSeleccionar.setText("Seleccionar Cliente");
        bntSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSeleccionarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 7, 9);
        jPanel4.add(bntSeleccionar, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 7, 9);
        jPanel4.add(jButton1, gridBagConstraints);

        lbShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(lbShow, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        tblClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSeleccionarActionPerformed
        getOptionPane();
        int indice  = this.tblClientes.getSelectedRow();
        if(indice != -1)
        {            
            //nuevoCliente = mdlCliente.getCliente(indice); 
            setNuevoCliente(mdlCliente.getCliente(indice));
            op.setValue(1);
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_bntSeleccionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getOptionPane();
       op.setValue(1);
    }//GEN-LAST:event_jButton1ActionPerformed
    public JLabel getLabelEscondido()
    {
        return this.lbShow;
    }

    public Cliente getNuevoCliente() {
        return nuevoCliente;
    }

    private void setNuevoCliente(Cliente nuevoCliente) {
        this.nuevoCliente = nuevoCliente;        
    }

    
    
    private void getOptionPane()
    {
        if(op != null)
        {
            return;
        }
        Component pdr =this.getParent(); 
        while(pdr.getParent() != null)
        {
            if(pdr instanceof JOptionPane)
            {
                op = (JOptionPane)pdr;
                break;
            }            
            pdr = pdr.getParent();
        }
    }

    public Cliente getCliente()
    {       
        return this.nuevoCliente;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbShow;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
