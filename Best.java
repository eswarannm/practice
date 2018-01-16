class Best {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		String str = "";

		for (int i=0; i<y; i++){
			str = str + "!";
		}

		for (int i=0; i<x; i++) {
			System.out.println("YOU'RE THE BEST" + str);
		}
	}
}