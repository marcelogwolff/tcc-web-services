
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LayoutIntegracaoBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LayoutIntegracaoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CnpjEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoConfiguracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CamposAdicionais" type="{http://tempuri.org/}ArrayOfCampoIntegracao" minOccurs="0"/>
 *         &lt;element name="TabelasAdicionais" type="{http://tempuri.org/}ArrayOfTabelaAdicional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutIntegracaoBase", propOrder = {
    "cnpjEmpresa",
    "codigoConfiguracao",
    "camposAdicionais",
    "tabelasAdicionais"
})
@XmlSeeAlso({
    PessoaIntegracaoLayout.class,
    EmailPessoaLayout.class,
    ContatoPessoaLayout.class,
    EnderecoPessoaLayout.class,
    TelefonePessoaLayout.class
})
public class LayoutIntegracaoBase {

    @XmlElementRef(name = "CnpjEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjEmpresa;
    @XmlElementRef(name = "CodigoConfiguracao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConfiguracao;
    @XmlElementRef(name = "CamposAdicionais", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCampoIntegracao> camposAdicionais;
    @XmlElementRef(name = "TabelasAdicionais", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTabelaAdicional> tabelasAdicionais;

    /**
     * Obtém o valor da propriedade cnpjEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    /**
     * Define o valor da propriedade cnpjEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjEmpresa(JAXBElement<String> value) {
        this.cnpjEmpresa = value;
    }

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

    /**
     * Obtém o valor da propriedade tabelasAdicionais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTabelaAdicional }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTabelaAdicional> getTabelasAdicionais() {
        return tabelasAdicionais;
    }

    /**
     * Define o valor da propriedade tabelasAdicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTabelaAdicional }{@code >}
     *     
     */
    public void setTabelasAdicionais(JAXBElement<ArrayOfTabelaAdicional> value) {
        this.tabelasAdicionais = value;
    }

}
