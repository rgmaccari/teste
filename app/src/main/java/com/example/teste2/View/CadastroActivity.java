package com.example.teste2.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.teste2.Adapter.PessoaAdapter;
import com.example.teste2.Controller.PessoaController;
import com.example.teste2.Model.Pessoa;
import com.example.teste2.R;

import java.util.ArrayList;

public class CadastroActivity extends AppCompatActivity {

    private EditText edNome;
    private EditText edTelefone;
    private EditText edEmail;
    private EditText edCpf;
    private EditText edSenha;

    private Button btnSalvar;
    private PessoaAdapter adapter;
    private PessoaController controller;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cadastro_activity);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PessoaAdapter(new ArrayList<>());
        recyclerView.setAdapter(adapter);

        edNome = findViewById(R.id.edNome);
        edTelefone = findViewById(R.id.edTelefone);
        edEmail = findViewById(R.id.edEmail);
        edCpf = findViewById(R.id.edCpf);
        edSenha = findViewById(R.id.edSenha);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(view -> {
            String nome = edNome.getText().toString();
            String telefone = edTelefone.getText().toString();
            String email = edEmail.getText().toString();
            String cpf = edCpf.getText().toString();
            String senha = edSenha.getText().toString();

            if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty() || cpf.isEmpty() || senha.isEmpty()) {
                if (nome.isEmpty()) edNome.setError("Preencha o campo nome.");
                if (telefone.isEmpty()) edTelefone.setError("Preencha o campo telefone");
                if (email.isEmpty()) edEmail.setError("Preencha o campo email");
                if (cpf.isEmpty()) edCpf.setError("Preencha o campo CPF");
                if (senha.isEmpty()) edSenha.setError("Preencha o campo senha");
            } else {
                Pessoa pessoa = new Pessoa(0, nome, telefone, email, cpf, senha);
                adapter.getListaPessoas().add(pessoa);
                controller.salvarPessoas(adapter.getListaPessoas());
                adapter.notifyDataSetChanged();
            }
        });
    }
}