
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfEnderecoPessoaLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEnderecoPessoaLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnderecoPessoaLayout" type="{http://tempuri.org/}EnderecoPessoaLayout" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnderecoPessoaLayout", propOrder = {
    "enderecoPessoaLayout"
})
public class ArrayOfEnderecoPessoaLayout {

    @XmlElement(name = "EnderecoPessoaLayout", nillable = true)
    protected List<EnderecoPessoaLayout> enderecoPessoaLayout;

    /**
     * Gets the value of the enderecoPessoaLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enderecoPessoaLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnderecoPessoaLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnderecoPessoaLayout }
     * 
     * 
     */
    public List<EnderecoPessoaLayout> getEnderecoPessoaLayout() {
        if (enderecoPessoaLayout == null) {
            enderecoPessoaLayout = new ArrayList<EnderecoPessoaLayout>();
        }
        return this.enderecoPessoaLayout;
    }

}
