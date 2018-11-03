
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TiposPessoa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TiposPessoa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nenhum"/>
 *     &lt;enumeration value="Fisica"/>
 *     &lt;enumeration value="Juridica"/>
 *     &lt;enumeration value="FisicaExterior"/>
 *     &lt;enumeration value="JuridicaExterior"/>
 *     &lt;enumeration value="Espolio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TiposPessoa")
@XmlEnum
public enum TiposPessoa {

    @XmlEnumValue("Nenhum")
    NENHUM("Nenhum"),
    @XmlEnumValue("Fisica")
    FISICA("Fisica"),
    @XmlEnumValue("Juridica")
    JURIDICA("Juridica"),
    @XmlEnumValue("FisicaExterior")
    FISICA_EXTERIOR("FisicaExterior"),
    @XmlEnumValue("JuridicaExterior")
    JURIDICA_EXTERIOR("JuridicaExterior"),
    @XmlEnumValue("Espolio")
    ESPOLIO("Espolio");
    private final String value;

    TiposPessoa(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiposPessoa fromValue(String v) {
        for (TiposPessoa c: TiposPessoa.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
