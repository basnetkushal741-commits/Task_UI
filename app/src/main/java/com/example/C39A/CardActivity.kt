package com.example.C39A

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChipDefaults.shape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.C39A.ui.theme.MyApplicationTheme
import com.example.C39A.ui.theme.dargreen

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           CardBody()
        }
    }
}

@Composable
fun CardBody() {
    Column(
        modifier = Modifier.background(color = dargreen)
            .fillMaxSize()
            .padding(12.dp, 14.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 8.dp, 0.dp, 0.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column() {
                Text("CARD", style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ))
                Text("Simple and easy way to use app",style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White
                ))
            }
            Column() {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.boss),
                    contentDescription = "Family",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
// first row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                    shape = RoundedCornerShape (15.dp),
                    elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                        )
                ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.textbook),
                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Text",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
                }

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.address),
                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Address",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
        }

        // second row

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.character),
                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Character",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.bankcard),

                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Bank card",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
        }

        // third row

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.logistics),
                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Logistics",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.password),

                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Password",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
        }

        //last

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .weight(0.8f)
                    .padding(6.dp, 0.dp),
                shape = RoundedCornerShape (15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(com.example.C39A.R.drawable.setting),

                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(88.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Setting",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    CardBody()
}