
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
 *         &lt;element name="LoginResult" type="{http://tempuri.org/}LoginResponse1" minOccurs="0"/>
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
    "loginResult"
})
@XmlRootElement(name = "LoginResponse")
public class LoginResponse {

    @XmlElementRef(name = "LoginResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginResponse1> loginResult;

    /**
     * Obtém o valor da propriedade loginResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginResponse1 }{@code >}
     *     
     */
    public JAXBElement<LoginResponse1> getLoginResult() {
        return loginResult;
    }

    /**
     * Define o valor da propriedade loginResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginResponse1 }{@code >}
     *     
     */
    public void setLoginResult(JAXBElement<LoginResponse1> value) {
        this.loginResult = value;
    }

}
