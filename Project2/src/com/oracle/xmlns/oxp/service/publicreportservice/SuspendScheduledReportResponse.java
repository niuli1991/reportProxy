
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
 *         &lt;element name="suspendScheduledReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "suspendScheduledReportReturn"
})
@XmlRootElement(name = "suspendScheduledReportResponse")
public class SuspendScheduledReportResponse {

    protected boolean suspendScheduledReportReturn;

    /**
     * Gets the value of the suspendScheduledReportReturn property.
     * 
     */
    public boolean isSuspendScheduledReportReturn() {
        return suspendScheduledReportReturn;
    }

    /**
     * Sets the value of the suspendScheduledReportReturn property.
     * 
     */
    public void setSuspendScheduledReportReturn(boolean value) {
        this.suspendScheduledReportReturn = value;
    }

}
