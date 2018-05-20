/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import courier.Autoservicio;
import courier.Cliente;
import courier.Ficha;
import courier.sendtext;
import courier.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maria Jose M.
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    Autoservicio Usuario;
    Cliente cliente;
    Autoservicio estadisticas = new Autoservicio();
    Administracion datosAdmi = new Administracion();
    private List<JButton> ventanillas;
    private int indice;
    private int cantidadVentanillas;
    String tipoVentanilla;
    private List<JButton> ventanillasNP;
    private int indicePerecederos;
    private int indiceNoPerecederos;
    private int cantidadVentanillasP;
    private int cantidadVentanillasNP;
    /**
     * Creates new form PaginaPrincipal
     * @param pCantidadVentanillas
     * @param interfaz recibe la informacion de la Pagina Inical
     * @param ventanilla Recibe informacion de autoservicio
     */

    //constructor encargado de crear las ventanillas
    public PaginaPrincipal(int pCantidadVentanillasP,int pCantidadVentanillasNP) {
        initComponents();
        ventanillas=new ArrayList<>();
        ventanillasNP=new ArrayList<>();
        cantidadVentanillasP=pCantidadVentanillasP;
        cantidadVentanillasNP=pCantidadVentanillasNP;
        indicePerecederos=0;
        indiceNoPerecederos=0;
        agregarVentanillas();
        JOptionPane.showMessageDialog(this, "Ventanillas Creadas", "Hola Mari", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    private PaginaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCantidadVentanillas(int pCantidadVentanillas){
        cantidadVentanillas=pCantidadVentanillas;
    }
    
    public void agregarVentanillas(){
        for (int i=0;i<cantidadVentanillasP;i++)
            crearVentanilla(tableroPerecederos, "P");
        for (int j=0;j<cantidadVentanillasNP;j++)
            crearVentanilla(tableroNoPerecederos, "NP");
    }
    
    public void crearVentanilla(JPanel tipoPanel, String pNombreVentanilla){
        if(pNombreVentanilla.equals("P")){
            JButton boton = new JButton(pNombreVentanilla+(indicePerecederos+1));
            tipoPanel.add(boton);
            ventanillas.add(boton);
            indicePerecederos++;
            }
            else{
                JButton boton = new JButton(pNombreVentanilla+(indiceNoPerecederos+1));
                tipoPanel.add(boton);
                ventanillas.add(boton);
                indiceNoPerecederos++;
            }
            
            tipoPanel.updateUI();
    }
        
    private void btnCrearVentanillaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        JButton boton = new JButton("P"+(indicePerecederos+1));
        tableroPerecederos.add(boton);
        ventanillas.add(boton);
        indicePerecederos++;
        tableroPerecederos.updateUI();//Actualiza la GUI
    }                                                  

    private void btnCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        tableroPerecederos.remove(indicePerecederos-1);
        ventanillas.remove(indicePerecederos-1);
        indicePerecederos--;
        tableroNoPerecederos.updateUI();
        
        
    }                                                

    private void btnCerrarNPActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        tableroNoPerecederos.remove(indiceNoPerecederos-1);
        ventanillasNP.remove(indiceNoPerecederos-1);
        indiceNoPerecederos--;
        tableroNoPerecederos.updateUI();
    }                                           

    private void btnCrearNPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JButton boton = new JButton("NP"+(indicePerecederos+1));
        tableroNoPerecederos.add(boton);
        ventanillasNP.add(boton);
        indiceNoPerecederos++;
        tableroNoPerecederos.updateUI();//Actualiza la GUI
    } 
        
    public PaginaPrincipal(PaginaInicial interfaz,Autoservicio ventanilla) {
        initComponents();
        setLocationRelativeTo (null);
        setTitle ("Página Principal");
    }
    //variables para el autoservicio
     Integer numero=0 ;
     String tiquete;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jComboBoxTipoPaquete = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLblTiqueteAsignado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jblTiquete = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldNuevaVentaEntrega = new javax.swing.JTextField();
        jTextFieldNuevaVentaSeguridad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBoxUsuariosP = new javax.swing.JComboBox<>();
        jComboBoxUsuariosNP = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaInfoNOPerecederos2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaInfoPerecederos2 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInfoEstadisticas = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableroPerecederos = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableroNoPerecederos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Entregas");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane6.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 114, 87));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Autoservicio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Usuario");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de Paquete");

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discapacitado", "Adulto Mayor", "Embarazada", "Regular" }));

        jComboBoxTipoPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perecedero", "No Perecedero" }));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Generar y enviar mensaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLblTiqueteAsignado.setBackground(new java.awt.Color(0, 153, 102));
        jLblTiqueteAsignado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblTiqueteAsignado.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tiquete :");

        jblTiquete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jblTiquete.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtTelefono)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipoPaquete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jblTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLblTiqueteAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblTiqueteAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblTiquete))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(31, 114, 87));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seguridad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Administración");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ventanillas de Perecederos:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ventanillas de No Perecederos:");

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cambiar Ventanillas  Entrega");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cambiar Ventanillas  Seguridad");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextAreaInfoNOPerecederos2.setColumns(20);
        jTextAreaInfoNOPerecederos2.setRows(5);
        jScrollPane4.setViewportView(jTextAreaInfoNOPerecederos2);

        jTextAreaInfoPerecederos2.setColumns(20);
        jTextAreaInfoPerecederos2.setRows(5);
        jScrollPane5.setViewportView(jTextAreaInfoPerecederos2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNuevaVentaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldNuevaVentaSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(39, 39, 39))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jComboBoxUsuariosP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBoxUsuariosNP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBoxUsuariosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxUsuariosNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNuevaVentaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jTextFieldNuevaVentaSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Estadísticas");

        jTextAreaInfoEstadisticas.setColumns(20);
        jTextAreaInfoEstadisticas.setRows(5);
        jTextAreaInfoEstadisticas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaInfoEstadisticasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTextAreaInfoEstadisticas);

        tableroPerecederos.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane7.setViewportView(tableroPerecederos);

        tableroNoPerecederos.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane8.setViewportView(tableroNoPerecederos);

        jLabel14.setText("Entrega de Perecederos");

        jLabel15.setText("Entregas de no perecederos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel14)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel15))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //informacion del comprador
        
        String nombre;
        String correo;
        int telefono;
        nombre = this.jtxtNombre.getText();
        correo = this.jtxtCorreo.getText();
        telefono = Integer.parseInt (this.jtxtTelefono.getText());
        String  TotalVP = (this.jTextFieldNuevaVentaEntrega.getText());
        String  TotalVS = (this.jTextFieldNuevaVentaSeguridad.getText());
        //variables de tipo de datos
        String TipoPaquete= "";
        String TipoUsuario = "";
        

        if (nombre.equals("") || correo.equals ("")){
             JOptionPane.showMessageDialog(new JFrame(), "Favor ingresar los datos correspondientes", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
                // TIPO de paquete
           String Paquete = (String) this.jComboBoxTipoPaquete.getSelectedItem();
           if (Paquete.equals("Perecedero")){
               TipoPaquete = "P";               
               numero =  numero; 
               
           }
           else if (Paquete.equals("No Perecedero")){
               TipoPaquete = "NP";          
              numero =  numero;
           }
           numero ++;

           //TIPO  de usuario
           String Usuario = (String) this.jComboBoxTipoUsuario.getSelectedItem();
           if (Usuario.equals("Discapacitado")){
               TipoUsuario = "D";
           }
           else if (Usuario.equals("Adulto Mayor")){
               TipoUsuario = "M";  
           }
           else if (Usuario.equals("Embarazada")){
               TipoUsuario = "E";
           }
           else if (Usuario.equals("Regular")){
               TipoUsuario = "R";
           }
        
       
            //tiquete correspondiene
            tiquete = TipoPaquete+"-"+TipoUsuario+"-"+numero;
            jblTiquete.setText(tiquete);
            
            System.out.println(nombre+" "+ correo+ " " + TipoPaquete + " " + TipoUsuario);
             JOptionPane.showMessageDialog(null, "BIENVENIDO  " + nombre +"\n" +"Su tiquete es: "+ tiquete);
             
              //validacion para la parte de administracion para saber cuantos clientes se encuentran en P o NP
            if (Paquete.equals("Perecedero")){
                   jComboBoxUsuariosP.addItem(tiquete);           
               }
            else if (Paquete.equals("No Perecedero")){
                  jComboBoxUsuariosNP.addItem(tiquete);
               }

             
           // agregar el objeto como una ficha y este a su vez lo va a agregar a la cola
           Cliente obj = new Cliente (nombre, correo, TipoPaquete, TipoUsuario);
           Ficha tiquete = new Ficha (numero , obj);
           tiquete.generarFichaCliente();
           tiquete.ingresarColaGeneral();
           estadisticas.autoservicio(TipoPaquete, TipoUsuario);
           jTextAreaInfoPerecederos2.setText(estadisticas.TotalP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n" );
           //datos no perecederos
           jTextAreaInfoNOPerecederos2.setText(estadisticas.TotalNP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n");
           //agregar los metodos para los datos faltantes +"\n"+ variable.metodo()
           jTextAreaInfoEstadisticas.setText (estadisticas.totales());
           
           //enviar mensaje de confirmacion 
           // se supone que funciona
           //sendtext mensaje = new sendtext (TipoPaquete, TipoUsuario, numero ,telefono );
           
     
        }        
        //inicializar los campos de texto vacios
        this.jtxtNombre.setText("");
        this.jtxtCorreo.setText("");
        this.jtxtTelefono.setText("");
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jTextAreaInfoEstadisticasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaInfoEstadisticasAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextAreaInfoEstadisticasAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       String  TotalVP = (this.jTextFieldNuevaVentaEntrega.getText());
        String  TotalVS = (this.jTextFieldNuevaVentaSeguridad.getText());
        
        jTextAreaInfoPerecederos2.setText(estadisticas.TotalP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n" );
           //datos no perecederos
           jTextAreaInfoNOPerecederos2.setText(estadisticas.TotalNP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String  TotalVP = (this.jTextFieldNuevaVentaEntrega.getText());
        String  TotalVS = (this.jTextFieldNuevaVentaSeguridad.getText());
        
        jTextAreaInfoPerecederos2.setText(estadisticas.TotalP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n" );
           //datos no perecederos
           jTextAreaInfoNOPerecederos2.setText(estadisticas.TotalNP()+"\n" +
                   "La cantidad de ventanillas" +"\n" 
                   +"para entrega se ha cambiado a: " + TotalVP +"\n" 
                   +"La cantidad de ventanillas" +"\n" 
                   +"para seguridad se ha cambiado a: " + TotalVS +"\n");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxTipoPaquete;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JComboBox<String> jComboBoxUsuariosNP;
    private javax.swing.JComboBox<String> jComboBoxUsuariosP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblTiqueteAsignado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaInfoEstadisticas;
    private javax.swing.JTextArea jTextAreaInfoNOPerecederos2;
    private javax.swing.JTextArea jTextAreaInfoPerecederos2;
    private javax.swing.JTextField jTextFieldNuevaVentaEntrega;
    private javax.swing.JTextField jTextFieldNuevaVentaSeguridad;
    private javax.swing.JLabel jblTiquete;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JPanel tableroNoPerecederos;
    private javax.swing.JPanel tableroPerecederos;
    // End of variables declaration//GEN-END:variables


}
