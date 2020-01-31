package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import task.service.AsyncService;

/**
 * @author: cdf
 * @create: 2020-02-01 00:27
 **/
@RestController
public class AsyncController {

	@Autowired
	AsyncService asyncService;

	@GetMapping("/hello")
	public String hello(){
		asyncService.hello();
		return "success";
	}
}
