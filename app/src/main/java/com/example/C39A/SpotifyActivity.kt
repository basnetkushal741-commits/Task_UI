package com.example.C39A

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SpotifyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyBody()
        }
    }
}

@Composable
fun SpotifyBody(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        CompositionLocalProvider(LocalContentColor provides Color.White){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column(
                    modifier = Modifier,
                ) {
                    Text("Recently Played", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 26.sp
                    ))
                }
                Row( ) {
                    Column(
                        modifier = Modifier.padding(8.dp, 0.dp)
                    ) {
                        Icon(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(com.example.C39A.R.drawable.baseline_notifications_none_24),
                            contentDescription = "notification"
                        )
                    }
                    Column(
                        modifier = Modifier.padding(8.dp, 0.dp)
                    ) {
                        Icon(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(com.example.C39A.R.drawable.baseline_history_24),
                            contentDescription = "history"
                        )
                    }
                    Column(
                        modifier = Modifier.padding(0.dp, 0.dp)
                    ) {
                        Icon(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(com.example.C39A.R.drawable.baseline_settings_24),
                            contentDescription = "history"
                        )
                    }
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 0.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.cobweb),
                        contentDescription = "cobweb",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .height(120.dp)
                            .width(120.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Cobweb")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.yorushika),
                        contentDescription = "yorushika",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .height(120.dp)
                            .width(120.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Yorushika")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.blink182),
                        contentDescription = "blink 182",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .height(120.dp)
                            .width(120.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text("Blink182")
                }
            }
        Row(
            modifier = Modifier.fillMaxWidth()
            .padding(10.dp, 20.dp)
        ) {
            Column() {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.spotify2025wrap),
                    contentDescription = "blink 182",
                    modifier = Modifier
                        .height(100.dp)
                        .width(120.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier.padding(18.dp)
            ) {
                Text("#SPOTIFYWRAPP", style = TextStyle(
                    color = Color.LightGray
                ))
                Text("Your 2025 in review", style = TextStyle(
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                ))
            }
        }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp, 5.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.topsong),
                        contentDescription = "top song",
                        modifier = Modifier
                            .height(180.dp)
                            .width(170.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Your top song 2025", style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ))
                    }

                }
                Column(
                    modifier = Modifier
                        .padding( 5.dp, 0.dp)
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.artisttowatch),
                        contentDescription = "artist to watch",
                        modifier = Modifier
                            .height(180.dp)
                            .width(185.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Artist to watch", style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ))
                    }
                }
            }
        Row(
            modifier = Modifier
                .padding( 10.dp, 5.dp)
        ) {
            Text("Artist to watch", style = TextStyle(
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            ))
        }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp, 5.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.oliviarodrigo),
                        contentDescription = "top song",
                        modifier = Modifier
                            .height(180.dp)
                            .width(170.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Olivia Rodrigo", style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ))
                    }

                }
                Column(
                    modifier = Modifier
                        .padding( 5.dp, 0.dp)
                ) {
                    Image(
                        painter = painterResource(com.example.C39A.R.drawable.axix),
                        contentDescription = "artist to watch",
                        modifier = Modifier
                            .height(180.dp)
                            .width(185.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Axix", style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ))
                    }
                }
            }

        }

    }
}

@Preview
@Composable
fun SpotifyPreview() {
    SpotifyBody()
}