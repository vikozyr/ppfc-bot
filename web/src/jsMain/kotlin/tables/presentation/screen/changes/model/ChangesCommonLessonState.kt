/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.presentation.screen.changes.model

import com.ppfcbot.common.api.models.tables.WeekAlternation
import infrastructure.extensions.plusDays
import tables.domain.interactor.calculateWeekAlternation
import tables.domain.model.DayNumber
import tables.presentation.common.mapper.toDayNumber
import kotlin.js.Date

data class ChangesCommonLessonState(
    val dayNumber: DayNumber = Date().plusDays(1).toDayNumber(),
    val date: Date = Date().plusDays(1),
    val weekAlternation: WeekAlternation = Date().plusDays(1).calculateWeekAlternation()
) {
    companion object {
        val Empty = ChangesCommonLessonState()
    }
}
