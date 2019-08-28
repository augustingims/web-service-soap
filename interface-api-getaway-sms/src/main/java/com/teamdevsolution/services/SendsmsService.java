package com.teamdevsolution.services;

import com.teamdevsolution.dto.SendSMS;
import com.teamdevsolution.dto.SendSMSResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService(name = "SendsmsService", targetNamespace = "http://services.ws.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface SendsmsService {

    @WebMethod(action = "sendSMS")
    public SendSMSResponse sendSMS(@WebParam(name = "sendSMS", targetNamespace = "")SendSMS sendSMS);
}
