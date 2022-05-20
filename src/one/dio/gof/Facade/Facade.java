package one.dio.gof.Facade;


import one.dio.gof.SubsistemaCRM.CRMService;
import one.dio.gof.SubsistemaCep.CepApi;

public class Facade {
    public void migrarClientes(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }


    public void migrarCliente(String cinthia, String s) {
    }
}
