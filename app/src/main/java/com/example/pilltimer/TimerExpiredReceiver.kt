package com.example.pilltimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.pilltimer.util.PrefUtil
import com.example.pilltimer.util.NotificationUtil


class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

    }
}
