package info.tharanga.app2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import info.tharanga.app2.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener {

            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()

            when {
                name.isBlank() -> Toast.makeText(
                    activity,
                    getString(R.string.invalidname),
                    Toast.LENGTH_SHORT
                ).show()
                email.isBlank() -> Toast.makeText(
                    activity,
                    getString(R.string.invalidemail),
                    Toast.LENGTH_SHORT
                ).show()
                else -> {

                    navigateToSecondFragment(view, name, email);
                }
            }


        }

    }

    private fun navigateToSecondFragment(view: View, name: String, email: String) {
        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(name, email)
        view.findNavController().navigate(action)
    }

}