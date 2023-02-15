package info.tharanga.midexamtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import info.tharanga.midexamtest.databinding.ActivityMainBinding
import info.tharanga.midexamtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)

        dataBinding.name = intent.getStringExtra(getString(R.string.name))!!
        dataBinding.email = intent.getStringExtra(getString(R.string.email))!!

//        dataBinding.tvResult.text = "Hi $name,\n Your email: $email is registered successfully"
    }
}