
import static java.lang.Math.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class JokenPo {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
        
        Random joken = new Random();
         //JOKENPÔ
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");   
            System.out.println("             JOKENPO             ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Escolha entre 0 , 1 e 2"); 
            System.out.println("Pedra = 0");
            System.out.println("Papel = 1");
            System.out.println("Tesoura = 2");
            
                System.out.println("Jogador");
                    int j1 = s.nextInt();
               
               
              int jogada = joken.nextInt(3);
            
                     switch (jogada){     
                         case 0:
                                System.out.println("PC: Pedra");
                              break;  
                         case 1: 
                                System.out.println("PC: Papel");
                                break;
                         case 2: 
                                System.out.println("PC: Tesoura");
                                break;
                         default:
                               System.out.println("PC: Invalid");
                                      break;
                     }       
                     
                     switch (j1){     
                         
                         case 0:
                                System.out.println("J1: Pedra");
                               break; 
                         case 1: 
                                System.out.println("J1: Papel");
                               break; 
                         case 2: 
                                System.out.println("J1: Tesoura");
                               break; 
                         default:
                                System.out.println("J1: Invalid"); 
                                break;
                     } 
                         
                     if(jogada == 0  && j1 == 0 )
                         System.out.println("EMPATE!!");
                         else
                            if(jogada == 0 && j1 == 1) 
                             System.out.println("Jogador 1 venceu");
                             else
                                 if(jogada == 0 && j1 == 2){
                                     System.out.println("Computador vence");
                                 }
                     
                     if(jogada == 1 && j1 == 1 )                        
                         System.out.println("EMPATE");
                         else
                             if(jogada == 1 && j1 == 2)
                                 System.out.println("JOGADOR 1 VENCEU");
                                 else
                                    if(jogada == 1 && j1 ==0)
                                        System.out.println("COMPUTADOR VENCEU");
                               
                        if( jogada == 2  && j1 == 2)
                            System.out.println("EMPATE");
                            else 
                                if (jogada == 2 && j1== 1)
                                    System.out.println("COMPUTADOR VENCE");
                                    else
                                        if(jogada == 2 && j1 == 0)
                                            System.out.println("JOGADOR 1 VENCEU");                
    }
}
