class My {
	public static void display() {
	}
}

class You {
	public static void display() {
	}
}

public class MainClass {
	public static void main(String[] args) {
		My.display();
		You.display();
		My m = new My();
		m.display();
		You y = new You();
		y.display();
		new You().display();
		My.display();
	}
}