/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119004.muhamadramadan;

/**
 *
 * @author ENDOG
 */
class ServicePrice {
    private float priceService, discount;
    
    public float Discount(String member){
        String kapital = member.toUpperCase();
        if (kapital.equals("Yes")) {
            discount = 10000;
        } else {
            discount = 0;
        }
        return discount;
    }
    
   public float priceService(int choose) {
        if(choose == 1) {
            priceService = 45000;
        } else if(choose == 2) {
            priceService = 35000;
        } else if(choose == 3) {
            priceService = 15000;
        } else {
            priceService = 0;
        }
        return choose;
    }
    
    public float TotalPay(){
        return priceService - discount;
    }
    
}
