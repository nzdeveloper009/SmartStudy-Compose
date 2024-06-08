package com.syedzada.android.smartstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.syedzada.android.smartstudy.presentation.dashboard.DashboardScreen
import com.syedzada.android.smartstudy.presentation.theme.SmartStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartStudyTheme {
                DashboardScreen()
            }
        }
    }
}