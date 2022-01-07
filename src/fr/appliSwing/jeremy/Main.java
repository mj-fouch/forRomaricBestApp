package fr.appliSwing.jeremy;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private Object entreprise;

	public static void main(String[] args) {
		JFrame appli = new JFrame();
		appli.setTitle("appli");
		appli.setSize(600,600);
		appli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menu = new JMenuBar();
		JMenu creer = new JMenu("Créer un compte");	
		JMenu quitter = new JMenu("quitter");
		JMenu transation = new JMenu("transaction");
		JMenuItem particulier = new JMenuItem("Particulier");
		JMenuItem entreprise = new JMenuItem("Entreprise");
		menu.add(creer);
		creer.add(particulier);
		menu.add(transation);
		menu.add(quitter);
		creer.add(entreprise);
		appli.setJMenuBar(menu);
		appli.setLayout(new FlowLayout());
		JLabel titleList =  new JLabel("Voici la liste des "+Client.nbUsers()+" utilisateur"); 
		particulier.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientCreator openWindos = new ClientCreator("particulier");
				openWindos.setVisible(true);
			}
		});
		entreprise.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientCreator openWindos = new ClientCreator("entreprise");
				openWindos.setVisible(true);
			}
		});
		appli.getContentPane().add(titleList);
		
		appli.setVisible(true);
	}

}
