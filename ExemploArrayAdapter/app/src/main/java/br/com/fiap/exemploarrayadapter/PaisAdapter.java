package br.com.fiap.exemploarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PaisAdapter extends BaseAdapter {

    Context context;
    String[] paises;

    public PaisAdapter(Context context, String[] paises) {
        this.context = context;
        this.paises = paises;
    }

    //Retornar o tamanho do array
    @Override
    public int getCount() {
        return paises.length;
    }

    //Retornar a posição do item
    @Override
    public Object getItem(int position) {
        return paises[position];
    }

    //Retornar o ID do item
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //Ler o XML e transformar em objeto
        //Com os objetos podemos mapear os paises e retornar a view
        //Cada item do spiner vai usar a mesma view e a mesma posição

        //Instanciar o layout inflater e passando o context do construtor
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        /*todo componente gráfico herda diretamente de view */
        View v = layoutInflater.inflate(R.layout.adapter_pais,null);

        //Mapear os objetos
        TextView txtNomePais = v.findViewById(R.id.txtNomePais);
        txtNomePais.setText(paises[position]);

        return v;
    }
}
