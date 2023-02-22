package PokedeX;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Pokedexv2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pokedexv2 frame = new Pokedexv2();
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
	public Pokedexv2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 555);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PokédeX");
		lblNewLabel.setBounds(0, 0, 786, 54);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBackground(new Color(204, 0, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Pokemon Solid", Font.BOLD, 38));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(28, 103, 250, 248);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\agregar (4).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
			        JFileChooser chooser = new JFileChooser();
			        chooser.showOpenDialog(null);
			        File file = chooser.getSelectedFile();
			        String filename = file.getAbsolutePath();
			        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT));
			        lblNewLabel_1.setIcon(imageIcon);
			    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(28, 397, 46, 47);
		contentPane.add(btnNewButton);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\cruz (1).png"));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnEliminar) {
					 lblNewLabel_1.setIcon(null);
				    }
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(84, 397, 46, 47);
		contentPane.add(btnEliminar);
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon("C:\\Users\\Karim\\Downloads\\disco (1).png"));
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBounds(140, 397, 46, 47);
		contentPane.add(btnEditar);
		
		
	}
}
