package id.sandyu.museum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import id.sandyu.museum.model.CollectionResponse
import id.sandyu.museum.databinding.ActivityMainBinding
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        CollectionSubscribe()
    }

    private fun CollectionSubscribe(): SingleObserver<CollectionResponse>{
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
