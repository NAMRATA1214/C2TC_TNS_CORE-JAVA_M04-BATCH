package programs_practice;

class Teacher{
	void teach() {
		System.out.println("Teaching Students");
	}
}

class Students extends Teacher{
	void listen() {
		System.out.println("Listening to teacher");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Students s=new Students();
		s.teach();
		s.listen();
	}

}
