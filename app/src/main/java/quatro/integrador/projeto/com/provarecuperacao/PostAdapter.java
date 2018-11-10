package quatro.integrador.projeto.com.provarecuperacao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    Context contexto;
    List<Aluno> lista;

    public PostAdapter(Context contexto, List<Aluno> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(contexto).inflate(R.layout.aluno, null);
        Aluno aluno = lista.get(position);

        TextView nome = (TextView) linha.findViewById(R.id.nome);
        TextView nota = (TextView) linha.findViewById(R.id.nota);
        ImageView foto = (ImageView) linha.findViewById(R.id.foto);

        nome.setText(aluno.getNome());
        nota.setText(aluno.getNota() + "");

        if(aluno.getNota() < 6){
            foto.setImageResource(R.drawable.vermelha);
        }
        else {
            foto.setImageResource(R.drawable.azul);
        }

        return linha;
    }
}

