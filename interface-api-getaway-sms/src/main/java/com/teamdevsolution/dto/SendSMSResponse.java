
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class SendSMSResponse {

    protected String resultCode;
    protected String resultDesc;
    protected String message;

    /**
     * Obtient la valeur de la propriété resultCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Définit la valeur de la propriété resultCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Obtient la valeur de la propriété resultDesc.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * Définit la valeur de la propriété resultDesc.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
