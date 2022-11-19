/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package service.impl;

import domainModel.LoaiDongHo;
import java.util.ArrayList;
import java.util.List;
import repository.impl.LoaiDongHoRepository;
import service.LoaiDongHoService;
import viewModel.LoaiDongHoResponse;

/**
 *
 * @author Admin
 */
public class LoaiDongHoServiceImpl implements LoaiDongHoService {

    LoaiDongHoRepository ldhRepo = new LoaiDongHoRepository();

//    public static void main(String[] args) {
//        List<LoaiDongHoResponse> list = new ArrayList<>();
//        list = new LoaiDongHoServiceImpl().getAllRespone();
//        for (LoaiDongHoResponse x : list) {
//            System.out.println(x.getMa());
//
//        }
//
//    }

    @Override
    public List<LoaiDongHoResponse> getAllRespone() {
        return ldhRepo.getAllResponse();
    }
}
