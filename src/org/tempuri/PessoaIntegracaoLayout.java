
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PessoaIntegracaoLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaIntegracaoLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}LayoutIntegracaoBase">
 *       &lt;sequence>
 *         &lt;element name="Abertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Apelido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contatos" type="{http://tempuri.org/}ArrayOfContatoPessoaLayout" minOccurs="0"/>
 *         &lt;element name="EhCliente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EhFornecedor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://tempuri.org/}ArrayOfEmailPessoaLayout" minOccurs="0"/>
 *         &lt;element name="Enderecos" type="{http://tempuri.org/}ArrayOfEnderecoPessoaLayout" minOccurs="0"/>
 *         &lt;element name="InscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InscricaoEstadualSubstituto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsentoInscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsentoInscricaoSubstituto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefones" type="{http://tempuri.org/}ArrayOfTelefonePessoaLayout" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaIntegracaoLayout", propOrder = {
    "abertura",
    "apelido",
    "contatos",
    "ehCliente",
    "ehFornecedor",
    "emails",
    "enderecos",
    "inscricaoEstadual",
    "inscricaoEstadualSubstituto",
    "isentoInscricaoEstadual",
    "isentoInscricaoSubstituto",
    "nome",
    "numeroDocumento",
    "telefones",
    "tipo"
})
public class PessoaIntegracaoLayout
    extends LayoutIntegracaoBase
{

    @XmlElement(name = "Abertura")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar abertura;
    @XmlElementRef(name = "Apelido", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apelido;
    @XmlElementRef(name = "Contatos", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfContatoPessoaLayout> contatos;
    @XmlElementRef(name = "EhCliente", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ehCliente;
    @XmlElementRef(name = "EhFornecedor", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ehFornecedor;
    @XmlElementRef(name = "Emails", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmailPessoaLayout> emails;
    @XmlElementRef(name = "Enderecos", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEnderecoPessoaLayout> enderecos;
    @XmlElementRef(name = "InscricaoEstadual", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inscricaoEstadual;
    @XmlElementRef(name = "InscricaoEstadualSubstituto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inscricaoEstadualSubstituto;
    @XmlElementRef(name = "IsentoInscricaoEstadual", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isentoInscricaoEstadual;
    @XmlElementRef(name = "IsentoInscricaoSubstituto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isentoInscricaoSubstituto;
    @XmlElementRef(name = "Nome", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "NumeroDocumento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumento;
    @XmlElementRef(name = "Telefones", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTelefonePessoaLayout> telefones;
    @XmlElement(name = "Tipo")
    protected Integer tipo;

    /**
     * Obtém o valor da propriedade abertura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbertura() {
        return abertura;
    }

    /**
     * Define o valor da propriedade abertura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbertura(XMLGregorianCalendar value) {
        this.abertura = value;
    }

    /**
     * Obtém o valor da propriedade apelido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApelido() {
        return apelido;
    }

    /**
     * Define o valor da propriedade apelido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApelido(JAXBElement<String> value) {
        this.apelido = value;
    }

    /**
     * Obtém o valor da propriedade contatos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContatoPessoaLayout }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContatoPessoaLayout> getContatos() {
        return contatos;
    }

    /**
     * Define o valor da propriedade contatos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContatoPessoaLayout }{@code >}
     *     
     */
    public void setContatos(JAXBElement<ArrayOfContatoPessoaLayout> value) {
        this.contatos = value;
    }

    /**
     * Obtém o valor da propriedade ehCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEhCliente() {
        return ehCliente;
    }

    /**
     * Define o valor da propriedade ehCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEhCliente(JAXBElement<Boolean> value) {
        this.ehCliente = value;
    }

    /**
     * Obtém o valor da propriedade ehFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEhFornecedor() {
        return ehFornecedor;
    }

    /**
     * Define o valor da propriedade ehFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEhFornecedor(JAXBElement<Boolean> value) {
        this.ehFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade emails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmailPessoaLayout }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmailPessoaLayout> getEmails() {
        return emails;
    }

    /**
     * Define o valor da propriedade emails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmailPessoaLayout }{@code >}
     *     
     */
    public void setEmails(JAXBElement<ArrayOfEmailPessoaLayout> value) {
        this.emails = value;
    }

    /**
     * Obtém o valor da propriedade enderecos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoPessoaLayout }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEnderecoPessoaLayout> getEnderecos() {
        return enderecos;
    }

    /**
     * Define o valor da propriedade enderecos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoPessoaLayout }{@code >}
     *     
     */
    public void setEnderecos(JAXBElement<ArrayOfEnderecoPessoaLayout> value) {
        this.enderecos = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInscricaoEstadual(JAXBElement<String> value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoEstadualSubstituto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInscricaoEstadualSubstituto() {
        return inscricaoEstadualSubstituto;
    }

    /**
     * Define o valor da propriedade inscricaoEstadualSubstituto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInscricaoEstadualSubstituto(JAXBElement<String> value) {
        this.inscricaoEstadualSubstituto = value;
    }

    /**
     * Obtém o valor da propriedade isentoInscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsentoInscricaoEstadual() {
        return isentoInscricaoEstadual;
    }

    /**
     * Define o valor da propriedade isentoInscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsentoInscricaoEstadual(JAXBElement<Boolean> value) {
        this.isentoInscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade isentoInscricaoSubstituto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsentoInscricaoSubstituto() {
        return isentoInscricaoSubstituto;
    }

    /**
     * Define o valor da propriedade isentoInscricaoSubstituto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsentoInscricaoSubstituto(JAXBElement<Boolean> value) {
        this.isentoInscricaoSubstituto = value;
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

    /**
     * Obtém o valor da propriedade numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define o valor da propriedade numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumento(JAXBElement<String> value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtém o valor da propriedade telefones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTelefonePessoaLayout }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTelefonePessoaLayout> getTelefones() {
        return telefones;
    }

    /**
     * Define o valor da propriedade telefones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTelefonePessoaLayout }{@code >}
     *     
     */
    public void setTelefones(JAXBElement<ArrayOfTelefonePessoaLayout> value) {
        this.telefones = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipo(Integer value) {
        this.tipo = value;
    }

}
