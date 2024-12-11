package com.example.teste2.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teste2.Model.Pessoa;
import com.example.teste2.R;

import java.util.ArrayList;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.PessoaViewHolder> {
    private ArrayList<Pessoa> listaPessoas;

    public PessoaAdapter(ArrayList<Pessoa> listaPessoas){
        this.listaPessoas = listaPessoas;
    }

    @NonNull
    @Override
    public PessoaAdapter.PessoaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlista_activity, parent, false);
        return new PessoaViewHolder(itemView);
    }

    public void onBindViewHolder(@NonNull PessoaViewHolder holder, int position) {
        // Obtemos a pessoa correspondente na posição atual
        Pessoa pessoa = listaPessoas.get(position);

        // Vinculamos os dados da pessoa aos elementos visuais
        holder.nome.setText(pessoa.getNome());
        holder.email.setText(pessoa.getEmail());
        holder.telefone.setText(pessoa.getTelefone());
        holder.cpf.setText(pessoa.getCpf());
        holder.senha.setText(pessoa.getSenha());
    }

    @Override
    public int getItemCount() {
        return listaPessoas.size();
    }

    public ArrayList<Pessoa> getListaPessoas(){
        return listaPessoas;
    }

    public static class PessoaViewHolder extends RecyclerView.ViewHolder{
        EditText nome;
        EditText telefone;
        EditText email;
        EditText cpf;
        EditText senha;

        public PessoaViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.edNome);
            telefone = itemView.findViewById(R.id.edTelefone);
            email = itemView.findViewById(R.id.edEmail);
            cpf = itemView.findViewById(R.id.edCpf);
        }
    }
}
