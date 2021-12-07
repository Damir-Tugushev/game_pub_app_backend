package io.github.damir_tugushev.game_pub_app.backend

import java.util.Optional

/**
 * Convert [Optional] to Kotlin nullable type of [T].
 */
fun <T> Optional<T>.orNull(): T? = orElse(null)
