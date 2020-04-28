package com.fss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import redis.clients.jedis.Jedis;

@Controller
public class HelloController {

    private static int count = 0;
	Jedis jedis;
	
	@GetMapping("/welcome")
    public String hello(Model model,
                        @RequestParam(value="name", required=false, defaultValue="World") String name) {

        // if(jedis == null)
		// {
		// 	jedis = new Jedis("redis-server");
		// 	System.out.println("Connected to Redis");
		// }
		
		// count = count + 1 ;
		// jedis.set("counter", Integer.toString(count));
		// model.addAttribute("count",jedis.get("counter"));

        model.addAttribute("name", name);
        return "hello";
    }
}
