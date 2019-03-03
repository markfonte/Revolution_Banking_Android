package fonte.com.revolutionuc.data

class MainRepository {

    private var webService: WebService = WebService.getInstance()

    companion object {

        @Volatile
        private var instance: MainRepository? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: MainRepository().also { instance = it }
        }
    }
}