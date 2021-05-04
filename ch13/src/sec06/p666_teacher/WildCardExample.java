package sec06.p666_teacher;

import java.util.Arrays;

public class WildCardExample {
	   public static void main(String[] args) {
		   Course<Person> personCourse = new Course<Person>("일반인과정", 5);
	       personCourse.add(new Person("홍길동(일반인)"));
	       personCourse.add(new Worker("이순신(직장인)"));
	       personCourse.add(new Student("강감찬(학생)"));
	       personCourse.add(new HighStudent("김유신(고등학생)"));
	         
	       Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
	       workerCourse.add(new Worker("이순신(직장인)"));
	         
	       Course<Student> studentCourse = new Course<Student>("학생과정", 5);
	       studentCourse.add(new Student("강감찬(학생)"));
	       studentCourse.add(new HighStudent("김유신(고등학생)"));
	         
	       Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
	       highStudentCourse.add(new HighStudent("김유신(고등학생)"));   
	      
	       RegisterCourse.registerCourse(personCourse);
	       RegisterCourse.registerCourse(workerCourse);
	       RegisterCourse.registerCourse(studentCourse);
	       RegisterCourse.registerCourse(highStudentCourse);
	       System.out.println();
	      
	       //RegisterCourse.registerCourseStudent(personCourse);       //   (x)
	       //RegisterCourse.registerCourseStudent(workerCourse);       //   (x)
	       RegisterCourse.registerCourseStudent(studentCourse);
	       RegisterCourse.registerCourseStudent(highStudentCourse);   
	       System.out.println();
	      
	       //RegisterCourse.registerCourseWorker(personCourse);
	       RegisterCourse.registerCourseWorker(workerCourse);
	       //RegisterCourse.registerCourseWorker(studentCourse);          (x)
	       //RegisterCourse.registerCourseWorker(highStudentCourse);       (x)
	      
	      
	       //오류가 발생되는 이유를 찾아보세요..
	       RegisterCourse.registerCourseStudent(personCourse);       //(오류)
	       RegisterCourse.registerCourseStudent(workerCourse);       //(오류)
	       RegisterCourse.registerCourseStudent(studentCourse);
	       RegisterCourse.registerCourseStudent(highStudentCourse);   
	       System.out.println();
	      
	       RegisterCourse.registerCourseWorker(personCourse);          //(오류)
	       RegisterCourse.registerCourseWorker(workerCourse);
	       RegisterCourse.registerCourseWorker(studentCourse);       //(오류)
	       RegisterCourse.registerCourseWorker(highStudentCourse);    //(오류)
	   }
	   
	   
//	   public static void registerCourse(Course<?> course) {
//	      System.out.println(course.getName() + " 수강생: " + 
//	            Arrays.toString(course.getStudents()));
//	    }
//	   
//	   public static void registerCourseStudent(Course<? extends Student> course) {
//	      System.out.println(course.getName() + " 수강생: " + 
//	            Arrays.toString(course.getStudents()) );
//	    }
//	   
//	   public static void registerCourseWorker(Course<? super Worker> course) {
//	      System.out.println(course.getName() + " 수강생: " + 
//	            Arrays.toString(course.getStudents()));
//	   }
	   	
}