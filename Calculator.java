/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

                int d = 1;
		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
                        if(a == 0){
                        
                            System.out.println("Bye, now");
                            d = 0;
                            break;
                        }
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
                        else if ( op.equals("-") )
                                c = a - b;
                        else if ( op.equals("/") )
                                c = a / b;
                        else if ( op.equals("*") )
                                c = a * b;
                        else if ( op.equals("^") )
                                c = Math.pow(a, b);
                        else{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( d > 0 );
	}
}
