
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSMS", propOrder = {
    "sender",
    "msisdn",
    "message",
    "flash",
    "partnId",
    "partnName"
})
public class SendSMS {

    protected String sender;
    protected String msisdn;
    protected String message;
    protected String flash;
    protected String partnId;
    protected String partnName;


    public String getSender() {
        return sender;
    }

    public void setSender(String value) {
        this.sender = value;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFlash() {
        return flash;
    }

    public void setFlash(String flash) {
        this.flash = flash;
    }

    public String getPartnId() {
        return partnId;
    }

    public void setPartnId(String partnId) {
        this.partnId = partnId;
    }

    public String getPartnName() {
        return partnName;
    }

    public void setPartnName(String partnName) {
        this.partnName = partnName;
    }
}
