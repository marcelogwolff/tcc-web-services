
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EmailPessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EmailPessoaLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}LayoutIntegracaoBase">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEmail" type="{http://tempuri.org/}TiposEmail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailPessoaLayout", propOrder = {
    "email",
    "tipoEmail"
})
public class EmailPessoaLayout
    extends LayoutIntegracaoBase
{

    @XmlElementRef(name = "Email", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "TipoEmail")
    @XmlSchemaType(name = "string")
    protected TiposEmail tipoEmail;

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade tipoEmail.
     * 
     * @return
     *     possible object is
     *     {@link TiposEmail }
     *     
     */
    public TiposEmail getTipoEmail() {
        return tipoEmail;
    }

    /**
     * Define o valor da propriedade tipoEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposEmail }
     *     
     */
    public void setTipoEmail(TiposEmail value) {
        this.tipoEmail = value;
    }

}
