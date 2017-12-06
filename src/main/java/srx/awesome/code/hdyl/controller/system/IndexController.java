package srx.awesome.code.hdyl.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping
	public String init() {
		// Resource/spring/ApplicationContext-web.xml中已经配置了前后缀
		return "/system/index";
	}
}
