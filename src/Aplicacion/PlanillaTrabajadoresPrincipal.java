
package Aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigInteger;









public class PlanillaTrabajadoresPrincipal extends javax.swing.JFrame {
  
    //Variables para la conexion a la base de datos
    public static final String URL="jdbc:mysql://localhost:3306/planillatrabajadores";
    public static final String USERNAME="root";
    public static final String PASSWORD="";
    
    //Creamos variables para poder preparar y traer las consultas
    //En global para que toda la aplicacion las pueda usar
    PreparedStatement VarDeclaracionLeer; //Variable declaracion de leer
    ResultSet VarConjuntoResultante; //Variable para la lectura
    

    //Metodo para hacer la conexion, Es un metodo de tipo Connection que nos
    //Retornara todos los datos de nuestra conexion.
    public static Connection ObtenerConexion()
    {
        //Creamos una variable de tipo conexion, para que podamos guardar en 
        //ella toda la informacino de conexion, esta misma variable es la que 
        //retornara nuestra funcion o metodo de tipo Connection
        Connection VarConexion=null;
        
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            VarConexion=(Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexión a la base de datos, EXITOSA");
             
        }catch(Exception DataError)
        {     
            DataError.getMessage();
            System.out.println("Error al conectar con la base de datos, active el servidor."+DataError);
            JOptionPane.showMessageDialog(null, "Error al conectar con el servidor de base de datos, active los servidores \n o contacte al soporte técnico de Edbyte en cualquiera de los medios disponibles...\n"+DataError);
        }
       
        //Retornamos la variable conexion en nuestro metodo de tipo Connection
        return VarConexion;
    }
    
    //Variables de uso global
    private int IdCurso1=0;
    private int IdCurso2=0;
    private int IdCurso3=0;
    private int IdCurso4=0;
    
