/*
 * Copyright (c) 2023. Vitalii Kozyr
 */

package com.ppfcbot.server.tables.data.dbsqldelight.utils

import com.ppfcbot.common.api.models.tables.WeekAlternation

fun Boolean.toSqlBoolean() = if (this) 1L else 0L

fun Long.toBoolean() = this == 1L

fun WeekAlternation.toSqlInteger() = this.option

fun Long.toAlternation() = WeekAlternation.entries
    .find { it.option == this } ?: WeekAlternation.BOTH