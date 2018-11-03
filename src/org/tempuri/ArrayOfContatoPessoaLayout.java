
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfContatoPessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContatoPessoaLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContatoPessoaLayout" type="{http://tempuri.org/}ContatoPessoaLayout" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContatoPessoaLayout", propOrder = {
    "contatoPessoaLayout"
})
public class ArrayOfContatoPessoaLayout {

    @XmlElement(name = "ContatoPessoaLayout", nillable = true)
    protected List<ContatoPessoaLayout> contatoPessoaLayout;

    /**
     * Gets the value of the contatoPessoaLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contatoPessoaLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContatoPessoaLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContatoPessoaLayout }
     * 
     * 
     */
    public List<ContatoPessoaLayout> getContatoPessoaLayout() {
        if (contatoPessoaLayout == null) {
            contatoPessoaLayout = new ArrayList<ContatoPessoaLayout>();
        }
        return this.contatoPessoaLayout;
    }

}
