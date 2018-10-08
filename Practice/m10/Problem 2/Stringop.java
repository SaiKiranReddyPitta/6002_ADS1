class Stringop {
	public String check(String str) {
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + check(str.substring(1));
		}
		return str.charAt(0) + check(str.substring(1));

	}
}