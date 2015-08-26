
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
 *         &lt;element name="getScheduledReportHistoryInfoInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobHistoryInfos"/>
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
    "getScheduledReportHistoryInfoInSessionReturn"
})
@XmlRootElement(name = "getScheduledReportHistoryInfoInSessionResponse")
public class GetScheduledReportHistoryInfoInSessionResponse {

    @XmlElement(required = true)
    protected JobHistoryInfos getScheduledReportHistoryInfoInSessionReturn;

    /**
     * Gets the value of the getScheduledReportHistoryInfoInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobHistoryInfos }
     *     
     */
    public JobHistoryInfos getGetScheduledReportHistoryInfoInSessionReturn() {
        return getScheduledReportHistoryInfoInSessionReturn;
    }

    /**
     * Sets the value of the getScheduledReportHistoryInfoInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobHistoryInfos }
     *     
     */
    public void setGetScheduledReportHistoryInfoInSessionReturn(JobHistoryInfos value) {
        this.getScheduledReportHistoryInfoInSessionReturn = value;
    }

}
