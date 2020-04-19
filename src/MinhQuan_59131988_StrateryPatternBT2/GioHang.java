/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT2;
import java.util.ArrayList;
/**
 *
 * @author quan
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dSHH;
    public void setHinhThucTT(IThanhToan hinhThucTT){
        this.hinhThucTT = hinhThucTT;
    }
    public void setHangHoa(){
        this.dSHH = dSHH;
    }
    
    public double thanhToan(){
        int i;
        int soTien = 0;
        for(i=0; i < dSHH.size(); i++){
            soTien = soTien + dSHH.get(i).getGia();
        }
        return hinhThucTT.thanhToan(soTien);
    }
}
