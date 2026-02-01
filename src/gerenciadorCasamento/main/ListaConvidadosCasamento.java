
package gerenciadorCasamento.main;
import java.util.Scanner;

import gerenciadorCasamento.domain.ListaConvidados;

class ListaConvidadosCasamento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int finalizador = 0;
        int contador = 0;
        
        System.out.println("Olá");
        
        System.out.println("Adicione o nome da noiva: ");
        String nomeNoiva = sc.nextLine();
        while (nomeNoiva.isBlank()){ // isblanck significa que o valor vazio é verdadeiro, se nome da noiva é vazio = true, roda
            System.out.println("Não pode ser vazio, digite novamente: ");
            nomeNoiva = sc.nextLine();
        }
        System.out.println("Adicione o nome do noivo: ");
        String nomeNoivo = sc.nextLine();
        while (nomeNoivo.isBlank()){
            System.out.println("Não pode ser vazio, digite novamente: ");
            nomeNoivo = sc.nextLine();
        }

        ListaConvidados listaConvidados = new ListaConvidados();
        
        while (true) {
            if (finalizador == 5){
                break;
            }
            int escolha;
            while (true) {
                try {
                System.out.println("_________________________");
                System.out.println("Escolha uma opção: \n1-Adicionar novo convidado  \n2-mostrar convidados" + 
                                    "\n3-remover convidado \n4-Editar convidado \n5-Sair");
                System.out.println("_________________________");
                escolha = Integer.parseInt(sc.nextLine());
                finalizador = escolha;
                if (escolha >= 1 && escolha <= 5){
                    break;
                }else{
                    System.out.println("\nNúmero não está na lista!");
                }
                } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida");
                }
            }
            
            switch (finalizador) {
                case 1:
                    System.out.println("_________________________");
                    System.out.println("Adicione o nome do convidado: ");
                    String nomeConvidado = sc.nextLine();
                    while (nomeConvidado.isBlank()){
                        System.out.println("Não pode ser vazio, digite novamente: ");
                        nomeConvidado = sc.nextLine();
                    }
                    if (listaConvidados.getLista().contains(nomeConvidado)) {
                        System.out.println(nomeConvidado + " Já está na lista");
                        break;
                    }
                    listaConvidados.add(nomeConvidado);
                    System.out.println("_________________________");
                    break;
                case 2:
                    contador = 0;
                    System.out.println("_________________________");
                    for (String convidado : listaConvidados.getLista()){

                        contador++;
                        System.out.println(contador + "º" + convidado);
                    }
                    System.out.println("_________________________");
                    break;
                case 3:
                    System.out.println("_________________________");
                    System.out.println("Escolha o convidado que deseja remover:");
                    String removido = sc.nextLine();
                    if (removido.equalsIgnoreCase(nomeNoiva) || removido.equalsIgnoreCase(nomeNoivo) ){
                        System.out.println("Noivos não podem ser retirados do casamento.");
                        break;
                    }

                    String convidadoEncontrado = null;
                    for (String convidadoNaLista : listaConvidados.getLista() ){
                        if(removido.equalsIgnoreCase(convidadoNaLista)){
                            convidadoEncontrado = convidadoNaLista;
                            break;
                        }
                    }
                    if (convidadoEncontrado != null){
                        listaConvidados.remove(convidadoEncontrado);
                        System.out.println(convidadoEncontrado + " removido com sucesso");
                        System.out.println("_________________________");
                        break;
                    }else{
                        System.out.println("Convidado Não encontrado!");
                    }
                    break;
                case 4:
                    contador = 0;
                    System.out.println("Escolha o número do convidado que deseja editar:");

                    System.out.println("_________________________");
                    for (String convidado : listaConvidados.getLista()){

                        contador++;
                        System.out.println(contador + "º" + convidado);
                    }
                    System.out.println("_________________________");

                    int ConvidadoEditado = Integer.parseInt(sc.nextLine());

                    if (ConvidadoEditado < 1 || ConvidadoEditado > listaConvidados.getLista().size()){
                        System.out.println("Número inválido!");
                        break;
                    }
                    System.out.println("Digite o nome do novo convidado:");
                    String novoConvidado = sc.nextLine();
                    listaConvidados.set(ConvidadoEditado - 1, novoConvidado);
                    System.out.println("Convidado editado com sucesso!");
                    break;
                default:
                break;
            }
        }   
        sc.close();
    }

}