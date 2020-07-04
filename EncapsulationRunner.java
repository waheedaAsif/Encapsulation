package encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee obj = new Employee();
		Employee obj1 = new Employee ("Waheeda", "Asif", "Agriculture",001,32,4000,25,4.6,true );
		
//		System.out.println(obj1.getFirstName()+" "+ obj1.getLastName()+" "+obj1.getDept());
//		System.out.println(obj1.getId()+" "+obj1.getAge()+" "+obj1.getSalary()+" "+obj1.getRate());
//		System.out.println(obj1.getBounce()); 
//		System.out.println(obj1.getQualified());
	System.out.println("_____________print Seperatlly_________________");
	
		obj1.setFirstName("Sultana");
		obj1.setLastName("Sana");
		obj1.setDept("Computer Science");
		obj1.setId(001);
		obj1.setAge(32);
		obj1.setSalary(12000);
		obj1.setRate(70);
		obj1.setBounce(2.10);
		obj1.setQualified(true);
		
//		System.out.println("First Name: "+ obj1.getFirstName());
//		System.out.println("Last Name: "+obj1.getLastName());
//		System.out.println("Dept: "+obj1.getDept());
//		System.out.println("Id: "+obj1.getId());
//		System.out.println("Age: "+obj1.getAge());
//		System.out.println("Salary: "+obj1.getSalary());
//		System.out.println("Rate: "+obj1.getRate());
//		System.out.println("Bounce: "+obj1.getBounce());
//		System.out.println("Qualified: "+obj1.getQualified());
	}

	
}
