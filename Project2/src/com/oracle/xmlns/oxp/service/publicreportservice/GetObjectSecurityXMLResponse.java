
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getObjectSecurityXMLReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getObjectSecurityXMLReturn"
})
@XmlRootElement(name = "getObjectSecurityXMLResponse")
public class GetObjectSecurityXMLResponse {

    @XmlElement(required = true)
    protected byte[] getObjectSecurityXMLReturn;

    /**
     * Gets the value of the getObjectSecurityXMLReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetObjectSecurityXMLReturn() {
        return getObjectSecurityXMLReturn;
    }

    /**
     * Sets the value of the getObjectSecurityXMLReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetObjectSecurityXMLReturn(byte[] value) {
        this.getObjectSecurityXMLReturn = ((byte[]) value);
    }

}
