package lap.uno.app.itsinfoforest.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import lap.uno.app.itsinfoforest.R
import lap.uno.app.itsinfoforest.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextInfo.setOnClickListener {
            findNavController().navigate(R.id.action_MenuFragment_to_infoFragment)
        }

        binding.nextFact.setOnClickListener {
            findNavController().navigate(R.id.action_MenuFragment_to_factFragment)
        }

        binding.nextAbout.setOnClickListener {
            findNavController().navigate(R.id.action_MenuFragment_to_aboutFragment)
        }

        binding.nextSettings.setOnClickListener {
            findNavController().navigate(R.id.action_MenuFragment_to_settingsFragment)
        }

        binding.nextExit.setOnClickListener {
            activity?.onBackPressed()
        }


//        // Устанавливаем цвет статус-бара
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            activity?.window?.statusBarColor = ContextCompat.getColor(requireActivity(), R.color.red)
//        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}