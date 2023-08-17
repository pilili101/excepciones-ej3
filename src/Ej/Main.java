/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Ej;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();

        System.out.println("Ingrese 2 numeros");
        String num1 = sc.next();
        String num2 = sc.next();

        try {
            dn.division(num1, num2, sc);
        } catch (NumberFormatException e) {
            System.out.println("no se parseo bien ");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (InputMismatchException e) {
            System.out.println("error del scanner");
        } catch (Exception e) {
            System.out.println("otra exception");
            //esta opcion esta porque si no me pide que le ponga throws al main
        }

    }

}
