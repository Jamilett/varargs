package test;

public class EjemploVarArgs {

    public static void main(String[] args) {

        imprimirNumeros(10, 20, 45, 68, 900, 1, 10);
        variosParametros("Jam", true, 0, 8, 2, 6);
    }

    public static void imprimirNumeros(int... numeros) {

        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros) {
        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);

        }

    }

}
