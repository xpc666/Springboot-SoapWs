//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 02:54:40 AM EDT 
//


package com.springdemo.soapws.gen;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="book" type="{http://www.springdemo.com/soapws/gen}book"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "book"
})
@XmlRootElement(name = "getBookResponse")
public class GetBookResponse
{

    @XmlElement(required = true)
    protected Book book;

    /**
     * Gets the value of the book property.
     *
     * @return possible object is
     * {@link Book }
     */
    public Book getBook()
    {
        return book;
    }

    /**
     * Sets the value of the book property.
     *
     * @param value allowed object is
     *              {@link Book }
     */
    public void setBook(Book value)
    {
        this.book = value;
    }

}
