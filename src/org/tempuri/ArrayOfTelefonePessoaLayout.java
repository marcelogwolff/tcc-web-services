
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTelefonePessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTelefonePessoaLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelefonePessoaLayout" type="{http://tempuri.org/}TelefonePessoaLayout" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTelefonePessoaLayout", propOrder = {
    "telefonePessoaLayout"
})
public class ArrayOfTelefonePessoaLayout {

    @XmlElement(name = "TelefonePessoaLayout", nillable = true)
    protected List<TelefonePessoaLayout> telefonePessoaLayout;

    /**
     * Gets the value of the telefonePessoaLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonePessoaLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonePessoaLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelefonePessoaLayout }
     * 
     * 
     */
    public List<TelefonePessoaLayout> getTelefonePessoaLayout() {
        if (telefonePessoaLayout == null) {
            telefonePessoaLayout = new ArrayList<TelefonePessoaLayout>();
        }
        return this.telefonePessoaLayout;
    }

}
