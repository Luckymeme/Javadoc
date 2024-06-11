import java.util.Scanner;

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
 * <em><b>Este es el primer objeto, la clase llamada Digimon y contiene las
 * variables nombre, nivel y atributo.</b></em>
 * 
 * @author Ferri Moreno Rafael
 * @version 2023-12 (4.30.0)
 * @since 17.0.9
 * @fecha 06/09/2024
 * @see <a href="https://github.com/Luckymeme">Mi github</a>
 * @version 1.0
 * 
 */
public class Digimon extends Extremidades {
	private String nombre;
	private int nivel;
	private String atributo;

	/**
	 * Este es el constructor de Digimon, el cual tiene tres atributos nombre, nivel
	 * y atributo.
	 * 
	 * @Constructor Digimon
	 * @param nombre:&emsp;Nombre    del digimon
	 * @param nivel:&emsp;Nivel      del digimon ej:Campeon=2, Mega=4, seria mejor
	 *                               utilizar un string para mas claridad pero
	 *                               tampoco es plan que todos los parametros sean
	 *                               string.
	 * @param atributo:&emsp;Similar a los tipos en pokemon; Virus, Vacuna, Datos o
	 *                               Desconocido.
	 */
	public Digimon(String nombre, int nivel, String atributo) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.atributo = atributo;
	}

	/**
	 * Aqui se crea el getter getNombre y nombre.
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Aqui se crea el setter setNombre.
	 * 
	 * @return nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Aqui se crea el getter getNivel y nivel.
	 * 
	 * @return nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Aqui se crea el setter setNivel.
	 * 
	 * @return nivel
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * Este es uno de los metodos, <b>evolucionar</b> y nos devuelve nombre y un
	 * breve texto.
	 * 
	 * @return nombre y texto.
	 */
	public void evolucionar() {
		System.out.println(nombre + " aun no puede evolucionar");
	}

	/**
	 * Este otro de los metodos, <b>luchar</b> devuelve nombre y un breve texto.
	 * 
	 * @return nombre y texto.
	 */
	public void luchar() {
		System.out.println("¡" + nombre + " parece estar listo para luchar!");
	}

	/**
	 * El metodo final es, <b>comer</b> y a efectos practicos las 3 hacen lo mismo.
	 * 
	 * @return nombre y texto.
	 */
	public void comer() {
		System.out.println(nombre + " no tiene hambre");
	}

	/**
	 * Esta excepcion salta cuando se introduce un valor entero por debajo de cero o
	 * alternarivamente si el valor es igual o superior a cinco.
	 * 
	 * @param nivel
	 * @throws Exception
	 */
	public static void excepcion(int nivel) throws Exception {
		if (nivel < 0 || nivel >= 5) {
			throw new Exception("Ese nivel no existe, por favor introduce un número entre 1 y 4.");
		}
	}

	/**
	 * Esta es la clase main donde la magia sucede. Este es el punto de entrada del
	 * programa en el que se crea una instancia de Digimon, en este caso lo he
	 * llamado betamon. Invoca los metodos evolucionar(), luchar() y comer() en
	 * betamon. Lee un valor de nivel desde la entrada por teclado s, basado en el
	 * nivel introducido, imprime mensajes dependiendo de su nivel.
	 * 
	 * @throw else Si no es nigun valor establecido entre 0 y 4 ambos incluido
	 *        devolver el siguiente mensaje 'Ese nivel no existe, porfavor introduce
	 *        un numero entre 1 y 4' Para mas información consulta {@link #nivel} en
	 *        la clase.
	 * @see #Digimon(String, int, String).
	 * @return Printeara una frase en base a el numero introducidio en
	 *         {@link #nivel}.
	 * 
	 */
	public static void main(String[] args) {
		Digimon betamon = new Digimon("Betamon", 1, "Virus");
		betamon.evolucionar();
		betamon.luchar();
		betamon.comer();

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el nivel del digimon: ");
		int nivel = s.nextInt();

		try {
			excepcion(nivel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (nivel == 0) {
			System.out.println("!Es un digihuevo, NO PUEDE LUCHAR ANIMAL¡");
		} else if (nivel == 1) {
			System.out.println("Este Digimon es nivel Novato, es capaza de pelear.");
		} else if (nivel == 2) {
			System.out.println("Este Digimon es nivel Campeon, esta acostumbrado a pelear.");
		} else if (nivel == 3) {
			System.out.println(
					"Este Digimon es nivel Cuerpo perfecto, su cuerpo ha sido curtido en cientos de batallas.");
		} else if (nivel == 4) {
			System.out.println("Este Digimon es nivel MEGA, !Es extraordinariamente poderoso¡.");
		} else {
			System.out.println("Introduce un valor valido porfavor");
		}
	}

}
