/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author congh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienResponse {

    private UUID id;
    private String ma;
    private String hoVaTen;
    private Integer gioiTinh;
    private String ngaySinh;
    private Integer chucVu;
    private String diaChi;
    private String sdt;

    public Object[] toDataRow(int index) {
        return new Object[]{index, ma, hoVaTen, gioiTinh, ngaySinh, chucVu, diaChi, sdt};
    }

}
