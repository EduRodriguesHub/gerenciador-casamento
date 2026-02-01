package gerenciadorCasamento.domain;

import java.util.ArrayList;

public class ListaConvidados {
    private ArrayList<String> listaconvidados = new ArrayList<>();


    public void add(String nome){

        listaconvidados.add(nome);
    }

    public void remove(String nome) {
        listaconvidados.remove(nome);

    }

    public ArrayList<String> getLista(){

        ArrayList<String> listaconvidadosCopia = new ArrayList<>(listaconvidados);
        return listaconvidadosCopia;
    }

    public void set(int convidadoRemovido, String novoConvidado) {
        listaconvidados.set(convidadoRemovido, novoConvidado);
    }
}
