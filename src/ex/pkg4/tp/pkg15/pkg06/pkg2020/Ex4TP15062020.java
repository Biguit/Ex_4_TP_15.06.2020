/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg4.tp.pkg15.pkg06.pkg2020;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Ex4TP15062020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double N1, N2, N3, DT, X1, X2;
        
    Scanner enter= new Scanner (System.in);
    System.out.println ("Informe o número A: ");
    N1= enter.nextDouble();
    System.out.println ("Informe o número B: ");
    N2= enter.nextDouble();
    System.out.println ("Informe o número C: ");
    N3= enter.nextDouble();
    
    DT= Math.pow(N2, 2) - 4 * N1 * N3 ;
    X1 = (- N2) + Math.sqrt(DT) / (2 * N1);
    X2 = (- N2) - Math.sqrt(DT) / (2 * N1);
    
    System.out.println ("o delta vale: "+ DT);
    if (N1 == 0)
    {
        System.out.println ("Não posso valer 0");
    }
    else
        if (DT > 0)
        {
            System.out.println(X1);
            System.out.println(X2);
        }
    else
        if (DT == 0)
        {
            System.out.println(X1);
        }
    else
    if (DT < 0)
    {
        System.out.println("Valores Inválidos");
        System.out.print("Valores Inválidos");
        
    }

            }
        // TODO code application logic here
    }
    

