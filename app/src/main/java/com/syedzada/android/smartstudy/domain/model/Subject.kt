package com.syedzada.android.smartstudy.domain.model

import androidx.compose.ui.graphics.Color
import com.syedzada.android.smartstudy.presentation.theme.gradient1
import com.syedzada.android.smartstudy.presentation.theme.gradient2
import com.syedzada.android.smartstudy.presentation.theme.gradient3
import com.syedzada.android.smartstudy.presentation.theme.gradient4
import com.syedzada.android.smartstudy.presentation.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>,
    val subjectId:Int
)
{
    companion object {
        val  subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}