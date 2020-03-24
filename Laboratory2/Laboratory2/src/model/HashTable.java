package model;

import exceptions.HashIsEmptyException;
import exceptions.NonExistentKeyException;

public class HashTable<K extends String ,V  > implements IHashTable<K, V> {

	

	private NodeHashTable<K, V>[] list;
 
	private int size; 
 
	
	@SuppressWarnings("unchecked")
	public HashTable() {
		this.size = 1;
		list = new NodeHashTable[10];
		
	}
		

	public void put(K key, V value) {
		
		int index = hashFuntion(key);
		NodeHashTable<K, V> nodeAdd = new NodeHashTable<K, V>(key, value);

		if(list[index]!= null) {
			list[index].add(nodeAdd);
			
		}else {
			list[index] = nodeAdd;
			size++;
		}
		
		
	}

	public void remove(K key) throws HashIsEmptyException, NonExistentKeyException {
		
		int index = hashFuntion(key);
		
		if(isEmpty() == true) {
			throw new HashIsEmptyException("");
		}else {
			if(list[index] == null) {
				throw new NonExistentKeyException("");
			}else {
				if(list[index].getNext() == null) {
					list[index] = null;
					size--; 
				}else {
					list[index].removeLast(); 
				}
			}
		}
			
	}
	
	public NodeHashTable<K, V> getObjet(K key, V value) throws NonExistentKeyException{
		
		int index = hashFuntion(key);
		
		if(list[index]== null) {
			throw new NonExistentKeyException("the object whit the key: "+ key + " non Exist" );
		}else if(list[index].getNext() == null && list[index].getKey().equals(key)) {
			return list[index];
		}else if(list[index].getNext() != null && list[index].getKey().equals(key)) {
			return list[index];
		}
		else {
			return list[index].getObjet(value);
		}
		
	}

	public V get(K key) {
		int index = hashFuntion(key); 
		return list[index].getValue(); 

	}
	
	public int getSize() {
		return size;
		
	}

	public boolean isEmpty() {
		return size == 0;
		
	}

	public int hashFuntion(K key) {
		int index = key.hashCode();

		if(index > 10) {
			index = key.hashCode()%10;
		}else if (index < 1 ) {
			index = key.hashCode()*10;
		}
		
		return index + 1;
	}
	
	
	
	
}
