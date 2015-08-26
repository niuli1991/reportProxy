
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
 *         &lt;element name="getScheduledReportInfoInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobInfos"/>
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
    "getScheduledReportInfoInSessionReturn"
})
@XmlRootElement(name = "getScheduledReportInfoInSessionResponse")
public class GetScheduledReportInfoInSessionResponse {

    @XmlElement(required = true)
    protected JobInfos getScheduledReportInfoInSessionReturn;

    /**
     * Gets the value of the getScheduledReportInfoInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfos }
     *     
     */
    public JobInfos getGetScheduledReportInfoInSessionReturn() {
        return getScheduledReportInfoInSessionReturn;
    }

    /**
     * Sets the value of the getScheduledReportInfoInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfos }
     *     
     */
    public void setGetScheduledReportInfoInSessionReturn(JobInfos value) {
        this.getScheduledReportInfoInSessionReturn = value;
    }

}
