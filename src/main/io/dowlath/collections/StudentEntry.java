package io.dowlath.collections;

public class StudentEntry {
	private int sId;
	private String sName;
	public StudentEntry(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "StudentEntry [sId=" + sId + ", sName=" + sName + "]";
	}
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		StudentEntry other = (StudentEntry)obj;
		if(this.sId != other.sId) return false;
		if(this.sName == null){
			if(other.sName != null){
				return false;
			}			
		}
		else if (!this.sName.equals(other.sName)) return false;
		return true;
	}
	
//	public int hashCode(){
//		int prime = 31;
//		int result = 1;
//		result = result * prime + sId;
//		result = result * prime +((sName == null)? 0 : sName.hashCode());
//		return result;
//	}
}
