package Condicoes;

public class LacosDeRepeticoes {
    public static void main(String[] args) {
        /*
        * laços de repeticao: Vao repetir infinitamente ou ate voce atingir o parametro desejado
        * WHILE = FOR
        * */

        // while
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras");
        }

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto esta se clonando e ja se clonou " + i);
        }
    }
}
