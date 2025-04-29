package com.loc.newsapp.presentation.common

import android.widget.Button
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.newsapp.ui.theme.NewsAppTheme
import com.loc.newsapp.ui.theme.WhiteGray

@Composable
fun NewsButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White),
        shape = RoundedCornerShape(6.dp)
        ) {
        Text(
            text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold))
    }
}

@Composable
fun NewsTextButton(
    text: String,
    onClick: () -> Unit) {
    TextButton(onClick = onClick) {
        Text(
            text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = WhiteGray)
    }
}

@Preview
@Composable
private fun NewsButton() {
    NewsAppTheme {
        NewsButton(text = "Next", {})
    }
}

@Preview
@Composable
private fun NewsTextButton() {
    NewsAppTheme {
        NewsTextButton(text = "Next", {})
    }
}