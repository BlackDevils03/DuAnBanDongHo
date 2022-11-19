/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package service.impl;

import domainModel.ChiTietSanPham;
import java.util.ArrayList;
import java.util.List;
import repository.impl.ChiTietSanPhamRepository;
import service.ChiTietSanPhamService;
import viewModel.ChiTietSanPhamResponse;

/**
 *
 * @author Admin
 */
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    ChiTietSanPhamRepository ctSpRepo = new ChiTietSanPhamRepository();

    @Override
    public List<ChiTietSanPhamResponse> getAllChiTietSanPham() {
        return ctSpRepo.getAllResponse();
    }

    @Override
    public List<ChiTietSanPham> getAll() {
        return ctSpRepo.getAll();
    }
    
//    public static void main(String[] args) {
//        ChiTietSanPhamService sv = new ChiTietSanPhamServiceImpl();
//        List<ChiTietSanPham> lst = sv.getAll();
//        for (ChiTietSanPham x : lst) {
//            System.out.println(x.getLoaiDongHo().getId());
//        }
//    }

    public static void main(String[] args) {
        List<ChiTietSanPhamResponse> list = new ArrayList<>();
        list = new ChiTietSanPhamServiceImpl().getAllChiTietSanPham();
        for (ChiTietSanPhamResponse x : list) {
            System.out.println(x.getId());
        }
    }
    @Override
    public String insert(ChiTietSanPham ctsp) {
        ctsp = ctSpRepo.saveOrUpdate(ctsp);
        if (ctsp != null) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String update(ChiTietSanPham ctsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
