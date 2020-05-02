package com.anggit97.workoutapp.ui.workoutlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.abstraction.util.ext.showGifImage
import com.anggit97.data.entity.workout.Workout
import com.anggit97.workoutapp.R
import kotlinx.android.synthetic.main.row_item_workout.view.*

/**
 * Created by Anggit Prayogo on 5/2/20.
 */
class WorkoutListAdapter: RecyclerView.Adapter<WorkoutListAdapter.ViewHolder>() {

    private var workoutList = mutableListOf<Workout>()

    fun setItems(workoutList: MutableList<Workout>){
        this.workoutList = workoutList
        notifyDataSetChanged()
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bindView(workout: Workout) {
            with(itemView){
                tvWorkoutName.text = workout.name
                tvWorkoutCapacity.text = workout.duration
                ivWorkout.showGifImage(workout.image)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_item_workout, parent, false))
    }

    override fun getItemCount(): Int = workoutList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(workoutList[position])
    }
}