
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultaPessoaCPFCNPJRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaPessoaCPFCNPJRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}Request">
 *       &lt;sequence>
 *         &lt;element name="CPFCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPessoaCPFCNPJRequest", propOrder = {
    "cpfcnpj"
})
public class ConsultaPessoaCPFCNPJRequest
    extends Request
{

    @XmlElementRef(name = "CPFCNPJ", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpfcnpj;

    /**
     * Obtém o valor da propriedade cpfcnpj.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCPFCNPJ() {
        return cpfcnpj;
    }

    /**
     * Define o valor da propriedade cpfcnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCPFCNPJ(JAXBElement<String> value) {
        this.cpfcnpj = value;
    }

}
