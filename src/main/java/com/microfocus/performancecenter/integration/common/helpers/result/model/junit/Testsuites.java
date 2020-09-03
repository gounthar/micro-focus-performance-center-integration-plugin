/*
 * © Copyright 2013 EntIT Software LLC
 *  Certain versions of software and/or documents (“Material”) accessible here may contain branding from
 *  Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 *  the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 *  and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 *  marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * © Copyright 2012-2018 Micro Focus or one of its affiliates.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors (“Micro Focus”) are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * ___________________________________________________________________
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.09 at 04:58:42 PM IST 
//

package com.microfocus.performancecenter.integration.common.helpers.result.model.junit;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}testsuite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "testsuite" })
@XmlRootElement(name = "testsuites")
@XStreamAlias("testsuites")
public class Testsuites {
    @XStreamImplicit
    protected List<Testsuite> testsuite;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String time;
    @XmlAttribute
    protected String tests;
    @XmlAttribute
    protected String failures;
    @XmlAttribute
    protected String disabled;
    @XmlAttribute
    protected String errors;
    
    /**
     * Gets the value of the testsuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the testsuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTestsuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Testsuite }
     * 
     * 
     */
    public List<Testsuite> getTestsuite() {
        if (testsuite == null) {
            testsuite = new ArrayList<Testsuite>();
        }
        return this.testsuite;
    }
    
    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }
    
    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTime() {
        return time;
    }
    
    /**
     * Sets the value of the time property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTime(String value) {
        this.time = value;
    }
    
    /**
     * Gets the value of the tests property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTests() {
        return tests;
    }
    
    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTests(String value) {
        this.tests = value;
    }
    
    /**
     * Gets the value of the failures property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFailures() {
        return failures;
    }
    
    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFailures(String value) {
        this.failures = value;
    }
    
    /**
     * Gets the value of the disabled property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDisabled() {
        return disabled;
    }
    
    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDisabled(String value) {
        this.disabled = value;
    }
    
    /**
     * Gets the value of the errors property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getErrors() {
        return errors;
    }
    
    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setErrors(String value) {
        this.errors = value;
    }
    
}
