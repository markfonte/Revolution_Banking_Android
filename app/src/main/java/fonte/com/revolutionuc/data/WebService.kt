package fonte.com.revolutionuc.data

class WebService {


    companion object {
        private val LOG_TAG: String = WebService::class.java.name

        @Volatile
        private var instance: WebService? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: WebService().also { instance = it }
        }
    }
}