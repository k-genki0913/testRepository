import java.io.Serializable;
import java.util.Objects;

public class Hero implements Cloneable, Serializable{

	String name;
	int hp, mp;
	Sword sword;
	
	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;
		Hero r = (Hero) o;
		if(!this.name.equals(r.name))return false;
		return true;
	}
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp, this.mp);
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
}
