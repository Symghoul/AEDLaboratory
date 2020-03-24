package model;

import exceptions.NonExistentKeyException;

public class NodeHashTable<K , V > {

	/**
	 * Key must be different to other ones
	 */
	private K key; 
	private V value; 
	
	private NodeHashTable<K,V> next;
	private NodeHashTable<K,V> previus; 
	private int size; 
	
	public NodeHashTable(K key, V value) {
		
		this.key = key;
		this.value = value;
		next = null; 
		previus = null; 
		size = 1; 
		
	}
	//Un arreglo de listas

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public NodeHashTable<K, V> getNext() {
		return next;
	}

	public void setNext(NodeHashTable<K, V> next) {
		this.next = next;
	}
	

	public NodeHashTable<K, V> getPrevius() {
		return previus;
	}

	public void setPrevius(NodeHashTable<K, V> previus) {
		this.previus = previus;
	}

	public int getSize() {
		return size;
	}


	public void incrementSize() {
		size++;
	}
	
	public int compareTo() {
		
		return 0;
	}
	
	public void add(NodeHashTable<K, V> agregate) {
		if(next == null) {
			next = agregate;
		}else {
			next.add(agregate);
		}
	}
	
	public void  removeLast() {
		if(next.getNext() == null) {
			next = null;
		}else {
			next.removeLast();
		}
	}
	
	public void incrementSize(int size) {
		this.size += size;

	}
	
	public NodeHashTable<K, V> getObjet(V value) throws NonExistentKeyException{
		if(next != null) {
			if(next.getKey().equals(value)) {
				return next;
			}else {
				return next.getObjet(value);
			}
		}else {
			throw new NonExistentKeyException("");
		}
	}
	
	

	
	
}
