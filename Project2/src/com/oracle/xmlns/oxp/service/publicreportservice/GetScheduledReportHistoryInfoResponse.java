
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
 *         &lt;element name="getScheduledReportHistoryInfoReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobHistoryInfos"/>
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
    "getScheduledReportHistoryInfoReturn"
})
@XmlRootElement(name = "getScheduledReportHistoryInfoResponse")
public class GetScheduledReportHistoryInfoResponse {

    @XmlElement(required = true)
    protected JobHistoryInfos getScheduledReportHistoryInfoReturn;

    /**
     * Gets the value of the getScheduledReportHistoryInfoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobHistoryInfos }
     *     
     */
    public JobHistoryInfos getGetScheduledReportHistoryInfoReturn() {
        return getScheduledReportHistoryInfoReturn;
    }

    /**
     * Sets the value of the getScheduledReportHistoryInfoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobHistoryInfos }
     *     
     */
    public void setGetScheduledReportHistoryInfoReturn(JobHistoryInfos value) {
        this.getScheduledReportHistoryInfoReturn = value;
    }

}
