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
public class Context {
    private Tinh tinhToan;
    public void setTinhtoan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
