package com.example.confirmationtick

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.confirmationtick.ui.theme.ConfirmationTickTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConfirmationTickTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TickMark( name1 = "All tasks completed", name2 = "Nice work!")
                }
            }
        }
    }
}

@Composable
fun TickMark(name1: String, name2: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxSize()
    ) {
        val image = painterResource(id = R.drawable.tick)
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier.align(CenterHorizontally)
        )
        Text(text = name1,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                .align(CenterHorizontally)
        )

        Text(text = name2,
            fontSize = 16.sp,
            modifier = Modifier.align(CenterHorizontally))
    }
}

@Preview(showBackground = true)
@Composable
fun TickPreview() {
    ConfirmationTickTheme {
        TickMark( name1 = "All tasks completed", name2 = "Nice work!")
    }
}