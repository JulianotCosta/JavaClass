public class ControleFluxo2 {

    public static void main(String[] args) {
        // operador ternario - fazer if else em apenas 1 linha

        int idade = 20;
        String status;

       // status = idade < 18 ? <true> : <False>
        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);

    }
}
