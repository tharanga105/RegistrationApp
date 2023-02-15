package info.tharanga.midexamtest

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import info.tharanga.midexamtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG: String = "Practical"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var dataBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

       dataBinding.btnRegister.setOnClickListener {

            val name = dataBinding.etName.text.toString()
            val email = dataBinding.etEmail.text.toString()

            when {
                name.isBlank() ->
                    Toast.makeText(this, "Name Empty", Toast.LENGTH_SHORT).show()
                email.isBlank() ->
                    Toast.makeText(baseContext, "Email Empty", Toast.LENGTH_SHORT).show()
                else -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra(getString(R.string.name), name)
                    intent.putExtra(getString(R.string.email), email)
                    startActivity(intent)
                }
            }

        }
    }
}