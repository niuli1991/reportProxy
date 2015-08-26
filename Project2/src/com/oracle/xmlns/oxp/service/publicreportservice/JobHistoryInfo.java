
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="documentDataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentDataContentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentOutput" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="jobID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="reportDataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reportDataContentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "JobHistoryInfo", propOrder = {
    "createdDate",
    "documentDataAvailable",
    "documentDataContentType",
    "documentOutput",
    "jobID",
    "jobMessage",
    "jobName",
    "outputID",
    "reportData",
    "reportDataAvailable",
    "reportDataContentType",
    "reportName",
    "reportURL",
    "status",
    "statusDetail",
    "username"
})
public class JobHistoryInfo {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected boolean documentDataAvailable;
    @XmlElement(required = true, nillable = true)
    protected String documentDataContentType;
    @XmlElement(required = true, nillable = true)
    protected byte[] documentOutput;
    protected int jobID;
    @XmlElement(required = true, nillable = true)
    protected String jobMessage;
    @XmlElement(required = true, nillable = true)
    protected String jobName;
    protected int outputID;
    @XmlElement(required = true, nillable = true)
    protected byte[] reportData;
    protected boolean reportDataAvailable;
    @XmlElement(required = true, nillable = true)
    protected String reportDataContentType;
    @XmlElement(required = true, nillable = true)
    protected String reportName;
    @XmlElement(required = true, nillable = true)
    protected String reportURL;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String statusDetail;
    @XmlElement(required = true, nillable = true)
    protected String username;

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
     * Gets the value of the documentDataAvailable property.
     * 
     */
    public boolean isDocumentDataAvailable() {
        return documentDataAvailable;
    }

    /**
     * Sets the value of the documentDataAvailable property.
     * 
     */
    public void setDocumentDataAvailable(boolean value) {
        this.documentDataAvailable = value;
    }

    /**
     * Gets the value of the documentDataContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDataContentType() {
        return documentDataContentType;
    }

    /**
     * Sets the value of the documentDataContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDataContentType(String value) {
        this.documentDataContentType = value;
    }

    /**
     * Gets the value of the documentOutput property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentOutput() {
        return documentOutput;
    }

    /**
     * Sets the value of the documentOutput property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentOutput(byte[] value) {
        this.documentOutput = ((byte[]) value);
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
     * Gets the value of the jobMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobMessage() {
        return jobMessage;
    }

    /**
     * Sets the value of the jobMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobMessage(String value) {
        this.jobMessage = value;
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
     * Gets the value of the outputID property.
     * 
     */
    public int getOutputID() {
        return outputID;
    }

    /**
     * Sets the value of the outputID property.
     * 
     */
    public void setOutputID(int value) {
        this.outputID = value;
    }

    /**
     * Gets the value of the reportData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportData() {
        return reportData;
    }

    /**
     * Sets the value of the reportData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportData(byte[] value) {
        this.reportData = ((byte[]) value);
    }

    /**
     * Gets the value of the reportDataAvailable property.
     * 
     */
    public boolean isReportDataAvailable() {
        return reportDataAvailable;
    }

    /**
     * Sets the value of the reportDataAvailable property.
     * 
     */
    public void setReportDataAvailable(boolean value) {
        this.reportDataAvailable = value;
    }

    /**
     * Gets the value of the reportDataContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDataContentType() {
        return reportDataContentType;
    }

    /**
     * Sets the value of the reportDataContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDataContentType(String value) {
        this.reportDataContentType = value;
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
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
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
