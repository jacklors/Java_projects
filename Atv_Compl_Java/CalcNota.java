
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bruno
 */
public class CalcNota {
    
    public static void main (String[] args){
    
     Scanner ler = new Scanner(System.in);
     
     String nome;
     
     double n1,n2,n3,n4,res;
     
        System.out.println("Olá, digite seu nome: ");
        nome = ler.next();
     
        System.out.println("Olá!, digite sua nota total do primeiro bimestre: ");
        n1 = ler.nextDouble();
        
        System.out.println("Olá!, digite sua nota total do segundo bimestre: ");
        n2 = ler.nextDouble();
        
        System.out.println("Olá!, digite sua nota total do terceiro bimestre: ");
        n3 = ler.nextDouble();
        
        System.out.println("Olá!, digite sua nota total do quarto bimestre: ");
        n4 = ler.nextDouble();
        
        
        res = (n1+n2+n3+n4);
        if (res < 50){
            
            System.out.println("REPROVADO");
            
            
            
        } else if(res == 50 ){
            
            System.out.println("RECUPERAÇÃO");
            
            
        } else if(res > 50){
        
        System.out.println("APROVADO");
        
            
    
    
            }  
     }
        

    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    }
    
    
   
    
}
