
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doS2S complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doS2S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsmsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsmsisdn2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callbackurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message_s2s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DoS2S {

    protected String subsmsisdn;
    protected String subsmsisdn2;
    protected String callbackurl;
    protected String partnId;
    protected String transid;
    protected String currency;
    protected String amount;
    @XmlElement(name = "message_s2s")
    protected String messageS2S;

    /**
     * Obtient la valeur de la propriété subsmsisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsmsisdn() {
        return subsmsisdn;
    }

    /**
     * Définit la valeur de la propriété subsmsisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsmsisdn(String value) {
        this.subsmsisdn = value;
    }

    /**
     * Obtient la valeur de la propriété subsmsisdn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsmsisdn2() {
        return subsmsisdn2;
    }

    /**
     * Définit la valeur de la propriété subsmsisdn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsmsisdn2(String value) {
        this.subsmsisdn2 = value;
    }

    /**
     * Obtient la valeur de la propriété callbackurl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    /**
     * Définit la valeur de la propriété callbackurl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackurl(String value) {
        this.callbackurl = value;
    }

    /**
     * Obtient la valeur de la propriété partnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnId() {
        return partnId;
    }

    /**
     * Définit la valeur de la propriété partnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnId(String value) {
        this.partnId = value;
    }

    /**
     * Obtient la valeur de la propriété transid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransid() {
        return transid;
    }

    /**
     * Définit la valeur de la propriété transid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransid(String value) {
        this.transid = value;
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété messageS2S.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageS2S() {
        return messageS2S;
    }

    /**
     * Définit la valeur de la propriété messageS2S.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageS2S(String value) {
        this.messageS2S = value;
    }

}
