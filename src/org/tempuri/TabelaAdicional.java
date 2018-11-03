
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TabelaAdicional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TabelaAdicional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoConfiguracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TabelaNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampoLigacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CamposAdicionais" type="{http://tempuri.org/}ArrayOfCampoIntegracao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabelaAdicional", propOrder = {
    "codigoConfiguracao",
    "tabelaNome",
    "campoLigacao",
    "camposAdicionais"
})
public class TabelaAdicional {

    @XmlElementRef(name = "CodigoConfiguracao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConfiguracao;
    @XmlElementRef(name = "TabelaNome", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tabelaNome;
    @XmlElementRef(name = "CampoLigacao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campoLigacao;
    @XmlElementRef(name = "CamposAdicionais", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCampoIntegracao> camposAdicionais;

    /**
     * Obtém o valor da propriedade codigoConfiguracao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoConfiguracao() {
        return codigoConfiguracao;
    }

    /**
     * Define o valor da propriedade codigoConfiguracao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoConfiguracao(JAXBElement<String> value) {
        this.codigoConfiguracao = value;
    }

    /**
     * Obtém o valor da propriedade tabelaNome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTabelaNome() {
        return tabelaNome;
    }

    /**
     * Define o valor da propriedade tabelaNome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTabelaNome(JAXBElement<String> value) {
        this.tabelaNome = value;
    }

    /**
     * Obtém o valor da propriedade campoLigacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampoLigacao() {
        return campoLigacao;
    }

    /**
     * Define o valor da propriedade campoLigacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampoLigacao(JAXBElement<String> value) {
        this.campoLigacao = value;
    }

    /**
     * Obtém o valor da propriedade camposAdicionais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampoIntegracao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampoIntegracao> getCamposAdicionais() {
        return camposAdicionais;
    }

    /**
     * Define o valor da propriedade camposAdicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampoIntegracao }{@code >}
     *     
     */
    public void setCamposAdicionais(JAXBElement<ArrayOfCampoIntegracao> value) {
        this.camposAdicionais = value;
    }

}
