package nuc.edu.cn.controller;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("get")
	public String  GetMapping() {
		return "dfsdf";
	}
	
	
}
