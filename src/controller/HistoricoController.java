package controller;

import br.edu.fateczl.pilhastrings.Pilha;

public class HistoricoController {

    public void inserirEndereco(String endereco, Pilha historico) throws Exception {
        if (!endereco.startsWith("https://") || !endereco.matches("https://www\\..+\\..+")) {
            throw new Exception("Endereço inválido!");
        }
        historico.push(endereco);
    }

    public String removerUltimoEndereco(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("O histórico está vazio!");
        }
        return historico.pop();
    }

    public String consultarUltimoEndereco(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("O histórico está vazio!");
        }
        return historico.top();
    }
}
