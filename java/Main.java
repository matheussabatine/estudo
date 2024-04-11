import java.util.ArrayList;


public class Main {

    public static void main() {
        int numero = 53;
        //System.out.println(numero);

        // var é pra variavel em escopo local, deve-se declarar com valor

        var nome = "Matheus";
        //System.out.println(nome);

        // byte(size 8 bits) valores de -128 a 127
        // short(size 16 bits) valores de -32,768 a -32,767
        // int(size 32 bits) valores de -2,147,483,648 a -2,147,483,647
        // long(size 64 bits) valores de -9,000,000,000,000,000,000 a 9,000,000,000,000,000,000

        //array(tamanho fixo): formas de inicializar

        int[] lista = new int[10];
        lista[0] = 20;
        lista[1] = 22;
        int[] lista2 = {1, 2, 3};

        //System.out.println(lista[0]);

        //arrayList(tamanho flexivel) deve ser importada
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(1);
        notas.add(3);
        notas.add(2);

        notas.remove(1);
        notas.get(0);
        byte i = 0;
        while((i < 5) || (i < 7)){
            System.out.println(i);
            i++;

        }

        for(byte j = 0; j <= 5; j++){
            System.out.println(j);
        }

        // casting: tranformar valor em outros tipos.

        int valor = 7;
        double dinheiro = valor;
        System.out.println(dinheiro);

        valor = (int) dinheiro;

        char letra = 'b';
        String palavra = String.valueOf(letra);

        String master_chief = "117";
        int spartan = Integer.parseInt(master_chief);

        // como compilar via terminal
        // javac nome_arquivo.java // obs: tambem compila todos outros arquivos que este depende para rodar
        // como executar via terminal
        // java nome_arquivo
    }
}