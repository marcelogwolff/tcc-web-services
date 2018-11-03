
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContatoPessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContatoPessoaLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}LayoutIntegracaoBase">
 *       &lt;sequence>
 *         &lt;element name="CargoCodigo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContatoPessoaLayout", propOrder = {
    "cargoCodigo",
    "nome"
})
public class ContatoPessoaLayout
    extends LayoutIntegracaoBase
{

    @XmlElement(name = "CargoCodigo")
    protected Long cargoCodigo;
    @XmlElementRef(name = "Nome", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;

    /**
     * Obtém o valor da propriedade cargoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoCodigo() {
        return cargoCodigo;
    }

    /**
     * Define o valor da propriedade cargoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoCodigo(Long value) {
        this.cargoCodigo = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

}
