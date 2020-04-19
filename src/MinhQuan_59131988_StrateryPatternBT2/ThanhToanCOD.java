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
public class ThanhToanCOD implements IThanhToan{
    @Override
    public double thanhToan(int tienHang){
        if(tienHang > 2000000)
        {
            return 0.02*tienHang;
        }
        else
        {
            return tienHang;
        }
    }
    
}
