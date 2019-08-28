package com.teamdevsolution.services.impl;

import com.teamdevsolution.dto.*;

import com.teamdevsolution.services.ApigwomService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService(serviceName = "ApigwomService", endpointInterface = "com.teamdevsolution.services.ApigwomService", portName = "ApigwomPort")
@Service("exposedApigwomServiceID")
public class ApigwomServiceImpl implements ApigwomService {

    @Override
    public TcheckBalResponse TcheckBal(TcheckBal tcheckBal) {
        TcheckBalResponse x = new TcheckBalResponse();
        x.setPartnId("400");
        return x;
    }

    @Override
    public DoCheckTransResponse doCheckTrans(DoCheckTrans doCheckTrans) {
        return new DoCheckTransResponse();
    }

    @Override
    public DoM2MResponse doM2M(DoM2M doM2M) {
        return new DoM2MResponse();
    }

    @Override
    public DoM2SResponse doM2S(DoM2S doM2S){
        return new DoM2SResponse();
    }

    @Override
    public DoS2MResponse doS2M(DoS2M doS2M) {
        return new DoS2MResponse();
    }

    @Override
    public DoS2SResponse doS2S(DoS2S doS2S) {
        return new DoS2SResponse();
    }
}
