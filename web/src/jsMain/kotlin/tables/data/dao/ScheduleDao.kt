/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.data.dao

import com.ppfcbot.common.api.models.tables.WeekAlternation
import com.ppfcbot.common.api.models.tables.ScheduleRequest
import com.ppfcbot.common.api.models.tables.ScheduleResponse

interface ScheduleDao {
    suspend fun saveScheduleItem(scheduleRequest: ScheduleRequest)

    suspend fun saveScheduleItems(scheduleRequests: List<ScheduleRequest>)

    suspend fun updateScheduleItem(scheduleRequest: ScheduleRequest, id: Long)

    suspend fun updateScheduleItems(scheduleRequests: Map<Long, ScheduleRequest>)

    suspend fun deleteScheduleItems(ids: Set<Long>)

    suspend fun deleteAllScheduleItems()

    suspend fun getScheduleItems(
        limit: Long,
        offset: Long,
        dayNumber: Long?,
        weekAlternation: WeekAlternation?,
        groupId: Long?,
        teacherId: Long?
    ): List<ScheduleResponse>
}