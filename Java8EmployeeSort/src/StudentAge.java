import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAge {

	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student("Jon", 22, 1001));
		studentlist.add(new Student("Steve", 19, 1003));
		studentlist.add(new Student("Kevin", 23, 1005));
		studentlist.add(new Student("Ron", 20, 1010));
		studentlist.add(new Student("Lucy", 18, 1111));

		List<Student> s = studentlist.stream().sorted((s1, s2) -> s1.getAge() - s2.getAge())
				.collect(Collectors.toList());
		s.forEach(stu -> System.out.println( "ASC Order : " +stu));
		
		List<Student> s1 = studentlist.stream().sorted((s3, s4) -> s4.getAge() - s3.getAge())
				.collect(Collectors.toList());
		s1.forEach(stu1 -> System.out.println("DESC Order : "+stu1));
	}

}
