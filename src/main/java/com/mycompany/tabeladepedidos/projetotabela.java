package com.mycompany.tabeladepedidos;

import java.util.Locale;
import java.util.Scanner;

public class projetotabela
{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        /* System.out.println("digite um numero:");
        int numero = teclado.nextInt();
        
        if (numero < 0 ) {
            System.out.println("negativo");
                }
        
        else{
            System.out.println("positivo");
        }
        
        
       System.out.println("digite um numero inteiro");
       int numero = teclado.nextInt();
      
       
       if (numero %2 == 0){
           System.out.println("par");
       }
       
       else{
           System.out.println("impar");
       }
         */
        int pedido, quantidade;
        double total;
        
        System.out.println("1  |  cachorro quente   |   R$4.00\n"
                         + "2  |  x-salada          |   R$4.50\n"
                         + "3  |  x-bacon           |   R$5.00\n"
                         + "4  |  torrada simples   |   R$2.00\n"
                         + "5  |  refrigerente      |   R$3.00\n");

        System.out.println("aperte enter para ir ao pedido");
        String enter;
        enter = teclado.nextLine();
        
        
        System.out.println("digite o numero do item do cardapio que deseja comprar");
        pedido = teclado.nextInt();

        if (pedido == 1) {
            System.out.println("escreva a quantidade desejada:");
            quantidade = teclado.nextInt();
            total = quantidade * 4.00;
            System.out.printf("seu/s %d cachorro/s saiu: R$%.2f ", quantidade, total);
        } else {
            if (pedido == 2) {

                System.out.println("escreva a quantidade desejada:");
                quantidade = teclado.nextInt();
                total = quantidade * 4.50;
                System.out.printf("seu/s %d x-salada saiu: R$%.2f", quantidade, total);
            } else {
                if (pedido == 3) {
                    System.out.println("escreva a quantidade desejada:");
                    quantidade = teclado.nextInt();
                    total = quantidade * 5.00;
                    System.out.printf("seu/s %d x-bacon saiu: R$%.2f", quantidade, total);

                } else {
                    if (pedido == 4) {
                        System.out.println("escreva a quantidade desejada:");
                        quantidade = teclado.nextInt();
                        total = quantidade * 2.00;
                        System.out.printf("seu/s %d torrada simples saiu: R$%.2f", quantidade, total);
                    } else {
                        if (pedido == 5) {
                            System.out.println("escreva a quantidade desejada:");
                            quantidade = teclado.nextInt();
                            total = quantidade * 3.00;
                            System.out.printf("seu/s %d refrigerante saiu: R$%.2f", quantidade, total);

                        }

                    }
                }
            }

        }

    }
}
