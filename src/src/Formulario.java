package src;

import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    private boolean editar = false; //Indicador si se muestra el interfaz de edicion o registro
    private boolean cambiar = false; //Cambio de materia (edicion)
    private Libro libro; //Objecto libro (edicion)
    private String inicialSelect = ""; // Inicial de la categoria
    private String mate[] = new String[0]; //Arreglo de materias
    private String[] iniciales = new String[0]; //Arreglo de iniciales

    public Formulario() {
        setTitle("Registro de libros");
        initComponents();
        visibleAddMateria(false);// Ocultar input y boton de agregar materia
        materias();// Cargar materias registradas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        AddMateria = new javax.swing.JTextField();
        BtnMateria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Paginas = new javax.swing.JTextField();
        Btn = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Autor = new javax.swing.JTextField();
        jlabel3 = new javax.swing.JLabel();
        Materia = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Auto = new javax.swing.JRadioButton();
        Inicial = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BtnMateria.setText("Agregar");
        BtnMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMateriaMouseClicked(evt);
            }
        });

        jLabel3.setText("N° Paginas");

        Btn.setBackground(new java.awt.Color(239, 110, 33));
        Btn.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        Btn.setForeground(new java.awt.Color(255, 255, 255));
        Btn.setText("Registrar");
        Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMouseClicked(evt);
            }
        });

        jlabel.setText("Código");

        jLabel1.setText("Nombre");

        jLabel2.setText("Autor/a");

        jlabel3.setText("Materia");

        Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Agregar" }));
        Materia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MateriaItemStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(239, 110, 33));

        title.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Registro de libros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Auto.setText("Automatico");
        Auto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AutoMouseClicked(evt);
            }
        });

        Inicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Inicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Inicial.setText("A");
        Inicial.setToolTipText("");
        Inicial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jlabel)
                    .addComponent(jLabel2)
                    .addComponent(jlabel3)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Autor)
                        .addComponent(Nombre)
                        .addComponent(Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Auto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnMateria))
                    .addComponent(Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Auto)
                    .addComponent(Inicial))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMateria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(Btn)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMouseClicked
        Registrar();
    }//GEN-LAST:event_BtnMouseClicked
    private void Registrar() {
        //Obtener texto de los inputs nombres, autor y materia
        String nombre = Nombre.getText().toString();
        String autor = Autor.getText().toString();
        String materia = Materia.getSelectedItem().toString();
        try {
            //Numero Codigo
            int codigoN = (Codigo.getText().toString().isEmpty()) ? 0 : Integer.parseInt(Codigo.getText());
            //Numero de  paginas
            int numeroPaginas = (Paginas.getText().toString().isEmpty()) ? 0 : Integer.parseInt(Paginas.getText());
            //Codigo automatico (Cuando se crea una nueva categoria)
            if (Auto.isSelected() && codigoN == 0) {
                codigoN = codigoN + 1;
            }
            //Codigo def (Letra + numero)
            String codigo = inicialSelect + codigoN;
            //Validar longitud nombre, numero codigo, autor y num paginas
            if (nombre.length() < 2 || codigoN < 0 || autor.length() < 2 || numeroPaginas < 1) {
                JOptionPane.showMessageDialog(rootPane, "Datos no ingresados o invalidos", "Error en los datos", JOptionPane.ERROR_MESSAGE);
            }
            //Validar si la materia seleccionada es diferente a Seleccionar (placeholder) y Agregar, tambien si numero de paginas es mayor a 0
            if (Materia.getSelectedIndex() > 1 && numeroPaginas > 0) {
                //Obtener codigo de libro (edicion)
                int code = Datos.getInstance().getLibros().buscarCodigo((editar) ? libro.getCodigo() : codigo);
                /*
                    Editar libro
                 */
                if (editar == true) {
                    Libro l = Datos.getInstance().getLibros().obtenerLibro(code);
                    //Cambiar Codigo cuando se cambia de materia
                    String codigoL = l.getCodigo();
                    if (materia != l.getMateria()) {
                        cambiar = true;
                        Auto.setSelected(true);
                        AutoCode();
                        codigoL = inicialSelect + Codigo.getText();
                    }
                    //Actualizar datos del libro 
                    Libro act = Datos.getInstance().getLibros().obtenerLibro(code);
                    act.setCodigo(codigoL);
                    act.setNombre(nombre);
                    act.setAutor(autor);
                    act.setMateria(materia);
                    act.setNumperoPaginas(numeroPaginas);
                    JOptionPane.showMessageDialog(rootPane, "Libro actualizado", "Libro actualizado", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                } else {
                    //Validar la previa existencia del objecto libro, para evidar duplicados en los codigos
                    if (code == -1) {
                        /*
                            Registrar nuevo libro
                         */
                        System.out.println("Nuevo codigo " + codigo);
                        Datos.getInstance().agregarLibro(new Libro(codigo, nombre, autor, materia, numeroPaginas));
                        JOptionPane.showMessageDialog(rootPane, "Libro registrado", "Libro registrado", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    } else {
                        //Limpiar input de Codigo 
                        JOptionPane.showMessageDialog(rootPane, "Código ya existente, ingresa un código diferente.", "Codigo ya exisente", JOptionPane.INFORMATION_MESSAGE);
                        Nombre.setText(nombre);
                        Codigo.setText("");
                        Inicial.setText(inicialSelect);
                        Autor.setText(autor);
                        Paginas.setText(String.valueOf(numeroPaginas));
                        Materia.setSelectedIndex(Materia.getSelectedIndex());
                    }
                }
                if (editar) {
                    //Al terminar de editar un libro, se cierra la ventana
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Materia no selecionada", "Materia no seleccionada", JOptionPane.ERROR_MESSAGE);
            }
            //Capturar error de ingreso diferente de numeros en Codigo y num paginas
        } catch (NumberFormatException e) {
            Paginas.setText("");
            JOptionPane.showMessageDialog(rootPane, "Número de paginas o código invalido,\ningrese un valor númerico. \nEl código agerga automaticamente la sigla de la categoria", "Error en los datos", JOptionPane.ERROR_MESSAGE);
        }
    }

//Funcion de limpiar inputs
    private void clear() {
        Nombre.setText("");
        if (!Auto.isSelected()) {
            Codigo.setText("");
        }
        Autor.setText("");
        inicialSelect = "";
        Inicial.setText("");
        Paginas.setText("");
        Materia.setSelectedIndex(0);
    }

    //Activar visualizacion de boton e input de agregar materia
    private void visibleAddMateria(boolean t) {
        AddMateria.setVisible(t);
        BtnMateria.setVisible(t);
    }

    //Lista seleccionable de materias (evento)
    private void MateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MateriaItemStateChanged
        //Hablitar o deshabilitar agregar materia
        if (Materia.getSelectedIndex() == 1) {
            visibleAddMateria(true);

        } else {
            visibleAddMateria(false);
        }
        //Obtener incide de la categoria y guardarlos en inicialSelect y Inicial (interfaz)
        inicialesL();
        if (Materia.getSelectedIndex() > 1 && iniciales.length > 0) {
            Inicial.setText(iniciales[Materia.getSelectedIndex() - 2]);
            inicialSelect = iniciales[Materia.getSelectedIndex() - 2];
            AutoCode();
        } else {
            Inicial.setText(" ");
            inicialSelect = "";
        }
    }//GEN-LAST:event_MateriaItemStateChanged
    //Obtener materias y guardarlo en mate (Atributo)
    private void materias() {
        Lista materias = Datos.getInstance().getMaterias();
        if (materias.getSize() > 0) {
            Nodo actual = materias.getInicio();
            String mat[] = new String[materias.getSize()];
            for (int i = 0; i < materias.getSize(); i++) {
                mat[i] = String.valueOf(actual.getValor());
                actual = actual.getSiguiente();
            }
            mate = mat;
            listaMaterias();
        }
    }

    //Agregar las materias como opciones en el seleccionable
    private void listaMaterias() {
        Materia.removeAllItems();
        Materia.addItem("Selecciona");
        Materia.addItem("Agregar");
        for (String mate1 : mate) {
            Materia.addItem(mate1);
        }
    }

    //Obtener iniciales y guardarlas en el atributo iniciales
    private void inicialesL() {
        Lista Iniciales = Datos.getInstance().getIniciales();
        if (Iniciales.getSize() > 0) {
            String[] inicial = new String[Iniciales.getSize()];
            Nodo actual = Iniciales.getInicio();
            for (int i = 0; i < Iniciales.getSize(); i++) {
                inicial[i] = String.valueOf(actual.getValor());
                actual = actual.getSiguiente();
            }
            this.iniciales = inicial;
        }
    }

    //Registrar materia e inicial
    private void BtnMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMateriaMouseClicked
        registrarMateria();

    }//GEN-LAST:event_BtnMateriaMouseClicked

    //Registrar materia e inicial
    private void registrarMateria() {
        //Obtener iniciales
        inicialesL();
        //Validar si en Materia (Lista seleccionable) esta seleccionado "Agregar" 
        if (Materia.getSelectedIndex() == 1) {
            //Obtener texto de AddMateria
            String materia = AddMateria.getText();
            //Validar logitud  de la materia ingresada
            if (materia.length() > 0) {
                //Regitrar materia en Datos
                Datos.getInstance().agregarMateria(materia);
                visibleAddMateria(false);
                materias();
                AddMateria.setText("");
                Materia.setSelectedIndex(0);
                //Crear nueva inicial en caso de llegar a Z:  Z -> ZA
                if (iniciales.length > 0) {
                    //Obtener ultimo caracter
                    String ini = iniciales[0];
                    char ultima = ini.charAt(ini.length() - 1);
                    int valor = (int) ultima;
                    int next = valor + 1;
                    //Crear
                    String inicialN = "";
                    if (next > 90) {
                        for (int i = 0; i < ini.length(); i++) {
                            inicialN += ini.charAt(i);
                        }
                        inicialN += "A";
                    } else {
                        char nueva = (char) next;
                        inicialN += nueva;
                    }
                    Datos.getInstance().agergarIniciales(inicialN);
                } else {
                    Datos.getInstance().agergarIniciales("A");
                }
                //Registrar materia
                materias();
                inicialesL();
                JOptionPane.showMessageDialog(rootPane, "Materia registrada", "Registro de nueva materia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Materia no ingresada", "Error en los datos", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
//Radio button de "Automatico"
    private void AutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutoMouseClicked
        // TODO add your handling code here:
        AutoCode();
    }//GEN-LAST:event_AutoMouseClicked
    //Funcion de generar automaticamente el codigo (Inicial + numero)
    private void AutoCode() {
        //Desabilitar si esta en edicion y no se cambio de materia
        if (editar && cambiar == false) {
            Auto.disable();
            return;
        }
        //Generar
        if (Auto.isSelected() || cambiar) {
            Codigo.disable();
            if (Materia.getSelectedIndex() > 1) {
                /*
                Obtene ultimo numero:
                    1. Obtener libros registrados de la categoria seleccioanda 
                    2. Ordenar de mayor a menor
                    3. Sumar 1 al ultimo numero
                    4. Guardar en valiables
                 */
                Object libros[][] = Datos.getInstance().getLibros().getLibros();
                Object temp[][] = new Object[libros.length][5];
                int cont = 0;
                for (int i = 0; i < libros.length; i++) {
                    String Original = String.valueOf(libros[i][3]);
                    if (Original.equalsIgnoreCase(String.valueOf(Materia.getSelectedItem()))) {
                        for (int j = 0; j < 5; j++) {
                            temp[i][j] = libros[i][j];
                        }
                        cont++;
                    }
                }
                Object arr[][] = new Object[cont][5];
                if (cont > 0) {
                    int v = 0;
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
                if (arr.length > 0) {
                    //Ordenar de mayor a menor
                    for (int i = arr.length - 1; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            long actual = stringToNumber(String.valueOf(arr[j][3]));
                            long siguiente = stringToNumber(String.valueOf(arr[j + 1][3]));
                            if (actual > siguiente) {
                                Object[] temp1 = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp1;
                            }
                        }
                    }
                    System.out.println("Ultimo: " + arr[0][0]);
                    //Sumar 1 al ultimo numero
                    int num = Integer.parseInt(numCode(String.valueOf(arr[0][0])));
                    //Mostrar en la interfaz
                    Codigo.setText("");
                    if (num == 0) {
                        Codigo.setText("1");
                    } else {
                        Codigo.setText(String.valueOf(num + 1));
                    }
                }
            } else {
                Codigo.enable();
                Auto.setSelected(false);
                if (Materia.getSelectedIndex() > 1) {
                    JOptionPane.showMessageDialog(rootPane, "No hay un libro registrado anteriormente\n con la materia :" + Materia.getSelectedItem() + ", regitra uno.", "Codigo automatico error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            Codigo.enable();
        }

    }

    private long stringToNumber(String texto) {
        long numero = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int valor = (int) letra - 'A' + 1;
            numero = numero * 10 + valor;
        }
        return numero;
    }

    //Cargar valores del Libro a editar
    public void editLibro(boolean edit, Libro libro) {
        editar = edit;
        this.libro = libro;
        setTitle("Actualización de libro");
        title.setText("Actualización de libro");
        Btn.setText("Actualizar");
        Materia.setSelectedItem(libro.getMateria());
        inicialesL();
        inicialSelect = iniciales[Materia.getSelectedIndex() - 2];
        Inicial.setText(inicialSelect);
        Autor.setText(libro.getAutor());
        Nombre.setText(libro.getNombre());
        Paginas.setText(Integer.toString(libro.getNumeroPaginas()));
        Auto.setVisible(false);
        Auto.disable();
        Codigo.disable();
        Codigo.setText(numCode(libro.getCodigo()));
    }

    //Obtener numero de un codigo
    private String numCode(String code) {
        String codigo = "";
        for (char c : code.toCharArray()) {
            if (Character.isDigit(c)) {
                codigo += c;
            }
        }
        return codigo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddMateria;
    private javax.swing.JRadioButton Auto;
    private javax.swing.JTextField Autor;
    private javax.swing.JButton Btn;
    private javax.swing.JButton BtnMateria;
    private javax.swing.JTextField Codigo;
    private javax.swing.JLabel Inicial;
    private javax.swing.JComboBox<String> Materia;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Paginas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
