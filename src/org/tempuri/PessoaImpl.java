package org.tempuri;

import java.util.Random;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.soap.Addressing;

@WebService(
		name="Pessoa",
		portName="BasicHttpBinding_Pessoa",
		serviceName="Pessoa",
		endpointInterface="org.tempuri.Pessoa",
		wsdlLocation="./WEB-INF/Pessoa.wsdl",
		targetNamespace="http://tempuri.org/"
		)
public class PessoaImpl implements Pessoa {

	@Override
	public LoginResponse1 login(LoginRequest request) throws PessoaLoginSecurityServiceFaultFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogoutResponse logout(LogoutRequest1 request) throws PessoaLogoutSecurityServiceFaultFaultFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod
	@RequestWrapper(
			localName = "inserirPessoaJuridicaNacionalResponse", 
			targetNamespace = "http://service.fiesc.com.br/serviceSchema/pessoaCallBack/v3", 
			className = "org.tempuri.IntegraPessoaRequest")
    @Action(input = "http://erp.com.br/corporativo/PessoaService/Pessoa/Integrar")
	@Addressing(enabled = true, required = true)
	public IntegraPessoaResponse integrar(IntegraPessoaRequest request) {
		Random random = new Random();
		Integer numRandom = random.nextInt(10000);
		IntegraPessoaResponse response = new IntegraPessoaResponse();
		try {
			Thread.sleep(new Integer(numRandom).longValue());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(random.nextBoolean()) {
			response.setCodigoRetorno(CodigosRetornoIntegracao.PROCESSAMENTO_OK);
			response.setMensagem(new JAXBElement<String>(new QName("Mensagem"),String.class, "Processado com sucesso"));

		} else {
			response.setCodigoRetorno(CodigosRetornoIntegracao.ERRO_PROCESSAMENTO);
			response.setMensagem(new JAXBElement<String>(new QName("Mensagem"),String.class, "Ocorreu um erro"));

		}
		response.setTokenId(new JAXBElement<String>(new QName("TokenId"),String.class, numRandom.toString()));
		return response;
	}

	@Override
	public ConsultaPessoaResponse consultarIntegracao(ConsultaPessoaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsultaPessoaCPFCNPJResponse consultar(ConsultaPessoaCPFCNPJRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
