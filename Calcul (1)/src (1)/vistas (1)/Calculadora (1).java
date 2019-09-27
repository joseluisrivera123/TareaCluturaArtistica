package vistas;

import factorial.Factorial;
import funciones.Servicios;

public class Calculadora extends javax.swing.JFrame {

    public double nro1 = 0;   // tomar el 1er valor de pantalla
    public double nro2 = 0;
    public String operador = ""; // tomar el valor del operador

    // constructor, aquél método que se ejecuta primero en la clase
    public Calculadora() {
        initComponents();
        txtPantalla12.setText(""); // limpiar la cajita de texto pantalla
        setLocationRelativeTo(null);//para centrar el formulario
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpNros = new javax.swing.JPanel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbPunto = new javax.swing.JButton();
        jbPorc = new javax.swing.JButton();
        jpOperadores = new javax.swing.JPanel();
        jbMenos = new javax.swing.JButton();
        jbMultip = new javax.swing.JButton();
        jbDiv = new javax.swing.JButton();
        jbIgual = new javax.swing.JButton();
        jbMas = new javax.swing.JButton();
        jbMas1 = new javax.swing.JButton();
        jbMenos1 = new javax.swing.JButton();
        jpPantalla = new javax.swing.JPanel();
        txtPantalla12 = new javax.swing.JTextField();
        jbFactorial = new javax.swing.JButton();
        jbPar = new javax.swing.JButton();
        jbNPrimos = new javax.swing.JButton();
        Fibonacci = new javax.swing.JButton();
        Perfecto = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jb1.setBackground(new java.awt.Color(255, 255, 255));
        jb1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb1.setForeground(new java.awt.Color(153, 153, 255));
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(255, 255, 255));
        jb2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb2.setForeground(new java.awt.Color(153, 153, 255));
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(255, 255, 255));
        jb3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb3.setForeground(new java.awt.Color(153, 153, 255));
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(255, 255, 255));
        jb4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb4.setForeground(new java.awt.Color(153, 153, 255));
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(255, 255, 255));
        jb5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb5.setForeground(new java.awt.Color(153, 153, 255));
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(255, 255, 255));
        jb6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb6.setForeground(new java.awt.Color(153, 153, 255));
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(255, 255, 255));
        jb7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb7.setForeground(new java.awt.Color(153, 153, 255));
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(255, 255, 255));
        jb8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb8.setForeground(new java.awt.Color(153, 153, 255));
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(255, 255, 255));
        jb9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb9.setForeground(new java.awt.Color(153, 153, 255));
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(255, 255, 255));
        jb0.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jb0.setForeground(new java.awt.Color(153, 153, 255));
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbPunto.setBackground(new java.awt.Color(255, 255, 255));
        jbPunto.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jbPunto.setForeground(new java.awt.Color(255, 0, 102));
        jbPunto.setText(".");

        jbPorc.setBackground(new java.awt.Color(255, 255, 255));
        jbPorc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbPorc.setForeground(new java.awt.Color(255, 0, 102));
        jbPorc.setText("%");

        javax.swing.GroupLayout jpNrosLayout = new javax.swing.GroupLayout(jpNros);
        jpNros.setLayout(jpNrosLayout);
        jpNrosLayout.setHorizontalGroup(
            jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNrosLayout.createSequentialGroup()
                        .addComponent(jb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb3))
                    .addGroup(jpNrosLayout.createSequentialGroup()
                        .addComponent(jb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb6))
                    .addGroup(jpNrosLayout.createSequentialGroup()
                        .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb7)
                            .addComponent(jbPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpNrosLayout.createSequentialGroup()
                                .addComponent(jb0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpNrosLayout.createSequentialGroup()
                                .addComponent(jb8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpNrosLayout.setVerticalGroup(
            jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbMenos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbMenos.setForeground(new java.awt.Color(255, 51, 51));
        jbMenos.setText("-");
        jbMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenosActionPerformed(evt);
            }
        });

        jbMultip.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbMultip.setForeground(new java.awt.Color(255, 51, 51));
        jbMultip.setText("*");
        jbMultip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultipActionPerformed(evt);
            }
        });

        jbDiv.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbDiv.setForeground(new java.awt.Color(255, 51, 51));
        jbDiv.setText("/");
        jbDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivActionPerformed(evt);
            }
        });

        jbIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbIgual.setForeground(new java.awt.Color(255, 51, 51));
        jbIgual.setText("=");
        jbIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIgualActionPerformed(evt);
            }
        });

        jbMas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbMas.setForeground(new java.awt.Color(255, 51, 51));
        jbMas.setText("+");
        jbMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMasActionPerformed(evt);
            }
        });

        jbMas1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbMas1.setForeground(new java.awt.Color(255, 51, 51));
        jbMas1.setText("C");
        jbMas1.setToolTipText("Borrar todo");
        jbMas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMas1ActionPerformed(evt);
            }
        });

        jbMenos1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbMenos1.setForeground(new java.awt.Color(255, 51, 51));
        jbMenos1.setText("<-");
        jbMenos1.setToolTipText("Borrar cada caracter");
        jbMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpOperadoresLayout = new javax.swing.GroupLayout(jpOperadores);
        jpOperadores.setLayout(jpOperadoresLayout);
        jpOperadoresLayout.setHorizontalGroup(
            jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMas1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOperadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpOperadoresLayout.setVerticalGroup(
            jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOperadoresLayout.createSequentialGroup()
                .addComponent(jbMas1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbMas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMultip, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpPantalla.setBackground(new java.awt.Color(255, 255, 255));

        txtPantalla12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPantalla12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla12.setText("txtPantalla");
        txtPantalla12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantalla12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPantallaLayout = new javax.swing.GroupLayout(jpPantalla);
        jpPantalla.setLayout(jpPantallaLayout);
        jpPantallaLayout.setHorizontalGroup(
            jpPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla12)
                .addContainerGap())
        );
        jpPantallaLayout.setVerticalGroup(
            jpPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPantallaLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(txtPantalla12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jbFactorial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbFactorial.setText("Factorial");
        jbFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFactorialActionPerformed(evt);
            }
        });

        jbPar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbPar.setText("Pares");
        jbPar.setToolTipText("Mostrar los N pares");
        jbPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbParActionPerformed(evt);
            }
        });

        jbNPrimos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbNPrimos.setText("NPrimos");
        jbNPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNPrimosActionPerformed(evt);
            }
        });

        Fibonacci.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Fibonacci.setText("Fibonacci");
        Fibonacci.setToolTipText("Borrar todo");
        Fibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FibonacciActionPerformed(evt);
            }
        });

        Perfecto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Perfecto.setText("Perfecto");
        Perfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfectoActionPerformed(evt);
            }
        });

        Potencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Potencia.setText("Potencia");
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        Raiz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Raiz.setText("Raiz");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpNros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbPar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNPrimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fibonacci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Perfecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpNros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpOperadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Perfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbNPrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Fibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb1.getText());
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb2.getText());
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb3.getText());
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb4.getText());
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb5.getText());
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb6.getText());
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb7.getText());
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb8.getText());
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb9.getText());
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        txtPantalla12.setText(txtPantalla12.getText() + jb0.getText());
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMasActionPerformed
        operador = jbMas.getText();
        //convertir texto en double o Cast
        nro1 = Double.parseDouble(txtPantalla12.getText());
        txtPantalla12.setText("");
    }//GEN-LAST:event_jbMasActionPerformed

    private void jbIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIgualActionPerformed
        nro2 = Double.parseDouble(txtPantalla12.getText());
        Servicios servicios = new Servicios();
        //Convertir un valor double a String
        txtPantalla12.setText(String.valueOf(servicios.Calcular(nro1, operador, nro2)));

    }//GEN-LAST:event_jbIgualActionPerformed

    private void jbMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenosActionPerformed
        operador = jbMenos.getText();
        //convertir texto en double o Cast
        nro1 = Double.parseDouble(txtPantalla12.getText());
        txtPantalla12.setText("");
    }//GEN-LAST:event_jbMenosActionPerformed

    private void jbMultipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultipActionPerformed
        operador = jbMultip.getText();
        //convertir texto en double o Cast
        nro1 = Double.parseDouble(txtPantalla12.getText());
        txtPantalla12.setText("");
    }//GEN-LAST:event_jbMultipActionPerformed

    private void jbDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivActionPerformed
        operador = jbDiv.getText();
        //convertir texto en double o Cast
        nro1 = Double.parseDouble(txtPantalla12.getText());
        txtPantalla12.setText("");
    }//GEN-LAST:event_jbDivActionPerformed

    private void jbParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbParActionPerformed
        Servicios servicios = new Servicios();
        txtPantalla12.setText(
                servicios.NrosPares(
                        Integer.parseInt(txtPantalla12.getText())));
    }//GEN-LAST:event_jbParActionPerformed

    private void jbMas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMas1ActionPerformed
        txtPantalla12.setText(null);
    }//GEN-LAST:event_jbMas1ActionPerformed

    private void jbMenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenos1ActionPerformed

    }//GEN-LAST:event_jbMenos1ActionPerformed

    private void FibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FibonacciActionPerformed
        Servicios servicios = new Servicios();
        txtPantalla12.setText(
        servicios.Fibonacci(
        Integer.parseInt
        (txtPantalla12.getText())));
    }//GEN-LAST:event_FibonacciActionPerformed

    private void jbFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFactorialActionPerformed
        Servicios servicios = new Servicios();
            txtPantalla12.setText(
                servicios.Factorial(
                        Integer.parseInt
        (txtPantalla12.getText())));
    }//GEN-LAST:event_jbFactorialActionPerformed

    private void jbNPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNPrimosActionPerformed
        Servicios servicios = new Servicios();
            txtPantalla12.setText(
                    servicios.Primo(
                            Integer.parseInt
        (txtPantalla12.getText())));
    }//GEN-LAST:event_jbNPrimosActionPerformed

    private void txtPantalla12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantalla12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla12ActionPerformed

    private void PerfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfectoActionPerformed
       Servicios servicios = new Servicios();
            txtPantalla12.setText(
                servicios.Perfecto(
                        Integer.parseInt
        (txtPantalla12.getText())));
    }//GEN-LAST:event_PerfectoActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        Servicios servicios = new Servicios();
        txtPantalla12.setText(
        servicios.Potencia(Integer.parseInt(txtPantalla12.getText()) ));
    }//GEN-LAST:event_PotenciaActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
       Servicios servicios = new Servicios();
       txtPantalla12.setText(servicios.Raiz(Integer.parseInt(txtPantalla12.getText())));
    }//GEN-LAST:event_RaizActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fibonacci;
    private javax.swing.JButton Perfecto;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Raiz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbDiv;
    private javax.swing.JButton jbFactorial;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbMas;
    private javax.swing.JButton jbMas1;
    private javax.swing.JButton jbMenos;
    private javax.swing.JButton jbMenos1;
    private javax.swing.JButton jbMultip;
    private javax.swing.JButton jbNPrimos;
    private javax.swing.JButton jbPar;
    private javax.swing.JButton jbPorc;
    private javax.swing.JButton jbPunto;
    private javax.swing.JPanel jpNros;
    private javax.swing.JPanel jpOperadores;
    private javax.swing.JPanel jpPantalla;
    private javax.swing.JTextField txtPantalla12;
    // End of variables declaration//GEN-END:variables

}
