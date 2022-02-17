/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class ImpostoDeRenda {

    public static void main (String[] args){
        
       Scanner teclado = new Scanner(System.in);
       double sal;
       double res;
       
        System.out.println("Olá, para calcular o imposto sobre o seu salário digite o valor referente ao seu salário: ");
       sal = teclado.nextDouble();
       
       if (sal <= 2500){
       
        System.out.println("Isento de imposto.");
       
       } else if (sal > 2500 && sal <= 3200){
           
        res = sal*0.075;
        
        System.out.println("Será aplicado uma porcetagem de 7.5% sobre teu salário, o resultado do seu imposto sobre teu salário é de : "+res);
    
    
             }else if(sal > 3200 && sal <= 4250){
           
                        res = sal*0.15;
        
                        System.out.println("Será aplicado uma porcetagem de 15% sobre teu salário, o resultado do seu imposto sobre teu salário é de : "+res);
                        
                 }else if( sal > 4250 && sal <= 5300){
                   
                     
                        res = sal*0.225;
                        
                        System.out.println("Será aplicado uma porcetagem de 22.5% sobre teu salário, o resultado do seu imposto sobre teu salário é de : "+res);
                     
                        }else {
                     
                             res = sal*0.27;
                        
                             System.out.println("Será aplicado uma porcetagem de 27% sobre teu salário, o resultado do seu imposto sobre teu salário é de : "+res);
                     
    
    
    
        }
        
        
        
    }
}
