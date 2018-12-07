public class Array2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Juliano";
        nomes[1] = "Carol";
        nomes[2] = "Joaquim";
        System.out.println(nomes.length); // numero do array
        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
