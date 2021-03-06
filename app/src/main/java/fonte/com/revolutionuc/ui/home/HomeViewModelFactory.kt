package fonte.com.revolutionuc.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fonte.com.revolutionuc.data.MainRepository

class HomeViewModelFactory(private val repository: MainRepository) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(repository) as T
    }
}