
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CodigosRetornoIntegracao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CodigosRetornoIntegracao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RecebimentoOK"/>
 *     &lt;enumeration value="ProcessamentoOK"/>
 *     &lt;enumeration value="FalhaDeConexao"/>
 *     &lt;enumeration value="ErroRecebimento"/>
 *     &lt;enumeration value="ErroProcessamento"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodigosRetornoIntegracao")
@XmlEnum
public enum CodigosRetornoIntegracao {

    @XmlEnumValue("RecebimentoOK")
    RECEBIMENTO_OK("RecebimentoOK"),
    @XmlEnumValue("ProcessamentoOK")
    PROCESSAMENTO_OK("ProcessamentoOK"),
    @XmlEnumValue("FalhaDeConexao")
    FALHA_DE_CONEXAO("FalhaDeConexao"),
    @XmlEnumValue("ErroRecebimento")
    ERRO_RECEBIMENTO("ErroRecebimento"),
    @XmlEnumValue("ErroProcessamento")
    ERRO_PROCESSAMENTO("ErroProcessamento");
    private final String value;

    CodigosRetornoIntegracao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodigosRetornoIntegracao fromValue(String v) {
        for (CodigosRetornoIntegracao c: CodigosRetornoIntegracao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
