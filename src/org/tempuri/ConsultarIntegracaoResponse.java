
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
 *         &lt;element name="ConsultarIntegracaoResult" type="{http://tempuri.org/}ConsultaPessoaResponse" minOccurs="0"/>
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
    "consultarIntegracaoResult"
})
@XmlRootElement(name = "ConsultarIntegracaoResponse")
public class ConsultarIntegracaoResponse {

    @XmlElementRef(name = "ConsultarIntegracaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultaPessoaResponse> consultarIntegracaoResult;

    /**
     * Obtém o valor da propriedade consultarIntegracaoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultaPessoaResponse }{@code >}
     *     
     */
    public JAXBElement<ConsultaPessoaResponse> getConsultarIntegracaoResult() {
        return consultarIntegracaoResult;
    }

    /**
     * Define o valor da propriedade consultarIntegracaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultaPessoaResponse }{@code >}
     *     
     */
    public void setConsultarIntegracaoResult(JAXBElement<ConsultaPessoaResponse> value) {
        this.consultarIntegracaoResult = value;
    }

}
