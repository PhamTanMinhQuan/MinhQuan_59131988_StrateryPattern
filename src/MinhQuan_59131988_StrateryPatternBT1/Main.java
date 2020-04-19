/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT1;

/**
 *
 * @author quan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        
        Context context = new Context();
        System.out.println("\nKet qua: ");
        
        context.setTinhtoan(cong);
        System.out.println("75 + 12 = " +context.tinh(75, 12));
        context.setTinhtoan(tru);
        System.out.println("54 - 78 = " + context.tinh(54, 78));
        
    }
    
}
