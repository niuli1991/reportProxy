
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
 *         &lt;element name="isReportExistInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isReportExistInSessionReturn"
})
@XmlRootElement(name = "isReportExistInSessionResponse")
public class IsReportExistInSessionResponse {

    protected boolean isReportExistInSessionReturn;

    /**
     * Gets the value of the isReportExistInSessionReturn property.
     * 
     */
    public boolean isIsReportExistInSessionReturn() {
        return isReportExistInSessionReturn;
    }

    /**
     * Sets the value of the isReportExistInSessionReturn property.
     * 
     */
    public void setIsReportExistInSessionReturn(boolean value) {
        this.isReportExistInSessionReturn = value;
    }

}
