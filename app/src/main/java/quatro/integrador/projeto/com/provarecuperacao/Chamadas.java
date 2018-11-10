package quatro.integrador.projeto.com.provarecuperacao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Chamadas {

        @GET("/lista_de_alunos")
        Call<List<Aluno>> obterLista();

}
