/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import ConexionSQL.Java_SQL;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chefu
 */
public class pClientes extends javax.swing.JPanel {

    /**
     * Creates new form pClientes
     */
    public pClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jIdCliente = new javax.swing.JTextField();
        jNombreC = new javax.swing.JTextField();
        jPuestoC = new javax.swing.JTextField();
        jNivelA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        bReporte = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxUsers = new javax.swing.JComboBox<>();

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel2.setText("Clientes");

        jLabel1.setText("ID de Cliente:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Puesto:");

        jLabel5.setText("Nivel de Acceso:");

        jLabel6.setText("Niveles de acceso: 0 = Master, 1 = Alto, 2 = Medio, 3 = Bajo.");

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bReporte.setText("Reporte");
        bReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReporteActionPerformed(evt);
            }
        });

        jLabel7.setText("Usuario:");

        jLabel8.setText("Usuario al que pertenece este cliente.");

        cbxUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAgregar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(bBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(bReporte)
                                .addGap(138, 138, 138)
                                .addComponent(bModificar)
                                .addGap(64, 64, 64)
                                .addComponent(bEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jIdCliente)
                                    .addComponent(jNivelA, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                    .addComponent(jPuestoC)
                                    .addComponent(jNombreC)
                                    .addComponent(cbxUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPuestoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jNivelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cbxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bModificar)
                    .addComponent(bBuscar)
                    .addComponent(bEliminar)
                    .addComponent(bReporte))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        String Insertar = "insert into Clientes (ID_de_Cliente,Nombre_de_Cliente,Puesto,Nivel_de_Acceso) values (" + Integer.parseInt(jIdCliente.getText()) + ",'" + jNombreC.getText() + "','" + jPuestoC.getText() + "','" + jNivelA.getText() + "')";
        Java_SQL cc = new Java_SQL();
        Connection con = cc.Conexion();

        int result = insertC(Insertar, con);
        switch (result) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Cliente insertado correctamente!", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE);
            case 2627 ->
                JOptionPane.showMessageDialog(null, "Cliente ya existente", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            case 547 ->
                JOptionPane.showMessageDialog(null, "Asegurese de que el proveedor exista", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            default ->
                JOptionPane.showMessageDialog(null, "Error desconocido", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
        }
        limpiarcampos();
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReporteActionPerformed
        // TODO add your handling code here:
        html();
    }//GEN-LAST:event_bReporteActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        Java_SQL cc = new Java_SQL();
        Connection con = cc.Conexion();
        ArrayList<String[]> filaSel = getClientes(con);
        for (String[] arreglohijo : filaSel) {
            jIdCliente.setText(arreglohijo[0].toString());
            jNombreC.setText(arreglohijo[1].toString());
            jPuestoC.setText(arreglohijo[2]);
            jNivelA.setText(arreglohijo[3]);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
        String Modificar = "UPDATE Clientes SET Nombre_de_Cliente = '" + jNombreC.getText() + "', Puesto = '" + jPuestoC.getText() + "', Nivel_de_Acceso =  '" + jNivelA.getText() + "' WHERE ID_de_Cliente = " + Integer.parseInt(jIdCliente.getText()) + "";
        Java_SQL cc = new Java_SQL();
        Connection con = cc.Conexion();
        int result = insertC(Modificar, con);
        switch (result) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Cliente Modificado correctamente!", "Modificar Dispositivo", JOptionPane.INFORMATION_MESSAGE);
            case 2627 ->
                JOptionPane.showMessageDialog(null, "Cliente ya existente", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            case 547 ->
                JOptionPane.showMessageDialog(null, "Asegurese de que el proveedor exista", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            default ->
                JOptionPane.showMessageDialog(null, "Error desconocido", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
        }
        limpiarcampos();
    }//GEN-LAST:event_bModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        String Borrar = "DELETE FROM Clientes WHERE ID_de_Cliente = " + Integer.parseInt(jIdCliente.getText()) + "";
        Java_SQL cc = new Java_SQL();
        Connection con = cc.Conexion();

        int result = insertC(Borrar, con);
        switch (result) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "Cliente borrado correctamente!", "Borrar Dispositivo", JOptionPane.INFORMATION_MESSAGE);
            case 2627 ->
                JOptionPane.showMessageDialog(null, "Cliente ya existente", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            case 547 ->
                JOptionPane.showMessageDialog(null, "Asegurese de que el proveedor exista", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
            default ->
                JOptionPane.showMessageDialog(null, "Error desconocido", "Error (" + result + ")", JOptionPane.ERROR_MESSAGE);
        }
        limpiarcampos();
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bReporte;
    private javax.swing.JComboBox<String> cbxUsers;
    private javax.swing.JTextField jIdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNivelA;
    private javax.swing.JTextField jNombreC;
    private javax.swing.JTextField jPuestoC;
    // End of variables declaration//GEN-END:variables

    public Integer insertC(String query, Connection con) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR INSERT METHOD " + e.getErrorCode());
            return e.getErrorCode();
        }
    }

    public ArrayList<String[]> getClientes(Connection con) {
        ArrayList<String[]> queryResult = new ArrayList<>();
        ResultSet result = null;
        try ( Statement statement = con.createStatement();) {
            result = statement.executeQuery("SELECT * FROM Clientes WHERE ID_de_Cliente = " + Integer.parseInt(jIdCliente.getText()) + "");
            while (result.next()) {
                String[] obj = {result.getString(1), result.getString(2), result.getString(3), result.getString(4)};
                queryResult.add(obj);
                System.out.println(result.getString(1) + result.getString(2) + result.getString(3) + result.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR SELECT METHOD " + e.getErrorCode());
        }
        return queryResult;
    }

    private void html() {
        String rows = "";
        Java_SQL cc = new Java_SQL();
        Connection con = cc.Conexion();
        BufferedWriter ficheroSalida;
        try {

            ficheroSalida = new BufferedWriter(new FileWriter(new File("ReporteC.html")));
            try ( Statement statement = con.createStatement();) {
                ResultSet result = statement.executeQuery("SELECT * FROM Clientes");
                while (result.next()) {
                    rows = rows + "            <tr>\n"
                            + "                <td>" + result.getObject("ID_de_Cliente") + "</td>\n"
                            + "                <td>" + result.getObject("Nombre_de_Cliente") + "</td>\n"
                            + "                <td>" + result.getObject("Puesto") + "</td>\n"
                            + "                <td>" + result.getObject("Nivel_de_Acceso") + "</td>\n"
                            + "            </tr>";
                }
            } catch (SQLException e) {
            }
            ficheroSalida.write("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n"
                    + "        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>Reportes</title>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body class=\"p-4\">\n"
                    + "    <table class=\"w-100 table table-dark table-hover\">\n"
                    + "        <thead>\n"
                    + "            <tr>\n"
                    + "                <th>ID</th>\n"
                    + "                <th>Nombre</th>\n"
                    + "                <th>Puesto</th>\n"
                    + "                <th>Nivel de Acceso</th>\n"
                    + "            </tr>\n"
                    + "        </thead>\n"
                    + "        <tbody>\n"
                    + rows
                    + "        </tbody>\n"
                    + "    </table>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>");
            ficheroSalida.close();
        } catch (IOException error) {
            System.out.println("El Error fue:" + error.getMessage());
        }
    }

    private void limpiarcampos() {
        jIdCliente.setText("");
        jNombreC.setText("");
        jPuestoC.setText("");
        jNivelA.setText("");
        jIdCliente.requestFocus();
    }
}