import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TablaFormulario {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Tabla y Formulario");

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(700,500);
            ventana.setLocationRelativeTo(null);

            String[] columnas = new String[]{"Legajo", "Nombre", "Apellido", "Carrera"};

            DefaultTableModel modelo = new DefaultTableModel(columnas,0);

            modelo.addRow(new Object[]{"1001","Juan","Pepito","Programacion"});

            modelo.addRow(new Object[]{"1002","Luis","Paez","Administracion"});

            modelo.addRow(new Object[]{"1003","Mariano","Rodrigues","Diseño"});

            modelo.addRow(new Object[]{"1004", "María", "López", "Contabilidad"});

            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);

            JTextField legajo = new JTextField(10);

            legajo.setEditable(false);
            JTextField nombre = new JTextField(10);
            JTextField apellido = new JTextField(10);
            JTextField carrera = new JTextField(10);

            JButton btnLimpiar =  new JButton("Limpiar campos: ");

            JPanel formulario = new JPanel();
            formulario.setLayout(new GridLayout(5,2,5,5));

            JLabel lblLegajo = new JLabel("Legajo:");
            JLabel lblNombre = new JLabel("Nombre:");
            JLabel lblApellido = new JLabel("Apellido:");
            JLabel lblCarrera = new JLabel("Carrera:");


            formulario.add(lblLegajo);
            formulario.add(legajo);

            formulario.add(lblNombre);
            formulario.add(nombre);

            formulario.add(lblApellido);
            formulario.add(apellido);

            formulario.add(lblCarrera);
            formulario.add(carrera);

            formulario.add(new JLabel(""));
            formulario.add(btnLimpiar);

            tabla.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = tabla.getSelectedRow();

                    legajo.setText(modelo.getValueAt(fila, 0).toString());

                    nombre.setText(modelo.getValueAt(fila, 1).toString());

                    apellido.setText(modelo.getValueAt(fila, 2).toString());

                    carrera.setText(modelo.getValueAt(fila, 3).toString());
                }
            });

            btnLimpiar.addActionListener(e-> {

                legajo.setText("");
                nombre.setText("");
                apellido.setText("");
                carrera.setText("");
            });

            ventana.add(scroll,BorderLayout.CENTER);
            ventana.add(formulario,BorderLayout.SOUTH);

            ventana.setVisible(true);
        });

    }

}
