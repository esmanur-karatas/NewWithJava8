import java.io.Serializable;

public class Student implements Serializable {
	
		private int number;
		private String name;
		private int gradeAverage;
		
		public Student() {
			
		}
		
		public Student(int number, String name, int gradeAverage) {
			this.number = number;
			this.name = name;
			this.gradeAverage = gradeAverage;
		}
		
		public int getNumber() {
			return number;
		}
		
		public void setNumber( int number) {
			this.number = number;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getGradeAverage() {
			return gradeAverage;
		}
		
		public void setGradeAverage(int gradeAverage) {
			this.gradeAverage = gradeAverage;
		}
		
		@Override
		public int hashCode() {
			return number;
		}
		
		@Override
		public boolean equals(Object object) {
			Student student = (Student) object;
			return this.number == student.number;
		}
		
		@Override
		public String toString() {
			return "NUMARA: " + number + "\tİSİM: " + name + "\tNOT ORTALAMASI: " + gradeAverage;
		}

	}


