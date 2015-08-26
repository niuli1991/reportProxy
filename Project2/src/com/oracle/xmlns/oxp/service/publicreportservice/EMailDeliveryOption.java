
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailDeliveryOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailDeliveryOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailBCC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailBody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailCC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailReplyTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailDeliveryOption", propOrder = {
    "emailBCC",
    "emailBody",
    "emailCC",
    "emailFrom",
    "emailReplyTo",
    "emailServerName",
    "emailSubject",
    "emailTo"
})
public class EMailDeliveryOption {

    @XmlElement(required = true, nillable = true)
    protected String emailBCC;
    @XmlElement(required = true, nillable = true)
    protected String emailBody;
    @XmlElement(required = true, nillable = true)
    protected String emailCC;
    @XmlElement(required = true, nillable = true)
    protected String emailFrom;
    @XmlElement(required = true, nillable = true)
    protected String emailReplyTo;
    @XmlElement(required = true, nillable = true)
    protected String emailServerName;
    @XmlElement(required = true, nillable = true)
    protected String emailSubject;
    @XmlElement(required = true, nillable = true)
    protected String emailTo;

    /**
     * Gets the value of the emailBCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBCC() {
        return emailBCC;
    }

    /**
     * Sets the value of the emailBCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBCC(String value) {
        this.emailBCC = value;
    }

    /**
     * Gets the value of the emailBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBody() {
        return emailBody;
    }

    /**
     * Sets the value of the emailBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBody(String value) {
        this.emailBody = value;
    }

    /**
     * Gets the value of the emailCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCC() {
        return emailCC;
    }

    /**
     * Sets the value of the emailCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCC(String value) {
        this.emailCC = value;
    }

    /**
     * Gets the value of the emailFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFrom() {
        return emailFrom;
    }

    /**
     * Sets the value of the emailFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFrom(String value) {
        this.emailFrom = value;
    }

    /**
     * Gets the value of the emailReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReplyTo() {
        return emailReplyTo;
    }

    /**
     * Sets the value of the emailReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReplyTo(String value) {
        this.emailReplyTo = value;
    }

    /**
     * Gets the value of the emailServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailServerName() {
        return emailServerName;
    }

    /**
     * Sets the value of the emailServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailServerName(String value) {
        this.emailServerName = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the emailTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * Sets the value of the emailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTo(String value) {
        this.emailTo = value;
    }

}
