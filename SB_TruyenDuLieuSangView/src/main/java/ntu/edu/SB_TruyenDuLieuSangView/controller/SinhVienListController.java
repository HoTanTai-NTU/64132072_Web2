package ntu.edu.SB_TruyenDuLieuSangView.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.edu.SB_TruyenDuLieuSangView.model.*;

@Controller
public class SinhVienListController {
	SinhVienList sinhVienList = new SinhVienList();
	
	public SinhVienListController() {
        sinhVienList.addSinhVien(new SinhVien("64132072", "Hồ Tấn Tài", 2004, "Nam"));
        sinhVienList.addSinhVien(new SinhVien("64130005", "Nguyễn Duy An", 2004, "Nam"));
    }

    @GetMapping("/sinhvienlist")
    public String getSinhVien(Model model) {
        model.addAttribute("sinhViens", sinhVienList.getSinhViens());
        return "sinhvienlist"; 
    }
}