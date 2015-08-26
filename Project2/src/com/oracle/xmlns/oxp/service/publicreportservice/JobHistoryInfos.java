
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobHistoryInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobHistoryInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfJobHistoryInfos" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfJobHistoryInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobHistoryInfos", propOrder = {
    "listOfJobHistoryInfos"
})
public class JobHistoryInfos {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfJobHistoryInfo listOfJobHistoryInfos;

    /**
     * Gets the value of the listOfJobHistoryInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobHistoryInfo }
     *     
     */
    public ArrayOfJobHistoryInfo getListOfJobHistoryInfos() {
        return listOfJobHistoryInfos;
    }

    /**
     * Sets the value of the listOfJobHistoryInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobHistoryInfo }
     *     
     */
    public void setListOfJobHistoryInfos(ArrayOfJobHistoryInfo value) {
        this.listOfJobHistoryInfos = value;
    }

}
