
public class Pocket<E>{
	E data;
	public void put(E data) {
		this.data = data;
	}
	
	public E get() {
		return this.data;
	}
}
