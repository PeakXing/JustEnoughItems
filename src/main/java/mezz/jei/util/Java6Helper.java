package mezz.jei.util;

/**
 * Some useful Java library methods are only available in Java 7 so I copy them here.
 */
public class Java6Helper {
	public static boolean equals(Object a, Object b) {
		return (a == b) || (a != null && a.equals(b));
	}

	public static int compare(int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
}
