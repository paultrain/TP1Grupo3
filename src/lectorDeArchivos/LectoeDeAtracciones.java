package lectorDeArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import parque.Atraccion;
import parque.TipoDeAtraccion;

public class LectoeDeAtracciones {

	// lee un archivo csv y me devuelve una lista de atracciones
	public class LectorDeAtracciones {
		public List<Atraccion> leerAtraccion(String archivo) {
			List<Atraccion> juegos = new LinkedList<Atraccion>();
			FileReader fr = null;
			BufferedReader br = null;
			String linea = null;
			try {
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				linea = br.readLine();
				try {
					juegos.add(crearAtraccion(linea));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return juegos;
		}

		private Atraccion crearAtraccion(String linea) throws Exception {
			String[] datos = linea.split(",");
			if (datos.length != 5) {
				throw new Exception("cantidad de datos incorrectos");
			}
			return new Atraccion(datos[0], Double.parseDouble(datos[1]), Double.parseDouble(datos[2]),
					Integer.parseInt(datos[3]), TipoDeAtraccion.valueOf(datos[4].toUpperCase()));
		}
	}
}
