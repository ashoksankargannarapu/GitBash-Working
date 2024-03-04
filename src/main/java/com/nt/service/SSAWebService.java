package com.nt.service;

import com.nt.binding.SSAWebRequest;
import com.nt.binding.SSAWebResponse;

public interface SSAWebService {
	
	public SSAWebResponse getCitizenInfo(SSAWebRequest request);

}
