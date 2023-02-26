package Agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField tipo;
	private JTextField altura;
	private JTable tabla;
	private DefaultTableModel modeloTabla;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 556);
		this.setLocationRelativeTo(null);
		this.setTitle("Pokédex");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PokedeX");
		lblNewLabel.setBounds(0, 0, 1074, 54);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBackground(new Color(239, 3, 3));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Pokemon Solid", Font.BOLD, 35));
		contentPane.add(lblNewLabel);
		
		JLabel imageLabel1 = new JLabel("");
	    imageLabel1.setBounds(813, 162, 200, 200);
	    contentPane.add(imageLabel1);
		
		JButton guardar = new JButton("");
		guardar.setMargin(getInsets());
		guardar.setBorderPainted(false);
		guardar.setBorder(null);
		guardar.setFocusPainted(false);
		guardar.setContentAreaFilled(false);
		guardar.setBackground(UIManager.getColor(""));
		guardar.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\salvar__1_-removebg-preview (1).png"));
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreContacto = nombre.getText();
		        String telefonoContacto = tipo.getText();
		        String correoContacto = altura.getText();

		        // Agregar una nueva fila a la tabla con los valores ingresados
		        Object[] fila = {nombreContacto, telefonoContacto, correoContacto};
		        modeloTabla.addRow(fila);

		        // Limpiar los campos de texto después de agregar el contacto
		        nombre.setText("");
		        tipo.setText("");
		        altura.setText("");
			}
		});
		
		guardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		guardar.setBounds(687, 64, 60, 60);
		contentPane.add(guardar);
		
		JButton eliminar = new JButton("");
		eliminar.setMargin(getInsets());
		eliminar.setBorderPainted(false);
		eliminar.setBorder(null);
		eliminar.setFocusPainted(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setBackground(UIManager.getColor(""));
		eliminar.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\eliminar (1) (1).png"));
		eliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int filaSeleccionada = tabla.getSelectedRow();
		        if (filaSeleccionada >= 0) {
		            modeloTabla.removeRow(filaSeleccionada);
		        } if (e.getSource() == eliminar) {
		        	imageLabel1.setIcon(null);
			    }
		    }
		});
		eliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		eliminar.setBounds(687, 142, 60, 60);
		contentPane.add(eliminar);
		
		nombre = new JTextField();
		nombre.setBounds(321, 64, 310, 34);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		tipo = new JTextField();
		tipo.setColumns(10);
		tipo.setBounds(321, 106, 310, 35);
		contentPane.add(tipo);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(321, 151, 310, 34);
		contentPane.add(altura);
		
		modeloTabla = new DefaultTableModel();
	    modeloTabla.addColumn("Nombre");
	    modeloTabla.addColumn("Tipo");
	    modeloTabla.addColumn("Altura");

	    // Crear la tabla con el modelo personalizado
	    tabla = new JTable(modeloTabla);
	    tabla.setBackground(new Color(192, 192, 192));
	    tabla.setBounds(10, 213, 737, 273);
	    contentPane.add(tabla);
	    
	    JTableHeader header = tabla.getTableHeader();
	    header.setBackground(SystemColor.menu);
	    header.setForeground(Color.WHITE);
	    header.setFont(new Font("Tahoma", Font.BOLD, 14));
	    header.setReorderingAllowed(false);
	    tabla.setTableHeader(header);
	    
	    JLabel lblNewLabel_1 = new JLabel("NOMBRE");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_1.setBackground(new Color(192, 192, 192));
	    lblNewLabel_1.setBounds(10, 188, 96, 29);
	    contentPane.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_1_1 = new JLabel("TIPO");
	    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_1_1.setBackground(Color.LIGHT_GRAY);
	    lblNewLabel_1_1.setBounds(266, 190, 89, 24);
	    contentPane.add(lblNewLabel_1_1);
	    
	    JLabel lblNewLabel_1_2 = new JLabel("ALTURA");
	    lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_1_2.setBackground(Color.LIGHT_GRAY);
	    lblNewLabel_1_2.setBounds(520, 190, 89, 24);
	    contentPane.add(lblNewLabel_1_2);
	    
	    JLabel lblNewLabel_2 = new JLabel("Nombre :");
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_2.setBounds(138, 64, 166, 34);
	    contentPane.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Tipo :");
	    lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_2_1.setBounds(138, 108, 177, 34);
	    contentPane.add(lblNewLabel_2_1);
	    
	    JLabel lblNewLabel_2_2 = new JLabel("Altura :");
	    lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_2_2.setBounds(138, 151, 166, 34);
	    contentPane.add(lblNewLabel_2_2);
	    
	    JLabel imageLabel;
	    
	    JButton btnNewButton = new JButton("");
	    btnNewButton.setMargin(getInsets());
	    btnNewButton.setBorderPainted(false);
	    btnNewButton.setBorder(null);
	    btnNewButton.setFocusPainted(false);
	    btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setBackground(UIManager.getColor(""));
	    btnNewButton.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\anadir__1_-removebg-preview (1).png"));
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (e.getSource() == btnNewButton) {
			        JFileChooser chooser = new JFileChooser();
			        chooser.showOpenDialog(null);
			        File file = chooser.getSelectedFile();
			        String filename = file.getAbsolutePath();
			        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(imageLabel1.getWidth(), imageLabel1.getHeight(), Image.SCALE_DEFAULT));
			        imageLabel1.setIcon(imageIcon);
			        
			        try {
			        	BufferedImage originalImage = ImageIO.read(file);
			        	
			        	int width = 200;
			        	int height = 200;
			        	
			        	Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			        	
			        	ImageIcon imageIcon1 = new ImageIcon(resizedImage);
			        	
			        	imageLabel1.setIcon(imageIcon1);
			        } catch (IOException ex) {
			        	ex.printStackTrace();
			        }
			    }
	    		
	    		
	    	}
	    });
	    btnNewButton.setBounds(27, 92, 60, 60);
	    contentPane.add(btnNewButton);
	    	    
	    
	}
}
