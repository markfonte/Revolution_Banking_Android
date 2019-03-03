package fonte.com.revolutionuc.util

import fonte.com.revolutionuc.data.MainRepository

object InjectorUtils {

    private fun getMainRepositorySingleton(): MainRepository {
        return MainRepository.getInstance()
    }
}