package com.iliasen.lab1n

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.material3.TopAppBar

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.magnifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun main() = AppCompatActivity()

class MainActivity : ComponentActivity() {
    val aboutMeStrings = listOf(
        "Почему всё так сложно", "Почему нас тут заставляют искать информацию ???", "ЭТО мы делали месяц ("
    )

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Мое приложение", /*modifier = Modifier.fillMaxSize().background(
                            Color.Black),
                            color = Color.White
*/                        )},

                    )
                },
                content = { innerPadding ->
                    Box(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        AboutScreen(aboutMeStrings = aboutMeStrings)

                    }
                }
            )

        }
    }
}


@Composable
fun AboutScreen(aboutMeStrings: List<String>){
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.onBackground) {
        Column(modifier = Modifier
            .padding(10.dp, 20.dp)
            .wrapContentHeight(Alignment.Top)) {
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
                Icon(imageVector = Icons.Filled.Person, contentDescription = null, modifier = Modifier.size(80.dp), Color.White)
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "iliasen",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(16.dp))
            }
            Row(Modifier.padding(0.dp, 16.dp)) {
                Text(text = "Facts about me:",
                    textAlign = TextAlign.Center,
                    color = Color.Green
                )
            }
            for (string in aboutMeStrings) {
                Row{
                    Text(text = string + "\n", fontSize = 18.sp, color = Color.LightGray)
                    Spacer(Modifier.height(8.dp))
                }
            }

            Row(modifier = Modifier.padding(0.dp, 8.dp)) {
                Text(
                    text = "Version 1.0.0",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }

        }

    }
}



