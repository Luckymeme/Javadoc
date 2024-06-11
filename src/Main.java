/**
 * <h1>Practica 3 Javadoc</h1>
 * <p>
 * Informacion general y requisitos: un objeto principal, un objeto que herede
 * del objeto anterior.
 * </p>
 * <h2>La interfaz tendra, como minimo, un metodo definido.<br>
 * </h2>
 * <p>
 * El primer objeto tendra constructores, getters y setters y, como minimo, 3
 * funciones, de las cuales minimo una tiene que tener parametros de entrada,
 * una tiene que devolver algun valor y una tiene que lanzar una excepcion.<br>
 * </p>
 * <h2>El segundo objeto tiene que, como minimo, definir 2 funciones mas.<br>
 * </h2>
 * <p>
 * Generad un JavaDoc de este proyecto y investigad que tags y que "comentarios"
 * se habrian de usar. Se valorara positivamente como mas complejo y mas tags
 * use la documentacion. Finalmente, redactad una documentacion explicando como
 * habeis generado el JavaDoc y mostrando y explicando las paginas generadas de
 * los objetos anteriores.<br>
 * </p>
 * 
 * <em><b>A esta clase la he llamado Main</b></em>
 * 
 * @author Ferri Moreno Rafael
 * @version 2023-12 (4.30.0)
 * @since 17.0.9
 * @fecha 06/09/2024
 * @see <a href="https://github.com/Luckymeme">Mi github</a>
 * @version 1.0
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		Digimon digimon = new Digimon("Betamon", 1, "Virus");
		System.out.println("Tiene " + digimon.patas + " patas");

	}

}
