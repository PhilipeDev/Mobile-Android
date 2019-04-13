package br.com.fiap.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContatoAdapter extends BaseAdapter{

    private Context context;
    private Contato[] contatos;


    public ContatoAdapter() {
    }

    public ContatoAdapter(Context context, Contato[] contatos){
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.length;
    }

    @Override
    public Object getItem(int position) {
        return this.contatos[position];
    }

    @Override
    public long getItemId(int position) {
        //O id do item pode ser a própria posição, gerando unicidade.
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //Ler o XML e transformar em objeto
        //Com os objetos podemos mapear os paises e retornar a view
        //Cada item do spiner vai usar a mesma view e a mesma posição

        //Instanciar o layout inflater e passando o context do construtor
        LayoutInflater inflater =  LayoutInflater.from(this.context);

        /*to do componente gráfico herda diretamente de view */
        View v = inflater.inflate(R.layout.listview_contato,null);

        //Mapear os objetos
        TextView txtNome = v.findViewById(R.id.txtNome);
        TextView txtTelefone = v.findViewById(R.id.txtTelefone);
        ImageView imgContato = v.findViewById(R.id.imgContato);

        Contato contato = this.contatos[position];

        txtNome.setText(contato.getNome());
        txtTelefone.setText(contato.getTelefone());
        imgContato.setImageResource(contato.getImg());

        return v;
    }
}
