
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TiposEmail.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TiposEmail">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cadastral"/>
 *     &lt;enumeration value="NFe"/>
 *     &lt;enumeration value="Cobranca"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TiposEmail")
@XmlEnum
public enum TiposEmail {

    @XmlEnumValue("Cadastral")
    CADASTRAL("Cadastral"),
    @XmlEnumValue("NFe")
    N_FE("NFe"),
    @XmlEnumValue("Cobranca")
    COBRANCA("Cobranca");
    private final String value;

    TiposEmail(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiposEmail fromValue(String v) {
        for (TiposEmail c: TiposEmail.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
