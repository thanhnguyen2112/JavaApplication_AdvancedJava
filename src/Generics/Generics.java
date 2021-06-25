package Generics;

import java.util.Iterator;

public class Generics<T> implements Iterable<T> {
	private final T[] items = (T[]) new Object[10];
	private int count;
	
	public void add (T item) {
		items[count++] = item;
	}
	
	public T get(int index) {
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new listIterator(this) ;
	}
	
	private class listIterator implements Iterator<T>{
		
		Generics<T> list;
		
		private int index;
		
		public listIterator(Generics<T> list) {
			super();
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < list.count;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return list.items[index++];
		}
		
	}
}
