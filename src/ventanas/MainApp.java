package ventanas;

import clases.AdminIFrame;
import clases.Conexion;
import clases.FiltroArchivo;
import clases.ScriptRunner;
import clases.Usuario;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import sun.java2d.loops.ProcessPath.ProcessHandler;


/**
 *
 * @author puntodeventa-jlat
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    private static IRegistroUsuarios vntUsuarios = null;
    private static IRegistroClientes vntClientes = null;
    private static IRegistroPagos vntPagos = null;
    private static IRegistroOrdenes vntOrdenes = null;
    private static IReporteIngresos vntReporteIngresos = null;
    private static IReporteDeOrdenes vntReporteOrdenes = null;
    public MainApp() {
        initComponents();           
        this.setLocation(50, 50);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width-100,screenSize.height-100);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/imagenes/money.png")));
        //System.out.println(bounds.height);
        this.panelBienvenido.addHyperlinkListener(new HyperlinkListener()
            {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e)
                {
                    if (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
                        if(Desktop.isDesktopSupported())
                        {

                            try {
                                Desktop.getDesktop().browse(new URI(e.getURL().toString()));
                            } catch (URISyntaxException ex) {
                                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                            }catch (IOException ex) {
                            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                }
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBienvenido = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mCerrarSesion = new javax.swing.JMenuItem();
        miRegistrarUsuarios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        mRegistroClientes = new javax.swing.JMenuItem();
        mPagos = new javax.swing.JMenu();
        mRegistrodePagos = new javax.swing.JMenuItem();
        mEmisiondeOrdenes = new javax.swing.JMenuItem();
        Mreportes = new javax.swing.JMenu();
        mReporteDeIngresos = new javax.swing.JMenuItem();
        mReportedeOrdenes = new javax.swing.JMenuItem();
        mHerramientas = new javax.swing.JMenu();
        mCalculadora = new javax.swing.JMenuItem();
        MiResPaldarBD = new javax.swing.JMenuItem();
        MiRestaurarBD = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dp.setBackground(new java.awt.Color(51, 153, 255));

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Bienvenido");
        jInternalFrame1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jInternalFrame1.setVisible(true);

        panelBienvenido.setEditable(false);
        panelBienvenido.setContentType("text/html"); // NOI18N
        panelBienvenido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelBienvenido.setText("<html><body>\n<p>Punto de Ventas Desarrollado por Grupo de Telegram Java Latinos</p>\n<p><a href=\"https://t.me/joinchat/Md3mZRATXOMMaG9NqE09Qg\">https://t.me/joinchat/Md3mZRATXOMMaG9NqE09Qg</a></p>\n<p>Este programa es un software libre: Puedes Distribuirlo y/o Modificarlo.</p>\n<p>Licencia GNU</p>\n<p>Este software se entrega tal y como es sin ninguna garantia.</p>       \n</body></html>\n");
        jScrollPane1.setViewportView(panelBienvenido);

        jInternalFrame1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dp.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(dp, java.awt.BorderLayout.CENTER);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/folder.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mCerrarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/disconnect.png"))); // NOI18N
        mCerrarSesion.setText("Cerrar Session");
        mCerrarSesion.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/disconnect.png"))); // NOI18N
        mCerrarSesion.setEnabled(false);
        mCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(mCerrarSesion);

        miRegistrarUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        miRegistrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/group_key.png"))); // NOI18N
        miRegistrarUsuarios.setText("Registro de Usuarios");
        miRegistrarUsuarios.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/group_key.png"))); // NOI18N
        miRegistrarUsuarios.setEnabled(false);
        miRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(miRegistrarUsuarios);

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/door_in.png"))); // NOI18N
        jMenuItem4.setText("Cerrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        mClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/group.png"))); // NOI18N
        mClientes.setText("Clientes");
        mClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mRegistroClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mRegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/group_add.png"))); // NOI18N
        mRegistroClientes.setText("Registro de Clientes");
        mRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistroClientesActionPerformed(evt);
            }
        });
        mClientes.add(mRegistroClientes);

        jMenuBar1.add(mClientes);

        mPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/money_dollar.png"))); // NOI18N
        mPagos.setText("Pagos");
        mPagos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mRegistrodePagos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mRegistrodePagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/coins_add.png"))); // NOI18N
        mRegistrodePagos.setText("Registro de Pagos Por Cliente");
        mRegistrodePagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrodePagosActionPerformed(evt);
            }
        });
        mPagos.add(mRegistrodePagos);

        mEmisiondeOrdenes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mEmisiondeOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/report_word.png"))); // NOI18N
        mEmisiondeOrdenes.setText("Emision de Ordenes(Corte/reconexion)");
        mEmisiondeOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEmisiondeOrdenesActionPerformed(evt);
            }
        });
        mPagos.add(mEmisiondeOrdenes);

        jMenuBar1.add(mPagos);

        Mreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/report.png"))); // NOI18N
        Mreportes.setText("Reportes");
        Mreportes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mReporteDeIngresos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mReporteDeIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/report_add.png"))); // NOI18N
        mReporteDeIngresos.setText("Reporte de Ingresos");
        mReporteDeIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReporteDeIngresosActionPerformed(evt);
            }
        });
        Mreportes.add(mReporteDeIngresos);

        mReportedeOrdenes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mReportedeOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/book_addresses.png"))); // NOI18N
        mReportedeOrdenes.setText("Reporte de Ordenes Enviadas");
        mReportedeOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReportedeOrdenesActionPerformed(evt);
            }
        });
        Mreportes.add(mReportedeOrdenes);

        jMenuBar1.add(Mreportes);

        mHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/cog.png"))); // NOI18N
        mHerramientas.setText("Herramientas");
        mHerramientas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mCalculadora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/calculator.png"))); // NOI18N
        mCalculadora.setText("Calculadora");
        mCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCalculadoraActionPerformed(evt);
            }
        });
        mHerramientas.add(mCalculadora);

        MiResPaldarBD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MiResPaldarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/database_save.png"))); // NOI18N
        MiResPaldarBD.setText("Respaldar Base de Datos");
        MiResPaldarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiResPaldarBDActionPerformed(evt);
            }
        });
        mHerramientas.add(MiResPaldarBD);

        MiRestaurarBD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MiRestaurarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/database_refresh.png"))); // NOI18N
        MiRestaurarBD.setText("Restaurar Base de Datos");
        MiRestaurarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiRestaurarBDActionPerformed(evt);
            }
        });
        mHerramientas.add(MiRestaurarBD);

        jMenuBar1.add(mHerramientas);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/help.png"))); // NOI18N
        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/comment.png"))); // NOI18N
        jMenuItem8.setText("Acerca de");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarUsuariosActionPerformed
       if(vntUsuarios== null)
       {
           vntUsuarios = new IRegistroUsuarios(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntUsuarios); 
    }//GEN-LAST:event_miRegistrarUsuariosActionPerformed

    private void mRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistroClientesActionPerformed
       if(vntClientes== null)
       {
           vntClientes = new IRegistroClientes(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntClientes); 
    }//GEN-LAST:event_mRegistroClientesActionPerformed

    private void mRegistrodePagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrodePagosActionPerformed
         if(vntPagos== null)
       {
           vntPagos = new IRegistroPagos(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntPagos); 
    }//GEN-LAST:event_mRegistrodePagosActionPerformed

    private void mEmisiondeOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEmisiondeOrdenesActionPerformed
       if(vntOrdenes== null)
       {
           vntOrdenes = new IRegistroOrdenes(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntOrdenes); 
    }//GEN-LAST:event_mEmisiondeOrdenesActionPerformed

    private void mReporteDeIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReporteDeIngresosActionPerformed
      if(vntReporteIngresos== null)
       {
           vntReporteIngresos = new IReporteIngresos(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntReporteIngresos); 
           
    }//GEN-LAST:event_mReporteDeIngresosActionPerformed

    private void mReportedeOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReportedeOrdenesActionPerformed
       if(vntReporteOrdenes== null)
       {
           vntReporteOrdenes = new IReporteDeOrdenes(dp); 
       }
       AdminIFrame.mostrarVentanaFactura(dp, vntReporteOrdenes); 
    }//GEN-LAST:event_mReportedeOrdenesActionPerformed

    private void MiResPaldarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiResPaldarBDActionPerformed
        JFileChooser selectorDeArchivos = new JFileChooser();        
        int showSaveDialog = selectorDeArchivos.showSaveDialog(this);
        if(showSaveDialog == JFileChooser.APPROVE_OPTION)
        {
            File archivo = selectorDeArchivos.getSelectedFile();
            
            /*NOTE: Used to create a cmd command*/
            String pasword = (Conexion.password == null || Conexion.password.isEmpty())?"":" -p " + Conexion.password;
            String datosComando = Conexion.login + pasword + " --database " + Conexion.bd + " -r " + archivo.getAbsoluteFile()+".sql";
            String executeCmd = "mysqldump -u "+datosComando;
             /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
              
            int processComplete = respaldarBd(executeCmd);
            if (processComplete == 0) {
                    System.out.println("Backup Complete");
                } else {
                    JFileChooser seleccionarExe = new JFileChooser();  
                    seleccionarExe.setFileFilter(new FiltroArchivo());
                    int showOpenDialog = seleccionarExe.showOpenDialog(this);
                    if(showOpenDialog == JFileChooser.APPROVE_OPTION)
                    {                        
                       executeCmd = seleccionarExe.getSelectedFile().getAbsolutePath()+" -u "+datosComando;
                       System.out.println(executeCmd);
                        int respaldarBd = respaldarBd(executeCmd);
                        if(processComplete == 0)
                        {
                           JOptionPane.showMessageDialog(this, "Respaldo de base de datos se realizo correctamente.\n"
                                   + "en "+seleccionarExe.getSelectedFile().getAbsolutePath(), "El Proceso se realizo correctammente", JOptionPane.PLAIN_MESSAGE);                 
                        }
                    }
                }
        
        }        
        
        
    }//GEN-LAST:event_MiResPaldarBDActionPerformed

    private void MiRestaurarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiRestaurarBDActionPerformed
        
        JFileChooser selectorDeArchivos = new JFileChooser();        
        int showSaveDialog = selectorDeArchivos.showOpenDialog(this);
        if(showSaveDialog == JFileChooser.APPROVE_OPTION)
        {
            try {
                FileReader archivo = new FileReader(selectorDeArchivos.getSelectedFile());
                Conexion.Conectar();
                ScriptRunner sr = new ScriptRunner(Conexion.con,false,true);
                sr.runScript(archivo);                
                Conexion.con.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Archivo no soportado");                
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(this, "Archivo no soportado");
            }
            catch(SQLException ex){JOptionPane.showMessageDialog(this, "Archivo no soportado");}
            JOptionPane.showMessageDialog(this, "Base de datos Importado correctamente");
        }
    }//GEN-LAST:event_MiRestaurarBDActionPerformed

    private void mCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCalculadoraActionPerformed
         Process runtimeProcess;
            try {
               
                System.out.println(System.getProperty("os.name"));
                String comandoCalculadora = System.getProperty("os.name").startsWith("Windows")?"calc":"gcalctool";
                runtimeProcess = Runtime.getRuntime().exec(comandoCalculadora);
                               
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);                
            }
           
    }//GEN-LAST:event_mCalculadoraActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
        JEditorPane ep = new JEditorPane("text/html", "<html><body>" //
            + "Youtube: <a href=\"http://goo.gl/6y2UCw\">puntodeventa-jlat</a><br/>"
                + "Facebook: <a href=\"https://www.facebook.com/Elaprendiz.sabe.algo?ref=hl\">www.facebook.com/Elaprendiz.sabe.algo</a><br/>"
                + "Grupo en Facebook: <a href=\"https://www.facebook.com/groups/795267827206099/\">Codigo Puro</a><br/>"
                + "Blog Tutoriales: <a href=\"http://javanoesdificil.blogspot.com/\">javanoesdificil.blogspot.com </a><br/>"
                + "Blog MiniSistemas <a href=\"http://minisistemas.blogspot.com/\">minisistemas.blogspot.com</a><br/>"
                + "<p>Este programa es un software libre: Puedes Distribuirlo y/o Modificarlo.</p>"
                + "<p>Este software se entrega tal y como es sin ninguna garantia.</p>" //
            + "</body></html>");

    // handle link events
    ep.addHyperlinkListener(new HyperlinkListener()
    {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e)
        {
            if (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
                if(Desktop.isDesktopSupported())
                {
                
                    try {
                        Desktop.getDesktop().browse(new URI(e.getURL().toString()));
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (IOException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                }
        }
    });
    ep.setEditable(false);        
     JOptionPane.showMessageDialog(this, ep, "Enlaces", JOptionPane.PLAIN_MESSAGE);                
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void mCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mCerrarSesionActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    public int respaldarBd(String executeCmd)
    {
           int processComplete = -1;
            /*NOTE: Executing the command here*/
            Process runtimeProcess;
            try {
                runtimeProcess = Runtime.getRuntime().exec(executeCmd);
                processComplete = runtimeProcess.waitFor();               
                return processComplete;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);                
            }
            catch(InterruptedException ex){ex.printStackTrace();}
            return processComplete;
    }
    
    public MainApp getMainApp()
    {
        return this;
    }
    
    public void setPermisos(Usuario user)
    {
        this.mCerrarSesion.setEnabled(user.isCerrarSesion());
        this.miRegistrarUsuarios.setEnabled(user.isRegistroDeUsuario());
        this.mClientes.setEnabled(user.isClientes());
        this.mRegistroClientes.setEnabled(user.isRegistroDeClientes());
        this.mPagos.setEnabled(user.isPagos());
        this.mRegistrodePagos.setEnabled(user.isRegistrosDePagos());
        this.mEmisiondeOrdenes.setEnabled(user.isEmisionesDeOrdenes());
        this.Mreportes.setEnabled(user.isReportes());
        this.mReporteDeIngresos.setEnabled(user.isReporteDeIngresos());
        this.mReportedeOrdenes.setEnabled(user.isReporteDeOrdenes());
        this.mHerramientas.setEnabled(user.isHerramientas());
        this.mCalculadora.setEnabled(user.isCalculadora());
        this.MiResPaldarBD.setEnabled(user.isRespladarBd());
        this.MiRestaurarBD.setEnabled(user.isRestaurarBd());
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MiResPaldarBD;
    private javax.swing.JMenuItem MiRestaurarBD;
    private javax.swing.JMenu Mreportes;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mCalculadora;
    private javax.swing.JMenuItem mCerrarSesion;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem mEmisiondeOrdenes;
    private javax.swing.JMenu mHerramientas;
    private javax.swing.JMenu mPagos;
    private javax.swing.JMenuItem mRegistroClientes;
    private javax.swing.JMenuItem mRegistrodePagos;
    private javax.swing.JMenuItem mReporteDeIngresos;
    private javax.swing.JMenuItem mReportedeOrdenes;
    private javax.swing.JMenuItem miRegistrarUsuarios;
    private javax.swing.JEditorPane panelBienvenido;
    // End of variables declaration//GEN-END:variables
}
