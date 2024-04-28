package io.dowlath.object_clone;

public class EmployeeClone implements Cloneable{
       private int eId;
       private String eName;
	public EmployeeClone(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}       
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "EmployeeClone [eId=" + eId + ", eName=" + eName + "]";
	}
	
	
}
