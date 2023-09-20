package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {

	Login() {

		setTitle("AUTOMATED TELLER MACHINE");

		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);

	//UTILIZADO PARA APRESENTAR UM TEXTO FIXO AO USUÁRIO
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);

	//UTILIZADO PARA INSERIR UMA CAIXA DE TEXTO
		JTextField cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		add(cardTextField);

		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		
		JTextField pinTextField = new JTextField();
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);
		
	//CAIXA DE TEXTO LOGIN
		JButton login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		add(login);
	
	//CAIXA DE TEXTO PARA LIMPAR
		JButton clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		add(clear);
		
	//CAIXA DE INSCRIÇÃO
		JButton signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		add(signup);
		


		getContentPane().setBackground(Color.WHITE);

		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}

	public static void main(String args[]) {
		new Login();

	}
}
