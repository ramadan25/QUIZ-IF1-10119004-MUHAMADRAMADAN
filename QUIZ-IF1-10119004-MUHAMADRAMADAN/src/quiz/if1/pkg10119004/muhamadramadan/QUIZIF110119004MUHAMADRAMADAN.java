/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119004.muhamadramadan;

import java.util.Scanner;

/**
 *
 * @author ENDOG
 */
public class QUIZIF110119004MUHAMADRAMADAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Costumer costumer = new Costumer();
        ServicePrice price = new ServicePrice();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Costumer Name : ");
        costumer.setName(scanner.next());
        System.out.print("Costumer email : ");
        costumer.setEmail(scanner.next());
        
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1.Haircut : IDR 45K");
        System.out.println("2.Haircut and Hairwash : IDR 55K");
        System.out.println("3.Hairwash only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3) : ");
        costumer.setChoose(scanner.nextInt());
        System.out.print("Are you Member (Yes/No) : ");
        costumer.setMember(scanner.next());
        
        int choose = costumer.getChoose();
        String member = costumer.getMember();
        
        System.out.println("#*************************#");
        System.out.println("#*****Costumer Invoice****#");
        System.out.println("Service Price\t: " + price.priceService(choose));
        System.out.println("Discount\t: " + price.Discount(member));
        System.out.println("Total Pay\t\t: " + price.TotalPay());
    }
    
}
