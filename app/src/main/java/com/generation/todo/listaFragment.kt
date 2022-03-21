package com.generation.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.todo.adapter.AtividadesAdapter
import com.generation.todo.modelo.Tarefa

class listaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        val listaTarefas = mutableListOf(
            Tarefa("Arrumar a casa","Começar pela manhã para preparar" +
                    "para as visitas", "Brian", "26/03/2022",
                false, "Doméstico"),
            Tarefa("Estudar AndroidStudio","Revisar matéria sobre Android Studio visto na Generation",
            "Brian", "26/03/2022", true, "Estudo"),
            Tarefa("Ajeitar Formatura", "Preparar formatura da turma Mobile 2 da Generation",
            "Brian", "11/04/2022",true,"Outros"),
            Tarefa("Vazio","Vazio","Vazio", "Vazio", false, "Vazio"))

        val recyclerAtividades = view.findViewById<RecyclerView>(R.id.recyclerAtividades)

        val adapter = AtividadesAdapter()

        recyclerAtividades.layoutManager = LinearLayoutManager(context)

        recyclerAtividades.adapter = adapter

        recyclerAtividades.setHasFixedSize(true)

        adapter.setLista(listaTarefas)

        return view
    }

}