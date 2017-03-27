/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Pedrapapeltesoura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1 - Papel; 2 - Pedra; 3 - Tesoura.
       // U(1) C(2) = -1, vencedor usuario
       // U(1) C(3) = -2, vencedor computador
       // U(2) C(1) = 1, vencedor computador
       // U(2) C(3) = -1, vencedor usuario
       // U(3) C(1) = 2, vencedor usuario
       // U(3) C(2) = 1, vencedor computador
       Scanner leitor = new Scanner(System.in);
       Random gerador = new Random();       
       int numeroUsuario;
       int escolhaComputador;
       int pontosUsuario = 0;
       int pontosComputador = 0;
       
       for(int i = 0; i < 5; i++){
       numeroUsuario = leitor.nextInt();
       escolhaComputador = gerador.nextInt(3) + 1; //gera um numero entre 1 e 3
       
       //imprimir a escolha do computador
       switch(escolhaComputador){
           case 1:
               System.out.println("Computador escolheu papel");
               break;
           case 2:
               System.out.println("Computador escolheu pedra");
               break;
           case 3:
               System.out.println("Computador escolheu tesoura");
               
       }
       
       // Verificacao do resultado
       if (numeroUsuario == escolhaComputador){
       System.out.println("Empate");
       }
       else if((numeroUsuario - escolhaComputador) == -1 ||
                (numeroUsuario - escolhaComputador) == 2){
           System.out.println("Usuario vencedor da partida.");
           pontosUsuario++;
           
       }               
       else {
           System.out.println("Computador vencedor da partida.");
           pontosComputador++;
           
       }
       
    }
       //verificacao de pontos do jogo    
       if(pontosUsuario > pontosComputador){
       System.out.println("Usuario vencedor do jogo.");
       }
       else if(pontosUsuario < pontosComputador){
       System.out.println("Computador vencedor do jogo.");
    }   
       else {
           System.out.println("Empate entre os jogadores.");
       }
    }
} 
