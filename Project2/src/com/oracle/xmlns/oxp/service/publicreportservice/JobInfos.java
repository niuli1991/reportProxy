
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfJobInfos" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfJobInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfos", propOrder = {
    "listOfJobInfos"
})
public class JobInfos {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfJobInfo listOfJobInfos;

    /**
     * Gets the value of the listOfJobInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobInfo }
     *     
     */
    public ArrayOfJobInfo getListOfJobInfos() {
        return listOfJobInfos;
    }

    /**
     * Sets the value of the listOfJobInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobInfo }
     *     
     */
    public void setListOfJobInfos(ArrayOfJobInfo value) {
        this.listOfJobInfos = value;
    }

}
