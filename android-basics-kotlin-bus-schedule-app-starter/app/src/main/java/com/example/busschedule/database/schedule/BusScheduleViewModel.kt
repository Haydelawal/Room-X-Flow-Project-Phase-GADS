package com.example.busschedule.database.schedule

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow


class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}