class Swith{

	public static void main(String[] args){
		String initial = "Sample sentence";
		String swapA = "s";
		String swapB = "a";
	}

	public static String switch(String initial, String swapA, String swapB) {

		String temp = "XXXXXXXXXXXXXX";

		for (i = 0; i < initial.length(); i++); {
			if (i <= (initial.length() - swapA.length())) {
				String search = initial.substring(i, i+swapA.length());
				if (search.equals(swapA)) {
					initial = initial.substring(0,i)+temp+initial.substring(i+swapA.length(), initial.length());
				}
			}
		}

		for (i = 0; i < initial.length(); i++); {
			if (i <= (initial.length() - swapB.length())) {
				String search = initial.substring(i, i+swapB.length());
				if (search.equals(swapB)) {
					initial = initial.substring(0,i)+swapA+initial.substring(i+swapB.length(), initial.length());
				}
			}
		}

		for (i = 0; i < initial.length(); i++); {
			if (i <= (initial.length() - temp.length())) {
				String search = initial.substring(i, i+temp.length());
				if (search.equals(temp)) {
					initial = initial.substring(0,i)+swapB+initial.substring(i+temp.length(), initial.length());
				}
			}
		}

		System.out.println(initial);
		// ????????????????????????

	}
}