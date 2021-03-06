
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntegraPessoaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegraPessoaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}Response">
 *       &lt;sequence>
 *         &lt;element name="CodigoRetorno" type="{http://tempuri.org/}CodigosRetornoIntegracao" minOccurs="0"/>
 *         &lt;element name="Mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegraPessoaResponse", propOrder = {
    "codigoRetorno",
    "mensagem",
    "tokenId"
})
public class IntegraPessoaResponse
    extends Response
{

    @XmlElement(name = "CodigoRetorno")
    @XmlSchemaType(name = "string")
    protected CodigosRetornoIntegracao codigoRetorno;
    @XmlElementRef(name = "Mensagem", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensagem;
    @XmlElementRef(name = "TokenId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenId;

    /**
     * Obtém o valor da propriedade codigoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link CodigosRetornoIntegracao }
     *     
     */
    public CodigosRetornoIntegracao getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Define o valor da propriedade codigoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigosRetornoIntegracao }
     *     
     */
    public void setCodigoRetorno(CodigosRetornoIntegracao value) {
        this.codigoRetorno = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensagem(JAXBElement<String> value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade tokenId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenId() {
        return tokenId;
    }

    /**
     * Define o valor da propriedade tokenId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenId(JAXBElement<String> value) {
        this.tokenId = value;
    }

}
