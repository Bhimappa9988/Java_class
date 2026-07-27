class Test {
	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		int res = t1.add(10, 20);
		System.out.println(res);
	}
}