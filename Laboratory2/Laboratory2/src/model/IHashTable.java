package model;

import exceptions.HashIsEmptyException;
import exceptions.NonExistentKeyException;

public interface IHashTable<K, V> {

	public void put(K key, V value); 
	
	public void remove(K key) throws HashIsEmptyException, NonExistentKeyException;
	
	public V get(K key);
	
	public int getSize();
	
	public boolean isEmpty(); 
	
 
}
