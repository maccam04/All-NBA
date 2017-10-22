package com.gmail.jorgegilcavazos.ballislife.util

import com.google.firebase.crash.FirebaseCrash
import javax.inject.Inject

class CrashReporterImpl @Inject constructor() : CrashReporter {
  override fun report(e: Throwable) {
    FirebaseCrash.report(e)
  }
}