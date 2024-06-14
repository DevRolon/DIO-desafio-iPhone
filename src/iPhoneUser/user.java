package iPhoneUser;

import reprodutorMusica.Reprodutor;
import navegadorInternet.Navegador;
import java.util.Scanner;

import appTelefone.Telefone;

public class user {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        while(sair != true){

        System.out.println("Selecione uma opção de 1 a 3, ou precione 0 para sair");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch(opcao){
            case 1:
            
                Reprodutor iphoneReprodutor = new Reprodutor();
        
                iphoneReprodutor.selecionarMusica();
                iphoneReprodutor.tocar();
                iphoneReprodutor.pausar();
                
                break;

            case 2:
                Navegador iphoneNavegador = new Navegador();

                System.out.println("Abrindo navegador");
                iphoneNavegador.exibirPagina();
	            iphoneNavegador.adicionarNovaAba();
	            iphoneNavegador.atualizarPagina();
                break;

            case 3:    
                Telefone iphoneTelefone = new Telefone();

                System.out.println("Discagem");
                iphoneTelefone.ligar();
                System.out.println("Chamada realizada");
                iphoneTelefone.desligar();
                System.out.println("\nAlgum tempo depois \n");
                System.out.println("Telefone tocando");
	            iphoneTelefone.atender();
	            iphoneTelefone.desligar();
                iphoneTelefone.iniciarCorreioVoz();
                iphoneTelefone.desligar();
                break;

            case 0:
                System.out.println("Programa encerrado com sucesso.");
                sair = true;
                break;

            default:
                System.out.println("Opção inválida. Ainda estamos trabalhando nisso.");
                break;
            }
        }
        scanner.close();     
    }
}
