package prague.castle.escape.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.location.FusedLocationProviderClient
import prague.castle.escape.repositories.GameRepository
import prague.castle.escape.repositories.TaskRepository

class GameViewModelFactory(
    private val taskRepository: TaskRepository,
    private val gameRepository: GameRepository,
    private val fusedLocationClient: FusedLocationProviderClient
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return GameViewModel(taskRepository, gameRepository, fusedLocationClient) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
