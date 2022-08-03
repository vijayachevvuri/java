import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
				Set<String> ts = new TreeSet<>();

				ts.add("vijaya");
				ts.add("lohitha");
				ts.add("Priyanka");
				ts.add("lavanya");
				ts.add("lalitha");
				ts.add("surekha");

				for (String value : ts)

					System.out.print( value + "  ");

				System.out.println();
			}
	
	}
