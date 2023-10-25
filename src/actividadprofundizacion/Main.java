package actividadprofundizacion;

import java.text.Normalizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    private ListaDoble Libros = new ListaDoble();//Lista de libros
    private Object[][] libros;//Arreglo de libros
    private boolean orden;//Variable de orden ASC o DES

    public Main() {
        setTitle("Biblioteca");
        initComponents();
        initData(); //Cargar datos de prueba
        getLibros(); //Obtener libros registrados
        orden = false;
    }

    @SuppressWarnings("unchecked")
    //Datos de prueba
    private void initData() {
        Datos.getInstance().agregarLibro(new Libro("A1", "La clave del son", "Cesar Lopez", "Música", 50));
        Datos.getInstance().agregarLibro(new Libro("B1", "Mi mejor amigo", "Maria Luna", "Novelas", 188));
        Datos.getInstance().agregarLibro(new Libro("C1", "La lucha contra la luz", "Paula Rincon", "Electricidad", 280));
        Datos.getInstance().agregarLibro(new Libro("C2", "Electricidad #1", "Carlos Ramos", "Electricidad", 150));
        Datos.getInstance().agregarLibro(new Libro("C4", "Electricidad #2", "Jose Prado", "Electricidad", 150));
        Datos.getInstance().agregarLibro(new Libro("D3", "Los cinco poderes", "Pedro Hernández", "Religión", 380));
        Datos.getInstance().agregarLibro(new Libro("E4", "Cocina Avanzada", "Maria Alarcón", "Cocina", 280));
        Datos.getInstance().agregarLibro(new Libro("F1", "La 1° invación a pluton", "Luis Riaño", "Ficción", 400));
        Datos.getInstance().agregarLibro(new Libro("F2", "La 2° invación a pluton", "Luis Riaño", "Ficción", 280));
        Datos.getInstance().agregarLibro(new Libro("F3", "¿Quién es Jhon Titor?", "Diego Perez", "Ficción", 150));
        Datos.getInstance().agregarLibro(new Libro("F4", "Mi amigo robot", "Luis Riaño", "Ficción", 100));
        Datos.getInstance().agregarLibro(new Libro("F5", "En el año 3874", "Luis Riaño", "Ficción", 200));
        Datos.getInstance().agregarLibro(new Libro("A2", "Letras y composiciones", "Claudo León", "Música", 150));
        Datos.getInstance().agregarLibro(new Libro("A3", "Canciones infantiles", "Rosa Velez", "Música", 50));
        Datos.getInstance().agregarLibro(new Libro("A4", "Canciones infantiles V2", "Rosa Velez", "Música", 50));
        Datos.getInstance().agregarLibro(new Libro("C3", "Electricidad #3", "Jose Prado", "Electricidad", 200));
        Datos.getInstance().agregarLibro(new Libro("C5", "Tomas Edison", "Carlos Ramos", "Electricidad", 150));
        Datos.getInstance().agregarLibro(new Libro("C6", "Electricidad #2", "Carlos Ramos y Jose Prado", "Electricidad", 150));
        Datos.getInstance().agregarLibro(new Libro("E1", "Todo sobre la gastronomia africana", "Marta Amaya", "Cocina", 240));
        Datos.getInstance().agregarLibro(new Libro("E2", "Cocina Basica", "Maria Alarcón", "Cocina", 200));
        Datos.getInstance().agregarLibro(new Libro("E3", "Cocina Media", "Maria Alarcón", "Cocina", 300));
        Datos.getInstance().agregarLibro(new Libro("E5", "Cocina Avanzada", "Maria Alarcón", "Cocina", 280));
        Datos.getInstance().agregarLibro(new Libro("B2", "¿Dónde ésta Carmen?", "Alejandro Musso", "Novelas", 150));
        Datos.getInstance().agregarLibro(new Libro("B3", "Autos nuevos", "Andres Hortúa", "Novelas", 280));
        Datos.getInstance().agregarLibro(new Libro("B4", "El hombre que llora", "Maria Luna", "Novelas", 100));
        Datos.getInstance().agregarLibro(new Libro("B5", "Mirada del pasado", "Julian Tavella", "Novelas", 300));
        Datos.getInstance().agregarLibro(new Libro("B6", "Mirada del pasado II", "Julian Tavella", "Novelas", 140));
        Datos.getInstance().agregarMateria("Música");//A
        Datos.getInstance().agregarMateria("Novelas");
        Datos.getInstance().agregarMateria("Electricidad");
        Datos.getInstance().agregarMateria("Religión");
        Datos.getInstance().agregarMateria("Cocina");
        Datos.getInstance().agregarMateria("Ficción");
        Datos.getInstance().agergarIniciales("A");
        Datos.getInstance().agergarIniciales("B");
        Datos.getInstance().agergarIniciales("C");
        Datos.getInstance().agergarIniciales("D");
        Datos.getInstance().agergarIniciales("E");
        Datos.getInstance().agergarIniciales("F");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Filtro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        BtnSeleccionar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        Msg = new javax.swing.JLabel();
        BtnActualizar = new javax.swing.JButton();
        BtnRegistrar = new javax.swing.JButton();
        BtnOrden = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BuscarTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Metodo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        LimpiarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(239, 110, 33));

        title.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Registro de libros Ucompensar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Autor/a", "Materia", "N° Paginas"
            }
        ));
        jScrollPane1.setViewportView(Table);

        Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Código", "Nombre", "Autor/a", "Materia", "N° Páginas" }));
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });

        jLabel1.setText("Ordenar por:");

        BtnSeleccionar.setBackground(new java.awt.Color(239, 110, 33));
        BtnSeleccionar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        BtnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionarMouseClicked(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(239, 110, 33));
        BtnBuscar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(51, 51, 51));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        Msg.setText("José David Hernández Hortúa");

        BtnActualizar.setBackground(new java.awt.Color(239, 110, 33));
        BtnActualizar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizar.setText("Actualizar lista");
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        BtnRegistrar.setBackground(new java.awt.Color(239, 110, 33));
        BtnRegistrar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 16)); // NOI18N
        BtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrar.setText("Registrar libro");
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
        });

        BtnOrden.setBackground(new java.awt.Color(239, 110, 33));
        BtnOrden.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        BtnOrden.setForeground(new java.awt.Color(255, 255, 255));
        BtnOrden.setText("Ascendente");
        BtnOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnOrdenMouseClicked(evt);
            }
        });

        jLabel2.setText("Buscar:");

        jLabel3.setText("Categoría:");

        BuscarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Código", "Nombre", "Autor/a", "Materia", "N° Páginas" }));
        BuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Método:");

        Metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lineal  - Busqueda general", "Binaria - Busqueda puntual" }));

        jLabel5.setText("Cambiar orden a:");

        LimpiarCampos.setText("Limpiar campos");
        LimpiarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarCamposMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LimpiarCampos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(jLabel3)
                    .addComponent(BuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BtnOrden)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Msg)
                            .addComponent(BtnActualizar)
                            .addComponent(BtnSeleccionar))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LimpiarCampos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        //Actualizar los registros en la tabla
        getLibros();
        drawTable();
        Msg.setText("Selecciona un libro en la tabla.");
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
        //Abrir formulario de registro
        Formulario registro = new Formulario();
        registro.setVisible(true);
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    private void BtnSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionarMouseClicked
        // TODO add your handling code here:
        selectLibro();
    }//GEN-LAST:event_BtnSeleccionarMouseClicked
    //Menu desplegable de ordenar
    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed

        if (libros == null) {
            return;
        }
        orden(false);
        Msg.setText("Selecciona un libro en la tabla.");
        switch (Filtro.getSelectedIndex()) {
            //Codigo -> burbuja
            case 1:
                burbuja(0);
                break;
            //Nombre -> insercion
            case 2:
                insercion(1);
                break;
            //Autor -> insercio
            case 3:
                insercion(2);
                break;
            //Materia -> burbuja
            case 4:
                burbuja(3);
                break;
            //Paginas -> seleccion (sin conversion de String a Long)
            case 5:
                seleccion();
                break;
            default:
                getLibros();
                drawTable();
                break;
        }
    }//GEN-LAST:event_FiltroActionPerformed
    /*
    Ordenamiento por seleccion
        1. Busca el menor numero
        2. Cambia la posicion del numero
        3. "acorta" el arreglo princial
        4. repite
     */
    private void seleccion() {
        Object actual[] = new Object[5];
        Object temp[] = new Object[5];
        int pos, j;
        for (int i = 0; i < libros.length; i++) {
            for (int p = 0; p < 5; p++) {
                actual[p] = libros[i][p];
            }
            pos = i;
            for (j = i + 1; j < libros.length; j++) {
                int t = (int) libros[j][4];
                int Int_Act = (int) actual[4];
                if (t < Int_Act) {
                    for (int p = 0; p < 5; p++) {
                        actual[p] = libros[j][p];
                    }
                    pos = j;
                }
            }
            if (pos != 1) {
                //Asiganar temp
                for (int p = 0; p < 5; p++) {
                    temp[p] = libros[i][p];
                }
                // cambiar orden
                for (int p = 0; p < 5; p++) {
                    libros[i][p] = libros[pos][p];
                }
                for (int p = 0; p < 5; p++) {
                    libros[pos][p] = temp[p];
                }
            }
        }
        drawTable();
    }

    /*
    Ordenamiento por insercion
        1. Seleciona un numero como referente
        2. se compara con los demas numeros en busca de su posicion
     */
    private void insercion(int categoria) {
        Object[] temp_libro = new Object[5];
        int Inx_principal, Inx_secundario;
        for (Inx_principal = 1; Inx_principal < libros.length; Inx_principal++) {
            //libro temporal
            for (int i = 0; i < 5; i++) {
                temp_libro[i] = libros[Inx_principal][i];
            }
            Inx_secundario = Inx_principal - 1;
            //Obtener valores
            String actual = String.valueOf(temp_libro[categoria]);
            String siguiente = String.valueOf(libros[Inx_secundario][categoria]);
            while ((Inx_secundario >= 0) && (siguiente.compareTo(actual) > 0)) {
                //intercambio
                for (int i = 0; i < 5; i++) {
                    libros[Inx_secundario + 1][i] = libros[Inx_secundario][i];
                }

                Inx_secundario--;
                //Actualizar siguiente
                if (Inx_secundario >= 0) {
                    siguiente = (String) libros[Inx_secundario][categoria];
                }
            }
            for (int i = 0; i < 5; i++) {
                libros[Inx_secundario + 1][i] = temp_libro[i];
            }
        }
        drawTable();
    }

    /*
    Ordenamiento burbuja
        Compara un numero con el siguiente
     */
    private void burbuja(int categoria) {
        for (int i = libros.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                long actual = stringToNumber(String.valueOf(libros[j][categoria]));
                long siguiente = stringToNumber(String.valueOf(libros[j + 1][categoria]));

                if (actual > siguiente) {
                    Object[] temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
        drawTable();
    }
    private void BtnOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOrdenMouseClicked
        // TODO add your handling code here:
        orden(orden);
    }//GEN-LAST:event_BtnOrdenMouseClicked
    //Alternar entre ordenes (ASC o DES)
    private void orden(boolean orden) {
        Object[][] temp = new Object[libros.length][5];
        this.orden = (orden == true) ? false : true;
        if (orden == true) {
            BtnOrden.setText("Descendente");
        } else {
            BtnOrden.setText("Ascendente");
        }
        //Invertir el arreglo de libros
        for (int i = 0; i < libros.length; i++) {
            temp[i][0] = libros[libros.length - 1 - i][0];
            temp[i][1] = libros[libros.length - 1 - i][1];
            temp[i][2] = libros[libros.length - 1 - i][2];
            temp[i][3] = libros[libros.length - 1 - i][3];
            temp[i][4] = libros[libros.length - 1 - i][4];
        }
        libros = temp;
        drawTable();
    }
    private void BuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarTipoActionPerformed
    //Quitar acentos de los textos
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }

    //Funcion de buscar
    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        // TODO add your handling code here:
        if (libros == null) {
            return;
        }
        //Obtner texto a buscar y tipo de busqueda
        String texto = (String.valueOf(Buscador.getText()).length() >= 2) ? String.valueOf(Buscador.getText()) : "";
        texto = cleanString(texto);
        int tipo = BuscarTipo.getSelectedIndex();
        if (texto.length() >= 2 && tipo != 0) {
            getLibros(); //Actulizar lista de libros
            //buscar
            tipo--;
            //Seleccionar el tipo de busqueda
            if (Metodo.getSelectedIndex() == 0) {
                //Lineal
                Object[][] arr = busquedaLineal(texto, tipo);
                if (arr.length == 0) {
                    avisoError(String.valueOf(BuscarTipo.getSelectedItem()), String.valueOf(Metodo.getSelectedItem()), texto);
                } else {
                    libros = new Object[arr.length][5];
                    libros = arr;
                    drawTable();
                }
            } else {
                //Binaria
                if (busquedaBinaria(texto.toLowerCase(), tipo)) {
                    avisoError(String.valueOf(BuscarTipo.getSelectedItem()), String.valueOf(Metodo.getSelectedItem()), texto);
                }
            }
        } else if (texto.length() < 3) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa el texto que quieres buscar", "Texto no ingresado", JOptionPane.ERROR_MESSAGE);
        } else if (tipo < 1) {
            JOptionPane.showMessageDialog(rootPane, "Selecciona la categoría en la que quieres buscar: \"" + texto + "\"", "Categoría no seleccionada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarMouseClicked
    //Aviso de error en busqueda

    private void avisoError(String cat, String met, String texto) {
        JOptionPane.showMessageDialog(rootPane, "Libro no encontrado con los siguientes parametros\nTexto: \""
                + texto + "\"\nCategoría: " + cat + "\nMétodo: " + met,
                "Libro no encontrado", JOptionPane.ERROR_MESSAGE);
    }

    /*
    Busqueda lineal
        1. Recorre todo el arreglo guardando en una variable temporal las concidencias
     */
    private Object[][] busquedaLineal(String texto, int tipo) {
        getLibros();
        Object temp[][] = new Object[libros.length][5];
        int cont = 0;
        for (int i = 0; i < libros.length; i++) {
            String Original = cleanString(String.valueOf(libros[i][tipo]));
            if (Original.equalsIgnoreCase(texto)) {
                for (int j = 0; j < 5; j++) {
                    temp[i][j] = libros[i][j];
                }
                cont++;
            }
        }
        Object arr[][] = new Object[cont][5];
        if (cont > 0) {
            int v = 0;
            //eliminar null de arr[][]
            Msg.setText("Coincidencias encontradas: " + cont);
            for (int i = 0; i < temp.length; i++) {
                for (int a = 0; a < 5; a++) {
                    if (temp[i][0] != null) {
                        arr[v][a] = temp[i][a];
                    }
                }
                if (temp[i][0] != null) {
                    v++;
                }
            }
        }
        return arr;
    }

    //Ordenamiento por seleccion con StringToNumber()
    private Object[][] seleccionNumerica(int cat) {
        Object actual[] = new Object[6];
        Object temp[] = new Object[6];
        Object local[][] = new Object[libros.length][6];
        //Obtener numeros de texto
        for (int i = 0; i < libros.length; i++) {
            for (int p = 1; p < 6; p++) {
                local[i][p] = libros[i][p - 1];
                String tem = cleanString(String.valueOf(libros[i][cat]));
                local[i][0] = stringToNumber(tem.toLowerCase());
            }
        }

        int pos, j;
        for (int i = 0; i < local.length; i++) {
            for (int p = 0; p < 6; p++) {
                actual[p] = local[i][p];
            }
            pos = i;
            for (j = i + 1; j < local.length; j++) {
                long t = (long) local[j][0];
                long Int_Act = (long) actual[0];
                if (t < Int_Act) {
                    for (int p = 0; p < 6; p++) {
                        actual[p] = local[j][p];
                    }
                    pos = j;
                }
            }
            if (pos != 1) {
                //Asiganar temp
                for (int p = 0; p < 6; p++) {
                    temp[p] = local[i][p];
                }
                // cambiar orden
                for (int p = 0; p < 6; p++) {
                    local[i][p] = local[pos][p];
                }
                for (int p = 0; p < 6; p++) {
                    local[pos][p] = temp[p];
                }
            }
        }

        return local;
    }

    /*
    Busqueda binaria
        1. Parte el arreglo a la mitad y elije si usa el lado derecho o izquierdo
        2. Busca la referencia
        3. repite
     */
    private boolean busquedaBinaria(String text, int tipo) {
        //Obtener arreglo con texto a numero
        Object local[][] = seleccionNumerica(tipo);
        //Busqueda
        int cont = 0;
        //Valor 
        long valor = stringToNumber(text);
        int inicio = 0, fin = local.length - 1;
        Object tempLibros[][] = new Object[local.length][6];
        int p = 0;
        while (inicio <= fin) {
            //Elemento en la mitad
            int mitad = inicio + (fin - inicio) / 2;
            long valorMitad = (long) local[mitad][0];
            if (valorMitad == valor) {
                for (int a = 0; a < 6; a++) {
                    tempLibros[p][a] = local[mitad][a];
                }
                cont++;
            }
            //derecha
            if (valorMitad <= valor) {
                inicio = mitad + 1;
            } else {//izquierda
                fin = mitad - 1;
            }
            p++;
        }
        if (cont > 0) {
            int v = 0;
            //formatear libros
            libros = new Object[cont][5];

            Msg.setText("Coincidencias encontradas: " + cont);
            for (int i = 0; i < local.length; i++) {
                for (int a = 0; a < 5; a++) {
                    if (tempLibros[i][0] != null) {
                        libros[v][a] = tempLibros[i][a + 1];
                    }
                }
                if (tempLibros[i][0] != null) {
                    v++;
                }
            }
            drawTable();
        }
        return (cont == 0) ? true : false;
    }
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed
    //Limpiar campos de buqueda y orden
    private void LimpiarCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarCamposMouseClicked
        // TODO add your handling code here:
        getLibros();
        Buscador.setText("");
        BuscarTipo.setSelectedIndex(0);
        Metodo.setSelectedIndex(0);
        Filtro.setSelectedIndex(0);
    }//GEN-LAST:event_LimpiarCamposMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus
    //Seleccionar un libro de la tabla
    private void selectLibro() {
        int opcion = Table.getSelectedRow(); //Obtener indice del objecto en la tabla
        if (Libros.isNull()) {
            JOptionPane.showMessageDialog(rootPane, "No hay libros registrados, por favor registra un libro.", "No hay libros", JOptionPane.ERROR_MESSAGE);
        } else if (opcion != -1 || Table.getRowCount() > 0) {
            //Codigo libro a int
            try {
                String code = String.valueOf(Table.getValueAt(opcion, 0));
                int index = Libros.buscarCodigo(code);//Bucar codigo en la lista de libros
                if (index == -1) {
                    getLibros();
                } else {
                    OpcionesLibro op = new OpcionesLibro();
                    op.setLibro(Libros.obtenerLibro(index), index);
                    op.setVisible(true);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(rootPane, "Libro seleccionado no encontrado", "Libro no seleccionado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un libro en la tabla", "Libro no seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Obtener libros para registrarlos en las lista libros y mostrarlos en la tabla
    private void getLibros() {
        Libros = Datos.getInstance().getLibros();
        if (Libros.isNull()) {
            Msg.setText("No hay libros registrados,por favor registra un libro.");
        } else {
            libros = Libros.getLibros();
            drawTable();
        }
    }

    //Mostrar libros en la tabla
    private void drawTable() {
        DefaultTableModel tableModel = (DefaultTableModel) Table.getModel();
        tableModel.setRowCount(0);
        for (int i = 0; i < libros.length; i++) {
            if (libros[i][0] != null) {
                Object[] fila = {libros[i][0], libros[i][1], libros[i][2], libros[i][3], libros[i][4]};
                tableModel.addRow(fila);
            }
        }
    }

    //Pasar texto a numeros
    private long stringToNumber(String texto) {
        long numero = 0;
        //Recorrer cada caracter el texto
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i); //Obtener letra
            int valor = (int) letra - 'A' + 1;  // Asigna un valor numérico a cada letra (numero de letra - 65 + 1)
            // Multiplica el valor por 10 elevado a la posición correspondiente
            // valor * 10 + siguiente posicion
            numero = numero * 10 + valor;
            /*
            Ejemplo:
                8 = 80
                5 = 85
             */
        }
        return numero;
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnOrden;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JTextField Buscador;
    private javax.swing.JComboBox<String> BuscarTipo;
    private javax.swing.JComboBox<String> Filtro;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JComboBox<String> Metodo;
    private javax.swing.JLabel Msg;
    private javax.swing.JTable Table;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
