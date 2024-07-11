package multilevel_inheritance;

public class MainClass {
	public static void main(String[] args) {
		Department d=new Department();
		System.out.println("university name:"+d.universityName);
		System.out.println("college name:"+d.collegeName);
		System.out.println("department name:"+d.deptName);
		System.out.println(".....................................");
		d.conductExams();
		d.providePlacements();
		d.fest();
	}

}
