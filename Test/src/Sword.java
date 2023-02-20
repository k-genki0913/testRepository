
public class Sword implements Cloneable{
	String name;
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
	
}
