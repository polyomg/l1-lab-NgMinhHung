package poly.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AuthController {
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/login/form")
	public String form() {
		return "auth/form";
	}
	
	@RequestMapping("/login/check")
	public String login(Model model) {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(user == null || user.isEmpty() || pass == null || pass.isEmpty()) {
			model.addAttribute("message", "Không được bỏ trống!");
		}else if ("poly".equals(user) && "123".equals(pass)) {
			model.addAttribute("message", "Đăng nhập thành công!");
		}else {
			model.addAttribute("message", "Đăng nhập thất bại");
		}
		return "auth/form";
	}
    
}
