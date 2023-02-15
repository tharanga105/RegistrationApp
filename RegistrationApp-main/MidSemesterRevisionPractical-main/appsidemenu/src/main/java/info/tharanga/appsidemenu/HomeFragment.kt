package info.tharanga.appsidemenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import info.tharanga.appsidemenu.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val list = listOf("Items 1", "Item 2", "Item 3")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdapter =
            ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, list)
        binding.listView.adapter = arrayAdapter

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(requireActivity(), list[position], Toast.LENGTH_SHORT).show()
                    }
    }

}