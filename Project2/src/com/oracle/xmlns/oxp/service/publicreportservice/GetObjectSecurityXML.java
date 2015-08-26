
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
 *         &lt;element name="adminUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adminPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isRecursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "adminUsername",
    "adminPassword",
    "objectAbsolutePath",
    "isRecursive"
})
@XmlRootElement(name = "getObjectSecurityXML")
public class GetObjectSecurityXML {

    @XmlElement(required = true)
    protected String adminUsername;
    @XmlElement(required = true)
    protected String adminPassword;
    @XmlElement(required = true)
    protected String objectAbsolutePath;
    protected boolean isRecursive;

    /**
     * Gets the value of the adminUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * Sets the value of the adminUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUsername(String value) {
        this.adminUsername = value;
    }

    /**
     * Gets the value of the adminPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * Sets the value of the adminPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPassword(String value) {
        this.adminPassword = value;
    }

    /**
     * Gets the value of the objectAbsolutePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectAbsolutePath() {
        return objectAbsolutePath;
    }

    /**
     * Sets the value of the objectAbsolutePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectAbsolutePath(String value) {
        this.objectAbsolutePath = value;
    }

    /**
     * Gets the value of the isRecursive property.
     * 
     */
    public boolean isIsRecursive() {
        return isRecursive;
    }

    /**
     * Sets the value of the isRecursive property.
     * 
     */
    public void setIsRecursive(boolean value) {
        this.isRecursive = value;
    }

}
