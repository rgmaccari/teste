package com.example.teste2.Controller;

import android.content.Context;
import android.widget.Toast;

import com.example.teste2.Dao.PessoaDao;
import com.example.teste2.Model.Pessoa;

import java.util.ArrayList;

public class PessoaController {
    private Context context;

    public PessoaController(Context context) {
        this.context = context;
    }

    public void salvarPessoas(ArrayList<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getNome() != null){
                if (pessoa.getId() == 0) {
                    int id = (int) PessoaDao.getInstancia(context).insert(pessoa);
                    pessoa.setId(id);
                }else{
                    PessoaDao.getInstancia(context).update(pessoa);
                    Toast.makeText(context, "Pessoa cadastrada!", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(context, "Preencha os campos em branco!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
