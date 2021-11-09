
package project;
import ConexionDB.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
 

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        Calendar calendar=new GregorianCalendar();
        fecha_venta.setText(""+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
    }
public void mostrar(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM empleados");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
public void mostrar1(){
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM proveedores");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
public void mostrar2(){
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM productos");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
public void mostrar3(){
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM cliente");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
public void mostra4(){
        DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM venta");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void limpiar(){
        id_emp.setText("");
        nom_emp.setText("");
        usuario_emp.setText("");
        pass_emp.setText("");
        tel_emp.setText("");
        correo_emp.setText("");       
    }
    
     private void limpiar1(){
        txtpro.setText("");
        txtnompro.setText("");
        txttelpro.setText("");
        txtdirrepro.setText("");      
    }
     private void limpiar2(){
        id_prod.setText("");
        txtcantidad.setText("");
        txt_nompro.setText("");
        txt_prepro.setText("");
        txt_pro.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        panelempleados = new javax.swing.JTabbedPane();
        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empleados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nom_emp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        id_emp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        usuario_emp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pass_emp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        correo_emp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tel_emp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        proveedores = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtpro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtnompro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txttelpro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtdirrepro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        productos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        id_prod = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_nompro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txt_prepro = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_pro = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        clientes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_idcl = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_nombrecl = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txt_telcl = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_dirrecl = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_correocl = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ventas = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        id_venta = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        id_empleados = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        num_factura = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        fecha_venta = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txt_iva = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton30 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grupo.png"))); // NOI18N
        jButton1.setText("Empleados");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        jButton2.setText("Proveedores");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        jButton3.setText("Productos");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opinion-del-cliente.png"))); // NOI18N
        jButton25.setText("Clientes");
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 370));

        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienvenido.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        principal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 70, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -40, -1, -1));

        panelempleados.addTab("tab1", principal);

        empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EMPLEADOS");
        empleados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        empleados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 20));
        empleados.add(nom_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");
        empleados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        id_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_empActionPerformed(evt);
            }
        });
        empleados.add(id_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "usuario", "contraseña", "correo", "telefono"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        empleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 540, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Usuario");
        empleados.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 20));
        empleados.add(usuario_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contraseña");
        empleados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        empleados.add(pass_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Correo");
        empleados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 40, 20));
        empleados.add(correo_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono");
        empleados.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        tel_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_empActionPerformed(evt);
            }
        });
        empleados.add(tel_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, -1));

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        empleados.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 80, -1));

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        empleados.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, -1));

        jButton7.setText("Mostrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        empleados.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 80, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleo.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        empleados.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 70));

        jButton12.setText("Eliminar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        empleados.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 80, -1));

        jButton22.setText("Generar Reporte");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        empleados.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        empleados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -40, -1, -1));

        panelempleados.addTab("tab2", empleados);

        proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedores");
        proveedores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Proveedor");
        proveedores.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, -1));
        proveedores.add(txtpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre  Proveedor");
        proveedores.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        proveedores.add(txtnompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 120, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Proveedor", "Nombre Proveedor", "Telefono Proveedor", "Dirrecion Proveedor"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        proveedores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 500, 90));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Telefono Proveedores");
        proveedores.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        proveedores.add(txttelpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Dirreción de Proveedor");
        proveedores.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));
        proveedores.add(txtdirrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 100, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        proveedores.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor (1).png"))); // NOI18N
        jLabel25.setText("jLabel25");
        proveedores.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 60));

        jButton8.setText("Guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        proveedores.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jButton9.setText("Modificar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        proveedores.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jButton10.setText("Mostrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        proveedores.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jButton11.setText("Eliminar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        proveedores.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jButton23.setText("Generar Reporte");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        proveedores.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        proveedores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -20, -1, -1));

        panelempleados.addTab("tab3", proveedores);

        productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRODUCTOS");
        productos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jLabel26.setText("jLabel26");
        productos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ID Producto");
        productos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, -1, 30));
        productos.add(id_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombre Producto");
        productos.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));
        productos.add(txt_nompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 250, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre Producto", "Precio", "Cantidad", "Proveedor"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        productos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 510, 90));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Precio");
        productos.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        productos.add(txt_prepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cantidad");
        productos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        txtcantidad.setToolTipText("");
        productos.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Proveedor");
        productos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));
        productos.add(txt_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 100, -1));

        jButton13.setText("Guardar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        productos.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 80, -1));

        jButton14.setText("Modificar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        productos.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 80, -1));

        jButton15.setText("Mostrar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        productos.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 80, -1));

        jButton16.setText("Eliminar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        productos.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, -1));

        jButton24.setText("Generar Reporte");
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        productos.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 120, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        productos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -10, -1, -1));

        panelempleados.addTab("tab4", productos);

        clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CLIENTES");
        clientes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/objetivo.png"))); // NOI18N
        clientes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("ID Cliente");
        clientes.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        txt_idcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idclActionPerformed(evt);
            }
        });
        clientes.add(txt_idcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("DPI");
        clientes.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        clientes.add(txt_dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Nombre Cliente");
        clientes.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));
        clientes.add(txt_nombrecl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "DPI", "Nombre Cliente", "Telefono Cliente", "Dirreción Cliente", "Correo Cliente"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        clientes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 560, 90));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Telefono Cliente");
        clientes.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));
        clientes.add(txt_telcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Dirreción Cliente");
        clientes.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));
        clientes.add(txt_dirrecl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 110, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Correo Cliente");
        clientes.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));
        clientes.add(txt_correocl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, -1));

        jButton17.setText("Guardar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        clientes.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 80, -1));

        jButton18.setText("Modificar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        clientes.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, -1));

        jButton19.setText("Mostrar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        clientes.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 80, -1));

        jButton20.setText("Eliminar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        clientes.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, -1));

        jButton21.setText("Generar Reporte");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        clientes.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        clientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, -1, 530));

        panelempleados.addTab("tab5", clientes);

        ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas-bajas.png"))); // NOI18N
        ventas.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("VENTAS");
        ventas.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton26.setText("Ingresar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        ventas.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 80, -1));

        jButton27.setText("Mostrar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        ventas.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 80, -1));

        jButton28.setText("Modificar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        ventas.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 80, -1));

        jButton29.setText("Eliminar");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        ventas.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 80, -1));
        ventas.add(id_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("ID Venta");
        ventas.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("ID Cliente");
        ventas.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        ventas.add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));
        ventas.add(id_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("ID Empleado");
        ventas.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        ventas.add(num_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("No. Factura");
        ventas.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Fecha de Venta");
        ventas.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));
        ventas.add(fecha_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 120, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Total Sin IVA");
        ventas.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txt_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ivaActionPerformed(evt);
            }
        });
        ventas.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 130, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "ID Cliente", "ID Empleados", "No. Factura", "Fecha de Venta", "Total"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(1).setHeaderValue("ID Cliente");
            jTable5.getColumnModel().getColumn(2).setHeaderValue("ID Empleados");
            jTable5.getColumnModel().getColumn(3).setHeaderValue("No. Factura");
        }

        ventas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 530, 90));

        jButton30.setText("Generar Reporte");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        ventas.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("TOTAL");
        ventas.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));
        ventas.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        ventas.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -20, -1, -1));

        panelempleados.addTab("tab6", ventas);

        getContentPane().add(panelempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -30, 600, 500));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        jButton4.setText("Ventas");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 100, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelempleados.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelempleados.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panelempleados.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        panelempleados.setSelectedIndex(5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mostrar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String id = id_emp.getText();
        String nombre = nom_emp.getText();
        String usuario = usuario_emp.getText();
        String contra = pass_emp.getText();
        int tel=Integer.parseInt(tel_emp.getText());
        String correo = correo_emp.getText();

                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO empleados (id_emp,nombre_emp, usario, contrasena, correo_emp, tel_emp) VALUES (?,?,?,?,?,?)");
                    ps.setString(1,id);
                    ps.setString(2, nombre);
                    ps.setString(3, usuario);
                    ps.setString(4, contra);
                    ps.setString(5, correo);
                    ps.setInt(6,tel);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El registro ha sido guardado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
           int fila = jTable1.getSelectedRow();
           int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
           
        PreparedStatement ps;
        ResultSet rs;
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM empleados where id_emp=?");
            ps.setInt(1, id);
           rs = ps.executeQuery();
           while(rs.next()){
               id_emp.setText(String.valueOf(id));
               nom_emp.setText(rs.getString("nombre_emp"));
               usuario_emp.setText(rs.getString("usario"));
               pass_emp.setText(rs.getString("contrasena"));
               correo_emp.setText(rs.getString("correo_emp"));
               tel_emp.setText(rs.getString("tel_emp"));
           }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());  
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String id = id_emp.getText();
        String nombre = nom_emp.getText();
        String usuario = usuario_emp.getText();
        String contra = pass_emp.getText();
        int tel=Integer.parseInt(tel_emp.getText());
        String correo = correo_emp.getText();
                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE empleados SET nombre_emp=?,usario=?, contrasena=?, correo_emp=?,  tel_emp=? WHERE id_emp=?");                 
     
                    ps.setString(1, nombre);
                    ps.setString(2, usuario);
                    ps.setString(3, contra);
                    ps.setString(4, correo);
                    ps.setInt(5,tel);
                    ps.setString(6,id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Registro a sido modificado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void id_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_empActionPerformed

    private void tel_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_empActionPerformed

    private void txt_idclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idclActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String pro = txtpro.getText();
        String nombreprove = txtnompro.getText();
        int tel=Integer.parseInt(txttelpro.getText());
        String dirrecion = txtdirrepro.getText();

                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO proveedores (prove,nom_prove,tel_prove,direc_prove) VALUES (?,?,?,?)");
                    ps.setString(1,pro);
                    ps.setString(2, nombreprove);
                    ps.setInt(3, tel);
                    ps.setString(4,dirrecion);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El registro ha sido guardado");
                    limpiar1 ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                } 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String provee = txtpro.getText();
        String nombre = txtnompro.getText();
        int tel=Integer.parseInt(txttelpro.getText());
        String dirrec = txtdirrepro.getText();
                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE proveedores SET nom_prove=?,tel_prove=?,direc_prove=?, WHERE prove=?");                 
     
                    ps.setString(1, provee);
                    ps.setString(2, nombre);
                    ps.setInt(3,tel);
                    ps.setString(4,dirrec);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Registro a sido modificado");
                    limpiar1 ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String id = id_prod.getText();
        String nombre = txt_nompro.getText();
        double precio = Double.parseDouble(txt_prepro.getText());
        int cantidad=Integer.parseInt(txtcantidad.getText());
        String prove = txt_pro.getText();

                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO productos (id_prod, nombre_prod, precio, cantidad, prove) VALUES (?,?,?,?,?)");
                    ps.setString(1,id);
                    ps.setString(2, nombre);
                    ps.setDouble(3, precio);
                    ps.setInt(4, cantidad);
                    ps.setString(5, prove);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El registro ha sido guardado");
                    limpiar2 ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        mostrar1();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String id = id_prod.getText();
        String nombre = txt_nompro.getText();
        double precio =Double.parseDouble(txt_prepro.getText());
        int cantidad=Integer.parseInt(txtcantidad.getText());
        String prove = txt_pro.getText();
                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE productos SET nombre_prod=?,precio=?,cantidad=?,prove=?, WHERE id_prod=?");                 
     
                    ps.setString(1, id);
                    ps.setString(2, nombre);
                    ps.setDouble(3,precio);
                    ps.setInt(4,cantidad);
                    ps.setString(5,prove);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Registro a sido modificado");
                    limpiar1 ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        mostrar2();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String id = txt_idcl.getText();
        int dpi=Integer.parseInt(txt_dpi.getText());
        String nombre = txt_nombrecl.getText();
        int tel=Integer.parseInt(tel_emp.getText());
        String dirrecion = txt_dirrecl.getText();
        String correo = txt_correocl.getText();

                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (id_cliente,DPI, nombre_cliente, tel_cliente,dirreccion_cliente, correo_cliente) VALUES (?,?,?,?,?,?)");
                    ps.setString(1,id);
                    ps.setInt(2, dpi);
                    ps.setString(3, nombre);
                    ps.setInt(4, tel);
                    ps.setString(5, dirrecion);
                    ps.setString(6,correo);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El registro ha sido guardado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        mostrar3();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String id = txt_idcl.getText();
        int dpi=Integer.parseInt(txt_dpi.getText());
        String nombre = txt_nombrecl.getText();
        int tel=Integer.parseInt(tel_emp.getText());
        String dirrecion = txt_dirrecl.getText();
        String correo = txt_correocl.getText();
                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE cliente SET DPI=?,nombre_cliente=?, tel_cliente=?, dirreccion_cliente=?, correo_cliente=? WHERE id_cliente=?");                 
     
                    ps.setString(1,id);
                    ps.setInt(2, dpi);
                    ps.setString(3, nombre);
                    ps.setInt(4, tel);
                    ps.setString(5, dirrecion);
                    ps.setString(6,correo);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Registro a sido modificado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
           int fila = jTable2.getSelectedRow();
           int id = Integer.parseInt(jTable2.getValueAt(fila, 0).toString());
           
        PreparedStatement ps;
        ResultSet rs;
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM proveedores where prove=?");
            ps.setInt(1, id);
           rs = ps.executeQuery();
           while(rs.next()){
               txtpro.setText(String.valueOf(id));
               txtnompro.setText(rs.getString("nom_prove"));
               txttelpro.setText(rs.getString("tel_prove"));
               txtdirrepro.setText(rs.getString("direc_prove"));
           }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());  
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        try{
           int fila = jTable3.getSelectedRow();
           int id = Integer.parseInt(jTable3.getValueAt(fila, 0).toString());
           
        PreparedStatement ps;
        ResultSet rs;
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM productos where id_prod=?");
            ps.setInt(1, id);
           rs = ps.executeQuery();
           while(rs.next()){
               id_prod.setText(String.valueOf(id));
               txt_nompro.setText(rs.getString("nombre_prod"));
               txt_prepro.setText(rs.getString("precio"));
               txtcantidad.setText(rs.getString("cantidad"));
               txt_pro.setText(rs.getString("prove"));
           }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());  
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        try{
           int fila = jTable4.getSelectedRow();
           int id = Integer.parseInt(jTable4.getValueAt(fila, 0).toString());
           
        PreparedStatement ps;
        ResultSet rs;
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM cliente where id_cliente=?");
            ps.setInt(1, id);
           rs = ps.executeQuery();
           while(rs.next()){
               txt_idcl.setText(String.valueOf(id));
               txt_dpi.setText(rs.getString("DPI"));
               txt_nombrecl.setText(rs.getString("nombre_cliente"));
               txt_telcl.setText(rs.getString("tel_cliente"));
               txt_dirrecl.setText(rs.getString("dirreccion_cliente"));
               txt_correocl.setText(rs.getString("correo_cliente"));
           }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());  
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
         panelempleados.setSelectedIndex(4);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int idv =Integer.parseInt(id_venta.getText());
        int idc =Integer.parseInt(id_cliente.getText());
        int ide =Integer.parseInt(id_empleados.getText());
        String numf = num_factura.getText();
        String fv = fecha_venta.getText();
        double total=Double.parseDouble(txt_total.getText());

                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO venta (id_venta,id_cliente,id_emp,num_venta, fecha_venta, total) VALUES (?,?,?,?,?,?)");
                    ps.setInt(1,idv);
                    ps.setInt(2, idc);
                    ps.setInt(3, ide);
                    ps.setString(4, numf);
                    ps.setString(5, fv);
                    ps.setDouble(6,total);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El registro ha sido guardado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        mostra4();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int idv =Integer.parseInt(id_venta.getText());
        int idc =Integer.parseInt(id_cliente.getText());
        int ide =Integer.parseInt(id_empleados.getText());
        String numf = num_factura.getText();
        String fv = fecha_venta.getText();
        double total=Double.parseDouble(txt_iva.getText());
                try{
                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE venta SET id_cliente=?,id_emp=?, num_venta=?, fecha_venta=?, total=? WHERE id_venta=?");                 
     
                    ps.setInt(1, idv);
                    ps.setInt(2, idc);
                    ps.setInt(3, ide);
                    ps.setString(4, numf);
                    ps.setString(5,fv);
                    ps.setDouble(6,total);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Registro a sido modificado");
                    limpiar ();
                   
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.toString());
                    
                }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       Document documento = new Document();
       
       try {
           String ruta = System.getProperty("user.home");
           PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Empleados.pdf"));
           documento.open();
           
           PdfPTable tabla = new PdfPTable(6);
           tabla.addCell("ID");
           tabla.addCell("Nombre");
           tabla.addCell("Usuario");
           tabla.addCell("Contraseña");
           tabla.addCell("Correo");
           tabla.addCell("Telefono");
           
           try{
               Connection con = conexion.getConexion();
               PreparedStatement pst = con.prepareStatement("select * from empleados");
               
               ResultSet rs = pst.executeQuery();
               
               if(rs.next()){
                   
                   do{ 
                       tabla.addCell (rs.getString(1));
                       tabla.addCell (rs.getString(2));
                       tabla.addCell (rs.getString(3));
                       tabla.addCell (rs.getString(4));
                       tabla.addCell (rs.getString(5));
                       tabla.addCell (rs.getString(6));
                   }while (rs.next());
                    documento.add(tabla);    
                           
               }
               
               
           } catch(DocumentException | SQLException e){
           }
           documento.close();
           JOptionPane.showMessageDialog(null, "Reporte de Empleados Creado.");
       } catch (DocumentException | HeadlessException | FileNotFoundException e){
           
       }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void txt_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ivaActionPerformed
        calculoiva();
    }//GEN-LAST:event_txt_ivaActionPerformed
    void calculoiva(){
    double iva,totiva,totpg;
    double precio = Double.parseDouble(txt_iva.getText());
    iva=0.12;
    totiva=precio*iva;
    totpg=precio+totiva;
    txt_total.setText(""+totpg);
}
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
    Document documento = new Document();
       
       try {
           String ruta = System.getProperty("user.home");
           PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Proveedores.pdf"));
           documento.open();
           
           PdfPTable tabla = new PdfPTable(4);
           tabla.addCell("Proveedor");
           tabla.addCell("Nombre de Proveedor");
           tabla.addCell("Telefono de Proveedor");
           tabla.addCell("Dirrecion de Proveedor");
           
           try{
               Connection con = conexion.getConexion();
               PreparedStatement pst = con.prepareStatement("select * from proveedores");
               
               ResultSet rs = pst.executeQuery();
               
               if(rs.next()){
                   
                   do{ 
                       tabla.addCell (rs.getString(1));
                       tabla.addCell (rs.getString(2));
                       tabla.addCell (rs.getString(3));
                       tabla.addCell (rs.getString(4));
                   }while (rs.next());
                    documento.add(tabla);    
                           
               }
               
               
           } catch(DocumentException | SQLException e){
           }
           documento.close();
           JOptionPane.showMessageDialog(null, "Reporte de Proveedores Creado.");
       } catch (DocumentException | HeadlessException | FileNotFoundException e){ 
    }
        
        
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Document documento = new Document();
       
       try {
           String ruta = System.getProperty("user.home");
           PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
           documento.open();
           
           PdfPTable tabla = new PdfPTable(5);
           tabla.addCell("ID Producto");
           tabla.addCell("Nombre de Producto");
           tabla.addCell("Precio");
           tabla.addCell("Cantidad");
           tabla.addCell("Proveedor");
           
           
           try{
               Connection con = conexion.getConexion();
               PreparedStatement pst = con.prepareStatement("select * from productos");
               
               ResultSet rs = pst.executeQuery();
               
               if(rs.next()){
                   
                   do{ 
                       tabla.addCell (rs.getString(1));
                       tabla.addCell (rs.getString(2));
                       tabla.addCell (rs.getString(3));
                       tabla.addCell (rs.getString(4));
                       tabla.addCell (rs.getString(5));
                   }while (rs.next());
                    documento.add(tabla);    
                           
               }
               
               
           } catch(DocumentException | SQLException e){
           }
           documento.close();
           JOptionPane.showMessageDialog(null, "Reporte de Productos Creado.");
       } catch (DocumentException | HeadlessException | FileNotFoundException e){ 
    }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    Document documento = new Document();
       
       try {
           String ruta = System.getProperty("user.home");
           PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Clientes.pdf"));
           documento.open();
           
           PdfPTable tabla = new PdfPTable(6);
           tabla.addCell("ID Cliente");
           tabla.addCell("DPI");
           tabla.addCell("Nombre del Cliente");
           tabla.addCell("Telefono del Cliente");
           tabla.addCell("Dirrección del Cliente");
           tabla.addCell("Correo del Cliente");
           
           try{
               Connection con = conexion.getConexion();
               PreparedStatement pst = con.prepareStatement("select * from cliente");
               
               ResultSet rs = pst.executeQuery();
               
               if(rs.next()){
                   
                   do{ 
                       tabla.addCell (rs.getString(1));
                       tabla.addCell (rs.getString(2));
                       tabla.addCell (rs.getString(3));
                       tabla.addCell (rs.getString(4));
                       tabla.addCell (rs.getString(5));
                       tabla.addCell (rs.getString(6));
                   }while (rs.next());
                    documento.add(tabla);    
                           
               }
               
               
           } catch(DocumentException | SQLException e){
           }
           documento.close();
           JOptionPane.showMessageDialog(null, "Reporte de Clientes Creado.");
       } catch (DocumentException | HeadlessException | FileNotFoundException e){ 
    }    
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int codigopr =Integer.parseInt (id_emp.getText());

        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM empleados WHERE id_emp=?");

            ps.setInt(1, codigopr);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
    try{
           int fila = jTable5.getSelectedRow();
           int id = Integer.parseInt(jTable5.getValueAt(fila, 0).toString());
           
        PreparedStatement ps;
        ResultSet rs;
            Connection con = conexion.getConexion();
            ps= con.prepareStatement("SELECT * FROM venta where id_venta=?");
            ps.setInt(1, id);
           rs = ps.executeQuery();
           while(rs.next()){
               id_venta.setText(String.valueOf(id));
               id_cliente.setText(rs.getString("id_cliente"));
               id_empleados.setText(rs.getString("id_emp"));
               num_factura.setText(rs.getString("num_venta"));
               fecha_venta.setText(rs.getString("fecha_venta"));
               txt_total.setText(rs.getString("total"));
           }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());  
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int codigopr =Integer.parseInt (txtpro.getText());

        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM proveedores WHERE prove=?");

            ps.setInt(1, codigopr);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int codigopr =Integer.parseInt (id_prod.getText());

        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE id_prod=?");

            ps.setInt(1, codigopr);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int codigopr =Integer.parseInt (txt_idcl.getText());

        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM cliente WHERE id_cliente=?");

            ps.setInt(1, codigopr);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int codigopr =Integer.parseInt (id_venta.getText());

        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM venta WHERE id_venta=?");

            ps.setInt(1, codigopr);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        Document documento = new Document();
       
       try {
           String ruta = System.getProperty("user.home");
           PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Ventas.pdf"));
           documento.open();
           
           PdfPTable tabla = new PdfPTable(5);
           tabla.addCell("ID Venta");
           tabla.addCell("ID Cliente");
           tabla.addCell("No. Factura");
           tabla.addCell("Fecha de Venta");
           tabla.addCell("Total");
           try{
               Connection con = conexion.getConexion();
               PreparedStatement pst = con.prepareStatement("select * from venta");
               
               ResultSet rs = pst.executeQuery();
               
               if(rs.next()){
                   
                   do{ 
                       tabla.addCell (rs.getString(1));
                       tabla.addCell (rs.getString(2));
                       tabla.addCell (rs.getString(3));
                       tabla.addCell (rs.getString(4));
                       tabla.addCell (rs.getString(5));
                   }while (rs.next());
                    documento.add(tabla);    
                           
               }
               
               
           } catch(DocumentException | SQLException e){
           }
           documento.close();
           JOptionPane.showMessageDialog(null, "Reporte de Ventas Creado.");
       } catch (DocumentException | HeadlessException | FileNotFoundException e){ 
    }
    }//GEN-LAST:event_jButton30ActionPerformed

  
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientes;
    private javax.swing.JTextField correo_emp;
    private javax.swing.JPanel empleados;
    private javax.swing.JTextField fecha_venta;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField id_emp;
    private javax.swing.JTextField id_empleados;
    private javax.swing.JTextField id_prod;
    private javax.swing.JTextField id_venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField nom_emp;
    private javax.swing.JTextField num_factura;
    private javax.swing.JTabbedPane panelempleados;
    private javax.swing.JTextField pass_emp;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel productos;
    private javax.swing.JPanel proveedores;
    private javax.swing.JTextField tel_emp;
    private javax.swing.JTextField txt_correocl;
    private javax.swing.JTextField txt_dirrecl;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_idcl;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JTextField txt_nombrecl;
    private javax.swing.JTextField txt_nompro;
    private javax.swing.JTextField txt_prepro;
    private javax.swing.JTextField txt_pro;
    private javax.swing.JTextField txt_telcl;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdirrepro;
    private javax.swing.JTextField txtnompro;
    private javax.swing.JTextField txtpro;
    private javax.swing.JTextField txttelpro;
    private javax.swing.JTextField usuario_emp;
    private javax.swing.JPanel ventas;
    // End of variables declaration//GEN-END:variables
}
