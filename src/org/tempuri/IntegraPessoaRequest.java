
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntegraPessoaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegraPessoaRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}Request">
 *       &lt;sequence>
 *         &lt;element name="Pessoa" type="{http://tempuri.org/}PessoaIntegracaoLayout" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegraPessoaRequest", propOrder = {
    "pessoa"
})
public class IntegraPessoaRequest
    extends Request
{

    @XmlElementRef(name = "Pessoa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PessoaIntegracaoLayout> pessoa;

    /**
     * Obtém o valor da propriedade pessoa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PessoaIntegracaoLayout }{@code >}
     *     
     */
    public JAXBElement<PessoaIntegracaoLayout> getPessoa() {
        return pessoa;
    }

    /**
     * Define o valor da propriedade pessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PessoaIntegracaoLayout }{@code >}
     *     
     */
    public void setPessoa(JAXBElement<PessoaIntegracaoLayout> value) {
        this.pessoa = value;
    }

}
