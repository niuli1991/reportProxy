
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobStatusInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobStatusInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfJobStatusInfos" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfJobStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStatusInfos", propOrder = {
    "listOfJobStatusInfos"
})
public class JobStatusInfos {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfJobStatus listOfJobStatusInfos;

    /**
     * Gets the value of the listOfJobStatusInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobStatus }
     *     
     */
    public ArrayOfJobStatus getListOfJobStatusInfos() {
        return listOfJobStatusInfos;
    }

    /**
     * Sets the value of the listOfJobStatusInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobStatus }
     *     
     */
    public void setListOfJobStatusInfos(ArrayOfJobStatus value) {
        this.listOfJobStatusInfos = value;
    }

}
