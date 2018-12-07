public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }


        for(int i=0; i<10; i++){
            System.out.println("Valor de i eh " + i);
        }

        // for que tem que parar quando assumir um valor
        for(int i=0; i<10; i++){
            System.out.println("Imprimir valor " + i);
            if(i==5){
                break;
            }

        }

    }
}
