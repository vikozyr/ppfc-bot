/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package tables.presentation.common.mapper

import com.ppfcbot.common.api.models.tables.WeekAlternation
import coreui.theme.AppTheme
import tables.presentation.common.model.WeekAlternationOption

fun WeekAlternationOption.toTextRepresentation() = when(this) {
    WeekAlternationOption.ALL -> AppTheme.stringResources.weekAlternationAll
    WeekAlternationOption.BOTH -> AppTheme.stringResources.weekAlternationBoth
    WeekAlternationOption.NUMERATOR -> AppTheme.stringResources.weekAlternationNumerator
    WeekAlternationOption.DENOMINATOR -> AppTheme.stringResources.weekAlternationDenominator
}

fun WeekAlternation.toTextRepresentation() = when(this) {
    WeekAlternation.BOTH -> AppTheme.stringResources.weekAlternationBoth
    WeekAlternation.NUMERATOR -> AppTheme.stringResources.weekAlternationNumerator
    WeekAlternation.DENOMINATOR -> AppTheme.stringResources.weekAlternationDenominator
}

fun WeekAlternationOption.toDomain(): WeekAlternation? = when(this) {
    WeekAlternationOption.ALL -> null
    WeekAlternationOption.BOTH -> WeekAlternation.BOTH
    WeekAlternationOption.NUMERATOR -> WeekAlternation.NUMERATOR
    WeekAlternationOption.DENOMINATOR -> WeekAlternation.DENOMINATOR
}