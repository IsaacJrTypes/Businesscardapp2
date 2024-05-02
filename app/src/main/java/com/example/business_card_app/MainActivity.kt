package com.example.business_card_app
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.business_card_app.ui.theme.BusinesscardappTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenContent()
                }
            }
        }
    }
}

// create profile and content areas
@Composable
fun ScreenContent () {
    val context = LocalContext.current
    val displayMetrics = context.resources.displayMetrics
    val screenWidthPx = displayMetrics.widthPixels
    val density = displayMetrics.density
    val screenWidthDp = screenWidthPx / density
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // top row for alignment

        Row(
            modifier = Modifier
                .width(screenWidthDp.dp)
                .height(100.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

        }

        // profile row
        Row(
            modifier = Modifier
                .width(screenWidthDp.dp)
                ,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column (

            ) {
                Row(
                    modifier = Modifier.padding(start = 40.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "Profile image",
                        modifier = Modifier
                            .size(175.dp)
                            .border(4.dp, Color.Black, CircleShape)
                            .background(Color.Black, CircleShape),
                        contentScale = ContentScale.Crop

                    )
                }
                Row(
                    modifier = Modifier.padding( top = 20.dp, bottom = 20.dp)
                ) {
                    Text(text = "Isaac Jimenez", color = Color.Black, fontSize = 40.sp,fontWeight = FontWeight.Bold)
                }
                Row(modifier = Modifier.padding(start= 40.dp)) {
                    Text(text = "Software Developer",color = Color.Black,fontSize = 20.sp,fontWeight = FontWeight.Bold)
                }
            }
        }

        // contact row
        Row(
            modifier = Modifier
                .width(screenWidthDp.dp)
                .height(300.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // content col
           Column() {
               Row() {
                   Icon(
                       imageVector = Icons.Filled.Email,
                       contentDescription = "email",
                       modifier = Modifier.padding(end = 20.dp)
                   )
                   Text("Content 1")
               }
               Row(
                   modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
               ) {
                   Icon(
                       imageVector = Icons.Filled.Phone,
                       contentDescription = "phone",
                       modifier = Modifier.padding(end = 20.dp)
                   )
                   Text("Content 2")
               }
               Row() {
                   Icon(
                       imageVector = Icons.Filled.Share,
                       contentDescription = "Share Icon",
                       modifier = Modifier.padding(end = 20.dp)
                   )
                   Text("Content 2")
               }
           }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardappTheme {
        ScreenContent()

    }
}