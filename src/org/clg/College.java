package org.clg;

public class College extends Dept {
	
	private void collegeName() {
	       System.out.println("Colloge Name : SCET");
		}
		private void collegeCode() {
	       System.out.println("Colloge Code : 6224");
		}
		private void collegeRank() {
	       System.out.println("Colloge Rank : 52");
		}
		public static void main(String[] args) {
			College c= new College();
			c.collegeName();
			c.collegeCode();
			c.collegeRank();
			c.deptName();
			c.studentName();
			c.studentDept();
			c.studentId();
			c.hostelName();
			
		}
}
