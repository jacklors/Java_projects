
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Comentário em linha

import java.time.Year;
import java.time.YearMonth;

/*
Comentário em quebra de linha
*/

/**
 *
 * @author Bruno
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = YearMonth.now().getYear();//Adicionando a classe java.time.year, para atualizar o ano de acordo com o sistema.
        
        int anoAtual = year;//Variável Contendo o ano atual em que estamos 

	System.out.print("Hello,World! We are in the year of "+ anoAtual+".");//Saída de dados com uma mensagem de "Olá, Mundo! Estamos no ano de 2022", a chamada da variável anoAtual está incluida dentro da caixa de texto.


    }
    
}
