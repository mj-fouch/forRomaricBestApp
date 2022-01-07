package fr.appliSwing.jeremy;

import java.util.ArrayList;

public class Client {
	protected static int nbClient = 0;
	protected String nom;
	protected int telephone;
	protected int secuSocial;
	protected static ArrayList<Client> liste = new ArrayList <Client>();
	public static int nbUsers()
	{
		return nbClient;
	}
	public static ArrayList listClient ()
	{
		return liste;
	}
	public void ajouter(Client arg)
	{
		liste.add(arg);
	}

}
