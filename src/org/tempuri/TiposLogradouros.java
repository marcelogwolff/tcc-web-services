
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TiposLogradouros.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TiposLogradouros">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nenhum"/>
 *     &lt;enumeration value="Aeroporto"/>
 *     &lt;enumeration value="Alameda"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="Avenida"/>
 *     &lt;enumeration value="Campo"/>
 *     &lt;enumeration value="Chacara"/>
 *     &lt;enumeration value="Colonia"/>
 *     &lt;enumeration value="Condominio"/>
 *     &lt;enumeration value="Conjunto"/>
 *     &lt;enumeration value="Distrito"/>
 *     &lt;enumeration value="Esplanada"/>
 *     &lt;enumeration value="Estacao"/>
 *     &lt;enumeration value="Estrada"/>
 *     &lt;enumeration value="Favela"/>
 *     &lt;enumeration value="Fazenda"/>
 *     &lt;enumeration value="Feira"/>
 *     &lt;enumeration value="Jardim"/>
 *     &lt;enumeration value="Ladeira"/>
 *     &lt;enumeration value="Lago"/>
 *     &lt;enumeration value="Lagoa"/>
 *     &lt;enumeration value="Largo"/>
 *     &lt;enumeration value="Loteamento"/>
 *     &lt;enumeration value="Morro"/>
 *     &lt;enumeration value="Outros"/>
 *     &lt;enumeration value="Parque"/>
 *     &lt;enumeration value="Passarela"/>
 *     &lt;enumeration value="Patio"/>
 *     &lt;enumeration value="Praca"/>
 *     &lt;enumeration value="Quadra"/>
 *     &lt;enumeration value="Recanto"/>
 *     &lt;enumeration value="Residencial"/>
 *     &lt;enumeration value="Rodovia"/>
 *     &lt;enumeration value="Rua"/>
 *     &lt;enumeration value="Setor"/>
 *     &lt;enumeration value="Sitio"/>
 *     &lt;enumeration value="Travessa"/>
 *     &lt;enumeration value="Trecho"/>
 *     &lt;enumeration value="Trevo"/>
 *     &lt;enumeration value="Vale"/>
 *     &lt;enumeration value="Vereda"/>
 *     &lt;enumeration value="Via"/>
 *     &lt;enumeration value="Viaduto"/>
 *     &lt;enumeration value="Viela"/>
 *     &lt;enumeration value="Vila"/>
 *     &lt;enumeration value="Praia"/>
 *     &lt;enumeration value="Nucleo"/>
 *     &lt;enumeration value="Calcada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TiposLogradouros")
@XmlEnum
public enum TiposLogradouros {

    @XmlEnumValue("Nenhum")
    NENHUM("Nenhum"),
    @XmlEnumValue("Aeroporto")
    AEROPORTO("Aeroporto"),
    @XmlEnumValue("Alameda")
    ALAMEDA("Alameda"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Avenida")
    AVENIDA("Avenida"),
    @XmlEnumValue("Campo")
    CAMPO("Campo"),
    @XmlEnumValue("Chacara")
    CHACARA("Chacara"),
    @XmlEnumValue("Colonia")
    COLONIA("Colonia"),
    @XmlEnumValue("Condominio")
    CONDOMINIO("Condominio"),
    @XmlEnumValue("Conjunto")
    CONJUNTO("Conjunto"),
    @XmlEnumValue("Distrito")
    DISTRITO("Distrito"),
    @XmlEnumValue("Esplanada")
    ESPLANADA("Esplanada"),
    @XmlEnumValue("Estacao")
    ESTACAO("Estacao"),
    @XmlEnumValue("Estrada")
    ESTRADA("Estrada"),
    @XmlEnumValue("Favela")
    FAVELA("Favela"),
    @XmlEnumValue("Fazenda")
    FAZENDA("Fazenda"),
    @XmlEnumValue("Feira")
    FEIRA("Feira"),
    @XmlEnumValue("Jardim")
    JARDIM("Jardim"),
    @XmlEnumValue("Ladeira")
    LADEIRA("Ladeira"),
    @XmlEnumValue("Lago")
    LAGO("Lago"),
    @XmlEnumValue("Lagoa")
    LAGOA("Lagoa"),
    @XmlEnumValue("Largo")
    LARGO("Largo"),
    @XmlEnumValue("Loteamento")
    LOTEAMENTO("Loteamento"),
    @XmlEnumValue("Morro")
    MORRO("Morro"),
    @XmlEnumValue("Outros")
    OUTROS("Outros"),
    @XmlEnumValue("Parque")
    PARQUE("Parque"),
    @XmlEnumValue("Passarela")
    PASSARELA("Passarela"),
    @XmlEnumValue("Patio")
    PATIO("Patio"),
    @XmlEnumValue("Praca")
    PRACA("Praca"),
    @XmlEnumValue("Quadra")
    QUADRA("Quadra"),
    @XmlEnumValue("Recanto")
    RECANTO("Recanto"),
    @XmlEnumValue("Residencial")
    RESIDENCIAL("Residencial"),
    @XmlEnumValue("Rodovia")
    RODOVIA("Rodovia"),
    @XmlEnumValue("Rua")
    RUA("Rua"),
    @XmlEnumValue("Setor")
    SETOR("Setor"),
    @XmlEnumValue("Sitio")
    SITIO("Sitio"),
    @XmlEnumValue("Travessa")
    TRAVESSA("Travessa"),
    @XmlEnumValue("Trecho")
    TRECHO("Trecho"),
    @XmlEnumValue("Trevo")
    TREVO("Trevo"),
    @XmlEnumValue("Vale")
    VALE("Vale"),
    @XmlEnumValue("Vereda")
    VEREDA("Vereda"),
    @XmlEnumValue("Via")
    VIA("Via"),
    @XmlEnumValue("Viaduto")
    VIADUTO("Viaduto"),
    @XmlEnumValue("Viela")
    VIELA("Viela"),
    @XmlEnumValue("Vila")
    VILA("Vila"),
    @XmlEnumValue("Praia")
    PRAIA("Praia"),
    @XmlEnumValue("Nucleo")
    NUCLEO("Nucleo"),
    @XmlEnumValue("Calcada")
    CALCADA("Calcada");
    private final String value;

    TiposLogradouros(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiposLogradouros fromValue(String v) {
        for (TiposLogradouros c: TiposLogradouros.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
