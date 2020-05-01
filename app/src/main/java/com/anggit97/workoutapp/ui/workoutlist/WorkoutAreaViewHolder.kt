package com.anggit97.workoutapp.ui.workoutlist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.abstraction.util.ext.showImage
import com.anggit97.data.entity.workoutarea.WorkoutArea
import kotlinx.android.synthetic.main.row_item_workout_area.view.*

/**
 * Created by Anggit Prayogo on 5/1/20.
 */
class WorkoutAreaViewHolder (view: View): RecyclerView.ViewHolder(view){
    fun bindView(workoutArea: WorkoutArea) {
        with(itemView){
            tvWorkoutArea.text = workoutArea.name
            ivWorkoutArea.showImage(workoutArea.imageUrl)
        }
    }
}