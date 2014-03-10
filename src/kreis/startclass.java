package kreis;
import static java.lang.System.out;

public class startclass 
{

	public static void main(String[] args) 
	{
		kreis k1;
		
		k1= new kreis();
		
		
		k1.setradius(20);
		
		out.println("Ergebnis");
		out.println("Ihr radius: " + k1.getradius());
		out.println("Ihr Flächeninhalt: "+ k1.berechneflaecheninhalt());
		out.println("Ihr Umfang: "+ k1.berechneumfang());
	}

}
