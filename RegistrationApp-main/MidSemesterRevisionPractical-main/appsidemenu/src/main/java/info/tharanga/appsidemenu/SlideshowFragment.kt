package info.tharanga.appsidemenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import info.tharanga.appsidemenu.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var binding: FragmentSlideshowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_slideshow,container, false)

        return binding.root
    }

}