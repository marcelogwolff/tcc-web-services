
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
 *         &lt;element name="IntegrarResult" type="{http://tempuri.org/}IntegraPessoaResponse" minOccurs="0"/>
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
    "integrarResult"
})
@XmlRootElement(name = "IntegrarResponse")
public class IntegrarResponse {

    @XmlElementRef(name = "IntegrarResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<IntegraPessoaResponse> integrarResult;

    /**
     * Obtém o valor da propriedade integrarResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntegraPessoaResponse }{@code >}
     *     
     */
    public JAXBElement<IntegraPessoaResponse> getIntegrarResult() {
        return integrarResult;
    }

    /**
     * Define o valor da propriedade integrarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntegraPessoaResponse }{@code >}
     *     
     */
    public void setIntegrarResult(JAXBElement<IntegraPessoaResponse> value) {
        this.integrarResult = value;
    }

}
