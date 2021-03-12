
public class Cafe {

	
	protected  int cantidadAgua;
	protected  int cantidadCafe;
	public Cafe(int agua, int cafeGramos) {
		cantidadAgua = agua;
		cantidadCafe = cafeGramos;
	}
	public int getCantidadAgua() {
		return cantidadAgua;
	}
	
	public int getCantidadCafe() {
		return cantidadCafe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadAgua;
		result = prime * result + cantidadCafe;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cafe other = (Cafe) obj;
		if (cantidadAgua != other.cantidadAgua)
			return false;
		if (cantidadCafe != other.cantidadCafe)
			return false;
		return true;
	}
	
	
}
