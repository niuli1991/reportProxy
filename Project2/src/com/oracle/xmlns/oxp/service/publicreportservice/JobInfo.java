
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="burstingOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deliveryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryParameters" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}DeliveryRequest"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="jobGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportParameters" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfParamNameValue"/>
 *         &lt;element name="reportSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reportURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleParameters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfo", propOrder = {
    "burstingOption",
    "createdDate",
    "deliveryDescription",
    "deliveryParameters",
    "endDate",
    "jobGroup",
    "jobID",
    "jobName",
    "locale",
    "reportName",
    "reportParameters",
    "reportSet",
    "reportURL",
    "runType",
    "scheduleDescription",
    "scheduleParameters",
    "startDate",
    "status",
    "username"
})
public class JobInfo {

    protected boolean burstingOption;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(required = true, nillable = true)
    protected String deliveryDescription;
    @XmlElement(required = true, nillable = true)
    protected DeliveryRequest deliveryParameters;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    protected String jobGroup;
    protected int jobID;
    @XmlElement(required = true, nillable = true)
    protected String jobName;
    @XmlElement(required = true, nillable = true)
    protected String locale;
    @XmlElement(required = true, nillable = true)
    protected String reportName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfParamNameValue reportParameters;
    protected boolean reportSet;
    @XmlElement(required = true, nillable = true)
    protected String reportURL;
    @XmlElement(required = true, nillable = true)
    protected String runType;
    @XmlElement(required = true, nillable = true)
    protected String scheduleDescription;
    @XmlElement(required = true, nillable = true)
    protected String scheduleParameters;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String username;

    /**
     * Gets the value of the burstingOption property.
     * 
     */
    public boolean isBurstingOption() {
        return burstingOption;
    }

    /**
     * Sets the value of the burstingOption property.
     * 
     */
    public void setBurstingOption(boolean value) {
        this.burstingOption = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the deliveryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDescription() {
        return deliveryDescription;
    }

    /**
     * Sets the value of the deliveryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDescription(String value) {
        this.deliveryDescription = value;
    }

    /**
     * Gets the value of the deliveryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRequest }
     *     
     */
    public DeliveryRequest getDeliveryParameters() {
        return deliveryParameters;
    }

    /**
     * Sets the value of the deliveryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRequest }
     *     
     */
    public void setDeliveryParameters(DeliveryRequest value) {
        this.deliveryParameters = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the jobGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * Sets the value of the jobGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobGroup(String value) {
        this.jobGroup = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     */
    public int getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     */
    public void setJobID(int value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public ArrayOfParamNameValue getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the value of the reportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public void setReportParameters(ArrayOfParamNameValue value) {
        this.reportParameters = value;
    }

    /**
     * Gets the value of the reportSet property.
     * 
     */
    public boolean isReportSet() {
        return reportSet;
    }

    /**
     * Sets the value of the reportSet property.
     * 
     */
    public void setReportSet(boolean value) {
        this.reportSet = value;
    }

    /**
     * Gets the value of the reportURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the value of the reportURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportURL(String value) {
        this.reportURL = value;
    }

    /**
     * Gets the value of the runType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunType() {
        return runType;
    }

    /**
     * Sets the value of the runType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunType(String value) {
        this.runType = value;
    }

    /**
     * Gets the value of the scheduleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleDescription() {
        return scheduleDescription;
    }

    /**
     * Sets the value of the scheduleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleDescription(String value) {
        this.scheduleDescription = value;
    }

    /**
     * Gets the value of the scheduleParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleParameters() {
        return scheduleParameters;
    }

    /**
     * Sets the value of the scheduleParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleParameters(String value) {
        this.scheduleParameters = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
