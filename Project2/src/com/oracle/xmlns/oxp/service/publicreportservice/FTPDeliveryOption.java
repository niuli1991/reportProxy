
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTPDeliveryOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTPDeliveryOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftpServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpUserPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remoteFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sftpOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTPDeliveryOption", propOrder = {
    "ftpServerName",
    "ftpUserName",
    "ftpUserPassword",
    "remoteFile",
    "sftpOption"
})
public class FTPDeliveryOption {

    @XmlElement(required = true, nillable = true)
    protected String ftpServerName;
    @XmlElement(required = true, nillable = true)
    protected String ftpUserName;
    @XmlElement(required = true, nillable = true)
    protected String ftpUserPassword;
    @XmlElement(required = true, nillable = true)
    protected String remoteFile;
    protected boolean sftpOption;

    /**
     * Gets the value of the ftpServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpServerName() {
        return ftpServerName;
    }

    /**
     * Sets the value of the ftpServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpServerName(String value) {
        this.ftpServerName = value;
    }

    /**
     * Gets the value of the ftpUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUserName() {
        return ftpUserName;
    }

    /**
     * Sets the value of the ftpUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUserName(String value) {
        this.ftpUserName = value;
    }

    /**
     * Gets the value of the ftpUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUserPassword() {
        return ftpUserPassword;
    }

    /**
     * Sets the value of the ftpUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUserPassword(String value) {
        this.ftpUserPassword = value;
    }

    /**
     * Gets the value of the remoteFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteFile() {
        return remoteFile;
    }

    /**
     * Sets the value of the remoteFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteFile(String value) {
        this.remoteFile = value;
    }

    /**
     * Gets the value of the sftpOption property.
     * 
     */
    public boolean isSftpOption() {
        return sftpOption;
    }

    /**
     * Sets the value of the sftpOption property.
     * 
     */
    public void setSftpOption(boolean value) {
        this.sftpOption = value;
    }

}
