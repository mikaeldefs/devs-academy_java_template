package _06_interfaces.atividade_01.exercicio_01;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

abstract class Impressora {

    static Scanner sc = new Scanner(System.in);
    static List<Imprimivel> listaDeImprimiveis = new ArrayList<>();
    static String[] classes = { "Contrato", "Foto", "Documento" };

    // escolhe ação a ser executada.
    static void escolherAcao() {

        // laço é repetido até que o usuário escolha interrompê-lo com a entrada "q".
        loop: while (true) {

            // imprime opções de entrada.
            System.out.println();
            listaDeImprimiveis.forEach(System.out::println);
            System.out.print("\na - Adicionar elemento\nr - Remover elemento\ni - Imprimir elemento\np - Imprimir todos\nq - Sair\n\nInsira a ação desejada: ");

            // lê entrada.
            String input = sc.nextLine();

            // checa se a entrada é uma das opções válidas e executa sua respectiva função.
            if (input.matches("^[aripq]$")) switch (input) {
                case "a" -> escolherImprimivelParaAdicionar();
                case "r" -> escolherImprimivelParaRemover();
                case "i" -> escolherImprimivelParaImprimir();
                case "p" -> imprimirTudo();
                case "q" -> {
                    break loop;
                }
            }
            else {
                System.out.println("\nEntrada inválida!");
            }
        }
    }

    // escolhe qual tipo de documento adicionar.
    static void escolherImprimivelParaAdicionar() {

        // laço é repetido enquanto o usuário não escolher uma entrada válida.
        while (true) {

            // imprime opções de entrada.
            System.out.print("\n01 - Contrato\n02 - Foto\n03 - Documento\n\nInsira o código do documento a ser adicionado (ou \"q\" para abortar): ");
            String entrada = sc.nextLine();

            // armazena o prefixo do pacote para o nome completo de cada classe em uma variável.
            StringBuilder classe = new StringBuilder(Impressora.class.getPackageName() + ".");

            // verifica se a entrada é válida.
            // caso a entrada seja válida, cria um novo objeto da classe escolhida
            // e o adiciona à lista de Imprimiveis.
            if (entrada.equals("q")) break;
            if (entrada.matches("[1-3]")) {
                classe.append(classes[Integer.parseInt(entrada) - 1]);
                try {
                    // inicializa um objeto Imprimivel de acordo com a opção escolhida
                    // e o adiciona à lista de Imprimveis.
                    Impressora.adicionarImprimivel(inicializarImprimivel(Class.forName(classe.toString())));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("\nEntrada inválida!");
            }
        }
    }

    // escolhe qual documento remover de acordo com seu índice.
    static void escolherImprimivelParaRemover() {

        // aborta a função caso a lista esteja vazia
        if (listaDeImprimiveis.isEmpty()) {
            System.out.print("\nNão é possível remover um elemento pois a lista está vazia!");
            return;
        }

        // imprime a lista de Impriveis.
        Impressora.imprimirLista();
        System.out.print("Insira o índice do documento a ser removido (ou \"q\" para abortar): ");

        // remove o objeto de acordo com o índice passado.
        lidarComEntrada(Impressora::removerImprimivel);
    }

    // escolhe o qual objeto imprimir.
    static void escolherImprimivelParaImprimir() {

        // aborta a função caso a lista de Imprimiveis esteja vazia.
        if (listaDeImprimiveis.isEmpty()) {
            System.out.print("\nNão é possível imprimir um elemento pois a lista está vazia!");
            return;
        }

        // imprime a lista de Imprimeis com índices para cada objeto.
        Impressora.imprimirLista();
        System.out.print("\nInsira o índice do documento a ser impresso (ou \"q\" para abortar): ");

        // imprime o elmento de acordo com o índice passado.
        lidarComEntrada(Imprimivel::imprimir);
    }

    // verifica se a entrada é válida
    // checando se ela é um número inteiro
    // e se existe índice equivalente na lista de Imprimiveis,
    // e executa a função passada como parâmetro.
    static void lidarComEntrada(Consumer<Imprimivel> funcao) {
        String entrada = sc.nextLine();

        // verifica se o usuário deseja abortar a operação.
        if (entrada.equals("q")) {
            return;
        }

        // verifica se a entrada é composta unicamente por números inteiros.
        if (entrada.matches("\\d")) {

            // converte a entrada em número inteiro
            // e subtrai 1 para manter o padrão base 0 da lista de Imprimiveis.
            int indice = Integer.parseInt(entrada) - 1;

            // verifica se o índice passado pode ser encontrado na lista de Imprimiveis.
            if (indice < listaDeImprimiveis.size()) {

                // executa a função passada como argumento.
                funcao.accept(listaDeImprimiveis.get(indice));
            } else {
                System.out.println("\nÍndice inválido!");
            }
        } else {
            System.out.println("\nEntrada inválida!");
        }
    }

    // checa se o objeto passado é nulo, e o adiciona na lista somente se ele não for.
    static void adicionarImprimivel(Imprimivel umImprimivel) {
        listaDeImprimiveis.add(umImprimivel);
    }

    // remove o objeto passado da lista de imprimíveis.
    static void removerImprimivel(Imprimivel obj) {
        listaDeImprimiveis.remove(obj);
    }


    // chama o método imprimir de cada objeto da listaDeImprimiveis.
    static void imprimirTudo() {
        System.out.println();
        listaDeImprimiveis.forEach(Imprimivel::imprimir);
    }

    // imprime a lista de imprimíveis com seus respectivos índices (base 1).
    static void imprimirLista() {
        System.out.println();
        for (int i = 0; i < listaDeImprimiveis.size(); i++) {
            Imprimivel imprimivel = listaDeImprimiveis.get(i);
            System.out.printf("%s - %s%n",
                    String.format("%02d", i + 1), imprimivel);
        }
        System.out.println();
    }

    // inicializa um novo objeto de acordo com a classe passada.
    static <T> Imprimivel inicializarImprimivel(Class<T> classe) {
        try {
            // armazena os atributos da classe passada em uma lista de campos.
            List<Field> atributos = Arrays.asList(classe.getDeclaredFields());

            // cria uma nova lista para as entradas do usuário
            // que será utilizada posteriormente como parâmetros no construtor do novo objeto.
            List<String> entrada = new ArrayList<>();

            // itera sobre todos os atributos da classe passada
            // e armazena as entradas na lista de entradas.
            atributos.forEach(atributo -> {
                System.out.printf("Insira o %s do novo objeto %s: ", atributo.getName(), classe.getSimpleName());
                entrada.add(sc.nextLine());
            });

            // recupera o construtor completo da classe passada,
            // e cria um novo objeto de acordo com os parâmetros armazenados na lista de entrada.
            return (Imprimivel) classe
                    .getConstructor(atributos.stream().map(Field::getType).toArray(Class[]::new))
                    .newInstance((Object[]) entrada.toArray(String[]::new));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
