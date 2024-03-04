package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.SSAWebRequest;
import com.nt.binding.SSAWebResponse;
import com.nt.service.SSAWebService;


@RestController
public class SSAWebRestController {
	
	@Autowired
	private SSAWebService service;
	
	@PostMapping("/ssa")
    public SSAWebResponse getCitizenInfo(@RequestBody SSAWebRequest req) {
    	return service.getCitizenInfo(req);
    }

}
