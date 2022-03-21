package com.generation.todo.modelo

data class Tarefa(
    var titulo: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var andamento: Boolean,
    var categoria: String) {
}