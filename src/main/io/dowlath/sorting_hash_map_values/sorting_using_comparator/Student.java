package src.main.io.dowlath.sorting_hash_map_values.sorting_using_comparator;

public class Student {
	private int studentId;
	private String fName;
	private String lName;
	public Student(int studentId, String fName, String lName) {
		super();
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + "]";
	}

}
