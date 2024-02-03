/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.data.mapper

import com.ppfcbot.common.api.models.tables.WeekAlternation

fun Boolean.toWeekAlternation() = if (this) {
    WeekAlternation.NUMERATOR
} else {
    WeekAlternation.DENOMINATOR
}

val WeekAlternation.isNumerator: Boolean
    get() = when (this) {
        WeekAlternation.BOTH -> true
        WeekAlternation.NUMERATOR -> true
        WeekAlternation.DENOMINATOR -> false
    }