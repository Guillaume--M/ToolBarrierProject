package barriere;


import java.util.Vector;

import javax.swing.JTextArea;

public final class GestionnaireAlarme {
	public static Vector<Alarme> _la = new Vector<Alarme>();
	public static JTextArea _jta = new JTextArea();
	
	GestionnaireAlarme(){
	}
	
	public static void ajouterAlarme(Alarme a){
		_la.add(a);
		_jta.append("\n"+a._type + a._message);
		
		_jta.setCaretPosition(_jta.getDocument().getLength());
	}
	
	void retirerAlarme(int i){
		_la.remove(i);
	}
}