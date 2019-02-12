package id.sandyu.museum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.sandyu.museum.data.response.CollectionResponse
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import org.reactivestreams.Subscriber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun CollectionSubscribe(): SingleObserver<CollectionResponse>{
        val mSubscriber = object : SingleObserver<CollectionResponse> {

            override fun onSubscribe(d: Disposable) {

            }

            override fun onSuccess(t: CollectionResponse) {

            }

            override fun onError(e: Throwable) {

            }

        }

        return mSubscriber
    }


}
