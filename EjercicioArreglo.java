Código Java:
public class Arreglos {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};

        System.out.println("Segundo número: " + numeros[1]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}public class Arreglos {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};

        System.out.println("Segundo número: " + numeros[1]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		 ArrayList<Integer> numeros = new ArrayList<>();

	        numeros.add(10);
	        numeros.add(20);
	        numeros.add(30);

	        System.out.println("Primer número: " + numeros.get(0));

	        for (int num : numeros) {
	            System.out.println(num);
	        }

	}

}
