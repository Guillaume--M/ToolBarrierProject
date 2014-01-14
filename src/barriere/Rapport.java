package barriere;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public final class Rapport {
	private static Rapport _instance = new Rapport();
	private Vector<String> _tableau;
	public static JTextArea _jta = new JTextArea();
	
	private Rapport(){
		_tableau = new Vector<String>();
	}
	
	public static Rapport getInstance(){
		return _instance;
	}
	
	public void ajouterLigne(String l){
		_tableau.add(l+"\n");
		_jta.append(l+"\n");
	}
	
	/*
	public String getDerniereLigne(){
		return _tableau.lastElement();
	}
	*/
	
	public String getRapport(){
		String message = "";
		Iterator<String> it = _tableau.iterator();
		while(it.hasNext()){
			message += it.next()+ "\n";
		}
		return message;
	}

	public static void ajouterObservateur(JTextArea jta) {
		_jta = jta;
	}
	
	public boolean creerFichier(){
		File f = new File ("rapport.txt");
		 
		try{
		    PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (f)));
		    pw.println (getRapport());
		    pw.println(RapportPaiement.getInstance().getRapportPaiement());
		    pw.close();
		}
		catch (IOException exception){
			System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
			return false;
		}
		return true;
	}
	
}
