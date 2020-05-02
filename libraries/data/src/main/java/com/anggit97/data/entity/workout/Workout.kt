package com.anggit97.data.entity.workout

/**
 * Created by Anggit Prayogo on 5/2/20.
 */
data class Workout(
    var id: Int,
    var name: String,
    var image: Int,
    var completed: Boolean,
    var duration: String
)