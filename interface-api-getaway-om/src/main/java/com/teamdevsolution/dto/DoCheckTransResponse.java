
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doCheckTransResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doCheckTransResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entite5CheckTransResponse" type="{http://services.ws1.com/}entite5CheckTransResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DoCheckTransResponse {

    protected String resultCode;
    protected String resultDesc;
    protected String transId;

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
     * Obtient la valeur de la propriété transId.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Définit la valeur de la propriété transId.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransId(String value) {
        this.transId = value;
    }


}
