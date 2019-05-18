package br.com.fiap.exemplorecyclerview;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.exemplorecyclerview.beans.Contato;

public class GeraContatos {
    public static List<Contato> getContatos(){
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato ("João", "(11) 1234-5678", "Ocupado", R.drawable.p1));
        contatos.add(new Contato("Pedro", "(11) 8765-4321", "Disponivel", R.drawable.p2));
        contatos.add(new Contato("Valentina", "(21) 3131-4545", "Ausente", R.drawable.p3));
        contatos.add(new Contato("José","(21) 9595-4545", "No trabalho", R.drawable.p4));

        return contatos;
    }
}
