package com.anggit97.workoutapp.ui.report


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.anggit97.abstraction.fragment.BaseFragment
import com.anggit97.data.entity.workout.Workout
import com.anggit97.workoutapp.R
import com.anggit97.workoutapp.databinding.FragmentReportBinding
import com.anggit97.workoutapp.ui.workoutlist.WorkoutListAdapter
import kotlinx.android.synthetic.main.fragment_report.*


class ReportFragment : BaseFragment() {
    private lateinit var adapter: WorkoutListAdapter
    private var workoutList: MutableList<Workout> = mutableListOf()
    
    private var _binding: FragmentReportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerview()
        populateWorkoutAreaData()
    }

    private fun populateWorkoutAreaData() {
        workoutList.clear()
        workoutList.add(Workout(1, "Loncat Bintang", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(2, "Crunch Perut", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(3, "Puntir Rusia", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(4, "Pendaki Gunung", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(5, "Sentuh Tumit", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(6, "Angkat Kaki", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(7, "Peregangan Kobra", R.drawable.boarding1, true, "20"))
        workoutList.add(Workout(8, "Plank", R.drawable.boarding1, true, "20"))
        adapter.setItems(workoutList)
    }

    private fun initRecyclerview() {
        adapter = WorkoutListAdapter()
        rvWorkoutDone.layoutManager =
            LinearLayoutManager(requireActivity())
        rvWorkoutDone.isNestedScrollingEnabled = false
        rvWorkoutDone.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}