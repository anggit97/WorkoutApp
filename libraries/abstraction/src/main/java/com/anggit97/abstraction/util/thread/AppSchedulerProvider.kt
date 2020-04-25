package com.anggit97.abstraction.util.thread

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Created by Anggit Prayogo on 4/25/20.
 */
class AppSchedulerProvider : SchedulerProvider {
    override fun ui(): CoroutineDispatcher {
        return Dispatchers.Main
    }
}