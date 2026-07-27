class Emp {
	String name;

	void setName(String n) {
		this.name = n;
	}

	String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setName("Vasanth");
		System.out.println(e1.getName());
	}
}
