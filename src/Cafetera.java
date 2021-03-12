
public class Cafetera {

	public int limiteVaso=250; //mililitros
	      private int capacidadActual;
	      private int capacidadActualCafe;
	      private int capacidadActualLeche;
	  public Cafetera(int capacidadLitros) {
		   capacidadActual= capacidadLitros;
		   // capacidadActualCafe= cantidadCafe;
		    //capacidadActualLeche= cantidadLeche;
		}
	
	  public int servirCafe(int vaso, int cantidad) 
	  {
		  if ( vaso >= cantidad ) 
		  {
			  return 1;
		  }else if(cantidad>vaso) {
			  return 0;
		  }
		  return 0;
	  }

	public Cafe prepararCafeNormal(int volumenVaso) {
		Cafe cafe = null;
		switch (volumenVaso)
		{
		case Volumen.VASO_PEQUEÑO: {
			cafe = new CafeNormal(150,10);
			break;
			}
		case Volumen.VASO_MEDIANO: {
			cafe = new CafeNormal(250,20);
			break;}
		case Volumen.VASO_GRANDE: {
			cafe = new CafeNormal(350,30);
			break;}
		}
		
		return cafe;
	}

	public Cafe prepararCapuchino(int vASO_PEQUEÑO) {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
	  
}
	



