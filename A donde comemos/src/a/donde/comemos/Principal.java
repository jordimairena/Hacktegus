/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.donde.comemos;

import java.awt.Color;


/**
 *
 * @author jordi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
        private static String USER_NAME = "adondecomemosentegus@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "Hacktegus2015"; // GMail password
    private String RECIPIENT;
    
    public Principal() {
        initComponents();
        jP_principal.setVisible(true);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
        //Dba db = new Dba("./Base de Datos de Restaurantes.accdb");
        //db.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jP_dinero = new javax.swing.JPanel();
        jB_dinero_retorno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jB_dinero_aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jS_dinero_maximo = new javax.swing.JSlider();
        jTF_dinero_valor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jP_comida = new javax.swing.JPanel();
        jP_resultados = new javax.swing.JPanel();
        jP_ubicacion = new javax.swing.JPanel();
        jP_sugerencias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_sugerencias_texto = new javax.swing.JTextArea();
        jB_sugerencias_enviar = new javax.swing.JButton();
        jB_sugerencias_retorno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTF_sugerencias_correo = new javax.swing.JTextField();
        jP_principal = new javax.swing.JPanel();
        jL_nombreApp = new javax.swing.JLabel();
        jB_principal_filtroComida = new javax.swing.JButton();
        jB_principal_filtroDinero = new javax.swing.JButton();
        jB_principal_filtroUbicacion = new javax.swing.JButton();
        jB_principal_filtroSugerencias = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jL_principal_buscarComida = new javax.swing.JLabel();
        jL_principal_buscarPrecio = new javax.swing.JLabel();
        jL_principal_buscarDistancia = new javax.swing.JLabel();
        jB_principal_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setResizable(false);

        jP_dinero.setBackground(new java.awt.Color(255, 204, 0));
        jP_dinero.setForeground(new java.awt.Color(255, 204, 0));

        jB_dinero_retorno.setText("back");
        jB_dinero_retorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_dinero_retornoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel6.setText("DINERO");

        jB_dinero_aceptar.setText("ok");
        jB_dinero_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_dinero_aceptarMouseClicked(evt);
            }
        });

        jLabel7.setText("Maximo que desea gastar:");

        jS_dinero_maximo.setMajorTickSpacing(100);
        jS_dinero_maximo.setMaximum(1000);
        jS_dinero_maximo.setMinimum(100);
        jS_dinero_maximo.setMinorTickSpacing(50);
        jS_dinero_maximo.setOrientation(javax.swing.JSlider.VERTICAL);
        jS_dinero_maximo.setPaintLabels(true);
        jS_dinero_maximo.setPaintTicks(true);
        jS_dinero_maximo.setSnapToTicks(true);
        jS_dinero_maximo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jS_dinero_maximoStateChanged(evt);
            }
        });

        jTF_dinero_valor.setText("100");

        jLabel8.setText("Lps.");

        javax.swing.GroupLayout jP_dineroLayout = new javax.swing.GroupLayout(jP_dinero);
        jP_dinero.setLayout(jP_dineroLayout);
        jP_dineroLayout.setHorizontalGroup(
            jP_dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dineroLayout.createSequentialGroup()
                .addGroup(jP_dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_dineroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_dinero_retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_dineroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addGroup(jP_dineroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jS_dinero_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jP_dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB_dinero_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jTF_dinero_valor))))
                .addGap(21, 21, 21))
            .addGroup(jP_dineroLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_dineroLayout.setVerticalGroup(
            jP_dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dineroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_dinero_retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jP_dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_dineroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jS_dinero_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jP_dineroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTF_dinero_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_dinero_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        jP_comida.setBackground(new java.awt.Color(255, 153, 51));
        jP_comida.setForeground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jP_comidaLayout = new javax.swing.GroupLayout(jP_comida);
        jP_comida.setLayout(jP_comidaLayout);
        jP_comidaLayout.setHorizontalGroup(
            jP_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jP_comidaLayout.setVerticalGroup(
            jP_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jP_resultados.setBackground(new java.awt.Color(0, 153, 153));
        jP_resultados.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jP_resultadosLayout = new javax.swing.GroupLayout(jP_resultados);
        jP_resultados.setLayout(jP_resultadosLayout);
        jP_resultadosLayout.setHorizontalGroup(
            jP_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jP_resultadosLayout.setVerticalGroup(
            jP_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jP_ubicacion.setBackground(new java.awt.Color(0, 0, 204));
        jP_ubicacion.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jP_ubicacionLayout = new javax.swing.GroupLayout(jP_ubicacion);
        jP_ubicacion.setLayout(jP_ubicacionLayout);
        jP_ubicacionLayout.setHorizontalGroup(
            jP_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jP_ubicacionLayout.setVerticalGroup(
            jP_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jP_sugerencias.setBackground(new java.awt.Color(204, 0, 0));
        jP_sugerencias.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Hollywood Capital", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUGERENCIAS");

        jTA_sugerencias_texto.setColumns(20);
        jTA_sugerencias_texto.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jTA_sugerencias_texto.setForeground(new java.awt.Color(153, 153, 153));
        jTA_sugerencias_texto.setLineWrap(true);
        jTA_sugerencias_texto.setRows(5);
        jTA_sugerencias_texto.setText("Sugerencia");
        jTA_sugerencias_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTA_sugerencias_textoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTA_sugerencias_texto);

        jB_sugerencias_enviar.setText("Enviar");
        jB_sugerencias_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_sugerencias_enviarMouseClicked(evt);
            }
        });

        jB_sugerencias_retorno.setText("Back");
        jB_sugerencias_retorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_sugerencias_retornoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier", 0, 14)); // NOI18N
        jLabel3.setText("Si encontro un error o falta ");

        jLabel4.setFont(new java.awt.Font("Courier", 0, 14)); // NOI18N
        jLabel4.setText("informacion, indiquelo abajo");

        jLabel5.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel5.setText("Su correo:");

        jTF_sugerencias_correo.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jTF_sugerencias_correo.setForeground(new java.awt.Color(153, 153, 153));
        jTF_sugerencias_correo.setText("alguien@correo.com");
        jTF_sugerencias_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTF_sugerencias_correoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_sugerenciasLayout = new javax.swing.GroupLayout(jP_sugerencias);
        jP_sugerencias.setLayout(jP_sugerenciasLayout);
        jP_sugerenciasLayout.setHorizontalGroup(
            jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_sugerenciasLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jTF_sugerencias_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_sugerenciasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel5))
                .addGap(14, 14, 14))
            .addGroup(jP_sugerenciasLayout.createSequentialGroup()
                .addGroup(jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_sugerenciasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_sugerencias_retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_sugerenciasLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jB_sugerencias_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_sugerenciasLayout.setVerticalGroup(
            jP_sugerenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_sugerenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_sugerencias_retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_sugerencias_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_sugerencias_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jP_principal.setBackground(new java.awt.Color(0, 153, 0));
        jP_principal.setForeground(new java.awt.Color(0, 102, 0));
        jP_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nombreApp.setFont(new java.awt.Font("Hollywood Capital", 1, 36)); // NOI18N
        jL_nombreApp.setForeground(new java.awt.Color(255, 153, 0));
        jL_nombreApp.setText("¿A DONDE COMEMOS?");
        jP_principal.add(jL_nombreApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jB_principal_filtroComida.setBackground(new java.awt.Color(255, 255, 153));
        jB_principal_filtroComida.setText("COMIDA");
        jB_principal_filtroComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_principal_filtroComidaMouseClicked(evt);
            }
        });
        jP_principal.add(jB_principal_filtroComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 145, 135));

        jB_principal_filtroDinero.setText("DINERO");
        jB_principal_filtroDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_principal_filtroDineroMouseClicked(evt);
            }
        });
        jP_principal.add(jB_principal_filtroDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 85, 144, 135));

        jB_principal_filtroUbicacion.setText("UBICACION");
        jB_principal_filtroUbicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_principal_filtroUbicacionMouseClicked(evt);
            }
        });
        jP_principal.add(jB_principal_filtroUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 145, 137));

        jB_principal_filtroSugerencias.setText("SUGERENCIAS");
        jB_principal_filtroSugerencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_principal_filtroSugerenciasMouseClicked(evt);
            }
        });
        jP_principal.add(jB_principal_filtroSugerencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 226, 144, 137));

        jLabel2.setFont(new java.awt.Font("Hollywood Capital", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("FILTROS");
        jP_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jL_principal_buscarComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_principal_buscarComida.setText("BUSCAR: Cualquier Comida");
        jP_principal.add(jL_principal_buscarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 270, 20));

        jL_principal_buscarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_principal_buscarPrecio.setText("POR: Lps 100");
        jP_principal.add(jL_principal_buscarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, -1));

        jL_principal_buscarDistancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_principal_buscarDistancia.setText("A: 1 km");
        jP_principal.add(jL_principal_buscarDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 440, 260, -1));

        jB_principal_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_principal_BuscarMouseClicked(evt);
            }
        });
        jP_principal.add(jB_principal_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 369, 295, 103));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_comida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_dinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_sugerencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_resultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_comida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_dinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_sugerencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_resultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jP_dinero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jP_comida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jP_resultados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jP_ubicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jP_sugerencias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jP_principal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_principal_filtroComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_principal_filtroComidaMouseClicked
        jP_principal.setVisible(false);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(true);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
        
    }//GEN-LAST:event_jB_principal_filtroComidaMouseClicked

    private void jB_principal_filtroSugerenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_principal_filtroSugerenciasMouseClicked
        jP_principal.setVisible(false);
        jP_sugerencias.setVisible(true);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
        jTF_sugerencias_correo.setForeground(new Color(153,153,153));
        jTA_sugerencias_texto.setForeground(new Color(153,153,153));
        jTA_sugerencias_texto.setText("Sugerencia");
        jTF_sugerencias_correo.setText("alguien@correo.com");
    }//GEN-LAST:event_jB_principal_filtroSugerenciasMouseClicked

    private void jB_principal_filtroDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_principal_filtroDineroMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(false);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(true);
        jP_resultados.setVisible(false);
        jS_dinero_maximo.setValue(100);
        jTF_dinero_valor.setText("100");
    }//GEN-LAST:event_jB_principal_filtroDineroMouseClicked

    private void jB_principal_filtroUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_principal_filtroUbicacionMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(false);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(true);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
    }//GEN-LAST:event_jB_principal_filtroUbicacionMouseClicked

    private void jB_principal_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_principal_BuscarMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(false);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(true);
    }//GEN-LAST:event_jB_principal_BuscarMouseClicked

    private void jB_sugerencias_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_sugerencias_enviarMouseClicked
        // TODO add your handling code here:
        email e= new email();
        boolean validacion = false;
        if(!jTA_sugerencias_texto.getText().equals("Sugerencia") && !jTF_sugerencias_correo.getText().equals("alguien@correo.com") && !jTA_sugerencias_texto.getText().equals("Gracias por su aporte, su sugerencia ha sido registrada")){
            if(!jTF_sugerencias_correo.getText().isEmpty() && !jTA_sugerencias_texto.getText().isEmpty()){
                validacion = true;
            } 
        }
        if(validacion){
            jTA_sugerencias_texto.setText("Gracias por su aporte, su sugerencia ha sido registrada");
            RECIPIENT = jTF_sugerencias_correo.getText();
            String from = USER_NAME;
            String[] us = {from};
            String pass = PASSWORD;
            String[] to = {RECIPIENT}; // list of recipient email addresses
            String subject = "Sugerencias a donde comemos";
            String body = jTA_sugerencias_texto.getText() + "\n" + RECIPIENT;
            e.sendFromGMail(from, pass, us, subject, body);
            e.sendFromGMail(from, pass, to, subject, "Su sugerencia fue recibida");
        }
             
    }//GEN-LAST:event_jB_sugerencias_enviarMouseClicked

    private void jB_sugerencias_retornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_sugerencias_retornoMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(true);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
    }//GEN-LAST:event_jB_sugerencias_retornoMouseClicked

    private void jTF_sugerencias_correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_sugerencias_correoMouseClicked
        // TODO add your handling code here:
        jTF_sugerencias_correo.setText("");
        jTF_sugerencias_correo.setForeground(Color.black);
    }//GEN-LAST:event_jTF_sugerencias_correoMouseClicked

    private void jTA_sugerencias_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTA_sugerencias_textoMouseClicked
        // TODO add your handling code here:
        jTA_sugerencias_texto.setText("");
        jTA_sugerencias_texto.setForeground(Color.black);
    }//GEN-LAST:event_jTA_sugerencias_textoMouseClicked

    private void jB_dinero_retornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_dinero_retornoMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(true);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
    }//GEN-LAST:event_jB_dinero_retornoMouseClicked

    private void jB_dinero_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_dinero_aceptarMouseClicked
        // TODO add your handling code here:
        jP_principal.setVisible(true);
        jP_sugerencias.setVisible(false);
        jP_ubicacion.setVisible(false);
        jP_comida.setVisible(false);
        jP_dinero.setVisible(false);
        jP_resultados.setVisible(false);
    }//GEN-LAST:event_jB_dinero_aceptarMouseClicked

    private void jS_dinero_maximoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jS_dinero_maximoStateChanged
        // TODO add your handling code here:
       jTF_dinero_valor.setText(Integer.toString(jS_dinero_maximo.getValue()));
    }//GEN-LAST:event_jS_dinero_maximoStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_dinero_aceptar;
    private javax.swing.JButton jB_dinero_retorno;
    private javax.swing.JButton jB_principal_Buscar;
    private javax.swing.JButton jB_principal_filtroComida;
    private javax.swing.JButton jB_principal_filtroDinero;
    private javax.swing.JButton jB_principal_filtroSugerencias;
    private javax.swing.JButton jB_principal_filtroUbicacion;
    private javax.swing.JButton jB_sugerencias_enviar;
    private javax.swing.JButton jB_sugerencias_retorno;
    private javax.swing.JLabel jL_nombreApp;
    private javax.swing.JLabel jL_principal_buscarComida;
    private javax.swing.JLabel jL_principal_buscarDistancia;
    private javax.swing.JLabel jL_principal_buscarPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jP_comida;
    private javax.swing.JPanel jP_dinero;
    private javax.swing.JPanel jP_principal;
    private javax.swing.JPanel jP_resultados;
    private javax.swing.JPanel jP_sugerencias;
    private javax.swing.JPanel jP_ubicacion;
    private javax.swing.JSlider jS_dinero_maximo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA_sugerencias_texto;
    private javax.swing.JTextField jTF_dinero_valor;
    private javax.swing.JTextField jTF_sugerencias_correo;
    // End of variables declaration//GEN-END:variables
}
