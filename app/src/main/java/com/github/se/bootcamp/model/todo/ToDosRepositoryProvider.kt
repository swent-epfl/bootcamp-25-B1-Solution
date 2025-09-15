package com.github.se.bootcamp.model.todo

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

/**
 * Provides a single instance of the repository in the app. `repository` is mutable for testing
 * purposes.
 */
object ToDosRepositoryProvider {
  private val _repositoryB1: ToDosRepository = ToDosRepositoryLocal()
  private val _repository: ToDosRepository by lazy { ToDosRepositoryFirestore(Firebase.firestore) }

  // You will need to replace with `_repository` when you implement B2.
  var repository: ToDosRepository = _repositoryB1
}
