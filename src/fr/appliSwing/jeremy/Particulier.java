package fr.appliSwing.jeremy;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Particulier extends Client {
	public Particulier(String nomArg,String telephoneArg,String secuArg)
	{
		super.nbClient = super.nbClient+1;
		super.nom = nomArg;
		super.telephone= Integer.parseInt(secuArg);
		super.secuSocial= Integer.parseInt(secuArg);
	}
}
