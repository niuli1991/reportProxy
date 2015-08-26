
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
 *         &lt;element name="reportObjectAbsolutePathURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectZippedData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportObjectAbsolutePathURL",
    "objectType",
    "objectZippedData",
    "bipSessionToken"
})
@XmlRootElement(name = "uploadReportObjectInSession")
public class UploadReportObjectInSession {

    @XmlElement(required = true)
    protected String reportObjectAbsolutePathURL;
    @XmlElement(required = true)
    protected String objectType;
    @XmlElement(required = true)
    protected byte[] objectZippedData;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the reportObjectAbsolutePathURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportObjectAbsolutePathURL() {
        return reportObjectAbsolutePathURL;
    }

    /**
     * Sets the value of the reportObjectAbsolutePathURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportObjectAbsolutePathURL(String value) {
        this.reportObjectAbsolutePathURL = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectZippedData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getObjectZippedData() {
        return objectZippedData;
    }

    /**
     * Sets the value of the objectZippedData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setObjectZippedData(byte[] value) {
        this.objectZippedData = ((byte[]) value);
    }

    /**
     * Gets the value of the bipSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Sets the value of the bipSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
