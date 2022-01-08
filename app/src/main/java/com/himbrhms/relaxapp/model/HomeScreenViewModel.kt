package com.himbrhms.relaxapp.model

import androidx.lifecycle.ViewModel
import com.himbrhms.relaxapp.util.Logger
import com.himbrhms.relaxapp.util.className
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor() : ViewModel() {

    companion object {
        private val logger = Logger(this::class.className)
    }

    val timeOfDay: TimeOfDay
        get() {
            val hourOfDay: Int = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
            return when (hourOfDay) {
                in 5..11 -> TimeOfDay.MORNING
                in 11..17 -> TimeOfDay.NOON
                in 17..22 -> TimeOfDay.EVENING
                else -> TimeOfDay.NIGHT
            }
        }
}
