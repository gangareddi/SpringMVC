package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springmvc {
	
	@RequestMapping("/")
	public ModelAndView getSample(){
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("message", "hello ganga");
		modelAndView.setViewName("home");
		return modelAndView;
	}

}
