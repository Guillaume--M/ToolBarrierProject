package barriere;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

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
		
		_jta.setCaretPosition(_jta.getDocument().getLength());
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
	/*
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
	}*/
	
	/**
	 * @author Bruyère Julien
	 * 
	 */
	public boolean creerFichier(){
		JFileChooser filechoose = new JFileChooser(new File("."));
		
		filechoose.setFileFilter(new FileNameExtensionFilter("Fichiers txt.", "txt"));
		
		if (filechoose.showDialog(filechoose, "Enregistrer") == JFileChooser.APPROVE_OPTION) {
	
			String nomFichier = new String(filechoose.getSelectedFile().toString());
			
			if(!nomFichier.endsWith(".txt")){
				nomFichier = nomFichier + ".txt";
			}
		
			try {
				FileWriter lu = new FileWriter(nomFichier);
				
				BufferedWriter out = new BufferedWriter(lu);
				out.write(getRapport());
				out.write(RapportPaiement.getInstance().getRapportPaiement());
				
				out.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
				
		}
		 
		return true;
	}
	
}
