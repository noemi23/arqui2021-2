import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {
 private int capacidadCafetera= 2000;
 private int aguaPequeñoMl = 150;
 private int aguaMedianoMl = 250;
 private int aguaGrandeMl = 350;
 
 
	
	
	@Test	
    void PrepararCafeNormalConVasoPequeño()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
		
		Cafe cafeNormal = cafetera.prepararCafeNormal(Volumen.VASO_PEQUEÑO);
		int cafeGramos = 10;
		Cafe esperado = new CafeNormal(aguaPequeñoMl,cafeGramos);
		assertEquals(esperado,cafeNormal);		
    }
	
	@Test	
    void PrepararCafeNormalConVasoMediano()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
		Cafe cafeNormal = cafetera.prepararCafeNormal(Volumen.VASO_MEDIANO);
		int cafeGramos = 20;
		Cafe esperado = new CafeNormal(aguaMedianoMl,cafeGramos);
		assertEquals(esperado,cafeNormal);		
    }
	
	@Test	
    void PrepararCafeNormalConVasoGrande()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
		
		Cafe cafeNormal = cafetera.prepararCafeNormal(Volumen.VASO_GRANDE);
		int cafeGramos = 30;
		Cafe esperado = new CafeNormal(aguaGrandeMl,cafeGramos);
		assertEquals(esperado,cafeNormal);		
    }
	
	@Test	
    void PrepararCafeCapuchinoConVasoPequeño()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
		Cafe cafeCapuchino = cafetera.prepararCapuchino(Volumen.VASO_PEQUEÑO);
		int cafeGramos = 10;
		int lecheMl= 100;
		Cafe esperado = new Capuchino(aguaPequeñoMl,cafeGramos,lecheMl);
		assertEquals(esperado,cafeCapuchino);		
    }
	
	@Test	
    void PrepararCafeCapuchinoConVasoMediano()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
		
		Cafe cafeCapuchino = cafetera.prepararCapuchino(Volumen.VASO_MEDIANO);
		int cafeGramos = 10;
		int lecheMl= 200;
		Cafe esperado = new Capuchino(aguaMedianoMl,cafeGramos,lecheMl);
		assertEquals(esperado,cafeCapuchino);		
    }
	
	@Test	
    void PrepararCafeCapuchinoConVasoGrande()
    {
		int capacidadCafetera = 2000;
		Cafetera cafetera= new Cafetera(capacidadCafetera);
	
		Cafe cafeCapuchino = cafetera.prepararCapuchino(Volumen.VASO_GRANDE);
		int cafeGramos = 10;
		int lecheMl= 300;
		Cafe esperado = new Capuchino(aguaGrandeMl,cafeGramos,lecheMl);
		assertEquals(esperado,cafeCapuchino);		
    }
	
	@Test
    void LlenarVasoCon100 () {
		int capacidadCafetera = 2000;
		Cafetera cafetera = new Cafetera(capacidadCafetera);		
		int vaso = 250;//limite vaso ml
		int servido = cafetera.servirCafe(vaso,100);
		int esperado= 1;
		assertEquals(servido,esperado);
	}
	@Test
  void LlenarVasoConLimite () {
		int capacidadCafetera = 2000;
		Cafetera cafetera = new Cafetera(capacidadCafetera);		
		int vaso = 250;
		int servido = cafetera.servirCafe(vaso,250);
		int esperado= 1;
		assertEquals(servido,esperado);
	}
	@Test
  void llenarVasoConLimiteSuperior () {
		int capacidadCafetera = 2000;
		Cafetera cafetera = new Cafetera(capacidadCafetera);
		int vaso = 250;
		int servido = cafetera.servirCafe(vaso,300);
		int esperado= 0;
		assertEquals(esperado,servido);
	}
	
}
