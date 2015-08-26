
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryChannels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryChannels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfEMailDeliveryOption"/>
 *         &lt;element name="faxOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfFaxDeliveryOption"/>
 *         &lt;element name="ftpOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfFTPDeliveryOption"/>
 *         &lt;element name="localOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfLocalDeliveryOption"/>
 *         &lt;element name="printOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfPrintDeliveryOption"/>
 *         &lt;element name="webDAVOptions" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfWebDAVDeliveryOption"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryChannels", propOrder = {
    "emailOptions",
    "faxOptions",
    "ftpOptions",
    "localOptions",
    "printOptions",
    "webDAVOptions"
})
public class DeliveryChannels {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfEMailDeliveryOption emailOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFaxDeliveryOption faxOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFTPDeliveryOption ftpOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLocalDeliveryOption localOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrintDeliveryOption printOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWebDAVDeliveryOption webDAVOptions;

    /**
     * Gets the value of the emailOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEMailDeliveryOption }
     *     
     */
    public ArrayOfEMailDeliveryOption getEmailOptions() {
        return emailOptions;
    }

    /**
     * Sets the value of the emailOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEMailDeliveryOption }
     *     
     */
    public void setEmailOptions(ArrayOfEMailDeliveryOption value) {
        this.emailOptions = value;
    }

    /**
     * Gets the value of the faxOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaxDeliveryOption }
     *     
     */
    public ArrayOfFaxDeliveryOption getFaxOptions() {
        return faxOptions;
    }

    /**
     * Sets the value of the faxOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaxDeliveryOption }
     *     
     */
    public void setFaxOptions(ArrayOfFaxDeliveryOption value) {
        this.faxOptions = value;
    }

    /**
     * Gets the value of the ftpOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFTPDeliveryOption }
     *     
     */
    public ArrayOfFTPDeliveryOption getFtpOptions() {
        return ftpOptions;
    }

    /**
     * Sets the value of the ftpOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFTPDeliveryOption }
     *     
     */
    public void setFtpOptions(ArrayOfFTPDeliveryOption value) {
        this.ftpOptions = value;
    }

    /**
     * Gets the value of the localOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocalDeliveryOption }
     *     
     */
    public ArrayOfLocalDeliveryOption getLocalOptions() {
        return localOptions;
    }

    /**
     * Sets the value of the localOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocalDeliveryOption }
     *     
     */
    public void setLocalOptions(ArrayOfLocalDeliveryOption value) {
        this.localOptions = value;
    }

    /**
     * Gets the value of the printOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrintDeliveryOption }
     *     
     */
    public ArrayOfPrintDeliveryOption getPrintOptions() {
        return printOptions;
    }

    /**
     * Sets the value of the printOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrintDeliveryOption }
     *     
     */
    public void setPrintOptions(ArrayOfPrintDeliveryOption value) {
        this.printOptions = value;
    }

    /**
     * Gets the value of the webDAVOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebDAVDeliveryOption }
     *     
     */
    public ArrayOfWebDAVDeliveryOption getWebDAVOptions() {
        return webDAVOptions;
    }

    /**
     * Sets the value of the webDAVOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebDAVDeliveryOption }
     *     
     */
    public void setWebDAVOptions(ArrayOfWebDAVDeliveryOption value) {
        this.webDAVOptions = value;
    }

}
