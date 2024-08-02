import java.util.HashMap;
import java.util.Map;

public class MainApp
{

	public static void main(String[] args)
	{
		// Ejercicio 2
		int len = 15;
		int[] arr = genArr(len);
		String[] asterix = new String[9];
		
		showArr(arr);
		
		// Contar y generar
		for(int i = 0; i < 9; ++i)
		{
			asterix[i] = genAsterix(ocurrencias(i + 1, arr));
		}
		// Mostrar
		System.out.println("");
		System.out.println("Recuento (Metodo 1):");
		for(int i = 0; i < 9; ++i)
		{
			System.out.println(Integer.toString(i + 1) + ": " + asterix[i]);
		}
		
		// Usando un mapa
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Contar y generar
		for(int i = 1; i <= 9; ++i)
		{
			map.put(i, genAsterix(ocurrencias(i, arr)));
		}
		
		// Mostrar
		System.out.println("");
		System.out.println("Recuento (Metodo 2):");
		for(int i = 1; i <= 9; ++i)
		{
			System.out.println(Integer.toString(i) + ": " + map.get(i));
		}
	}
	
	/**
	 * Generar cadena de asteriscos
	 * @param count Cantidad de asteriscos
	 * @return Cadena generada
	 */
	public static String genAsterix(int count)
	{
		String asterix = "";
		for(int i = 0; i < count; ++i)
		{
			asterix += "*";
		}
		return asterix;
	}

	/**
	 * Generar un array de enteros de un dígito
	 * @param len Longitud del array
	 * @return Array generado
	 */
	public static int[] genArr(int len)
	{
		if(len <= 0)
		{
			return null;
		}
		int[] arr = new int[len];
		for(int i = 0; i < len; ++i)
		{
			arr[i] = (int)(Math.random()*9) + 1;	// 1 a 9
		}
		return arr;
	}

	/**
	 * Mostrar por consola un array
	 * @param arr Array
	 */
	public static void showArr(int[] arr)
	{
		if((arr == null) || (arr.length == 0))
		{
			return;
		}
		System.out.println("Array:");
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
	
	/**
	 * Buscar las ocurrencias de un valor  en un array
	 * @param buscado Valor a buscar
	 * @param arreglo Array
	 * @return Ocurrencias
	 */
	public static int ocurrencias(int buscado, int[] arreglo)
	{
		if((arreglo == null) || (arreglo.length == 0))
		{
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arreglo.length; ++i)
		{
			if(arreglo[i] == buscado)
			{
				++count;
			}
		}
		return count;
		
	}
}
