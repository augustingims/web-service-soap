package com.teamdevsolution.services.impl;

import com.teamdevsolution.dto.SendSMS;
import com.teamdevsolution.dto.SendSMSResponse;
import com.teamdevsolution.services.SendsmsService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService(serviceName = "SendsmsService", endpointInterface = "com.teamdevsolution.services.SendsmsService", portName = "SendsmsPort")
@Service("exposedSendsmsServiceID")
public class SendsmsServiceImpl implements SendsmsService {

    @Override
    public SendSMSResponse sendSMS(SendSMS sendSMS) {
        return new SendSMSResponse();
    }
}
