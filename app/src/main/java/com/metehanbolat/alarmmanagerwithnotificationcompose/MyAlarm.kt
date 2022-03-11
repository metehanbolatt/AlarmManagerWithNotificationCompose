package com.metehanbolat.alarmmanagerwithnotificationcompose

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat

class MyAlarm: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        try {
            showNotification(context, "Important Alarm", "Important Notification!")
        } catch (e: Exception) {
            Log.d("Receive", "onReceive: ${e.localizedMessage}")
        }
    }

}

private fun showNotification(context: Context, title: String, desc: String) {
    val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    val channelId = "message_channel"
    val channelName = "message_name"

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT)
        manager.createNotificationChannel(channel)
    }

    val builder = NotificationCompat.Builder(context, channelId)
        .setContentTitle(title)
        .setContentText(desc)
        .setSmallIcon(R.drawable.ic_notification_active)

    manager.notify(1, builder.build())
}