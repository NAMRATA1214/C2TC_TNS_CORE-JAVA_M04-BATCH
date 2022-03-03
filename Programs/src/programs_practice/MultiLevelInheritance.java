package programs_practice;

class Maam{
	void teach() {
		System.out.println("Teaching Subjects");
	}
}

class Studnts extends Maam{
	void listen() {
		System.out.println("Listening to teacher");
	}
}

class hometution extends Studnts{
	void explains() {
		System.out.println("Does Homework");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Studnts s=new Studnts();
		s.teach();
		s.listen();
		hometution h=new hometution();
		h.explains();
		
	}

}
