
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://tempuri.org/}LoginRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "Login")
public class Login {

    @XmlElementRef(name = "request", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginRequest> request;

    /**
     * Obtém o valor da propriedade request.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}
     *     
     */
    public JAXBElement<LoginRequest> getRequest() {
        return request;
    }

    /**
     * Define o valor da propriedade request.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<LoginRequest> value) {
        this.request = value;
    }

}
