package br.com.fiap.exemplorecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import br.com.fiap.exemplorecyclerview.beans.Contato;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder> {

    private Context context;
    private List<Contato> contatos;

    public ContatoAdapter(Context context,List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @NonNull
    @Override
    public ContatoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(this.context)
                .inflate(R.layout.recyclerview_contato, viewGroup,false);
        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);
        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContatoViewHolder contatoViewHolder, int i) {
        final Contato contato = this.contatos.get(i);

        contatoViewHolder.imgContato.setImageResource(contato.getImagem());
        contatoViewHolder.txtNome.setText("" + contato.getNome());
        contatoViewHolder.txtTelefone.setText(contato.getTelefone());

        contatoViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicou em "+ contato.getNome(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.contatos.size();
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imgContato;
        TextView txtNome;
        TextView txtTelefone;

        public ContatoViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgContato = itemView.findViewById(R.id.imgContato);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtTelefone = itemView.findViewById(R.id.txtTelefone);
        }
    }
}
