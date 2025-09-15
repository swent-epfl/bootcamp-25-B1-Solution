package com.github.se.bootcamp.model.todo

import com.google.firebase.firestore.FirebaseFirestore

const val TODOS_COLLECTION_PATH = "todos"

class ToDosRepositoryFirestore(private val db: FirebaseFirestore) : ToDosRepository {
  override fun getNewUid(): String {
    TODO("Not yet implemented")
  }

  override suspend fun getAllTodos(): List<ToDo> {
    TODO("Not yet implemented")
  }

  override suspend fun getTodo(todoID: String): ToDo {
    TODO("Not yet implemented")
  }

  override suspend fun addTodo(toDo: ToDo) {
    TODO("Not yet implemented")
  }

  override suspend fun editTodo(todoID: String, newValue: ToDo) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteTodo(todoID: String) {
    TODO("Not yet implemented")
  }
}
