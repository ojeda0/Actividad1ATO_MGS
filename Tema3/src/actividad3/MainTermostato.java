package actividad3;

public class MainTermostato {

	public static void main(String[] args) {
		
        Termostato t = new Termostato(15, 30, 20);
        t.encender();
        
        t.bajar(2);
        
        t.setTemperaturaMin(18);

	}

}
