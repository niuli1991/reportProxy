
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
 *         &lt;element name="getListOfScheduledReportsStatusInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JobStatusInfos"/>
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
    "getListOfScheduledReportsStatusInSessionReturn"
})
@XmlRootElement(name = "getListOfScheduledReportsStatusInSessionResponse")
public class GetListOfScheduledReportsStatusInSessionResponse {

    @XmlElement(required = true)
    protected JobStatusInfos getListOfScheduledReportsStatusInSessionReturn;

    /**
     * Gets the value of the getListOfScheduledReportsStatusInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusInfos }
     *     
     */
    public JobStatusInfos getGetListOfScheduledReportsStatusInSessionReturn() {
        return getListOfScheduledReportsStatusInSessionReturn;
    }

    /**
     * Sets the value of the getListOfScheduledReportsStatusInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusInfos }
     *     
     */
    public void setGetListOfScheduledReportsStatusInSessionReturn(JobStatusInfos value) {
        this.getListOfScheduledReportsStatusInSessionReturn = value;
    }

}
