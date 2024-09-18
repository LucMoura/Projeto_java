package Projeto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Peças> pecas_estoque = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int escolha = 8;

        while (escolha != 0) {
            System.out.println("----------- menu -----------");
            System.out.println("0 - Encerrar programa\n" +
                    "1 - Cadastrar peça\n" +
                    "2 - Excluir peça\n" +
                    "3 - Visualizar peças\n" +
                    "4 - Mostrar informação das peças cadastradas");
            System.out.println("----------------------------");
            escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando");
                    input.close();
                    break;
                case 1:
                    System.out.println("Cadastrar peça");
                    Peças peca = new Peças();
                    System.out.println("Nome da peça: ");
                    peca.setNome(input.next());
                    System.out.println("Modelo do carro da peça: ");
                    peca.setModelo(input.next());
                    System.out.println("Marca: ");
                    peca.setMarca(input.next());
                    System.out.println("Valor: ");
                    peca.setValor(input.nextDouble());
                    pecas_estoque.add(peca);
                    break;
                case 2:
                    System.out.println("Excluir peça");
                    System.out.println("Nome da peça a ser excluída: ");
                    String nomeParaExcluir = input.next();
                    Peças pecaParaExcluir = null;
                    for (Peças p : pecas_estoque) {
                        if (p.getNome().equalsIgnoreCase(nomeParaExcluir)) {
                            pecaParaExcluir = p;
                            break;
                        }
                    }
                    if (pecaParaExcluir != null) {
                        pecas_estoque.remove(pecaParaExcluir);
                        System.out.println("Peça excluída com sucesso.");
                    } else {
                        System.out.println("Peça não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Mostrar peças cadastradas");
                    for (Peças p : pecas_estoque) {
                        System.out.println(p.getNome());
                    }
                    break;
                case 4:
                    System.out.println("Mostrar informação das peças cadastradas");
                    for (Peças p : pecas_estoque) {
                        System.out.println(p);
                    }
                    break;
            }
        }
    }
}
