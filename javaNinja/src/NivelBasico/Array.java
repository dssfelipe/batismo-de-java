package NivelBasico;

public class Array {
    public static void main(String[] args) {

        //Array é tipo referencia!
        //String inicializam como null
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruna";
        ninjas[3] = "Hinata Hyuga";
        System.out.println(ninjas[3]);

        // Redeclarar String
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";


        // Redeclarar o ARRAY
        ninjas = new String[7];
        ninjas [0] = "Hashirama senju";
        ninjas [1] = "Tobirama senju";
        ninjas [2] = "Hiruzen Sarutobi";
        ninjas [3] = "Minato Namikaze";
        ninjas [4] = "Tsunade";
        ninjas [5] = "Kakashi hatake";
        ninjas [6] = "Naruto Uzumake";
        System.out.println(ninjas[4]);

        // For para fazer um LOOP Array
        for (int i = 0; i <= 6; i++) {
            System.out.println(i+ " " + ninjas[i]);
        }

        //Array idade
        //int inicializam como 0
        int[] idade = new int[1];
//        System.out.println(idade[0]);

        //Array
        // Bolean inicializam como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

//        String ninja1 = "naruto uzumaki";
//        String ninja2 = "Sasuke Uchiha";
//        String ninja3 = "Sakura Haruna";
//        System.out.println(ninja1);
//        System.out.println(ninja2);
//        System.out.println(ninja3);

    }
}
