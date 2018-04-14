package org.ice1000.julia.devkt.lang

import org.intellij.lang.annotations.Language
import org.jetbrains.annotations.NonNls

@NonNls const val JULIA_CONTEXT_ID = "JULIA_CONTEXT"
@NonNls const val JULIA_LANGUAGE_NAME = "Julia"
@NonNls const val JULIA_EXTENSION = "jl"
@NonNls const val JULIA_DOC_SURROUNDING = "\"\"\""
@NonNls const val JULIA_BLOCK_COMMENT_BEGIN = "#="
@NonNls const val JULIA_BLOCK_COMMENT_END = "=#"
@NonNls const val JULIA_STRING_DOLLAR = '\$'
@NonNls const val JULIA_MODULE_ID = "JULIA_MODULE_TYPE"
@NonNls const val JULIA_RUN_CONFIG_ID = "JULIA_RUN_CONFIG_ID"
@NonNls const val JULIA_PLUGIN_ID = "org.ice1000.julia"
@NonNls @Language("RegExp") const val JULIA_CHAR_SINGLE_UNICODE_X_REGEX = "\\\\x([A-Fa-f0-9]){2}"
@NonNls @Language("RegExp") const val JULIA_CHAR_NOT_UX_REGEX = "\\\\([^uxUX])"
@NonNls @Language("RegExp") const val JULIA_CHAR_SINGLE_UNICODE_U_REGEX = "\\\\u([A-Fa-f0-9]){4}"
@NonNls @Language("RegExp") const val JULIA_CHAR_TRIPLE_UNICODE_X_REGEX = "(\\\\x([A-Fa-f0-9]){2}){3}"
@NonNls @Language("RegExp") const val JULIA_STACK_FRAME_LOCATION_REGEX = "at ([^:])+:\\d+"
@NonNls @Language("RegExp") const val JULIA_ERROR_FILE_LOCATION_REGEX = "[^ ,]+,"

@NonNls @Language("HTML") const val UNKNOWN_VALUE_PLACEHOLDER = "<unknown>"

@NonNls const val DOCFMT_EXTENSION = "julia-config"
@NonNls const val DOCFMT_LANGUAGE_NAME = "DocumentFormat"
