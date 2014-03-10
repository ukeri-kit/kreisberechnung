package kreis;
import java.lang.Math;


public class kreis 
{

	private double radius;
	private double umfang;
	private double flaecheninhalt;
	private double pi = Math.PI;
	
	public void setradius(double radius) 
	{
		this.radius = radius;
	}
	
	
	public double getradius() 
	{
		return radius;
	}
	
	
	public double berechneumfang()
	{
		umfang = 2*pi*this.radius;
		return umfang;
	}
	
	public double berechneflaecheninhalt()
	{
		flaecheninhalt = pi*(radius*radius);
		return flaecheninhalt;
	}
	
}
