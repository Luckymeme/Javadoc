/**
 * <em><b>La clase Extremidades muestra el numero de extremidades usando int,
 * ademas determina si el digimon esta vivo o durmiendo.</em></b>
 * 
 * @param patas Numero de patas, en caso de que tenga.
 * @param cola  Numero de colas.
 * 
 * @author Ferri Moreno Rafael
 * @version 2023-12 (4.30.0)
 * @since 17.0.9
 * @fecha 06/09/2024
 * @see <a href="https://github.com/Luckymeme">Mi github</a>
 * @version 4.5
 */

public class Extremidades extends Estado {
	int patas = 4;
	int cola = 1;

	Estado digimon = new Estado();
	{
		digimon.salud = 80;

		if (digimon.salud > 50) {
			digimon.vivo();
		} else {
			digimon.durmiendo();
		}
	}

}
