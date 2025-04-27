package thiGK.ntu64132072.HoTanTai_BaiThiGK_Lan2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String dashBoard(ModelMap model) {
        model.addAttribute("mssv", "64132072");
        model.addAttribute("hoTen", "Hồ Tấn Tài");
        model.addAttribute("namSinh","2004" );
        model.addAttribute("gioiTinh", "Nam");
        return "Dashboard";
    }
}