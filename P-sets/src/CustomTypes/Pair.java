package CustomTypes;

public class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<Pair<K, V>> {
	K k;
	V v;

	public Pair(K k, V v) {
		this.k = k;
		this.v = v;
	}

	@Override
	public int compareTo(Pair<K, V> o) {
		// TODO Auto-generated method stub
		return this.compareTo(o);
	}

	@Override
	public String toString() {
		return "(" + k.toString() + ", " + v.toString() + ")";
	}
	
	@Override
	public int hashCode() {
		return (k.toString()+v.toString()).hashCode();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object o) {
		Pair<K, V> other = (Pair<K, V>) o;
		return (this.k.equals(other.k) && this.v.equals(other.v));
	}
}