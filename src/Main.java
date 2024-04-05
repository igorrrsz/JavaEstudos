
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // -------------------------------------------------------------------------------------------------------------------------
        // cliente 1
            // dados do cliente 1
                System.out.println("Digite os dados do primeiro cliente:");

                System.out.print("Informe seu nome: ");
                String nome = scanner.nextLine();


                System.out.print("Informe sua idade: ");
                String idade = scanner.nextLine();


                System.out.print("Informe seu sexo: ");
                String sexo = scanner.nextLine();


                System.out.print("Informe seu E-mail: ");
                String email = scanner.nextLine();

                System.out.print("Informe sua Senha: ");
                String senha = scanner.nextLine();

            // informações livro 1
                System.out.println("Digite as informações do primeiro livro:");

                System.out.print("Informe o título do seu livro: ");
                String titulo = scanner.nextLine();


                System.out.print("Informe o autor do livro: ");
                String autor = scanner.nextLine();


                System.out.print("Informe o ano de publicação do livro: ");
                int anodepublicacao = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Informe o preço do livro: ");
                float preco = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Informe a quantidade de páginas do livro: ");
                int qtdpaginas = scanner.nextInt();
                scanner.nextLine();



        // ---------------------------------------------------------------------------------------------------------------------------
        // cliente 2
                // dados cliente 2

                    System.out.println("Digite os dados do segundo cliente:");

                    System.out.print("Informe seu nome: ");
                    String nome2 = scanner.nextLine();


                    System.out.print("Informe sua idade: ");
                    String idade2 = scanner.nextLine();


                    System.out.print("Informe seu sexo: ");
                    String sexo2 = scanner.nextLine();


                    System.out.print("Informe seu E-mail: ");
                    String email2 = scanner.nextLine();

                    System.out.print("Informe sua Senha: ");
                    String senha2 = scanner.nextLine();

                // informações livro 2

                    System.out.println("Digite as informações do segundo livro:");

                    System.out.print("Informe o título do seu livro: ");
                    String titulo2 = scanner.nextLine();


                    System.out.print("Informe o autor do livro: ");
                    String autor2 = scanner.nextLine();


                    System.out.print("Informe o ano de publicação do livro: ");
                    int anodepublicacao2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o preço do livro: ");
                    float preco2 = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Informe a quantidade de páginas do livro: ");
                    int qtdpaginas2 = scanner.nextInt();
                    scanner.nextLine();
        // ------------------------------------------------------------------------------------------------------------------------------
        // cliente 3
            // dados cliente 2
                System.out.println("Digite os dados do segundo cliente:");
                System.out.print("Informe seu nome: ");
                String nome3 = scanner.nextLine();


                System.out.print("Informe sua idade: ");
                String idade3 = scanner.nextLine();


                System.out.print("Informe seu sexo: ");
                String sexo3 = scanner.nextLine();


                System.out.print("Informe seu E-mail: ");
                String email3 = scanner.nextLine();

                System.out.print("Informe sua Senha: ");
                String senha3 = scanner.nextLine();

            // informações livro 3
                System.out.println("Digite as informações do terceiro livro:");

                System.out.print("Informe o título do seu livro: ");
                String titulo3 = scanner.nextLine();


                System.out.print("Informe o autor do livro: ");
                String autor3= scanner.nextLine();


                System.out.print("Informe o ano de publicação do livro: ");
                int anodepublicacao3 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Informe o preço do livro: ");
                float preco3 = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Informe a quantidade de páginas do livro: ");
                int qtdpaginas3 = scanner.nextInt();
                scanner.nextLine();


        // ----------------------------------------------------------------------------------------------------------------------------

        // impressão dos cliente 1
            // dados
                Cliente cliente1 = new Cliente(nome, idade, sexo, email, senha);
                System.out.println("Dados do primero cliente:");
                cliente1.impressaodetalhes();

            // livro 1
                Livro livro1 = new Livro(titulo, autor, anodepublicacao, preco, qtdpaginas);
                System.out.println("Livro do primero cliente:");
                livro1.impressaoLivros();

            // valor de cada página do livro 1
                System.out.println("Este é o valor de cada página do livro escolhido: ");
                livro1.calcularPrecoPorPagina();


        // ----------------------------------------------------------------------------------------------------------------------------


        // impressao do cliente 2
            // dados
                Cliente cliente2 = new Cliente(nome2, idade2, sexo2, email2, senha2);
                System.out.println("Dados do primero cliente:");
                cliente2.impressaodetalhes();

            // livro 2
                Livro livro2 = new Livro(titulo2, autor2, anodepublicacao2, preco2, qtdpaginas2);
                System.out.println("Livro do primero cliente:");
                livro2.impressaoLivros();

            // valor de cada página do livro 2
                System.out.println("Este é o valor de cada página do livro escolhido: ");
                livro2.calcularPrecoPorPagina();


        // ----------------------------------------------------------------------------------------------------------------------------


        // impressao do cliente 3
            // dados
                Cliente cliente3 = new Cliente(nome3, idade3, sexo3, email3, senha3);
                System.out.println("Dados do primero cliente:");
                cliente3.impressaodetalhes();

            // livro 3
                Livro livro3 = new Livro(titulo3, autor3, anodepublicacao3, preco3, qtdpaginas3);
                System.out.println("Livro do primero cliente:");
                livro3.impressaoLivros();

            // valor de cada página do livro 2
                System.out.println("Este é o valor de cada página do livro escolhido: ");
                livro3.calcularPrecoPorPagina();
    }

}
