package barriere;
import types.TypeAlarme;

public class Alarme {
	TypeAlarme _type;
	String _message = "";
	
	public Alarme(TypeAlarme t,String str){
		_type = t;
		_message = str;
	}
	
	
}
