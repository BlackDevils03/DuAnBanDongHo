/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package service;

import domainModel.ChiTietSanPham;
import java.util.List;
import viewModel.ChiTietSanPhamResponse;

/**
 *
 * @author Admin
 */
public interface ChiTietSanPhamService {

    List<ChiTietSanPhamResponse> getAllChiTietSanPham();

    List<ChiTietSanPham> getAll();

    String insert(ChiTietSanPham ctsp);

    String update(ChiTietSanPham ctsp);

}
