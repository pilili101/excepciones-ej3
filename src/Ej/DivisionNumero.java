/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Ej;

import java.util.Scanner;

public class DivisionNumero {

    public void division(String num1, String num2, Scanner sc) throws Exception {

        Integer numero1 = Integer.parseInt(num1);
        Integer numero2 = Integer.parseInt(num2);
        int max, min = 0;
        if (numero1 > numero2) {
            max = numero1;
            min = numero2;
        } else if (numero2 > numero1) {
            max = numero2;
            min = numero1;
        } else {
            max = numero1;
            min = numero2;
        }
        double resultado= (double)max/min;
 //lo casteamos porque al dividir dos enteros el resultado tambien lo es
        System.out.println("la division entre " + max+" y "+min+" es "+resultado);

    }

}
