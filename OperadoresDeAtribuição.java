public class OperadoresDeAtribuição {
    public static void main(String[] args) {
        System.out.println();

        int salario = 1800;
        // se quiser colocar mais 1000 no salario
        salario = salario + 1000;
        // ou
        salario += 1000; // código mais limpo
        System.out.println(salario);

        // resto
        int numero = 11;
        numero %= 2;
        System.out.println(numero);
    }

}
