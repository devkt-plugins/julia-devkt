package org.ice1000.julia.devkt.lang

import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange
import java.io.InputStream
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.stream.Collectors

inline fun forceRun(lambda: () -> Unit) {
	try {
		lambda()
	} catch (e: Throwable) {
	}
}

fun TextRange.narrow(fromStart: Int, toEnd: Int) = TextRange(startOffset + fromStart, endOffset - toEnd)

fun String.trimQuotePair() = trim('\'', '"', '`')

/**
 * its effect needs to profit.
 * it is stupid to map each char and compare indices whether in ListSet
 * @param someStr String
 */
fun String.indicesOf(someStr: String) = indices
	.map { indexOf(someStr, it) }
	.filter { it > -1 }

fun String.splitsOf(someStr: String, expandSize: Int) = indices
	.filter { substring(it).startsWith(someStr) }
	.map { substring(it, it + expandSize) }

fun Boolean.toYesNo() = if (this) "yes" else "no"
fun Boolean?.orFalse() = true == this
