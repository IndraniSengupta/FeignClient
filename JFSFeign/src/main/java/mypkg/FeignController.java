package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FeignController {
	
	@GetMapping("/name")
	public String getName() {
		return "Indrani";
	}
	
	@GetMapping("/lastname")
	public String getLastName() {
		return "Sengupta";
	}
	
	@GetMapping("/Status")
	public String getStatus() {
		return "Intern";
	}
	
	
	

}
