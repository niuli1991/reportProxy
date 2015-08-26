
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryServiceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryServiceDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMailServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="FTPServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="HTTPServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="SFTPServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="defaultServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="faxServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="printerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="webDAVServerNames" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryServiceDefinition", propOrder = {
    "eMailServerNames",
    "ftpServerNames",
    "httpServerNames",
    "sftpServerNames",
    "defaultServerNames",
    "faxServerNames",
    "printerNames",
    "webDAVServerNames"
})
public class DeliveryServiceDefinition {

    @XmlElement(name = "EMailServerNames", required = true, nillable = true)
    protected ArrayOfString eMailServerNames;
    @XmlElement(name = "FTPServerNames", required = true, nillable = true)
    protected ArrayOfString ftpServerNames;
    @XmlElement(name = "HTTPServerNames", required = true, nillable = true)
    protected ArrayOfString httpServerNames;
    @XmlElement(name = "SFTPServerNames", required = true, nillable = true)
    protected ArrayOfString sftpServerNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString defaultServerNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString faxServerNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString printerNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString webDAVServerNames;

    /**
     * Gets the value of the eMailServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEMailServerNames() {
        return eMailServerNames;
    }

    /**
     * Sets the value of the eMailServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEMailServerNames(ArrayOfString value) {
        this.eMailServerNames = value;
    }

    /**
     * Gets the value of the ftpServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFTPServerNames() {
        return ftpServerNames;
    }

    /**
     * Sets the value of the ftpServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFTPServerNames(ArrayOfString value) {
        this.ftpServerNames = value;
    }

    /**
     * Gets the value of the httpServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHTTPServerNames() {
        return httpServerNames;
    }

    /**
     * Sets the value of the httpServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHTTPServerNames(ArrayOfString value) {
        this.httpServerNames = value;
    }

    /**
     * Gets the value of the sftpServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSFTPServerNames() {
        return sftpServerNames;
    }

    /**
     * Sets the value of the sftpServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSFTPServerNames(ArrayOfString value) {
        this.sftpServerNames = value;
    }

    /**
     * Gets the value of the defaultServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDefaultServerNames() {
        return defaultServerNames;
    }

    /**
     * Sets the value of the defaultServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDefaultServerNames(ArrayOfString value) {
        this.defaultServerNames = value;
    }

    /**
     * Gets the value of the faxServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFaxServerNames() {
        return faxServerNames;
    }

    /**
     * Sets the value of the faxServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFaxServerNames(ArrayOfString value) {
        this.faxServerNames = value;
    }

    /**
     * Gets the value of the printerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrinterNames() {
        return printerNames;
    }

    /**
     * Sets the value of the printerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrinterNames(ArrayOfString value) {
        this.printerNames = value;
    }

    /**
     * Gets the value of the webDAVServerNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWebDAVServerNames() {
        return webDAVServerNames;
    }

    /**
     * Sets the value of the webDAVServerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWebDAVServerNames(ArrayOfString value) {
        this.webDAVServerNames = value;
    }

}
