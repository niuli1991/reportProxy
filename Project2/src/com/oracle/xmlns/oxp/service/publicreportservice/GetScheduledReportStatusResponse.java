
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
 *         &lt;element name="getScheduledReportStatusReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobStatus"/>
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
    "getScheduledReportStatusReturn"
})
@XmlRootElement(name = "getScheduledReportStatusResponse")
public class GetScheduledReportStatusResponse {

    @XmlElement(required = true)
    protected JobStatus getScheduledReportStatusReturn;

    /**
     * Gets the value of the getScheduledReportStatusReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatus }
     *     
     */
    public JobStatus getGetScheduledReportStatusReturn() {
        return getScheduledReportStatusReturn;
    }

    /**
     * Sets the value of the getScheduledReportStatusReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatus }
     *     
     */
    public void setGetScheduledReportStatusReturn(JobStatus value) {
        this.getScheduledReportStatusReturn = value;
    }

}
