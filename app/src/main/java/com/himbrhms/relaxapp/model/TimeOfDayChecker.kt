package com.himbrhms.relaxapp.model

import java.util.*
import kotlin.concurrent.schedule

class TimeOfDayChecker {

    companion object {
        private const val EVERY_MINUTE: Long = 60000
        private const val NO_DELAY: Long = 0
    }

    private val timeOfDayTimer = Timer()


    init {
        timeOfDayTimer.schedule(NO_DELAY, EVERY_MINUTE) {
            val hourOfDay: Int = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
            when (hourOfDay) {
                in 5..11 -> {
                    // good morning
                }
                in 11..18 -> {
                    // hello
                }
                in 18..24
            }
        }
    }
}