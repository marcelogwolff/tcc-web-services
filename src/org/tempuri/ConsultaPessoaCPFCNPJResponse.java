
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultaPessoaCPFCNPJResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaPessoaCPFCNPJResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}Response">
 *       &lt;sequence>
 *         &lt;element name="Mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pessoas" type="{http://tempuri.org/}ArrayOfPessoaIntegracaoLayout" minOccurs="0"/>
 *         &lt;element name="Sucesso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPessoaCPFCNPJResponse", propOrder = {
    "mensagem",
    "pessoas",
    "sucesso"
})
public class ConsultaPessoaCPFCNPJResponse
    extends Response
{

    @XmlElementRef(name = "Mensagem", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensagem;
    @XmlElementRef(name = "Pessoas", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPessoaIntegracaoLayout> pessoas;
    @XmlElement(name = "Sucesso")
    protected Boolean sucesso;

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
     * Obtém o valor da propriedade pessoas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPessoaIntegracaoLayout }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPessoaIntegracaoLayout> getPessoas() {
        return pessoas;
    }

    /**
     * Define o valor da propriedade pessoas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPessoaIntegracaoLayout }{@code >}
     *     
     */
    public void setPessoas(JAXBElement<ArrayOfPessoaIntegracaoLayout> value) {
        this.pessoas = value;
    }

    /**
     * Obtém o valor da propriedade sucesso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSucesso() {
        return sucesso;
    }

    /**
     * Define o valor da propriedade sucesso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSucesso(Boolean value) {
        this.sucesso = value;
    }

}
