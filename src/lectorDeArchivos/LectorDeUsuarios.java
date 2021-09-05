package lectorDeArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import parque.TipoDeAtraccion;
import parque.Usuario;

//lee un archivo csv y me devuelve una lista de usuarios
public class LectorDeUsuarios {
	public List<Usuario> leerUsuario(String archivo) {
		List<Usuario> users = new LinkedList<Usuario>();
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			linea = br.readLine();
			try {
				users.add(crearUsuario(linea));
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
		return users;
	}

	private Usuario crearUsuario(String linea) throws Exception {
		String[] datos = linea.split(",");
		// comprueba que se pase la cantidad correcta de argumentos
		if (datos.length != 4) {
			throw new Exception("Cantidad de argumentos erroneos");
		}

		return new Usuario(datos[0],

				TipoDeAtraccion.valueOf(datos[1].toUpperCase()),

				Double.parseDouble(datos[2]),

				Double.parseDouble(datos[3]));
	}

}
