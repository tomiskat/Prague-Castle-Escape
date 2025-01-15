package escape.game.utils

import com.google.gson.Gson
import escape.game.models.Task

object TaskSerializer {

    private val gson = Gson()

    fun serializeTask(task: Task): String {
        return gson.toJson(task)
    }

    fun deserializeTask(taskJson: String): Task {
        return gson.fromJson(taskJson, Task::class.java)
    }
}