package encapsulation;

public class Employee {

	
	 private String firstName;
	 private String lastName;
	 private String dept;
	 private int id;
	 private int age;
	 private int salary;
	 private int rate;
	 private double bounce;
     private boolean qualified;
     
  // default Constructer
 public Employee() {
	 
	 System.out.println("Default Constractor");
	  
 }
 // Parameterized Constructer method
 public Employee(String firstName, String lastName, String dept, int id, int age, int salary,
		 int rate, double bounce,boolean qualified) {
	 
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.dept = dept;
	 this.id = id;
	 this.age = age;
	 this.salary = salary;
	 this.rate = rate;
	 this.bounce = bounce;
	 this.qualified = qualified;
	 System.out.println("parametarized Constructor");
 }
 
  // Setter
 public void setFirstName(String firstName) {
	 this.firstName = firstName;
 }
 public void setLastName(String lastName) {
	 this.lastName = lastName;
 }
 public void setDept(String dept) {
     this.dept = dept;
 }
 public void setId(int id) {
	 this.id = id;
 }
 public void setAge(int age) {
	 this.age = age;
 }
 public void setSalary(int salary) {
	 this.salary = salary;
 }
 public void setRate(int rate) {
	 this.rate = rate;
 }
 public void setBounce(double bounce) {
	 this.bounce = bounce;
 }
 public void setQualified(boolean qualified) {
     this.qualified = qualified;
}
 // getter
 public String getFirstName() {
	 return firstName;	 
 }
 public String getLastName() {
	 return lastName;
 }
 public String getDept() {
	 return dept;
 }
 public int getId() {
	 return id; 
 }
 public int getAge() {
	 return age;
 }
 public int getSalary() {
	 return salary;
}
 public int getRate() {
	 return rate;
 }
 public double getBounce() {
	 return bounce;
 }
 public boolean getQualified() {
	 return qualified;
 }








}


