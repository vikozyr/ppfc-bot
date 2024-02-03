/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package com.ppfcbot.server.tables.api.util

import com.ppfcbot.common.api.models.tables.WeekAlternation

fun String.toIdsList(): List<Long>? {
    if (!Regex("^[0-9,]+$").matches(this)) {
        return null
    }

    return this.split(',').map {
        it.toLongOrNull() ?: run {
            return null
        }
    }
}

fun String.toAlternation() = runCatching {
    WeekAlternation.valueOf(this)
}.getOrNull()