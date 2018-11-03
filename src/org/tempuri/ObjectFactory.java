
package org.tempuri;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmailPessoaLayout_QNAME = new QName("http://tempuri.org/", "EmailPessoaLayout");
    private final static QName _ArrayOfTelefonePessoaLayout_QNAME = new QName("http://tempuri.org/", "ArrayOfTelefonePessoaLayout");
    private final static QName _PessoaIntegracaoLayout_QNAME = new QName("http://tempuri.org/", "PessoaIntegracaoLayout");
    private final static QName _ArrayOfCampoIntegracao_QNAME = new QName("http://tempuri.org/", "ArrayOfCampoIntegracao");
    private final static QName _CampoIntegracao_QNAME = new QName("http://tempuri.org/", "CampoIntegracao");
    private final static QName _ArrayOfTabelaAdicional_QNAME = new QName("http://tempuri.org/", "ArrayOfTabelaAdicional");
    private final static QName _TabelaAdicional_QNAME = new QName("http://tempuri.org/", "TabelaAdicional");
    private final static QName _UnsignedLong_QNAME = new QName("http://tempuri.org/", "unsignedLong");
    private final static QName _IntegraPessoaRequest_QNAME = new QName("http://tempuri.org/", "IntegraPessoaRequest");
    private final static QName _SecurityServiceFault_QNAME = new QName("http://tempuri.org/", "SecurityServiceFault");
    private final static QName _UnsignedByte_QNAME = new QName("http://tempuri.org/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://tempuri.org/", "unsignedShort");
    private final static QName _TiposEmail_QNAME = new QName("http://tempuri.org/", "TiposEmail");
    private final static QName _ArrayOfPessoaIntegracaoLayout_QNAME = new QName("http://tempuri.org/", "ArrayOfPessoaIntegracaoLayout");
    private final static QName _CodigosRetornoIntegracao_QNAME = new QName("http://tempuri.org/", "CodigosRetornoIntegracao");
    private final static QName _AnyType_QNAME = new QName("http://tempuri.org/", "anyType");
    private final static QName _ConsultaPessoaRequest_QNAME = new QName("http://tempuri.org/", "ConsultaPessoaRequest");
    private final static QName _TiposEndereco_QNAME = new QName("http://tempuri.org/", "TiposEndereco");
    private final static QName _Float_QNAME = new QName("http://tempuri.org/", "float");
    private final static QName _ArrayOfEnderecoPessoaLayout_QNAME = new QName("http://tempuri.org/", "ArrayOfEnderecoPessoaLayout");
    private final static QName _EnderecoPessoaLayout_QNAME = new QName("http://tempuri.org/", "EnderecoPessoaLayout");
    private final static QName _Base64Binary_QNAME = new QName("http://tempuri.org/", "base64Binary");
    private final static QName _Guid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://tempuri.org/", "decimal");
    private final static QName _ContatoPessoaLayout_QNAME = new QName("http://tempuri.org/", "ContatoPessoaLayout");
    private final static QName _TiposLogradouros_QNAME = new QName("http://tempuri.org/", "TiposLogradouros");
    private final static QName _Byte_QNAME = new QName("http://tempuri.org/", "byte");
    private final static QName _Double_QNAME = new QName("http://tempuri.org/", "double");
    private final static QName _ConsultaPessoaResponse_QNAME = new QName("http://tempuri.org/", "ConsultaPessoaResponse");
    private final static QName _AnyURI_QNAME = new QName("http://tempuri.org/", "anyURI");
    private final static QName _ArrayOfEmailPessoaLayout_QNAME = new QName("http://tempuri.org/", "ArrayOfEmailPessoaLayout");
    private final static QName _Duration_QNAME = new QName("http://tempuri.org/", "duration");
    private final static QName _ServiceFault_QNAME = new QName("http://tempuri.org/", "ServiceFault");
    private final static QName _TiposPessoa_QNAME = new QName("http://tempuri.org/", "TiposPessoa");
    private final static QName _ConsultaPessoaCPFCNPJRequest_QNAME = new QName("http://tempuri.org/", "ConsultaPessoaCPFCNPJRequest");
    private final static QName _LayoutIntegracaoBase_QNAME = new QName("http://tempuri.org/", "LayoutIntegracaoBase");
    private final static QName _DateTime_QNAME = new QName("http://tempuri.org/", "dateTime");
    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _Long_QNAME = new QName("http://tempuri.org/", "long");
    private final static QName _Boolean_QNAME = new QName("http://tempuri.org/", "boolean");
    private final static QName _Response_QNAME = new QName("http://tempuri.org/", "Response");
    private final static QName _IntegraPessoaResponse_QNAME = new QName("http://tempuri.org/", "IntegraPessoaResponse");
    private final static QName _Short_QNAME = new QName("http://tempuri.org/", "short");
    private final static QName _UnsignedInt_QNAME = new QName("http://tempuri.org/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://tempuri.org/", "char");
    private final static QName _ArrayOfContatoPessoaLayout_QNAME = new QName("http://tempuri.org/", "ArrayOfContatoPessoaLayout");
    private final static QName _TelefonePessoaLayout_QNAME = new QName("http://tempuri.org/", "TelefonePessoaLayout");
    private final static QName _QName_QNAME = new QName("http://tempuri.org/", "QName");
    private final static QName _LogoutResponse_QNAME = new QName("http://tempuri.org/", "LogoutResponse");
    private final static QName _Request_QNAME = new QName("http://tempuri.org/", "Request");
    private final static QName _Int_QNAME = new QName("http://tempuri.org/", "int");
    private final static QName _ConsultaPessoaCPFCNPJResponse_QNAME = new QName("http://tempuri.org/", "ConsultaPessoaCPFCNPJResponse");
    private final static QName _ServiceFaultMessage_QNAME = new QName("http://tempuri.org/", "Message");
    private final static QName _PessoaIntegracaoLayoutEhFornecedor_QNAME = new QName("http://tempuri.org/", "EhFornecedor");
    private final static QName _PessoaIntegracaoLayoutEmails_QNAME = new QName("http://tempuri.org/", "Emails");
    private final static QName _PessoaIntegracaoLayoutEnderecos_QNAME = new QName("http://tempuri.org/", "Enderecos");
    private final static QName _PessoaIntegracaoLayoutTelefones_QNAME = new QName("http://tempuri.org/", "Telefones");
    private final static QName _PessoaIntegracaoLayoutNome_QNAME = new QName("http://tempuri.org/", "Nome");
    private final static QName _PessoaIntegracaoLayoutContatos_QNAME = new QName("http://tempuri.org/", "Contatos");
    private final static QName _PessoaIntegracaoLayoutEhCliente_QNAME = new QName("http://tempuri.org/", "EhCliente");
    private final static QName _PessoaIntegracaoLayoutApelido_QNAME = new QName("http://tempuri.org/", "Apelido");
    private final static QName _PessoaIntegracaoLayoutIsentoInscricaoSubstituto_QNAME = new QName("http://tempuri.org/", "IsentoInscricaoSubstituto");
    private final static QName _PessoaIntegracaoLayoutInscricaoEstadualSubstituto_QNAME = new QName("http://tempuri.org/", "InscricaoEstadualSubstituto");
    private final static QName _PessoaIntegracaoLayoutIsentoInscricaoEstadual_QNAME = new QName("http://tempuri.org/", "IsentoInscricaoEstadual");
    private final static QName _PessoaIntegracaoLayoutNumeroDocumento_QNAME = new QName("http://tempuri.org/", "NumeroDocumento");
    private final static QName _PessoaIntegracaoLayoutInscricaoEstadual_QNAME = new QName("http://tempuri.org/", "InscricaoEstadual");
    private final static QName _ConsultarResponseConsultarResult_QNAME = new QName("http://tempuri.org/", "ConsultarResult");
    private final static QName _EnderecoPessoaLayoutNumeroLogradouro_QNAME = new QName("http://tempuri.org/", "NumeroLogradouro");
    private final static QName _EnderecoPessoaLayoutCaixaPostal_QNAME = new QName("http://tempuri.org/", "CaixaPostal");
    private final static QName _EnderecoPessoaLayoutLogradouro_QNAME = new QName("http://tempuri.org/", "Logradouro");
    private final static QName _EnderecoPessoaLayoutSiglaPais_QNAME = new QName("http://tempuri.org/", "SiglaPais");
    private final static QName _EnderecoPessoaLayoutComplemento_QNAME = new QName("http://tempuri.org/", "Complemento");
    private final static QName _EnderecoPessoaLayoutCep_QNAME = new QName("http://tempuri.org/", "Cep");
    private final static QName _EnderecoPessoaLayoutNomeMunicipio_QNAME = new QName("http://tempuri.org/", "NomeMunicipio");
    private final static QName _EnderecoPessoaLayoutSiglaEstado_QNAME = new QName("http://tempuri.org/", "SiglaEstado");
    private final static QName _EnderecoPessoaLayoutBairro_QNAME = new QName("http://tempuri.org/", "Bairro");
    private final static QName _LoginRequestUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private final static QName _LoginRequestPassword_QNAME = new QName("http://tempuri.org/", "Password");
    private final static QName _ConsultarIntegracaoResponseConsultarIntegracaoResult_QNAME = new QName("http://tempuri.org/", "ConsultarIntegracaoResult");
    private final static QName _TabelaAdicionalCamposAdicionais_QNAME = new QName("http://tempuri.org/", "CamposAdicionais");
    private final static QName _TabelaAdicionalCampoLigacao_QNAME = new QName("http://tempuri.org/", "CampoLigacao");
    private final static QName _TabelaAdicionalCodigoConfiguracao_QNAME = new QName("http://tempuri.org/", "CodigoConfiguracao");
    private final static QName _TabelaAdicionalTabelaNome_QNAME = new QName("http://tempuri.org/", "TabelaNome");
    private final static QName _LogoutRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _IntegraPessoaRequestPessoa_QNAME = new QName("http://tempuri.org/", "Pessoa");
    private final static QName _LayoutIntegracaoBaseCnpjEmpresa_QNAME = new QName("http://tempuri.org/", "CnpjEmpresa");
    private final static QName _LayoutIntegracaoBaseTabelasAdicionais_QNAME = new QName("http://tempuri.org/", "TabelasAdicionais");
    private final static QName _LogoutRequest1AuthenticationTokenId_QNAME = new QName("http://tempuri.org/", "AuthenticationTokenId");
    private final static QName _EmailPessoaLayoutEmail_QNAME = new QName("http://tempuri.org/", "Email");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _TelefonePessoaLayoutTipo_QNAME = new QName("http://tempuri.org/", "Tipo");
    private final static QName _TelefonePessoaLayoutTelefone_QNAME = new QName("http://tempuri.org/", "Telefone");
    private final static QName _CampoIntegracaoCampoReferencia_QNAME = new QName("http://tempuri.org/", "CampoReferencia");
    private final static QName _CampoIntegracaoValor_QNAME = new QName("http://tempuri.org/", "Valor");
    private final static QName _ConsultaPessoaCPFCNPJResponsePessoas_QNAME = new QName("http://tempuri.org/", "Pessoas");
    private final static QName _ConsultaPessoaCPFCNPJResponseMensagem_QNAME = new QName("http://tempuri.org/", "Mensagem");
    private final static QName _ConsultaPessoaCPFCNPJRequestCPFCNPJ_QNAME = new QName("http://tempuri.org/", "CPFCNPJ");
    private final static QName _LogoutResponseLogoutResult_QNAME = new QName("http://tempuri.org/", "LogoutResult");
    private final static QName _IntegrarResponseIntegrarResult_QNAME = new QName("http://tempuri.org/", "IntegrarResult");
    private final static QName _IntegraPessoaResponseTokenId_QNAME = new QName("http://tempuri.org/", "TokenId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfPessoaIntegracaoLayout }
     * 
     */
    public ArrayOfPessoaIntegracaoLayout createArrayOfPessoaIntegracaoLayout() {
        return new ArrayOfPessoaIntegracaoLayout();
    }

    /**
     * Create an instance of {@link Integrar }
     * 
     */
    public Integrar createIntegrar() {
        return new Integrar();
    }

    /**
     * Create an instance of {@link IntegraPessoaRequest }
     * 
     */
    public IntegraPessoaRequest createIntegraPessoaRequest() {
        return new IntegraPessoaRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEnderecoPessoaLayout }
     * 
     */
    public ArrayOfEnderecoPessoaLayout createArrayOfEnderecoPessoaLayout() {
        return new ArrayOfEnderecoPessoaLayout();
    }

    /**
     * Create an instance of {@link ConsultaPessoaRequest }
     * 
     */
    public ConsultaPessoaRequest createConsultaPessoaRequest() {
        return new ConsultaPessoaRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampoIntegracao }
     * 
     */
    public ArrayOfCampoIntegracao createArrayOfCampoIntegracao() {
        return new ArrayOfCampoIntegracao();
    }

    /**
     * Create an instance of {@link CampoIntegracao }
     * 
     */
    public CampoIntegracao createCampoIntegracao() {
        return new CampoIntegracao();
    }

    /**
     * Create an instance of {@link PessoaIntegracaoLayout }
     * 
     */
    public PessoaIntegracaoLayout createPessoaIntegracaoLayout() {
        return new PessoaIntegracaoLayout();
    }

    /**
     * Create an instance of {@link EmailPessoaLayout }
     * 
     */
    public EmailPessoaLayout createEmailPessoaLayout() {
        return new EmailPessoaLayout();
    }

    /**
     * Create an instance of {@link ArrayOfTelefonePessoaLayout }
     * 
     */
    public ArrayOfTelefonePessoaLayout createArrayOfTelefonePessoaLayout() {
        return new ArrayOfTelefonePessoaLayout();
    }

    /**
     * Create an instance of {@link ArrayOfTabelaAdicional }
     * 
     */
    public ArrayOfTabelaAdicional createArrayOfTabelaAdicional() {
        return new ArrayOfTabelaAdicional();
    }

    /**
     * Create an instance of {@link TabelaAdicional }
     * 
     */
    public TabelaAdicional createTabelaAdicional() {
        return new TabelaAdicional();
    }

    /**
     * Create an instance of {@link SecurityServiceFault }
     * 
     */
    public SecurityServiceFault createSecurityServiceFault() {
        return new SecurityServiceFault();
    }

    /**
     * Create an instance of {@link ContatoPessoaLayout }
     * 
     */
    public ContatoPessoaLayout createContatoPessoaLayout() {
        return new ContatoPessoaLayout();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResponse1 }
     * 
     */
    public LoginResponse1 createLoginResponse1() {
        return new LoginResponse1();
    }

    /**
     * Create an instance of {@link ConsultaPessoaResponse }
     * 
     */
    public ConsultaPessoaResponse createConsultaPessoaResponse() {
        return new ConsultaPessoaResponse();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link ConsultaPessoaCPFCNPJRequest }
     * 
     */
    public ConsultaPessoaCPFCNPJRequest createConsultaPessoaCPFCNPJRequest() {
        return new ConsultaPessoaCPFCNPJRequest();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link ConsultaPessoaCPFCNPJResponse }
     * 
     */
    public ConsultaPessoaCPFCNPJResponse createConsultaPessoaCPFCNPJResponse() {
        return new ConsultaPessoaCPFCNPJResponse();
    }

    /**
     * Create an instance of {@link EnderecoPessoaLayout }
     * 
     */
    public EnderecoPessoaLayout createEnderecoPessoaLayout() {
        return new EnderecoPessoaLayout();
    }

    /**
     * Create an instance of {@link ConsultarIntegracao }
     * 
     */
    public ConsultarIntegracao createConsultarIntegracao() {
        return new ConsultarIntegracao();
    }

    /**
     * Create an instance of {@link ArrayOfEmailPessoaLayout }
     * 
     */
    public ArrayOfEmailPessoaLayout createArrayOfEmailPessoaLayout() {
        return new ArrayOfEmailPessoaLayout();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutRequest1 }
     * 
     */
    public LogoutRequest1 createLogoutRequest1() {
        return new LogoutRequest1();
    }

    /**
     * Create an instance of {@link LayoutIntegracaoBase }
     * 
     */
    public LayoutIntegracaoBase createLayoutIntegracaoBase() {
        return new LayoutIntegracaoBase();
    }

    /**
     * Create an instance of {@link ArrayOfContatoPessoaLayout }
     * 
     */
    public ArrayOfContatoPessoaLayout createArrayOfContatoPessoaLayout() {
        return new ArrayOfContatoPessoaLayout();
    }

    /**
     * Create an instance of {@link TelefonePessoaLayout }
     * 
     */
    public TelefonePessoaLayout createTelefonePessoaLayout() {
        return new TelefonePessoaLayout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ConsultarIntegracaoResponse }
     * 
     */
    public ConsultarIntegracaoResponse createConsultarIntegracaoResponse() {
        return new ConsultarIntegracaoResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link IntegrarResponse }
     * 
     */
    public IntegrarResponse createIntegrarResponse() {
        return new IntegrarResponse();
    }

    /**
     * Create an instance of {@link IntegraPessoaResponse }
     * 
     */
    public IntegraPessoaResponse createIntegraPessoaResponse() {
        return new IntegraPessoaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EmailPessoaLayout")
    public JAXBElement<EmailPessoaLayout> createEmailPessoaLayout(EmailPessoaLayout value) {
        return new JAXBElement<EmailPessoaLayout>(_EmailPessoaLayout_QNAME, EmailPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTelefonePessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfTelefonePessoaLayout")
    public JAXBElement<ArrayOfTelefonePessoaLayout> createArrayOfTelefonePessoaLayout(ArrayOfTelefonePessoaLayout value) {
        return new JAXBElement<ArrayOfTelefonePessoaLayout>(_ArrayOfTelefonePessoaLayout_QNAME, ArrayOfTelefonePessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PessoaIntegracaoLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PessoaIntegracaoLayout")
    public JAXBElement<PessoaIntegracaoLayout> createPessoaIntegracaoLayout(PessoaIntegracaoLayout value) {
        return new JAXBElement<PessoaIntegracaoLayout>(_PessoaIntegracaoLayout_QNAME, PessoaIntegracaoLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampoIntegracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfCampoIntegracao")
    public JAXBElement<ArrayOfCampoIntegracao> createArrayOfCampoIntegracao(ArrayOfCampoIntegracao value) {
        return new JAXBElement<ArrayOfCampoIntegracao>(_ArrayOfCampoIntegracao_QNAME, ArrayOfCampoIntegracao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampoIntegracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CampoIntegracao")
    public JAXBElement<CampoIntegracao> createCampoIntegracao(CampoIntegracao value) {
        return new JAXBElement<CampoIntegracao>(_CampoIntegracao_QNAME, CampoIntegracao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTabelaAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfTabelaAdicional")
    public JAXBElement<ArrayOfTabelaAdicional> createArrayOfTabelaAdicional(ArrayOfTabelaAdicional value) {
        return new JAXBElement<ArrayOfTabelaAdicional>(_ArrayOfTabelaAdicional_QNAME, ArrayOfTabelaAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabelaAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TabelaAdicional")
    public JAXBElement<TabelaAdicional> createTabelaAdicional(TabelaAdicional value) {
        return new JAXBElement<TabelaAdicional>(_TabelaAdicional_QNAME, TabelaAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegraPessoaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegraPessoaRequest")
    public JAXBElement<IntegraPessoaRequest> createIntegraPessoaRequest(IntegraPessoaRequest value) {
        return new JAXBElement<IntegraPessoaRequest>(_IntegraPessoaRequest_QNAME, IntegraPessoaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SecurityServiceFault")
    public JAXBElement<SecurityServiceFault> createSecurityServiceFault(SecurityServiceFault value) {
        return new JAXBElement<SecurityServiceFault>(_SecurityServiceFault_QNAME, SecurityServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiposEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TiposEmail")
    public JAXBElement<TiposEmail> createTiposEmail(TiposEmail value) {
        return new JAXBElement<TiposEmail>(_TiposEmail_QNAME, TiposEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPessoaIntegracaoLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfPessoaIntegracaoLayout")
    public JAXBElement<ArrayOfPessoaIntegracaoLayout> createArrayOfPessoaIntegracaoLayout(ArrayOfPessoaIntegracaoLayout value) {
        return new JAXBElement<ArrayOfPessoaIntegracaoLayout>(_ArrayOfPessoaIntegracaoLayout_QNAME, ArrayOfPessoaIntegracaoLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigosRetornoIntegracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CodigosRetornoIntegracao")
    public JAXBElement<CodigosRetornoIntegracao> createCodigosRetornoIntegracao(CodigosRetornoIntegracao value) {
        return new JAXBElement<CodigosRetornoIntegracao>(_CodigosRetornoIntegracao_QNAME, CodigosRetornoIntegracao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultaPessoaRequest")
    public JAXBElement<ConsultaPessoaRequest> createConsultaPessoaRequest(ConsultaPessoaRequest value) {
        return new JAXBElement<ConsultaPessoaRequest>(_ConsultaPessoaRequest_QNAME, ConsultaPessoaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiposEndereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TiposEndereco")
    public JAXBElement<TiposEndereco> createTiposEndereco(TiposEndereco value) {
        return new JAXBElement<TiposEndereco>(_TiposEndereco_QNAME, TiposEndereco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfEnderecoPessoaLayout")
    public JAXBElement<ArrayOfEnderecoPessoaLayout> createArrayOfEnderecoPessoaLayout(ArrayOfEnderecoPessoaLayout value) {
        return new JAXBElement<ArrayOfEnderecoPessoaLayout>(_ArrayOfEnderecoPessoaLayout_QNAME, ArrayOfEnderecoPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnderecoPessoaLayout")
    public JAXBElement<EnderecoPessoaLayout> createEnderecoPessoaLayout(EnderecoPessoaLayout value) {
        return new JAXBElement<EnderecoPessoaLayout>(_EnderecoPessoaLayout_QNAME, EnderecoPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContatoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ContatoPessoaLayout")
    public JAXBElement<ContatoPessoaLayout> createContatoPessoaLayout(ContatoPessoaLayout value) {
        return new JAXBElement<ContatoPessoaLayout>(_ContatoPessoaLayout_QNAME, ContatoPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiposLogradouros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TiposLogradouros")
    public JAXBElement<TiposLogradouros> createTiposLogradouros(TiposLogradouros value) {
        return new JAXBElement<TiposLogradouros>(_TiposLogradouros_QNAME, TiposLogradouros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultaPessoaResponse")
    public JAXBElement<ConsultaPessoaResponse> createConsultaPessoaResponse(ConsultaPessoaResponse value) {
        return new JAXBElement<ConsultaPessoaResponse>(_ConsultaPessoaResponse_QNAME, ConsultaPessoaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfEmailPessoaLayout")
    public JAXBElement<ArrayOfEmailPessoaLayout> createArrayOfEmailPessoaLayout(ArrayOfEmailPessoaLayout value) {
        return new JAXBElement<ArrayOfEmailPessoaLayout>(_ArrayOfEmailPessoaLayout_QNAME, ArrayOfEmailPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TiposPessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TiposPessoa")
    public JAXBElement<TiposPessoa> createTiposPessoa(TiposPessoa value) {
        return new JAXBElement<TiposPessoa>(_TiposPessoa_QNAME, TiposPessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultaPessoaCPFCNPJRequest")
    public JAXBElement<ConsultaPessoaCPFCNPJRequest> createConsultaPessoaCPFCNPJRequest(ConsultaPessoaCPFCNPJRequest value) {
        return new JAXBElement<ConsultaPessoaCPFCNPJRequest>(_ConsultaPessoaCPFCNPJRequest_QNAME, ConsultaPessoaCPFCNPJRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutIntegracaoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LayoutIntegracaoBase")
    public JAXBElement<LayoutIntegracaoBase> createLayoutIntegracaoBase(LayoutIntegracaoBase value) {
        return new JAXBElement<LayoutIntegracaoBase>(_LayoutIntegracaoBase_QNAME, LayoutIntegracaoBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegraPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegraPessoaResponse")
    public JAXBElement<IntegraPessoaResponse> createIntegraPessoaResponse(IntegraPessoaResponse value) {
        return new JAXBElement<IntegraPessoaResponse>(_IntegraPessoaResponse_QNAME, IntegraPessoaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContatoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfContatoPessoaLayout")
    public JAXBElement<ArrayOfContatoPessoaLayout> createArrayOfContatoPessoaLayout(ArrayOfContatoPessoaLayout value) {
        return new JAXBElement<ArrayOfContatoPessoaLayout>(_ArrayOfContatoPessoaLayout_QNAME, ArrayOfContatoPessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonePessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TelefonePessoaLayout")
    public JAXBElement<TelefonePessoaLayout> createTelefonePessoaLayout(TelefonePessoaLayout value) {
        return new JAXBElement<TelefonePessoaLayout>(_TelefonePessoaLayout_QNAME, TelefonePessoaLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultaPessoaCPFCNPJResponse")
    public JAXBElement<ConsultaPessoaCPFCNPJResponse> createConsultaPessoaCPFCNPJResponse(ConsultaPessoaCPFCNPJResponse value) {
        return new JAXBElement<ConsultaPessoaCPFCNPJResponse>(_ConsultaPessoaCPFCNPJResponse_QNAME, ConsultaPessoaCPFCNPJResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Message", scope = ServiceFault.class)
    public JAXBElement<String> createServiceFaultMessage(String value) {
        return new JAXBElement<String>(_ServiceFaultMessage_QNAME, String.class, ServiceFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EhFornecedor", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<Boolean> createPessoaIntegracaoLayoutEhFornecedor(Boolean value) {
        return new JAXBElement<Boolean>(_PessoaIntegracaoLayoutEhFornecedor_QNAME, Boolean.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Emails", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<ArrayOfEmailPessoaLayout> createPessoaIntegracaoLayoutEmails(ArrayOfEmailPessoaLayout value) {
        return new JAXBElement<ArrayOfEmailPessoaLayout>(_PessoaIntegracaoLayoutEmails_QNAME, ArrayOfEmailPessoaLayout.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Enderecos", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<ArrayOfEnderecoPessoaLayout> createPessoaIntegracaoLayoutEnderecos(ArrayOfEnderecoPessoaLayout value) {
        return new JAXBElement<ArrayOfEnderecoPessoaLayout>(_PessoaIntegracaoLayoutEnderecos_QNAME, ArrayOfEnderecoPessoaLayout.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTelefonePessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Telefones", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<ArrayOfTelefonePessoaLayout> createPessoaIntegracaoLayoutTelefones(ArrayOfTelefonePessoaLayout value) {
        return new JAXBElement<ArrayOfTelefonePessoaLayout>(_PessoaIntegracaoLayoutTelefones_QNAME, ArrayOfTelefonePessoaLayout.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Nome", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<String> createPessoaIntegracaoLayoutNome(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutNome_QNAME, String.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContatoPessoaLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Contatos", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<ArrayOfContatoPessoaLayout> createPessoaIntegracaoLayoutContatos(ArrayOfContatoPessoaLayout value) {
        return new JAXBElement<ArrayOfContatoPessoaLayout>(_PessoaIntegracaoLayoutContatos_QNAME, ArrayOfContatoPessoaLayout.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EhCliente", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<Boolean> createPessoaIntegracaoLayoutEhCliente(Boolean value) {
        return new JAXBElement<Boolean>(_PessoaIntegracaoLayoutEhCliente_QNAME, Boolean.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Apelido", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<String> createPessoaIntegracaoLayoutApelido(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutApelido_QNAME, String.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IsentoInscricaoSubstituto", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<Boolean> createPessoaIntegracaoLayoutIsentoInscricaoSubstituto(Boolean value) {
        return new JAXBElement<Boolean>(_PessoaIntegracaoLayoutIsentoInscricaoSubstituto_QNAME, Boolean.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InscricaoEstadualSubstituto", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<String> createPessoaIntegracaoLayoutInscricaoEstadualSubstituto(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutInscricaoEstadualSubstituto_QNAME, String.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IsentoInscricaoEstadual", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<Boolean> createPessoaIntegracaoLayoutIsentoInscricaoEstadual(Boolean value) {
        return new JAXBElement<Boolean>(_PessoaIntegracaoLayoutIsentoInscricaoEstadual_QNAME, Boolean.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NumeroDocumento", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<String> createPessoaIntegracaoLayoutNumeroDocumento(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutNumeroDocumento_QNAME, String.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InscricaoEstadual", scope = PessoaIntegracaoLayout.class)
    public JAXBElement<String> createPessoaIntegracaoLayoutInscricaoEstadual(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutInscricaoEstadual_QNAME, String.class, PessoaIntegracaoLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarResult", scope = ConsultarResponse.class)
    public JAXBElement<ConsultaPessoaCPFCNPJResponse> createConsultarResponseConsultarResult(ConsultaPessoaCPFCNPJResponse value) {
        return new JAXBElement<ConsultaPessoaCPFCNPJResponse>(_ConsultarResponseConsultarResult_QNAME, ConsultaPessoaCPFCNPJResponse.class, ConsultarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NumeroLogradouro", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutNumeroLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutNumeroLogradouro_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CaixaPostal", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutCaixaPostal(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutCaixaPostal_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Logradouro", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutLogradouro_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SiglaPais", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutSiglaPais(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutSiglaPais_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Complemento", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutComplemento(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutComplemento_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cep", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutCep(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutCep_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NomeMunicipio", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutNomeMunicipio(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutNomeMunicipio_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SiglaEstado", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutSiglaEstado(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutSiglaEstado_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Bairro", scope = EnderecoPessoaLayout.class)
    public JAXBElement<String> createEnderecoPessoaLayoutBairro(String value) {
        return new JAXBElement<String>(_EnderecoPessoaLayoutBairro_QNAME, String.class, EnderecoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = LoginRequest.class)
    public JAXBElement<String> createLoginRequestUserName(String value) {
        return new JAXBElement<String>(_LoginRequestUserName_QNAME, String.class, LoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = LoginRequest.class)
    public JAXBElement<String> createLoginRequestPassword(String value) {
        return new JAXBElement<String>(_LoginRequestPassword_QNAME, String.class, LoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarIntegracaoResult", scope = ConsultarIntegracaoResponse.class)
    public JAXBElement<ConsultaPessoaResponse> createConsultarIntegracaoResponseConsultarIntegracaoResult(ConsultaPessoaResponse value) {
        return new JAXBElement<ConsultaPessoaResponse>(_ConsultarIntegracaoResponseConsultarIntegracaoResult_QNAME, ConsultaPessoaResponse.class, ConsultarIntegracaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampoIntegracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CamposAdicionais", scope = TabelaAdicional.class)
    public JAXBElement<ArrayOfCampoIntegracao> createTabelaAdicionalCamposAdicionais(ArrayOfCampoIntegracao value) {
        return new JAXBElement<ArrayOfCampoIntegracao>(_TabelaAdicionalCamposAdicionais_QNAME, ArrayOfCampoIntegracao.class, TabelaAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CampoLigacao", scope = TabelaAdicional.class)
    public JAXBElement<String> createTabelaAdicionalCampoLigacao(String value) {
        return new JAXBElement<String>(_TabelaAdicionalCampoLigacao_QNAME, String.class, TabelaAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CodigoConfiguracao", scope = TabelaAdicional.class)
    public JAXBElement<String> createTabelaAdicionalCodigoConfiguracao(String value) {
        return new JAXBElement<String>(_TabelaAdicionalCodigoConfiguracao_QNAME, String.class, TabelaAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TabelaNome", scope = TabelaAdicional.class)
    public JAXBElement<String> createTabelaAdicionalTabelaNome(String value) {
        return new JAXBElement<String>(_TabelaAdicionalTabelaNome_QNAME, String.class, TabelaAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutRequest1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = Logout.class)
    public JAXBElement<LogoutRequest1> createLogoutRequest(LogoutRequest1 value) {
        return new JAXBElement<LogoutRequest1>(_LogoutRequest_QNAME, LogoutRequest1 .class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PessoaIntegracaoLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pessoa", scope = IntegraPessoaRequest.class)
    public JAXBElement<PessoaIntegracaoLayout> createIntegraPessoaRequestPessoa(PessoaIntegracaoLayout value) {
        return new JAXBElement<PessoaIntegracaoLayout>(_IntegraPessoaRequestPessoa_QNAME, PessoaIntegracaoLayout.class, IntegraPessoaRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegraPessoaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = Integrar.class)
    public JAXBElement<IntegraPessoaRequest> createIntegrarRequest(IntegraPessoaRequest value) {
        return new JAXBElement<IntegraPessoaRequest>(_LogoutRequest_QNAME, IntegraPessoaRequest.class, Integrar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampoIntegracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CamposAdicionais", scope = LayoutIntegracaoBase.class)
    public JAXBElement<ArrayOfCampoIntegracao> createLayoutIntegracaoBaseCamposAdicionais(ArrayOfCampoIntegracao value) {
        return new JAXBElement<ArrayOfCampoIntegracao>(_TabelaAdicionalCamposAdicionais_QNAME, ArrayOfCampoIntegracao.class, LayoutIntegracaoBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CnpjEmpresa", scope = LayoutIntegracaoBase.class)
    public JAXBElement<String> createLayoutIntegracaoBaseCnpjEmpresa(String value) {
        return new JAXBElement<String>(_LayoutIntegracaoBaseCnpjEmpresa_QNAME, String.class, LayoutIntegracaoBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CodigoConfiguracao", scope = LayoutIntegracaoBase.class)
    public JAXBElement<String> createLayoutIntegracaoBaseCodigoConfiguracao(String value) {
        return new JAXBElement<String>(_TabelaAdicionalCodigoConfiguracao_QNAME, String.class, LayoutIntegracaoBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTabelaAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TabelasAdicionais", scope = LayoutIntegracaoBase.class)
    public JAXBElement<ArrayOfTabelaAdicional> createLayoutIntegracaoBaseTabelasAdicionais(ArrayOfTabelaAdicional value) {
        return new JAXBElement<ArrayOfTabelaAdicional>(_LayoutIntegracaoBaseTabelasAdicionais_QNAME, ArrayOfTabelaAdicional.class, LayoutIntegracaoBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticationTokenId", scope = LogoutRequest1 .class)
    public JAXBElement<String> createLogoutRequest1AuthenticationTokenId(String value) {
        return new JAXBElement<String>(_LogoutRequest1AuthenticationTokenId_QNAME, String.class, LogoutRequest1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticationTokenId", scope = LoginResponse1 .class)
    public JAXBElement<String> createLoginResponse1AuthenticationTokenId(String value) {
        return new JAXBElement<String>(_LogoutRequest1AuthenticationTokenId_QNAME, String.class, LoginResponse1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Email", scope = EmailPessoaLayout.class)
    public JAXBElement<String> createEmailPessoaLayoutEmail(String value) {
        return new JAXBElement<String>(_EmailPessoaLayoutEmail_QNAME, String.class, EmailPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = Login.class)
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LogoutRequest_QNAME, LoginRequest.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<LoginResponse1> createLoginResponseLoginResult(LoginResponse1 value) {
        return new JAXBElement<LoginResponse1>(_LoginResponseLoginResult_QNAME, LoginResponse1 .class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Tipo", scope = TelefonePessoaLayout.class)
    public JAXBElement<String> createTelefonePessoaLayoutTipo(String value) {
        return new JAXBElement<String>(_TelefonePessoaLayoutTipo_QNAME, String.class, TelefonePessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Telefone", scope = TelefonePessoaLayout.class)
    public JAXBElement<String> createTelefonePessoaLayoutTelefone(String value) {
        return new JAXBElement<String>(_TelefonePessoaLayoutTelefone_QNAME, String.class, TelefonePessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CampoReferencia", scope = CampoIntegracao.class)
    public JAXBElement<String> createCampoIntegracaoCampoReferencia(String value) {
        return new JAXBElement<String>(_CampoIntegracaoCampoReferencia_QNAME, String.class, CampoIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Valor", scope = CampoIntegracao.class)
    public JAXBElement<String> createCampoIntegracaoValor(String value) {
        return new JAXBElement<String>(_CampoIntegracaoValor_QNAME, String.class, CampoIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Nome", scope = CampoIntegracao.class)
    public JAXBElement<String> createCampoIntegracaoNome(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutNome_QNAME, String.class, CampoIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPessoaIntegracaoLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pessoas", scope = ConsultaPessoaCPFCNPJResponse.class)
    public JAXBElement<ArrayOfPessoaIntegracaoLayout> createConsultaPessoaCPFCNPJResponsePessoas(ArrayOfPessoaIntegracaoLayout value) {
        return new JAXBElement<ArrayOfPessoaIntegracaoLayout>(_ConsultaPessoaCPFCNPJResponsePessoas_QNAME, ArrayOfPessoaIntegracaoLayout.class, ConsultaPessoaCPFCNPJResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Mensagem", scope = ConsultaPessoaCPFCNPJResponse.class)
    public JAXBElement<String> createConsultaPessoaCPFCNPJResponseMensagem(String value) {
        return new JAXBElement<String>(_ConsultaPessoaCPFCNPJResponseMensagem_QNAME, String.class, ConsultaPessoaCPFCNPJResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CPFCNPJ", scope = ConsultaPessoaCPFCNPJRequest.class)
    public JAXBElement<String> createConsultaPessoaCPFCNPJRequestCPFCNPJ(String value) {
        return new JAXBElement<String>(_ConsultaPessoaCPFCNPJRequestCPFCNPJ_QNAME, String.class, ConsultaPessoaCPFCNPJRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticationTokenId", scope = Request.class)
    public JAXBElement<String> createRequestAuthenticationTokenId(String value) {
        return new JAXBElement<String>(_LogoutRequest1AuthenticationTokenId_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LogoutResult", scope = LogoutResponse.class)
    public JAXBElement<LogoutResponse> createLogoutResponseLogoutResult(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponseLogoutResult_QNAME, LogoutResponse.class, LogoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegraPessoaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IntegrarResult", scope = IntegrarResponse.class)
    public JAXBElement<IntegraPessoaResponse> createIntegrarResponseIntegrarResult(IntegraPessoaResponse value) {
        return new JAXBElement<IntegraPessoaResponse>(_IntegrarResponseIntegrarResult_QNAME, IntegraPessoaResponse.class, IntegrarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Nome", scope = ContatoPessoaLayout.class)
    public JAXBElement<String> createContatoPessoaLayoutNome(String value) {
        return new JAXBElement<String>(_PessoaIntegracaoLayoutNome_QNAME, String.class, ContatoPessoaLayout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = ConsultarIntegracao.class)
    public JAXBElement<ConsultaPessoaRequest> createConsultarIntegracaoRequest(ConsultaPessoaRequest value) {
        return new JAXBElement<ConsultaPessoaRequest>(_LogoutRequest_QNAME, ConsultaPessoaRequest.class, ConsultarIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PessoaIntegracaoLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pessoa", scope = ConsultaPessoaResponse.class)
    public JAXBElement<PessoaIntegracaoLayout> createConsultaPessoaResponsePessoa(PessoaIntegracaoLayout value) {
        return new JAXBElement<PessoaIntegracaoLayout>(_IntegraPessoaRequestPessoa_QNAME, PessoaIntegracaoLayout.class, ConsultaPessoaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Mensagem", scope = ConsultaPessoaResponse.class)
    public JAXBElement<String> createConsultaPessoaResponseMensagem(String value) {
        return new JAXBElement<String>(_ConsultaPessoaCPFCNPJResponseMensagem_QNAME, String.class, ConsultaPessoaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPessoaCPFCNPJRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = Consultar.class)
    public JAXBElement<ConsultaPessoaCPFCNPJRequest> createConsultarRequest(ConsultaPessoaCPFCNPJRequest value) {
        return new JAXBElement<ConsultaPessoaCPFCNPJRequest>(_LogoutRequest_QNAME, ConsultaPessoaCPFCNPJRequest.class, Consultar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Mensagem", scope = IntegraPessoaResponse.class)
    public JAXBElement<String> createIntegraPessoaResponseMensagem(String value) {
        return new JAXBElement<String>(_ConsultaPessoaCPFCNPJResponseMensagem_QNAME, String.class, IntegraPessoaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TokenId", scope = IntegraPessoaResponse.class)
    public JAXBElement<String> createIntegraPessoaResponseTokenId(String value) {
        return new JAXBElement<String>(_IntegraPessoaResponseTokenId_QNAME, String.class, IntegraPessoaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TokenId", scope = ConsultaPessoaRequest.class)
    public JAXBElement<String> createConsultaPessoaRequestTokenId(String value) {
        return new JAXBElement<String>(_IntegraPessoaResponseTokenId_QNAME, String.class, ConsultaPessoaRequest.class, value);
    }

}
