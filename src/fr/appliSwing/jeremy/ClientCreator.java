package fr.appliSwing.jeremy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientCreator  extends JFrame{
	public ClientCreator(String arg) {
		JFrame appli = new JFrame();
		this.setSize(600,600);
		this.setTitle("Users creator");
		JLabel title =  new JLabel("Nous allon créer un "+arg); 
		this.getContentPane().add(title);
		this.setLayout(new FlowLayout());
		JLabel nom = new JLabel("Entré votre nom");
		JTextField nomVal= new JTextField(10);
		JLabel telephone = new JLabel("Entré votre telephone");
		JTextField telephoneVal= new JTextField(10);
		JLabel secu = new JLabel("Entré votre n°securité social");
		JTextField secuVal= new JTextField(10);
		this.getContentPane().add(nom);
		this.getContentPane().add(nomVal);
		this.getContentPane().add(telephone);
		this.getContentPane().add(telephoneVal);
		this.getContentPane().add(secu);
		this.getContentPane().add(secuVal);
		if(arg=="entreprise")
		{
			JLabel representant = new JLabel("Entré le nom de votre représentant");
			JTextField representantVal= new JTextField(10);
			this.getContentPane().add(representant);
			this.getContentPane().add(representantVal);
		}
		JButton submit = new JButton("Créer");
		this.getContentPane().add(submit);
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(arg=="particulier")
				{
					Particulier particulier = new Particulier(nomVal.getText().toString(),
							telephoneVal.getText().toString(),secuVal.getText().toString());
					System.out.println(Client.nbUsers());
				}
			}
			});
	}
}
