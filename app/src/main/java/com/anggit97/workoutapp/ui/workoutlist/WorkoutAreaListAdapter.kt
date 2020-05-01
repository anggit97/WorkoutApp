package com.anggit97.workoutapp.ui.workoutlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.data.entity.workoutarea.WorkoutArea
import com.anggit97.workoutapp.R

/**
 * Created by Anggit Prayogo on 5/1/20.
 */
class WorkoutAreaListAdapter: RecyclerView.Adapter<WorkoutAreaViewHolder>() {

    private var workoutAreaList = mutableListOf<WorkoutArea>()

    fun setItems(workoutAreaList: MutableList<WorkoutArea>){
        this.workoutAreaList = workoutAreaList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WorkoutAreaViewHolder {
        return WorkoutAreaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_item_workout_area, parent, false))
    }

    override fun getItemCount(): Int = workoutAreaList.size

    override fun onBindViewHolder(holderWorkoutArea: WorkoutAreaViewHolder, position: Int) {
        holderWorkoutArea.bindView(workoutAreaList[position])
    }
}