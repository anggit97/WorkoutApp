package com.anggit97.abstraction.util.thread

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by Anggit Prayogo on 4/25/20.
 */
interface SchedulerProvider {
    fun ui(): CoroutineDispatcher
}