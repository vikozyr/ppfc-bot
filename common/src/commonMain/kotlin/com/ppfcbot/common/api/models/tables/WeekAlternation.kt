/*
 * Copyright (c) 2024. Vitalii Kozyr
 */

package com.ppfcbot.common.api.models.tables

import kotlinx.serialization.Serializable

@Serializable
enum class WeekAlternation(val option: Long) {
    BOTH(0),
    NUMERATOR(1),
    DENOMINATOR(2)
}