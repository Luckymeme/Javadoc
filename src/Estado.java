/**
 * <em><b>La funcion de esta clase es mostrar la salud de nuestro digimon.</em></b>
 * @param vivo:&emsp;Si su salud esta bien esta vivo.
 * @param durmiendo:&emsp;Si no esta tan vivo,o en otras palabras si su vida no llega al minimo de puntos.
 * 
 * @author Ferri Moreno Rafael
 * @version 2023-12 (4.30.0)
 * @since 17.0.9
 * @fecha 06/09/2024
 * @see <a href="https://github.com/Luckymeme">Mi github</a>
 * @version 1
 */
public class Estado {
	int salud;

	void vivo() {
		System.out.println("Este digimon esta vivo");
	}

	void durmiendo() {
		System.out.println("No te preocupes, solo esta durmiendo");
	}
}
