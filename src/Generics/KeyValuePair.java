package Generics;

public class KeyValuePair<K, V> {
	private K key;
	private V value;

	public KeyValuePair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "KeyValuePair [key=" + key + ", value=" + value + "]";
	}
	
	
}
