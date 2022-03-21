package com.generation.todo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListAdapter
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.todo.R
import com.generation.todo.modelo.Tarefa

class AtividadesAdapter: RecyclerView.Adapter<AtividadesAdapter.TarefaViewHolder>() {

    private var listAtividades = emptyList<Tarefa>()

    class TarefaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val textTitulo = view.findViewById<TextView>(R.id.textTitulo)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchAndamento = view.findViewById<Switch>(R.id.buttonAndamento)
        val textCategoria = view.findViewById<TextView>(R.id.textCategoria)
        val buttonApagar = view.findViewById<Button>(R.id.buttonApagar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)

        return TarefaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val atividades = listAtividades[position]

        holder.textTitulo.text = atividades.titulo
        holder.textDescricao.text = atividades.descricao
        holder.textResponsavel.text = atividades.responsavel
        holder.textData.text = atividades.data
        holder.switchAndamento.isChecked = atividades.andamento
        holder.textCategoria.text = atividades.categoria

    }

    override fun getItemCount(): Int {
        return listAtividades.size
    }

    fun setLista(lista: List<Tarefa>){
        listAtividades = lista
        notifyDataSetChanged()
    }
}