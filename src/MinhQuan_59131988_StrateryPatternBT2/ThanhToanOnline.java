/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT2;

/**
 *
 * @author quan
 */
public class ThanhToanOnline implements IThanhToan{
    public double thanhToan(int tienHang){
        if(tienHang < 1000000)
        {
            return 0.05*tienHang;
        }
        else
        {
            return 0.07*tienHang;
        }
    }
    
}
