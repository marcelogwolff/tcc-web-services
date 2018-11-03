
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LogoutResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LogoutResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogoutResult" type="{http://tempuri.org/}LogoutResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoutResponse", propOrder = {
    "logoutResult"
})
public class LogoutResponse {

    @XmlElementRef(name = "LogoutResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LogoutResponse> logoutResult;

    /**
     * Obtém o valor da propriedade logoutResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     *     
     */
    public JAXBElement<LogoutResponse> getLogoutResult() {
        return logoutResult;
    }

    /**
     * Define o valor da propriedade logoutResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     *     
     */
    public void setLogoutResult(JAXBElement<LogoutResponse> value) {
        this.logoutResult = value;
    }

}
