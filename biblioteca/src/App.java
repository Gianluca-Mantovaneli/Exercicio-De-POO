import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception {

        Map<Integer, Livro> mapaLivros = new HashMap<Integer, Livro>();
        try (Scanner s = new Scanner(System.in)) {

            int comand = 99;
            while (true) {
                System.out.println("1 - Cadastrar Livro");
                System.out.println("2 - Listar Livros");
                System.out.println("3 - Ver detalhes do livro");
                System.out.println("4 - Remver livro");
                System.out.println();
                System.out.println("0 - Sair");
                comand = s.nextInt();
                s.nextLine();

                switch (comand) {
                    case 0:
                        return;
                    case 1:
                        System.out.print("Titulo do Livro: ");
                        String nome = s.nextLine();

                        System.out.print("Autor do Livro: ");
                        String autor = s.nextLine();

                        System.out.print("Código do livro: ");
                        int codigo = s.nextInt();
                        s.nextLine();

                        System.out.print("Ano de publicação do Livro: ");
                        int anoPublicação = s.nextInt();
                        s.nextLine();

                        Livro l = new Livro(nome, autor, codigo, anoPublicação);
                        mapaLivros.put(l.getCodigo(), l);
                        break;

                    case 2:
                        for (Livro m : mapaLivros.values()) {
                            System.out.println(m.getCodigo() + " | " + m.getNome());
                        }
                        break;

                    case 3:
                        System.out.print("Escreva o codigo do livro: ");
                        int cod = s.nextInt();
                        s.nextLine();
                        System.out.println(mapaLivros.get(cod));
                        break;

                    case 4:
                        System.out.print("Escreva o código do livro: ");
                        int codR = s.nextInt();
                        s.nextLine();
                        mapaLivros.remove(codR);
                        break;

                    default:
                        System.out.println("Escreveu errado aí doente!!");
                        break;
                }
            }
        }

    }
}
