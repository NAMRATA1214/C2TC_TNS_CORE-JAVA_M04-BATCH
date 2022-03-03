package programs_practice;

class Teachers{
	void teach() {
		System.out.println("Teaching Subjects");
	}
}

class Student extends Teachers{
	void listen() {
		System.out.println("Listening to Teacher");
	}
}

class Principal extends Teachers{
	void evaluate() {
		System.out.println("Evaluating");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Principal p =new Principal();
		p.teach();
		p.evaluate();
		// produce an error  -- p.listen(); 
	}

}
