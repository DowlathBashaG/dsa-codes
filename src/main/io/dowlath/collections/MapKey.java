package io.dowlath.collections;

public class MapKey{
	private Object key1;
	private Object key2;
	public Object getKey1() {
		return key1;
	}
	public void setKey1(Object key1) {
		this.key1 = key1;
	}
	public Object getKey2() {
		return key2;
	}
	public void setKey2(Object key2) {
		this.key2 = key2;
	}
	public boolean equals(Object obj){
		if(((MapKey)obj).key1 == null && ((MapKey)obj).key2 == null)
			return true;
		if(((MapKey)obj).key1 == null && ((MapKey)obj).key2.equals(this.key2))
			return true;
		if(((MapKey)obj).key1.equals(this.key1) && ((MapKey)obj).key2 == null)
			return true;
		if(((MapKey)obj).key1.equals(this.key1) && ((MapKey)obj).key2.equals(this.key2))
			return true;
		else{
			return false;
		}
	}
	public int hashCode(){
		int hashCode = this.key1 == null ? 0 : key1.hashCode();
		hashCode = hashCode+ (this.key2 == null ? 0: key2.hashCode());
		return hashCode;
	}
}
