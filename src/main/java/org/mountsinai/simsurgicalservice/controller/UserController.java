/**
 * 
 */
package org.mountsinai.simsurgicalservice.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author chintr05
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	
	@GetMapping("/hello")
	public String hello() {
		
		try {
			logger.info("Say Hello");
			
		}catch(Exception ex) {
			logger.error("Signup: An error occured while trying to save the new user", ex);
			logger.error(ex.getMessage());
		}
		
		return "Hello";
	}

}
