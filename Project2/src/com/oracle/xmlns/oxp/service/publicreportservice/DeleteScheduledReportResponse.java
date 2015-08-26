
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
 *         &lt;element name="deleteScheduledReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteScheduledReportReturn"
})
@XmlRootElement(name = "deleteScheduledReportResponse")
public class DeleteScheduledReportResponse {

    protected boolean deleteScheduledReportReturn;

    /**
     * Gets the value of the deleteScheduledReportReturn property.
     * 
     */
    public boolean isDeleteScheduledReportReturn() {
        return deleteScheduledReportReturn;
    }

    /**
     * Sets the value of the deleteScheduledReportReturn property.
     * 
     */
    public void setDeleteScheduledReportReturn(boolean value) {
        this.deleteScheduledReportReturn = value;
    }

}
