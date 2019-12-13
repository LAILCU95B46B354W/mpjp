package s049;

public class AboutString {
	public static void main(String[] args) {
		String s = "hello";
		String t = "world";
		String u = "or";
		System.out.println("s, t, u: " + s + ", " + t + ", " + u);

		System.out.println("char at position 1 in s: " + s.charAt(1));

		System.out.println("s < t: " + s.compareTo(t));
		System.out.println("t > s: " + t.compareTo(s));

		System.out.println("concat s and t: " + s.concat(t)); // stringa s + . + concat + stringa t

		System.out.println("t contains u? " + t.contains(u)); // la stringa t contiene la stringa u -> or sta
																// all'interno di wORld

		String u2 = t.substring(1, 3);
		System.out.println("u2 = t.substring(1, 3): " + u2); // beginn-end: comincia in un punto dell'indice e finisce
																// in un altro punto di i
		System.out.println("t.substring(3): " + t.substring(3));

		System.out.println("u equals u2? " + u.equals(u2));
		System.out.println("u == u2? " + (u == u2)); // comparazione: bisogna però stare attenti a non comparare due
														// indirizzi diversi

		System.out.println("First index of 'l' is s: " + s.indexOf('l')); // palla : ritorna la l che ha come indice 2
		System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); // palla: ritorna la l che ha come indice 3

		System.out.println("there is no 'x' in s: " + s.indexOf('x'));
		System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
		System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

		System.out.println("check if an empty string is empty: " + "".isEmpty());

		System.out.println("s length: " + s.length());

		String s2 = s.replace('l', 'q');
		System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

		String[] splits = "one for me, one for you".split(" "); // suddivide una stringa (partendo dagli spazi presenti
																// in essa) e si creano tante nuove stringhe quante sono
																// le parole della stringa iniziale
		System.out.println("Splitting: ");
		for (String token : splits) {
			System.out.println(token);
		}
		String joined = String.join(" ", splits);
		System.out.println("Joining back [" + joined + "]");

		System.out.println("upper: " + s.toUpperCase()); // viene creata una COPIA in maiuscolo della parola, ma la
															// parola originale non viene modificata
		System.out.println("lower: " + "SHUT UP!".toLowerCase()); // viene fatto lo stesso ma la parola è convertita in
																	// caratteri minuscoli

		System.out.println("trim [" + " la la la ".trim() + "]");

		String x = null;
		System.out.println("Sort of safe toString(): " + String.valueOf(x));
	}
}
