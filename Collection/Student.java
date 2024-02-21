import java.util.*;
class Student implements  Comparable {
		String name;
		int id;
		public Student(String name, int id) {
			this.name = name;
			this.id = id;

		}
		public int compareTo(Object obj) {
			Student s = (Student)obj;
			return -(this.id-s.id); // depend id accending decending 
		}
		public String toString() {
			return name+" "+id;
	}
}