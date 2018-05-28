//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.23 at 01:59:08 PM MSK 
//


package by.it.romankov.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tours" type="{http://jd02_09.romankov.it.by}Tours"/>
 *         &lt;element name="ReapetedClients" type="{http://jd02_09.romankov.it.by}ReapetedClients"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent", propOrder = {
    "name",
    "telephone",
    "email",
    "tours",
    "reapetedClients"
})
public class Agent {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Telephone", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger telephone;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Tours", required = true)
    protected Tours tours;
    @XmlElement(name = "ReapetedClients", required = true)
    protected ReapetedClients reapetedClients;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTelephone(BigInteger value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tours property.
     * 
     * @return
     *     possible object is
     *     {@link Tours }
     *     
     */
    public Tours getTours() {
        return tours;
    }

    /**
     * Sets the value of the tours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tours }
     *     
     */
    public void setTours(Tours value) {
        this.tours = value;
    }

    /**
     * Gets the value of the reapetedClients property.
     * 
     * @return
     *     possible object is
     *     {@link ReapetedClients }
     *     
     */
    public ReapetedClients getReapetedClients() {
        return reapetedClients;
    }

    /**
     * Sets the value of the reapetedClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReapetedClients }
     *     
     */
    public void setReapetedClients(ReapetedClients value) {
        this.reapetedClients = value;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", tours=" + tours +
                ", reapetedClients=" + reapetedClients +
                '}';
    }
}