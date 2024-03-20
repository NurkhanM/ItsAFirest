package lap.uno.app.itsinfoforest.info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import lap.uno.app.itsinfoforest.R
import lap.uno.app.itsinfoforest.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arrayOf(
            R.drawable.img1, R.drawable.img2,
            R.drawable.img3, R.drawable.img4, R.drawable.img5
        )
        binding.pager.adapter = ViewPagerAdapter(data)
        binding.pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
//                Toast.makeText(requireContext(), "onPageSelected", Toast.LENGTH_SHORT).show()
            }
        })

        binding.leftPage.setOnClickListener {
            // Листание на предыдущую страницу
            binding.pager.setCurrentItem(binding.pager.currentItem - 1, true)
        }

        binding.rightPage.setOnClickListener {
            // Листание на следующую страницу
            binding.pager.setCurrentItem(binding.pager.currentItem + 1, true)
        }

        binding.backStack.setOnClickListener {
            activity?.onBackPressed()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}