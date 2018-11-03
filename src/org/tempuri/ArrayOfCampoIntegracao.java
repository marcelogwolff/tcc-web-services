
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfCampoIntegracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampoIntegracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampoIntegracao" type="{http://tempuri.org/}CampoIntegracao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampoIntegracao", propOrder = {
    "campoIntegracao"
})
public class ArrayOfCampoIntegracao {

    @XmlElement(name = "CampoIntegracao", nillable = true)
    protected List<CampoIntegracao> campoIntegracao;

    /**
     * Gets the value of the campoIntegracao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campoIntegracao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampoIntegracao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampoIntegracao }
     * 
     * 
     */
    public List<CampoIntegracao> getCampoIntegracao() {
        if (campoIntegracao == null) {
            campoIntegracao = new ArrayList<CampoIntegracao>();
        }
        return this.campoIntegracao;
    }

}
