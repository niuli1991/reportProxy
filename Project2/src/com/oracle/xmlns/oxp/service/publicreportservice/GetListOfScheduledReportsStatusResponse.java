
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
 *         &lt;element name="getListOfScheduledReportsStatusReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobStatusInfos"/>
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
    "getListOfScheduledReportsStatusReturn"
})
@XmlRootElement(name = "getListOfScheduledReportsStatusResponse")
public class GetListOfScheduledReportsStatusResponse {

    @XmlElement(required = true)
    protected JobStatusInfos getListOfScheduledReportsStatusReturn;

    /**
     * Gets the value of the getListOfScheduledReportsStatusReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusInfos }
     *     
     */
    public JobStatusInfos getGetListOfScheduledReportsStatusReturn() {
        return getListOfScheduledReportsStatusReturn;
    }

    /**
     * Sets the value of the getListOfScheduledReportsStatusReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusInfos }
     *     
     */
    public void setGetListOfScheduledReportsStatusReturn(JobStatusInfos value) {
        this.getListOfScheduledReportsStatusReturn = value;
    }

}
