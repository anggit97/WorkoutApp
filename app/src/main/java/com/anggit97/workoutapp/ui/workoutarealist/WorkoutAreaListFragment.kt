package com.anggit97.workoutapp.ui.workoutarealist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.anggit97.abstraction.fragment.BaseFragment
import com.anggit97.data.entity.workoutarea.WorkoutArea
import com.anggit97.workoutapp.R
import com.anggit97.workoutapp.databinding.FragmentWorkoutAreaListBinding
import kotlinx.android.synthetic.main.fragment_workout_area_list.*

/**
 * A simple [Fragment] subclass.
 */
class WorkoutAreaListFragment : BaseFragment() {

    private var _binding: FragmentWorkoutAreaListBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: WorkoutAreaListAdapter
    private var workoutAreaList: MutableList<WorkoutArea> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkoutAreaListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerview()
        populateWorkoutAreaData()
    }

    private fun populateWorkoutAreaData() {
        workoutAreaList.clear()
        workoutAreaList.add(WorkoutArea(1, "Arms", R.drawable.boarding1))
        workoutAreaList.add(WorkoutArea(2, "Abs", R.drawable.boarding2))
        workoutAreaList.add(WorkoutArea(3, "Arms", R.drawable.boarding3))
        workoutAreaList.add(WorkoutArea(4, "Arms", R.drawable.boarding1))
        workoutAreaList.add(WorkoutArea(5, "Arms", R.drawable.boarding1))
        workoutAreaList.add(WorkoutArea(6, "Arms", R.drawable.boarding1))
        workoutAreaList.add(WorkoutArea(7, "Arms", R.drawable.boarding1))
        workoutAreaList.add(WorkoutArea(8, "Arms", R.drawable.boarding1))
        adapter.setItems(workoutAreaList)
    }

    private fun initRecyclerview() {
        adapter = WorkoutAreaListAdapter()
        rvWorkoutArea.layoutManager =
            GridLayoutManager(requireActivity(), 2)
        rvWorkoutArea.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
