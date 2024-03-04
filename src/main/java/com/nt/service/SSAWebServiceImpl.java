package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.binding.SSAWebRequest;
import com.nt.binding.SSAWebResponse;

@Service
public class SSAWebServiceImpl implements SSAWebService {

	@Override
	public SSAWebResponse getCitizenInfo(SSAWebRequest request) {
		
		SSAWebResponse response=new SSAWebResponse();
		
		
		Long ssn = request.getSsn();
		response.setSsn(ssn);

		String ssnStr = String.valueOf(ssn);

		if (ssnStr.startsWith("1")) {
              response.setStateName("New Jersey");
		} else if (ssnStr.startsWith("2")) {
			response.setStateName("Texax");
		} else if (ssnStr.startsWith("3")) {
			response.setStateName("Dallas");
		} else if (ssnStr.startsWith("4")) {
			response.setStateName("Rhode Island");
		} else if (ssnStr.startsWith("5")) {
			response.setStateName("Ohio");
		} else if (ssnStr.startsWith("6")) {
			response.setStateName("Albama");
		} else if (ssnStr.startsWith("7")) {
			response.setStateName("Kentucky");
		} else if (ssnStr.startsWith("8")) {
			response.setStateName("California");
		}
		else if (ssnStr.startsWith("9")) {
			response.setStateName("Standford");
		}
          return response;
	}

}
