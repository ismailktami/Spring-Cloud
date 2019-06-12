package org.sid.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sid.dao.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class CompanyRestService {
	@Value("${xParam}")
	private int xParam;
	
	
	@Autowired
	private CompanyRepository cpp;

	
	@GetMapping("/myConfig")
	public Map<String,Object> myconfig(){
		Map<String,Object> params=new HashMap<String, Object>();
		params.put("xParam", xParam);
		params.put("hey", "dvnkdfnvdnfmkmkdmk");

		params.put("threadName", Thread.currentThread().getName());
		
		return params;
	}
	
	
	
	




}
