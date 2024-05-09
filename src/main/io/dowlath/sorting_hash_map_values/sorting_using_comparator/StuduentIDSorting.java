package src.main.io.dowlath.sorting_hash_map_values.sorting_using_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StuduentIDSorting {
	public static void main(String args[]){
		Student stu1 = new Student(109,"Dowlath","Basha");
		Student stu2 = new Student(19,"Arsh","Dowlath");
		Student stu3 = new Student(200,"Naveeda","Zamani");
		Student stu4 = new Student(500,"Kishore","Kumar");
		Student stu5 = new Student(9,"Dowlath","Basha");
		//List<Student> list = new ArrayList<Student>();
		List list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		System.out.println("Before sorting.... : "+list);
		//System.out.println("\n");
		Collections.sort(list,new StduentIdComparator());
		System.out.println("After sorting.... : "+list);
	}

}

class StduentIdComparator implements Comparator<Student>{
	public int compare(Student st1,Student st2){
		return st1.getStudentId()-st2.getStudentId();
	}
	
}