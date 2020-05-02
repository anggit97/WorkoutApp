package com.anggit97.workoutapp.ui.workoutlist

import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.abstraction.activity.BaseActivity
import com.anggit97.data.entity.workout.Workout
import com.anggit97.workoutapp.R
import com.anggit97.workoutapp.databinding.ActivityWorkoutListBinding
import kotlinx.android.synthetic.main.activity_workout_list.*

class WorkoutListActivity : BaseActivity() {

    private lateinit var adapter: WorkoutListAdapter
    private lateinit var binding: ActivityWorkoutListBinding
    private var workoutList = mutableListOf<Workout>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkoutListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

        populateWorkoutData()
    }

    private fun initRecyclerView() {
        adapter = WorkoutListAdapter()
        rvWorkout.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvWorkout.adapter = adapter
        rvWorkout.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
    }

    private fun populateWorkoutData() {
        workoutList.clear()
        workoutList.add(Workout(1, "Sit Up", R.drawable.workout_gif, true, "20 Kali"))
        workoutList.add(Workout(2, "Push Up", R.drawable.workout_gif, true, "50 Kali"))
        workoutList.add(Workout(3, "Running", R.drawable.workout_gif, true, "5 Menit"))
        workoutList.add(Workout(4, "Terbang", R.drawable.workout_gif, true, "Seumur Hidup"))
        adapter.setItems(workoutList)
    }
}
