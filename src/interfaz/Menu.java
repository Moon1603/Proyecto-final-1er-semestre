package interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame implements ActionListener  {


    JButton cliente, empleado, planilla, ventas;
    public Menu () {
       this.setTitle("Tabla");
       this.setLayout(null);
       this.setBounds(0,0,950,356);
       this.getContentPane().setBackground(Color.WHITE);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       setLocationRelativeTo(null);
       this.setVisible(true);


       cliente = new JButton("Modulo Cliente");
       cliente.setBounds(0,0,300,80 );
       cliente.setBackground(Color.darkGray);
       cliente.setForeground(Color.WHITE);
       cliente.setFont(new java.awt.Font("Cambria",1,14));
       cliente.addActionListener(this);
       cliente.setBorderPainted(false);
       cliente.setFocusPainted(false);
       cliente.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
               cliente.setBackground(Color.gray);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               cliente.setBackground(Color.DARK_GRAY);
           }

       });
       this.add (cliente);

        empleado = new JButton("Modulo Empleados");
        empleado.setBounds(0,80,300,80 );
        empleado.setBackground(Color.darkGray);
        empleado.setForeground(Color.WHITE);
        empleado.setFont(new java.awt.Font("Cambria",1,14));
        empleado.addActionListener(this);
        empleado.setBorderPainted(false);
        empleado.setFocusPainted(false);
        empleado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                empleado.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                empleado.setBackground(Color.DARK_GRAY);
            }

        });
        this.add (empleado);


        JLabel title = new JLabel("Ferreteria La Llave Dorada");
        title.setBounds(305, 0, 720, 320);
        title.setFont(new java.awt.Font("Cambria" , 1, 50));
        this.add (title);



        ventas = new JButton("Modulo Ventas");
        ventas.setBounds(0,160,300,80 );
        ventas.setBackground(Color.darkGray);
        ventas.setForeground(Color.WHITE);
        ventas.setFont(new java.awt.Font("Cambria",1,14));
        ventas.addActionListener(this);
        ventas.setBorderPainted(false);
        ventas.setFocusPainted(false);
        ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ventas.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ventas.setBackground(Color.DARK_GRAY);
            }

        });
        this.add (ventas);



        planilla = new JButton("Modulo Planilla");
        planilla.setBounds(0,240,300,80 );
        planilla.setBackground(Color.darkGray);
        planilla.setForeground(Color.WHITE);
        planilla.setFont(new java.awt.Font("Cambria",1,14));
        planilla.addActionListener(this);
        planilla.setBorderPainted(false);
        planilla.setFocusPainted(false);
        planilla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                planilla.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                planilla.setBackground(Color.DARK_GRAY);
            }

        });
        this.add (planilla);
   }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cliente){

        };

    }
}
