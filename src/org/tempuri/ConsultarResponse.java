
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
 *         &lt;element name="ConsultarResult" type="{http://tempuri.org/}ConsultaPessoaCPFCNPJResponse" minOccurs="0"/>
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
    "consultarResult"
})
@XmlRootElement(name = "ConsultarResponse")
public class ConsultarResponse {

    @XmlElementRef(name = "ConsultarResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultaPessoaCPFCNPJResponse> consultarResult;

    /**
     * Obtém o valor da propriedade consultarResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJResponse }{@code >}
     *     
     */
    public JAXBElement<ConsultaPessoaCPFCNPJResponse> getConsultarResult() {
        return consultarResult;
    }

    /**
     * Define o valor da propriedade consultarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJResponse }{@code >}
     *     
     */
    public void setConsultarResult(JAXBElement<ConsultaPessoaCPFCNPJResponse> value) {
        this.consultarResult = value;
    }

}
