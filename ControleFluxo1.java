public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 17;
        if(idade >= 18){
            System.out.println("Entrou no clube");
        } else {
            System.out.println("Não entrar no clube");
        }
// Categoria de tenis
        // idade < 15 é categoria infantil
        // idade >= 15 && idade < 18 é categoria juvenil
        // idade >= 18 é categoria adulto
        int idadeAtleta = 17;
        if(idadeAtleta < 15){
            System.out.println("Categoria Infantil");
        } else if (idadeAtleta >= 15 && idadeAtleta < 18) {
            System.out.println("Categoria Juvenil");
        } else
            System.out.println("Categoria Adulto");
    }
}
