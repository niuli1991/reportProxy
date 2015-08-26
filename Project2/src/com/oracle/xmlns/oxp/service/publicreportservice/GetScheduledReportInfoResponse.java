
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
 *         &lt;element name="getScheduledReportInfoReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobInfos"/>
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
    "getScheduledReportInfoReturn"
})
@XmlRootElement(name = "getScheduledReportInfoResponse")
public class GetScheduledReportInfoResponse {

    @XmlElement(required = true)
    protected JobInfos getScheduledReportInfoReturn;

    /**
     * Gets the value of the getScheduledReportInfoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfos }
     *     
     */
    public JobInfos getGetScheduledReportInfoReturn() {
        return getScheduledReportInfoReturn;
    }

    /**
     * Sets the value of the getScheduledReportInfoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfos }
     *     
     */
    public void setGetScheduledReportInfoReturn(JobInfos value) {
        this.getScheduledReportInfoReturn = value;
    }

}
