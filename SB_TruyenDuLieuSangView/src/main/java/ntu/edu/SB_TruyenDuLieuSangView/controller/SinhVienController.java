package ntu.edu.SB_TruyenDuLieuSangView.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import ntu.edu.SB_TruyenDuLieuSangView.model.SinhVien;
@Controller
public class SinhVienController {
	@GetMapping("/sinhvien")
	public String getSinhVien(Model model) {
        SinhVien sinhVien = new SinhVien("64132072", "Hồ Tấn Tài", 2004, "Nam");
        SinhVien sinhVien2 = new SinhVien("64130005", "Nguyễn Duy An", 2004, "Nam");
        model.addAttribute("sinhVien", sinhVien);
        model.addAttribute("sinhVien2", sinhVien2);
        return "sinhvien";
    }
}
