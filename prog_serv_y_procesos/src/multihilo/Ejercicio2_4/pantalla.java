package multihilo.Ejercicio2_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_H1;
	private JTextField textField_H2;
	private List<JButton> btns=new ArrayList<>();
	private MyHilo h1=null,h2=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla frame = new pantalla();
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
	public pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 50, 107, 136);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnReanudarH1 = new JButton("Reanudar");
		btnReanudarH1.setEnabled(false);
		panel.add(btnReanudarH1);
		
		JButton btnPararH1 = new JButton("Suspender");
		btnPararH1.setEnabled(false);
		panel.add(btnPararH1);
		
		textField_H1 = new JTextField();
		textField_H1.setEditable(false);
		panel.add(textField_H1);
		textField_H1.setColumns(10);
		
		JLabel lblH1 = new JLabel("Hilo 1");
		panel.add(lblH1);
		
		JButton btnReanudarHilos = new JButton("Comenzar Proceso");
		btnReanudarHilos.setBounds(131, 16, 167, 23);
		contentPane.add(btnReanudarHilos);
		
		JButton btnPararHilos = new JButton("Finalizar Procesos");
		btnPararHilos.setEnabled(false);
		btnPararHilos.setBounds(131, 197, 167, 23);
		contentPane.add(btnPararHilos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(263, 50, 107, 136);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnReanudarH2 = new JButton("Reanudar");
		btnReanudarH2.setEnabled(false);
		panel_1.add(btnReanudarH2);
		
		JButton btnPararH2 = new JButton("Suspender");
		btnPararH2.setEnabled(false);
		panel_1.add(btnPararH2);
		
		textField_H2 = new JTextField();
		textField_H2.setEditable(false);
		textField_H2.setColumns(10);
		panel_1.add(textField_H2);
		
		JLabel lblH2 = new JLabel("Hilo 2");
		panel_1.add(lblH2);
		
		btns.add(btnReanudarH1);
		btns.add(btnReanudarH2);
		btns.add(btnPararH1);
		btns.add(btnPararH2);
		btns.add(btnPararHilos);
		
		
		btnReanudarHilos.addActionListener((e)->{
			 h1=new MyHilo(textField_H1);
			 h2=new MyHilo(textField_H2);
			
			 h1.start();
			 h2.start();
			
			 btns.forEach(btn->{
				 btn.setEnabled(true);
			 });
			 
			 btnReanudarHilos.setEnabled(false);
		});
		
		
		btnReanudarH1.addActionListener((e)->{
			h1.Reanuda();
		});
		
		btnPararH1.addActionListener((e)->{
			h1.Suspende();
		});
		
		btnReanudarH2.addActionListener((e)->{
			h2.Reanuda();
		});
		
		btnPararH2.addActionListener((e)->{
			h2.Suspende();
		});
		
		btnPararHilos.addActionListener((e)->{
			h1.setFin(true);
			h2.setFin(true);
			
			btns.forEach(btn->{
				 btn.setEnabled(false);
			 });
			 
			 btnReanudarHilos.setEnabled(true);
		});
		

	}
}
