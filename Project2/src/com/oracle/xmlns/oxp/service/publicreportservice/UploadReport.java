
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
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folderAbsolutePathURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportZippedData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportName",
    "folderAbsolutePathURL",
    "reportZippedData",
    "userID",
    "password"
})
@XmlRootElement(name = "uploadReport")
public class UploadReport {

    @XmlElement(required = true)
    protected String reportName;
    @XmlElement(required = true)
    protected String folderAbsolutePathURL;
    @XmlElement(required = true)
    protected byte[] reportZippedData;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the folderAbsolutePathURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderAbsolutePathURL() {
        return folderAbsolutePathURL;
    }

    /**
     * Sets the value of the folderAbsolutePathURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderAbsolutePathURL(String value) {
        this.folderAbsolutePathURL = value;
    }

    /**
     * Gets the value of the reportZippedData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportZippedData() {
        return reportZippedData;
    }

    /**
     * Sets the value of the reportZippedData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportZippedData(byte[] value) {
        this.reportZippedData = ((byte[]) value);
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
