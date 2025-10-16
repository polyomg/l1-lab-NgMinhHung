package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HinhChuNhatController {
	@RequestMapping("/hinhchunhat/nhap")
	public String nhap() {
		return "hinhchunhat/hinhchunhat";
	}

	@RequestMapping("/hinhchunhat/tinh")
	public String tinh(@RequestParam double chieudai, @RequestParam double chieurong, Model model) {
		double dientich = chieudai * chieurong;
		double chuvi = (chieudai + chieurong) * 2;
		
		model.addAttribute("chieudai", chieudai);
		model.addAttribute("chieurong", chieurong);

		model.addAttribute("dientich", dientich);
		model.addAttribute("chuvi", chuvi);
		return "hinhchunhat/hinhchunhat";
	}
}
