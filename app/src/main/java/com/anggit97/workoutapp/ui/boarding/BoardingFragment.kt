package com.anggit97.workoutapp.ui.boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anggit97.abstraction.fragment.BaseFragment
import com.anggit97.abstraction.util.ext.showImage
import com.anggit97.workoutapp.R
import com.anggit97.workoutapp.databinding.FragmentBoardingBinding

class BoardingFragment : BaseFragment() {

    private val boardingImages =
        intArrayOf(R.drawable.boarding1, R.drawable.boarding2, R.drawable.boarding3)
    private val boardingHeaders =
        intArrayOf(R.string.routine_sport, R.string.routine_sport, R.string.routine_sport)
    private val boardingSubHeaders = intArrayOf(
        R.string.routine_sport_subheader,
        R.string.routine_sport_subheader,
        R.string.routine_sport_subheader
    )

    private var _binding: FragmentBoardingBinding? = null
    private val binding get() = _binding!!

    private var positionArgs = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        positionArgs = arguments?.getInt(ARGS_SECTION_NUMBER, 0) ?: 0

        if (positionArgs > 0) positionArgs -= 1
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBoardingBinding.inflate(inflater, container, false)
        val view = binding.root
        view.tag = positionArgs
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivBoarding.showImage(boardingImages[positionArgs])
        binding.tvHeader.text = getString(boardingHeaders[positionArgs])
        binding.tvSubheader.text = getString(boardingSubHeaders[positionArgs])
    }

    companion object {

        const val ARGS_SECTION_NUMBER = "args_section_number"

        fun newInstance(sectionNumber: Int): BoardingFragment {
            val fragment = BoardingFragment()
            val args = Bundle()
            args.putInt(ARGS_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}
