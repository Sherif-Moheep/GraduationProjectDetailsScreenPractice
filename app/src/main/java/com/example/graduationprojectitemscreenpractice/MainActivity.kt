package com.example.graduationprojectitemscreenpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationprojectitemscreenpractice.ui.theme.GraduationProjectItemScreenPracticeTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ButtonDefaults

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationProjectItemScreenPracticeTheme {
                DetailsScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App top bar
        TopAppBar(
            title = {
                Text(
                    text = "Details",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            },
            navigationIcon = {
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = ""
                    )
                }
            },
            actions = {
                IconButton(onClick = { }) {}
            }
        )

        // language image
        Image(
            painter = painterResource(id = R.drawable.google_logo),
            contentDescription = "",
            modifier = Modifier
                .padding(10.dp)
                .size(200.dp)
        )

        // language text
        Text(
            text = "Language",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(10.dp)
        )

        //
        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {

            // stars row
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "1525",
                    modifier = Modifier.padding(horizontal = 5.dp),
                    fontSize = 20.sp
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "",
                    tint = Color.Yellow
                )
            }

            // language row
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Python",
                    modifier = Modifier.padding(horizontal = 5.dp),
                    fontSize = 20.sp
                )
                Icon(
                    imageVector = Icons.Filled.Circle,
                    contentDescription = "",
                    tint = Color.Blue
                )
            }

            // forks row
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "347",
                    modifier = Modifier.padding(horizontal = 5.dp),
                    fontSize = 20.sp
                )
                Icon(
                    painter = painterResource(R.drawable.fork_logo),
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
            }
        }

        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team.",
            modifier = Modifier.padding(10.dp),
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(30.dp)
        ) {
            Text(
                text = "Show Issues",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 5.dp)
            )
        }
    }
}