    private int UltimaIdPlazaConsultada=0;
    
    
    //Constructor
    public PlanillaTrabajadoresPrincipal() {
        initComponents();

        //Al iniciar el programa manipulamos el programa y su apariencia
        MostrarDatosTabla();
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
           
    }
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleCarnet = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        titleCarnet1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPlaza = new javax.swing.JTextField();
        titleCarnet3 = new javax.swing.JLabel();
        titleCarnet4 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        titleCarnet8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarDPI = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscarNombre = new javax.swing.JButton();
        txtProfesion = new javax.swing.JTextField();
        titleCarnet10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        titleCarnet6 = new javax.swing.JLabel();
        txtIGSS = new javax.swing.JTextField();
        titleCarnet11 = new javax.swing.JLabel();
        txtIrtra = new javax.swing.JTextField();
        titleCarnet12 = new javax.swing.JLabel();
        txtISR = new javax.swing.JTextField();
        titleCarnet13 = new javax.swing.JLabel();
        txtBonificacion = new javax.swing.JTextField();
        titleCarnet14 = new javax.swing.JLabel();
        txtSueldoLiquido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 31, 61));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(204, 226, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(694, 567));
        jPanel1.setMinimumSize(new java.awt.Dimension(694, 567));

        titleCarnet.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet.setText("Profesión:");

        txtDPI.setBackground(new java.awt.Color(255, 238, 204));
        txtDPI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDPI.setForeground(new java.awt.Color(0, 0, 0));
        txtDPI.setName("txtDPI"); // NOI18N
        txtDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPIActionPerformed(evt);
            }
        });
        txtDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDPIKeyTyped(evt);
            }
        });

        titleCarnet1.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet1.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet1.setText("DPI:");

        txtNombre.setBackground(new java.awt.Color(255, 238, 204));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setName("txtNombre"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPlaza.setBackground(new java.awt.Color(255, 238, 204));
        txtPlaza.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlaza.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaza.setName("txtPlaza"); // NOI18N
        txtPlaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlazaActionPerformed(evt);
            }
        });
        txtPlaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlazaKeyTyped(evt);
            }
        });

        titleCarnet3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleCarnet3.setForeground(new java.awt.Color(151, 202, 62));
        titleCarnet3.setText("SIstema de planilla para trabajadores");

        titleCarnet4.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet4.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet4.setText("Salario:");

        txtSalario.setBackground(new java.awt.Color(255, 238, 204));
        txtSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.setName("txtSalario"); // NOI18N
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });

        tablaDatos.setAutoCreateRowSorter(true);
        tablaDatos.setBackground(new java.awt.Color(244, 244, 244));
        tablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaDatos.setForeground(new java.awt.Color(255, 51, 51));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDatos.setAlignmentY(1.0F);
        tablaDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaDatos.setGridColor(new java.awt.Color(255, 247, 0));
        tablaDatos.setSelectionBackground(new java.awt.Color(151, 202, 62));
        jScrollPane1.setViewportView(tablaDatos);

        titleCarnet8.setBackground(new java.awt.Color(151, 202, 62));
        titleCarnet8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleCarnet8.setForeground(new java.awt.Color(151, 202, 62));
        titleCarnet8.setText("Datos registrados...");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        txtApellidos.setBackground(new java.awt.Color(255, 238, 204));
        txtApellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setName("txtApellidos"); // NOI18N
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");

        jPanel2.setBackground(new java.awt.Color(151, 202, 62));

        btnBuscarDPI.setBackground(new java.awt.Color(18, 31, 61));
        btnBuscarDPI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscarDPI.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDPI.setText("Buscar por DPI.");
        btnBuscarDPI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarDPI.setName("btnBuscarDPI"); // NOI18N
        btnBuscarDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDPIActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(18, 31, 61));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(18, 31, 61));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(18, 31, 61));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModificar.setName("btnModificar"); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(18, 31, 61));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimpiar.setName("btnLimpiar"); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscarNombre.setBackground(new java.awt.Color(18, 31, 61));
        btnBuscarNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscarNombre.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarNombre.setText("Buscar por nombre.");
        btnBuscarNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarNombre.setName("btnBuscarNombre"); // NOI18N
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnBuscarDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        txtProfesion.setBackground(new java.awt.Color(255, 238, 204));
        txtProfesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProfesion.setForeground(new java.awt.Color(0, 0, 0));
        txtProfesion.setName("txtProfesion"); // NOI18N
        txtProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesionActionPerformed(evt);
            }
        });
        txtProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProfesionKeyTyped(evt);
            }
        });

        titleCarnet10.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet10.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet10.setText("Plaza:");

        jPanel3.setBackground(new java.awt.Color(18, 31, 61));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de planilla automáticos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(222, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(222, 255, 255));
        jPanel3.setToolTipText("");

        titleCarnet6.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet6.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet6.setText("Pago Irtra:");

        txtIGSS.setBackground(new java.awt.Color(255, 238, 204));
        txtIGSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIGSS.setForeground(new java.awt.Color(0, 0, 0));
        txtIGSS.setEnabled(false);
        txtIGSS.setName("txtIGSS"); // NOI18N
        txtIGSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGSSActionPerformed(evt);
            }
        });
        txtIGSS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIGSSKeyTyped(evt);
            }
        });

        titleCarnet11.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet11.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet11.setText("Pago IGSS:");

        txtIrtra.setBackground(new java.awt.Color(255, 238, 204));
        txtIrtra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIrtra.setForeground(new java.awt.Color(0, 0, 0));
        txtIrtra.setEnabled(false);
        txtIrtra.setName("txtIrtra"); // NOI18N
        txtIrtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIrtraActionPerformed(evt);
            }
        });
        txtIrtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIrtraKeyTyped(evt);
            }
        });

        titleCarnet12.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet12.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet12.setText("Pago ISR:");

        txtISR.setBackground(new java.awt.Color(255, 238, 204));
        txtISR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtISR.setForeground(new java.awt.Color(0, 0, 0));
        txtISR.setEnabled(false);
        txtISR.setName("txtISR"); // NOI18N
        txtISR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISRActionPerformed(evt);
            }
        });
        txtISR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISRKeyTyped(evt);
            }
        });

        titleCarnet13.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet13.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet13.setText("Bonificación:");

        txtBonificacion.setBackground(new java.awt.Color(255, 238, 204));
        txtBonificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBonificacion.setForeground(new java.awt.Color(0, 0, 0));
        txtBonificacion.setEnabled(false);
        txtBonificacion.setName("txtBonificacion"); // NOI18N
        txtBonificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBonificacionActionPerformed(evt);
            }
        });
        txtBonificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBonificacionKeyTyped(evt);
            }
        });

        titleCarnet14.setBackground(new java.awt.Color(255, 255, 255));
        titleCarnet14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleCarnet14.setForeground(new java.awt.Color(222, 255, 255));
        titleCarnet14.setText("Sueldo Liquido:");

        txtSueldoLiquido.setBackground(new java.awt.Color(255, 238, 204));
        txtSueldoLiquido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSueldoLiquido.setForeground(new java.awt.Color(0, 0, 0));
        txtSueldoLiquido.setEnabled(false);
        txtSueldoLiquido.setName("txtSueldoLiquido"); // NOI18N
        txtSueldoLiquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoLiquidoActionPerformed(evt);
            }
        });
        txtSueldoLiquido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoLiquidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(titleCarnet11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIGSS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleCarnet6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIrtra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleCarnet12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtISR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleCarnet13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(titleCarnet14)
                        .addGap(4, 4, 4)
                        .addComponent(txtSueldoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleCarnet6)
                    .addComponent(txtIGSS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIrtra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleCarnet11)
                    .addComponent(titleCarnet12)
                    .addComponent(txtISR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleCarnet13)
                    .addComponent(txtBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleCarnet14)
                    .addComponent(txtSueldoLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(titleCarnet)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtProfesion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(titleCarnet10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPlaza))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(titleCarnet1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(titleCarnet4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDPI)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(titleCarnet3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(titleCarnet8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleCarnet3)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleCarnet)
                            .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleCarnet10)
                            .addComponent(txtPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titleCarnet4)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titleCarnet1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleCarnet8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSueldoLiquidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoLiquidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoLiquidoKeyTyped

    private void txtSueldoLiquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoLiquidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoLiquidoActionPerformed

    private void txtBonificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBonificacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBonificacionKeyTyped

    private void txtBonificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBonificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBonificacionActionPerformed

    private void txtISRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISRKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISRKeyTyped

    private void txtISRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISRActionPerformed

    private void txtIrtraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIrtraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIrtraKeyTyped

    private void txtIrtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIrtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIrtraActionPerformed

    private void txtIGSSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIGSSKeyTyped
        //Aceptar solo 6 caracteres
        if(txtIGSS.getText().length()>=6)
        {
            evt.consume();
        }

        //Aceptar solo numeros
        //Obtener caracteres presionado
        int key=evt.getKeyChar();
        //Pasar a true si... y pasar a false si no.. DE ACUERDO AL RANGO DE CODIGO ASCII
        boolean numeros= key>=44 && key<=57;

        //Si lo tecleado no esta en el rango y la condicion anterior paso a falso, se desactiva el tecleo
        if(!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtIGSSKeyTyped

    private void txtIGSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGSSActionPerformed

    private void txtProfesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesionKeyTyped
        //Aceptar solo 25 caracteres
        if(txtProfesion.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtProfesionKeyTyped

    private void txtProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCampos(true);
        MostrarDatosTabla();
        btnGuardar.setEnabled(true);
       
                   btnEliminar.setEnabled(false);
                    btnModificar.setEnabled(false);
        
        //MostrarDatosTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if((!"".equals(txtNombre.getText()))&&(!"".equals(txtApellidos.getText()))&&
            (!"".equals(txtDPI.getText()))&&(!"".equals(txtProfesion.getText()))&&
            (!"".equals(txtPlaza.getText()))&&(!"".equals(txtSalario.getText()))&&NumerosEnSalario==true)
        {


            //Traer salario base
            Double Salario= ConDouble(txtSalario.getText());
            //Calculos de planilla
            Double IGSS= ConDouble(txtSalario.getText())*0.0483;
            
            Double Irtra= ConDouble(txtSalario.getText())*0.01;
            
            Double ISR= ConDouble(txtSalario.getText())*0.01;
            
            Double Bonificacion= 250.00;
            
            Double SueldoLiquido=(Salario-IGSS-Irtra-ISR+Bonificacion);
            
            
            ValoresPlanilla(ConDouble(txtSalario.getText()));
            

            //Creamoa una varialbe de tipo conexion
            Connection VarConexionModificar=null;

            //Usamos try catch para guardar los datos para que intenemos el guarado y\
            //ya si no funciona, guardamos el error y continuamos con el progrtama c
            //como si nada

            try
            {
                //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
                VarConexionModificar=ObtenerConexion();

                //Preparar la declaracion de consulta
                VarDeclaracionLeer=VarConexionModificar.prepareStatement("CALL ProcesoModificar (?,?,?,?,?,?,?,?,?,?,?,?);");

                //Preparar los elementos que vamos a ingresar en la base
                //Mandandolas a la base con SET y obteniendolas con GET desde la interfaz
                VarDeclaracionLeer.setString(1,txtPlaza.getText());
                VarDeclaracionLeer.setDouble(2,Double.parseDouble(txtSalario.getText()));
                

                VarDeclaracionLeer.setString(3,txtNombre.getText());
                VarDeclaracionLeer.setString(4,txtApellidos.getText());
                VarDeclaracionLeer.setLong(5,Long.parseLong(txtDPI.getText()));
                VarDeclaracionLeer.setString(6,txtProfesion.getText());
                 
                VarDeclaracionLeer.setDouble(7,IGSS);
                VarDeclaracionLeer.setDouble(8,Irtra);
                VarDeclaracionLeer.setDouble(9,ISR);
                VarDeclaracionLeer.setDouble(10,Bonificacion);
                VarDeclaracionLeer.setDouble(11,SueldoLiquido);
                VarDeclaracionLeer.setInt(12,UltimaIdPlazaConsultada);
                
                //UltimaIdPlazaConsultada=0;
                //Ahora guardamos el resultado verdadero o falso que guaradar la funcion de EJECUTAR ACTUALIZACION
                int RespuestaActualizacion=VarDeclaracionLeer.executeUpdate();

                //Evaualndo respuesta
                if(RespuestaActualizacion>0)
                {
                    JOptionPane.showMessageDialog(null, "Datos modificados exitosamente");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error al modificar los datos");
                }

                LimpiarCampos(true);
                VarConexionModificar.close();

             

                //MostrarDatosTabla();

            }
            catch(SQLException DataError)
            {
                DataError.getMessage();

                JOptionPane.showMessageDialog(null, "Hubo un error al modificar los datos, verifíque que el DPI del Trabajador NO se haya repetido con otro\n (Puede ser que el número de PDI o Salario ingresado tienen un formato incorrecto). \nSi el error continúa, contacte con el soporte de 'Edbyte' ::::"+DataError);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"LLene todos los campos antes de modficiar o verifique que tengan el contenido adecuado");
        }
       MostrarDatosTabla();

           
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      

        if((!"".equals(txtDPI.getText()))&&(!"".equals(txtNombre.getText())))
        {

            //Creamoa una varialbe de tipo conexion
            Connection VarConexionEliminar=null;

            //Usamos try catch para guardar los datos para que intenemos el guarado y\
            //ya si no funciona, guardamos el error y continuamos con el progrtama c
            //como si nada
            try
            {
                //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
                VarConexionEliminar=ObtenerConexion();

                //Preparar la declaracion de consulta
                VarDeclaracionLeer=VarConexionEliminar.prepareStatement("CALL ProcesoEliminar(?);");

                //Preparar los elementos que vamos a ingresar en la base
                //Mandandolas a la base con SET y obteniendolas con GET desde la interfaz
                VarDeclaracionLeer.setInt(1,UltimaIdPlazaConsultada);

                //Ahora guardamos el resultado verdadero o falso que guaradar la funcion de EJECUTAR ACTUALIZACION
                int RespuestaActualizacion=VarDeclaracionLeer.executeUpdate();

                //Evaualndo respuesta
                if(RespuestaActualizacion>0)
                {
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    LimpiarCampos(true);
                    txtDPI.setEnabled(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Eror al eliminar los datos. Verifique que haya \n buscado en el sistema el trabajador correcto");
                }

                VarConexionEliminar.close();

                

                //MostrarDatosTabla();

            }
            catch(SQLException DataError)
            {
                DataError.getMessage();
                LimpiarCampos(true);
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error en el proceso, \nsi el error persiste contactese con el soporte técnico de Edbyte"+DataError);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Los campos de nombre y número de DPI deben estar \nllenos con los datos correspondientes");
        }
        MostrarDatosTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    
    
    private void ValoresPlanilla(Double SalarioParametro)
    {
             //Traer salario base
        
    
            Double Salario= SalarioParametro;
            //Calculos de planilla
            Double IGSS= SalarioParametro*0.0483;
            
            Double Irtra= SalarioParametro*0.01;
            
            Double ISR= SalarioParametro*0.01;
            
            Double Bonificacion= 250.00;
            
            Double SueldoLiquido=(Salario-IGSS-Irtra-ISR+Bonificacion);
            
          
      
            txtIGSS.setText(Double.toString(IGSS));
            txtIrtra.setText(Double.toString(Irtra));
            txtISR.setText(Double.toString(ISR));
            txtBonificacion.setText(Double.toString(Bonificacion));
            txtSueldoLiquido.setText(Double.toString(SueldoLiquido));
                        
            
    }
    
    
    //Boton para hacer el guardado de datos
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if((!"".equals(txtNombre.getText()))&&(!"".equals(txtApellidos.getText()))&&
            (!"".equals(txtDPI.getText()))&&(!"".equals(txtProfesion.getText()))&&
            (!"".equals(txtPlaza.getText()))&&(!"".equals(txtSalario.getText()))&&NumerosEnSalario==true)
        {


            //Traer salario base
            Double Salario= (ConDouble(txtSalario.getText()));
            //Calculos de planilla
            Double IGSS= (ConDouble(txtSalario.getText()))*0.0483;
            
            Double Irtra= (ConDouble(txtSalario.getText()))*0.01;
            
            Double ISR= (ConDouble(txtSalario.getText()))*0.01;
            
            Double Bonificacion= 250.00;
            
            Double SueldoLiquido=(Salario-IGSS-Irtra-ISR+Bonificacion);
            
            
            ValoresPlanilla(ConDouble(txtSalario.getText()));
            

            //Creamoa una varialbe de tipo conexion
            Connection VarConexionGuardar=null;

            //Usamos try catch para guardar los datos para que intenemos el guarado y\
            //ya si no funciona, guardamos el error y continuamos con el progrtama c
            //como si nada

            try
            {
                //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
                VarConexionGuardar=ObtenerConexion();

                //Preparar la declaracion de consulta
                VarDeclaracionLeer=VarConexionGuardar.prepareStatement("CALL ProcesoGuardar(?,?,?,?,?,?,?,?,?,?,?);");

                //Preparar los elementos que vamos a ingresar en la base
                //Mandandolas a la base con SET y obteniendolas con GET desde la interfaz
                VarDeclaracionLeer.setString(1,txtPlaza.getText());
                VarDeclaracionLeer.setDouble(2,Double.parseDouble(txtSalario.getText()));
                

                VarDeclaracionLeer.setString(3,txtNombre.getText());
                VarDeclaracionLeer.setString(4,txtApellidos.getText());
                VarDeclaracionLeer.setLong(5,Long.parseLong(txtDPI.getText()));
                VarDeclaracionLeer.setString(6,txtProfesion.getText());
                 
                VarDeclaracionLeer.setDouble(7,IGSS);
                VarDeclaracionLeer.setDouble(8,Irtra);
                VarDeclaracionLeer.setDouble(9,ISR);
                VarDeclaracionLeer.setDouble(10,Bonificacion);
                VarDeclaracionLeer.setDouble(11,SueldoLiquido);
                
                //Ahora guardamos el resultado verdadero o falso que guaradar la funcion de EJECUTAR ACTUALIZACION
                int RespuestaActualizacion=VarDeclaracionLeer.executeUpdate();

                //Evaualndo respuesta
                if(RespuestaActualizacion>0)
                {
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error al guardar datos");
                }

                LimpiarCampos(true);
                VarConexionGuardar.close();

                /*if(VarConexionGuardar.isClosed())
                {
                    JOptionPane.showMessageDialog(null,"Conexion cerrada");
                }*/

                //MostrarDatosTabla();

            }
            catch(SQLException DataError)
            {
                DataError.getMessage();

                JOptionPane.showMessageDialog(null, "Hubo un error al Guardar los datos, verifíque que el Carné de estudiante NO se haya repetido con otro \n(Puede ser que el número de carné ingresado ya esta registrado anteriormente).\n Si el error continúa, contacte con el soporte de 'Edbyte'\n"+DataError);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"LLene todos los campos antes de guardar o verifique que tengan el contenido adecuado");
        }
        MostrarDatosTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDPIActionPerformed
        LimpiarCampos(false);
        
        

        if(!"".equals(txtDPI.getText()))
        {
            //Creamoa una varialbe de tipo conexion
            Connection VarConexionBuscar=null;

            //Usamos try catch para guardar los datos para que intenemos el guarado y\
            //ya si no funciona, guardamos el error y continuamos con el progrtama c
            //como si nada

            try
            {

                //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
                VarConexionBuscar=ObtenerConexion();

                //Preparar la declaracion de consulta
                VarDeclaracionLeer=VarConexionBuscar.prepareStatement("SELECT trabajador.Nombre,trabajador.Apellidos,trabajador.DPI,trabajador.Profesion,plaza.NombrePlaza,plaza.Salario,planilla.PagoIGSS,planilla.PagoIrtra,planilla.PagoISR,planilla.Bonificacion,planilla.SueldoLiquido,Plaza.IdPlaza FROM plaza INNER JOIN trabajador ON plaza.IdPlaza=trabajador.IdPlaza INNER JOIN planilla ON trabajador.IdTrabajador=planilla.IdTrabajador WHERE trabajador.DPI=?");

                //Mandamos datos a la consulta;
                VarDeclaracionLeer.setLong(1,Long.parseLong(txtDPI.getText()));

                ///YA MANDAMOS TODOS LOS PARAMETROS, AHORA LEEREMOS EL RESULTADO
                VarConjuntoResultante=VarDeclaracionLeer.executeQuery();

                //Ahora validamos si hay un siguiente registro

               

                if(VarConjuntoResultante.next())
                {
                    btnGuardar.setEnabled(false);
                    btnEliminar.setEnabled(true);
                    btnModificar.setEnabled(true);
                   
                    txtNombre.setText(VarConjuntoResultante.getString("Nombre"));
                    txtApellidos.setText(VarConjuntoResultante.getString("Apellidos"));
                    txtDPI.setText(VarConjuntoResultante.getString("DPI"));
                    txtProfesion.setText(VarConjuntoResultante.getString("Profesion"));
                    txtPlaza.setText(VarConjuntoResultante.getString("NombrePlaza"));
                    txtSalario.setText(VarConjuntoResultante.getString("Salario"));
                    txtIGSS.setText(VarConjuntoResultante.getString("PagoIGSS"));
                    txtIrtra.setText(VarConjuntoResultante.getString("PagoIrtra"));
                    txtISR.setText(VarConjuntoResultante.getString("PagoISR"));
                    txtBonificacion.setText(VarConjuntoResultante.getString("Bonificacion"));
                    txtSueldoLiquido.setText(VarConjuntoResultante.getString("SueldoLiquido"));
                    
                    UltimaIdPlazaConsultada=(VarConjuntoResultante.getInt("IdPlaza")); 
                   

                    //txtDPI.setEnabled(false);

                }
                //EN CASO DE QUE NO SE ENCUENTREN DATOS DE RETORNO CON ESE NUMERO 
                else
                {
                    JOptionPane.showMessageDialog(null,"No se pudo encontrar ningun trabajador con ese número de DPI");
                    //LimpiarCampos(true);
                    btnGuardar.setEnabled(true);
                    btnEliminar.setEnabled(false);
                    btnModificar.setEnabled(false);

                }
                //Cerramos conexion
                VarConexionBuscar.close();
               MostrarDatosTabla();

            }
            catch(SQLException DataError)
            {

                System.err.println(DataError);
                LimpiarCampos(true);
                btnGuardar.setEnabled(true);
                MostrarDatosTabla();

            }

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Para hacer una busqueda, primero ingrese un número de DPI");
        }
    }//GEN-LAST:event_btnBuscarDPIActionPerformed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped

        //Aceptar solo 6 caracteres
        if(txtSalario.getText().length()>=7)
        {
            evt.consume();
        }

        //Aceptar solo numeros
        //Obtener caracteres presionado
        int key=evt.getKeyChar();
        //Pasar a true si... y pasar a false si no.. DE ACUERDO AL RANGO DE CODIGO ASCII
        boolean numeros= key>=44 && key<=57;

        //Si lo tecleado no esta en el rango y la condicion anterior paso a falso, se desactiva el tecleo
        if(!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtPlazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazaKeyTyped
        //Aceptar solo 25 caracteres
        if(txtPlaza.getText().length()>=75)
        {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlazaKeyTyped

    private void txtPlazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlazaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Aceptar solo 30 caracteres
        if(txtNombre.getText().length()>=75)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped

        //Aceptar solo 10 caracteres
        if(txtDPI.getText().length()>20)
        {
            evt.consume();
        }

        //Aceptar solo numeros
        //Obtener caracteres presionado
        int key=evt.getKeyChar();
        //Pasar a true si... y pasar a false si no.. DE ACUERDO AL RANGO DE CODIGO ASCII
        boolean numeros= key>=48 && key<=57;

        //Si lo tecleado no esta en el rango y la condicion anterior paso a falso, se desactiva el tecleo
        if(!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtDPIKeyTyped

    private void txtDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPIActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        //LimpiarCampos(false);
        
        //Variables para guardar los ids de los cursos

        if(!"".equals(txtNombre.getText()))
        {
            //Creamoa una varialbe de tipo conexion
            Connection VarConexionBuscarNombre=null;

            //Usamos try catch para guardar los datos para que intenemos el guarado y\
            //ya si no funciona, guardamos el error y continuamos con el progrtama c
            //como si nada

            try
            {

                //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
                VarConexionBuscarNombre=ObtenerConexion();

                
                //Preparar la declaracion de consulta
                VarDeclaracionLeer=VarConexionBuscarNombre.prepareStatement("SELECT trabajador.Nombre,trabajador.Apellidos,trabajador.DPI,trabajador.Profesion,plaza.NombrePlaza,plaza.Salario,planilla.PagoIGSS,planilla.PagoIrtra,planilla.PagoISR,planilla.Bonificacion,planilla.SueldoLiquido,Plaza.IdPlaza FROM plaza INNER JOIN trabajador ON plaza.IdPlaza=trabajador.IdPlaza INNER JOIN planilla ON trabajador.IdTrabajador=planilla.IdTrabajador WHERE  trabajador.Nombre like ?");  

                //Mandamos datos a la consulta;
                VarDeclaracionLeer.setString(1,txtNombre.getText());

                ///YA MANDAMOS TODOS LOS PARAMETROS, AHORA LEEREMOS EL RESULTADO
                VarConjuntoResultante=VarDeclaracionLeer.executeQuery();

                //Ahora validamos si hay un siguiente registro

               

                if(VarConjuntoResultante.next())
                {
                    btnGuardar.setEnabled(false);
                    btnEliminar.setEnabled(true);
                    btnModificar.setEnabled(true);
                   
                    txtNombre.setText(VarConjuntoResultante.getString("Nombre"));
                    txtApellidos.setText(VarConjuntoResultante.getString("Apellidos"));
                    txtDPI.setText(VarConjuntoResultante.getString("DPI"));
                    txtProfesion.setText(VarConjuntoResultante.getString("Profesion"));
                    txtPlaza.setText(VarConjuntoResultante.getString("NombrePlaza"));
                    txtSalario.setText(VarConjuntoResultante.getString("Salario"));
                    txtIGSS.setText(VarConjuntoResultante.getString("PagoIGSS"));
                    txtIrtra.setText(VarConjuntoResultante.getString("PagoIrtra"));
                    txtISR.setText(VarConjuntoResultante.getString("PagoISR"));
                    txtBonificacion.setText(VarConjuntoResultante.getString("Bonificacion"));
                    txtSueldoLiquido.setText(VarConjuntoResultante.getString("SueldoLiquido"));
                    
                    UltimaIdPlazaConsultada=(VarConjuntoResultante.getInt("IdPlaza")); 
                   

                    //txtDPI.setEnabled(false);

                }
                //EN CASO DE QUE NO SE ENCUENTREN DATOS DE RETORNO CON ESE NUMERO DE DPI
                else
                {
                    JOptionPane.showMessageDialog(null,"No se pudo encontrar ningun trabajador con ese nombre \n Tenga en cuenta espacios, Mayusculas, minusculas y tildes para el nombre");
                    //LimpiarCampos(true);
                    btnGuardar.setEnabled(true);
                    btnEliminar.setEnabled(false);
                    btnModificar.setEnabled(false);

                }
                //Cerramos conexion
                VarConexionBuscarNombre.close();
               MostrarDatosTabla();

            }
            catch(SQLException DataError)
            {

                System.err.println(DataError);
                LimpiarCampos(true);
                btnGuardar.setEnabled(true);
                MostrarDatosTabla();

            }

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Para hacer una busqueda, primero ingrese un nombre de trabajador");
        }
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

     boolean NumerosEnSalario=false;
    private void txtSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyReleased
     
       

        //Aceptar solo numeros
        //Obtener caracteres presionado
        int key=evt.getKeyChar();
        //Pasar a true si... y pasar a false si no.. DE ACUERDO AL RANGO DE CODIGO ASCII
        boolean numeros= key>=48 && key<=57;

        //Si lo tecleado no esta en el rango y la condicion anterior paso a falso, se desactiva el tecleo
        if(!numeros)
        {
            evt.consume();
        }
        
        
        if(!"".equals(txtSalario.getText())&&numeros==true)
        {
            ValoresPlanilla(ConDouble(txtSalario.getText()));
            NumerosEnSalario=true;
        }
        else if("".equals(txtSalario.getText())&&numeros==false)   
        {
            ValoresPlanilla(0.00);
            NumerosEnSalario=false;
        }
            
    }//GEN-LAST:event_txtSalarioKeyReleased

    
     public static Double ConDouble(String Parametro)
        {
             Double Valor= Double.parseDouble(Parametro);
             
             return Valor;
        }
    
  

   
   
    
    
    
    private void MostrarDatosTabla()
    {
        //Crear un formato de tabla
        DefaultTableModel TablaDatosTemporal=new DefaultTableModel();
        TablaDatosTemporal.addColumn("Nombre");
        TablaDatosTemporal.addColumn("Apellidos");
        TablaDatosTemporal.addColumn("DPI");
        TablaDatosTemporal.addColumn("Profesión");
        TablaDatosTemporal.addColumn("Plaza");
        TablaDatosTemporal.addColumn("Salario");
        TablaDatosTemporal.addColumn("Sueldo Liquido");
        TablaDatosTemporal.addColumn("IGSS");
        TablaDatosTemporal.addColumn("IRTRA");
        TablaDatosTemporal.addColumn("ISR");
        TablaDatosTemporal.addColumn("Bonificación");
       
        //Mandamos el formato de la tabla creada al formato de la tabla en la interfaz
        tablaDatos.setModel(TablaDatosTemporal);
        
         //Creamoa una varialbe de tipo conexion
          Connection VarConexionTabla=null;
        
        //Array donde traerremos los datos
        String[] DatosObtenidos=new String[11];
        //Usamos try catch para guardar los datos para que intenemos el guarado y\
        //ya si no funciona, guardamos el error y continuamos con el progrtama c
        //como si nada
        
        try
        {
            //Abrimos nuestra conexion invocando la funcion de tipo conexion que nos conecta a la base
            VarConexionTabla=ObtenerConexion();
       
            //Preparar la declaracion de consulta
            VarDeclaracionLeer=VarConexionTabla.prepareStatement("SELECT trabajador.Nombre,trabajador.Apellidos,trabajador.DPI,trabajador.Profesion,plaza.NombrePlaza,plaza.Salario,planilla.PagoIGSS,planilla.PagoIrtra,planilla.PagoISR,planilla.Bonificacion,planilla.SueldoLiquido,Plaza.IdPlaza FROM plaza INNER JOIN trabajador ON plaza.IdPlaza=trabajador.IdPlaza INNER JOIN planilla ON trabajador.IdTrabajador=planilla.IdTrabajador");
        
            ///YA MANDAMOS TODOS LOS PARAMETROS, AHORA LEEREMOS EL RESULTADO
            VarConjuntoResultante=VarDeclaracionLeer.executeQuery();
           
            
            while(VarConjuntoResultante.next())
            {
                //Obtener los datos en base a la consulta obtenida de la base de datos
                //Vamos a asignar cada columna a un espacio del array para poder
                //Copiar los datos en cada iterracion
                DatosObtenidos[0]=VarConjuntoResultante.getString("Nombre");
                DatosObtenidos[1]=VarConjuntoResultante.getString("Apellidos");
                DatosObtenidos[2]=VarConjuntoResultante.getString("DPI");
                DatosObtenidos[3]=VarConjuntoResultante.getString("Profesion");
                DatosObtenidos[4]=VarConjuntoResultante.getString("NombrePlaza");
                DatosObtenidos[5]=VarConjuntoResultante.getString("Salario");
                DatosObtenidos[6]=VarConjuntoResultante.getString("SueldoLiquido");
                DatosObtenidos[7]=VarConjuntoResultante.getString("PagoIGSS");
                DatosObtenidos[8]=VarConjuntoResultante.getString("PagoIrtra");
                DatosObtenidos[9]=VarConjuntoResultante.getString("PagoISR");
                DatosObtenidos[10]=VarConjuntoResultante.getString("Bonificacion");
                
                //Pasar los daatos obtenidos al array de la primera fila de la base a 
                //una fila del formato de tabla que creamos hace rato
                
                TablaDatosTemporal.addRow(DatosObtenidos);
            }
         //Despues de guardar todas las filas obtenidas en nuestra tabla, pasamos esa tabla a la interfaz grafica
          tablaDatos.setModel(TablaDatosTemporal);
        
        
        
        }
        catch(SQLException DataError)
        {
            JOptionPane.showMessageDialog(null,DataError+"Error en la consulta de BD" );
            System.out.println("Error al conectar con la base de datos, active el servidor."+DataError);
        }
            
        
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Metodo Limpiar datos
    private void LimpiarCampos(boolean Parametro)
    {
        txtDPI.setEnabled(true);
        if(Parametro==true)
        {    
        txtDPI.setText(null);
        }
        
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtProfesion.setText(null);
        txtPlaza.setText(null);
        txtSalario.setText(null);
        txtIGSS.setText(null);
        txtIrtra.setText(null);
        txtISR.setText(null);
        txtBonificacion.setText(null);
        txtSueldoLiquido.setText(null);
      
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
            java.util.logging.Logger.getLogger(PlanillaTrabajadoresPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanillaTrabajadoresPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanillaTrabajadoresPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanillaTrabajadoresPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanillaTrabajadoresPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDPI;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel titleCarnet;
    private javax.swing.JLabel titleCarnet1;
    private javax.swing.JLabel titleCarnet10;
    private javax.swing.JLabel titleCarnet11;
    private javax.swing.JLabel titleCarnet12;
    private javax.swing.JLabel titleCarnet13;
    private javax.swing.JLabel titleCarnet14;
    private javax.swing.JLabel titleCarnet3;
    private javax.swing.JLabel titleCarnet4;
    private javax.swing.JLabel titleCarnet6;
    private javax.swing.JLabel titleCarnet8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBonificacion;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtIGSS;
    private javax.swing.JTextField txtISR;
    private javax.swing.JTextField txtIrtra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaza;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSueldoLiquido;
    // End of variables declaration//GEN-END:variables
}
