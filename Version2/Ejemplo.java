
import java.io.File;

public class Ejemplo {
	public static void main(String[] args) {
		Ejemplo p = new Ejemplo();
		p.start();
		// p.start2();
	}

	/**
	 * Construct a DOT graph in memory, convert it to image and store the image in
	 * the file system.
	 */
	private void start() {
		GraphViz gv = new GraphViz();
		gv.addln(gv.start_graph());

		String automata = (
		"node [shape=circle];\n"+
		"node [style=filled];\n"+
		"node [fillcolor=\"#EEEEEE\"];\n"+
		"node [color=\"#EEEEEE\"];\n"+
		"edge [color=\"#31CEF0\"];\n"+
		"A -> B [label=\"1\"];\n"+
		"A -> C [label=\"3\"];\n"+
		"A -> E [label=\"2\"];\n"+
		"B -> D [label=\"4\"];\n"+
		"B -> E [label=\"5\"];\n"+
		"C -> E [label=\"8\"];\n"+
		"C -> F [label=\"9\"];\n"+
		"E -> G [label=\"6\"];\n"+
		"E -> H [label=\"7\"];\n"+
		"D -> G [label=\"10\"];\n"+
		"F -> H [label=\"11\"];\n"+
		"G -> I [label=\"12\"];\n"+
		"H -> I [label=\"13\"];\n"+
		"rankdir=LR;\n");
	   
		gv.add(automata);

		/* O uno por uno
		gv.addln("A -> B;");
		gv.addln("A -> C;");
		gv.addln("B -> A;");
		*/
		gv.addln(gv.end_graph());
		System.out.println(gv.getDotSource());

		gv.increaseDpi(); // 106 dpi

		// String type = "gif";
		// String type = "dot";
		// String type = "fig"; // open with xfig
		// String type = "pdf";
		// String type = "ps";
		// String type = "svg"; // open with inkscape
		String type = "png";
		// String type = "plain";

		String repesentationType = "dot";
		// String repesentationType= "neato";
		// String repesentationType= "fdp";
		// String repesentationType= "sfdp";
		// String repesentationType= "twopi";
		// String repesentationType= "circo";

		// File out = new File("/tmp/out"+gv.getImageDpi()+"."+ type); // Linux
		File out = new File("C:/Users/Tapia/Desktop/out." + type); // Windows
		gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, repesentationType), out);
	}

	/**
	 * Read the DOT source from a file, convert to image and store the image in the
	 * file system.
	 */
	private void start2() {
		String dir = "/home/jabba/Dropbox/git.projects/laszlo.own/graphviz-java-api"; // Linux
		String input = dir + "/sample/simple.dot";
		// String input = "c:/eclipse.ws/graphviz-java-api/sample/simple.dot"; //
		// Windows

		GraphViz gv = new GraphViz();
		gv.readSource(input);
		System.out.println(gv.getDotSource());

		String type = "gif";
		// String type = "dot";
		// String type = "fig"; // open with xfig
		// String type = "pdf";
		// String type = "ps";
		// String type = "svg"; // open with inkscape
		// String type = "png";
		// String type = "plain";

		String repesentationType = "dot";
		// String repesentationType= "neato";
		// String repesentationType= "fdp";
		// String repesentationType= "sfdp";
		// String repesentationType= "twopi";
		// String repesentationType= "circo";

		File out = new File("/tmp/simple." + type); // Linux
		// File out = new File("c:/eclipse.ws/graphviz-java-api/tmp/simple." + type); //
		// Windows
		gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, repesentationType), out);
	}
}
