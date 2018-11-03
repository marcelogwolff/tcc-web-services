
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnderecoPessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnderecoPessoaLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}LayoutIntegracaoBase">
 *       &lt;sequence>
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaixaPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIbgeMunicipio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEndereco" type="{http://tempuri.org/}TiposEndereco" minOccurs="0"/>
 *         &lt;element name="TipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoPessoaLayout", propOrder = {
    "bairro",
    "caixaPostal",
    "cep",
    "codigoIbgeMunicipio",
    "complemento",
    "logradouro",
    "nomeMunicipio",
    "numeroLogradouro",
    "siglaEstado",
    "siglaPais",
    "tipoEndereco",
    "tipoLogradouro"
})
public class EnderecoPessoaLayout
    extends LayoutIntegracaoBase
{

    @XmlElementRef(name = "Bairro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bairro;
    @XmlElementRef(name = "CaixaPostal", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caixaPostal;
    @XmlElementRef(name = "Cep", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cep;
    @XmlElement(name = "CodigoIbgeMunicipio")
    protected Long codigoIbgeMunicipio;
    @XmlElementRef(name = "Complemento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complemento;
    @XmlElementRef(name = "Logradouro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logradouro;
    @XmlElementRef(name = "NomeMunicipio", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeMunicipio;
    @XmlElementRef(name = "NumeroLogradouro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLogradouro;
    @XmlElementRef(name = "SiglaEstado", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaEstado;
    @XmlElementRef(name = "SiglaPais", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaPais;
    @XmlElement(name = "TipoEndereco")
    @XmlSchemaType(name = "string")
    protected TiposEndereco tipoEndereco;
    @XmlElement(name = "TipoLogradouro")
    protected Integer tipoLogradouro;

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairro(JAXBElement<String> value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade caixaPostal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Define o valor da propriedade caixaPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaixaPostal(JAXBElement<String> value) {
        this.caixaPostal = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCep(JAXBElement<String> value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade codigoIbgeMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoIbgeMunicipio() {
        return codigoIbgeMunicipio;
    }

    /**
     * Define o valor da propriedade codigoIbgeMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoIbgeMunicipio(Long value) {
        this.codigoIbgeMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplemento(JAXBElement<String> value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade logradouro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogradouro(JAXBElement<String> value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade nomeMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeMunicipio() {
        return nomeMunicipio;
    }

    /**
     * Define o valor da propriedade nomeMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeMunicipio(JAXBElement<String> value) {
        this.nomeMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade numeroLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroLogradouro() {
        return numeroLogradouro;
    }

    /**
     * Define o valor da propriedade numeroLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroLogradouro(JAXBElement<String> value) {
        this.numeroLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade siglaEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaEstado() {
        return siglaEstado;
    }

    /**
     * Define o valor da propriedade siglaEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaEstado(JAXBElement<String> value) {
        this.siglaEstado = value;
    }

    /**
     * Obtém o valor da propriedade siglaPais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaPais() {
        return siglaPais;
    }

    /**
     * Define o valor da propriedade siglaPais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaPais(JAXBElement<String> value) {
        this.siglaPais = value;
    }

    /**
     * Obtém o valor da propriedade tipoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link TiposEndereco }
     *     
     */
    public TiposEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Define o valor da propriedade tipoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposEndereco }
     *     
     */
    public void setTipoEndereco(TiposEndereco value) {
        this.tipoEndereco = value;
    }

    /**
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoLogradouro(Integer value) {
        this.tipoLogradouro = value;
    }

}
