
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="isFolderExistInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isFolderExistInSessionReturn"
})
@XmlRootElement(name = "isFolderExistInSessionResponse")
public class IsFolderExistInSessionResponse {

    protected boolean isFolderExistInSessionReturn;

    /**
     * Gets the value of the isFolderExistInSessionReturn property.
     * 
     */
    public boolean isIsFolderExistInSessionReturn() {
        return isFolderExistInSessionReturn;
    }

    /**
     * Sets the value of the isFolderExistInSessionReturn property.
     * 
     */
    public void setIsFolderExistInSessionReturn(boolean value) {
        this.isFolderExistInSessionReturn = value;
    }

}
