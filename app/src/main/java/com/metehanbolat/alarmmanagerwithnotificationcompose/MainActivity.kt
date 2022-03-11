package com.metehanbolat.alarmmanagerwithnotificationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.alarmmanagerwithnotificationcompose.ui.theme.AlarmManagerWithNotificationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlarmManagerWithNotificationComposeTheme {

            }
        }
    }
}
