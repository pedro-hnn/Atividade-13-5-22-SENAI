/*
Atividade 1:
1) Crie uma lista com nomes, faça as operações de inserção, e deleção; (na classe principal)
2) faça uma lista que recebe (usuário entra com o dado) números (Integer) e despois mostre na tela os números digitados; (na classe principal)

3) Faça um programa que recebe o nome, idade, e altura de uma pessoa. Na classe pessoa, crie o construtor da classe com os parâmetros (nome, idade e altura) sendo como obrigatório.
mostre na tela quantas pessoas com idade superior a 18 anos foram incluídas.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tAdicionar Nome\n" +
                        "2\t\t=>\t\tRemover Nome\n" +
                        "3\t\t=>\t\tAdicionar Número\n" +
                        "4\t\t=>\t\tMostrar Números\n" +
                        "5\t\t=>\t\tCadastrar Pessoa\n" +
                        "6\t\t=>\t\tMostrar todas as Pessoas maiores de 18 anos\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 6) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        String nome;
        int idade;
        Double altura;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nDigite o nome que quer adicionar: ");
                    nomes.add(new Scanner(System.in).nextLine());

                    System.out.println("\n\nNOME CADASTRADO COM SUCESSO!\n\n");

                    System.out.println("\n\n");
                    for (int i = 0; i < nomes.size();i++)
                    {
                        System.out.println(nomes.get(i));
                    }
                    System.out.println("\n\n");
                    continue;

                case 2:
                    System.out.print("\n\nDigite o nome que quer deletar: ");
                    nome = new Scanner(System.in).nextLine();
                    if(nomes.contains(nome)){
                        nomes.remove(nome);
                        System.out.println("\n\nNOME DELETADO COM SUCESSO!\n\n");

                    }else{
                        System.out.println("\n\nNOME NÃO CADASTRADO NA LISTA!\n\n");
                    }

                    System.out.println("\n\n");
                    for (int i = 0; i < nomes.size();i++)
                    {
                        System.out.println(nomes.get(i));
                    }
                    System.out.println("\n\n");

                    continue;

                case 3:
                    try{
                        System.out.print("\n\nDigite o número inteiro que deseja adicionar: ");
                        numeros.add(new Scanner(System.in).nextInt());
                        System.out.println("\n\nNÚMERO CADASTRADO COM SUCESSO!\n\n");

                    }catch (Exception e){
                        System.out.println("\n\nDIGITE UM NÚMERO INTEIRO!\n\n");
                    }
                    continue;

                case 4:

                    System.out.println("\n\nTODOS OS NÚMEROS CADASTRADOS:\n\n");

                    System.out.println("\n\n");
                    for (int i = 0; i < numeros.size();i++)
                    {
                        System.out.println(numeros.get(i));
                    }
                    System.out.println("\n\n");

                    continue;


                case 5:
                    try{
                        System.out.print("\n\nNome: ");
                        nome = new Scanner(System.in).nextLine();
                        System.out.print("\n\nIdade: ");
                        idade = new Scanner(System.in).nextInt();
                        System.out.print("\n\nAltura: ");
                        altura = new Scanner(System.in).nextDouble();

                        pessoas.add(new Pessoa(nome,idade,altura));
                        System.out.println("\n\nPESSOA CADASTRADA COM SUCESSO!\n\n");

                        for(Pessoa p : pessoas){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+p.getNome());
                            System.out.println("Idade = "+p.getIdade());
                            System.out.println("Peso = "+p.getAltura());
                            System.out.println("=====\n");
                        }


                    }catch(Exception e){
                        System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    }

                    continue;

                case 6:
                    if(!pessoas.isEmpty()){
                        for(Pessoa p : pessoas){
                            if(p.getIdade() >= 18){
                                System.out.println("\n=====");
                                System.out.println("Nome = "+p.getNome());
                                System.out.println("Idade = "+p.getIdade());
                                System.out.println("Peso = "+p.getAltura());
                                System.out.println("=====\n");
                            }
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UMA PESSOA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 0:
                    run = false;
                    break;
            }

        }

    }

}
