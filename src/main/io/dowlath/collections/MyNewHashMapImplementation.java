package io.dowlath.collections;

public class MyNewHashMapImplementation<K,V> {
	
	private Entry<K,V>[] table;
	private int capacity = 4;
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		Entry(K key,V value,Entry<K,V> next){
			this.key = key;
			this.value = value;
			this.next = next;
		}		
	}
	
	MyNewHashMapImplementation(){
		table = new Entry[capacity];
	}
	
	public void put(K newKey,V value){
		if(newKey == null){
			return;
		}
		int hash = hash(newKey);
		Entry<K,V> newEntry = new Entry<K,V>(newKey,value,null);
		if(table[hash] == null){
			table[hash] = newEntry;			
		}
		else{
			Entry<K,V> previous = null;
			Entry<K,V> current = table[hash];
			while(current !=null){
				if(current.key.equals(newKey)){
					if(previous==null){
						newEntry.next = current.next;
						table[hash].next= newEntry;
						return;
					}
					else{
						 newEntry.next = current.next;
						 previous.next=newEntry;
						 return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}
	
	public V get(K key){
		int hash = hash(key);
		if(table[hash]==null){
			return null;
		}
		else{
			  Entry<K,V> tmp = table[hash];
			  while(tmp != null){
				  if(tmp.key.equals(key)){
					  return tmp.value;
				  }
				  tmp = tmp.next;
			  }	
			  return null;
		}
	}
	
	public boolean remove(K deleteKey){
		int hash = hash(deleteKey);
		if(table[hash] == null){
			return false;
		}
		else{
			  Entry<K,V> previous = null;
			  Entry<K,V> current = table[hash];
			  while(current != null){
				  if(current.key.equals(deleteKey)){
					  if(previous==null){
						  table[hash] = table[hash].next;						  
					  }
					  else{
						  previous.next = current.next;
					  }
				  }
				  previous = current;
				  current = current.next;
			  }
			  
			  return false;
		}  
	}
	
	public void display(){
		for(int i=0 ; i<capacity;i++){
			if( table[i] ==null){
				Entry<K,V> entry = table[i];
				while(entry != null){
					System.out.println(entry.key+"..."+entry.value);
				}
			}
		}
	}
	
	public int hash(K key){
		return Math.abs(key.hashCode() % capacity);
		
	}
}
