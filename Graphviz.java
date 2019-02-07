public class Graphviz {
	public static void main(String[] arg) {
		new Graphviz();
	}

	public Graphviz() {
		/* RUTA DE ORIGEN DEL ARCHIVO A TOMAR LOS DATOS EN FORMATO .DOT */
		String direccionDOT = "./automata.dot";

		/* RUTA DE DESTINO DEL ARCHIVO EN FORMATO .PNG*/
		String direccionPng = "./automata.png";

		dibujar(direccionDOT, direccionPng);
	}

	public void dibujar(String direccionDot, String direccionPng) {
		try {
			/* Esta clase es usada para crear procesos del sistema operativo */
			ProcessBuilder proceso;

			/* CONSTRUIMOS EL SIGUIENTE COMANDO PARA GENERAR EL AUTOMATA PLANTEADO */
			proceso = new ProcessBuilder("dot", "-Tpng", "-o", direccionPng, direccionDot);
			proceso.redirectErrorStream(true);

			/* EJECUTA EL PROCESO*/
			proceso.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}