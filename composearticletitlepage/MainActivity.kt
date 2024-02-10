package com.example.composearticletitlepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticletitlepage.ui.theme.ComposeArticleTitlePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTitlePageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
//                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage()

                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp)) {
        Text(
            text = "Jetpack Compose tutorial",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 25.sp,
            lineHeight = 30.sp,

        )
        Text(
            text = "\nJetpack Compose is a modern toolkit for building native Android UI. Compose " +
                    "simplifies and accelerates UI development on Android with less code, powerful " +
                    "tools, and intuitive Kotlin APIs.",
            fontSize = 14.sp
        )
        Text(
            text = "\nIn this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose " +
                    "compiler does the rest. Compose is built around Composable functions. These " +
                    "functions let you define your app's UI programmatically because they let " +
                    "you describe how it should look and provide data dependencies, rather than " +
                    "focus on the process of the UI's construction, such as initializing an " +
                    "element and then attaching it to a parent. To create a Composable function, " +
                    "you add the @Composable annotation to the function name.",
            fontSize = 14.sp
        )
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally)
    {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.4F
        )
        GreetingText()
    }

}

