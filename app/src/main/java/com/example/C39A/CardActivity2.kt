package com.example.C39A

import android.graphics.Paint
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.C39A.ui.theme.LightBrown
import com.example.C39A.ui.theme.LightGreen
import com.example.C39A.ui.theme.MyApplicationTheme
import com.example.C39A.ui.theme.Orange
import com.example.C39A.ui.theme.Purple
import com.example.C39A.ui.theme.Skyblue
import com.example.C39A.ui.theme.dargreen

class CardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Card2Body()

        }
    }
}

@Composable
fun Card2Body() {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
//            .padding(12.dp, 14.dp)
    ){

        //profile
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = dargreen)
                .padding(12.dp, 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,

            ){
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
        //body
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
                .padding(12.dp, 14.dp)
        ) {
            //row 1
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Orange,

                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically

                    ) {
                        Text("Dribble", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            color = Color.White
                        ))
                    }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),

                ) {
                    Text("Paidx", style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White
                    ))
                }
            }

            //row2
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Skyblue,

                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text("HJM", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White
                    ))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),

                    ) {
                    Text("98xxxx000", style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White
                    ))
                }
            }

            //row 3
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = LightGreen,

                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text("Me Just ME", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White
                    ))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),

                    ) {
                    Text("I am only i only ii", style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White
                    ))
                }
            }

            //row4

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Purple,

                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text("321654xxx6565", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White
                    ))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),

                    ) {
                    Text("ICBC", style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White
                    ))
                }
            }

            //row 5

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = LightBrown,

                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text("Young", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White
                    ))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),

                    ) {
                    Text("I am young!!!", style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White
                    ))
                }
            }


        }


    }
}

@Preview
@Composable
fun Card2Preview() {
    Card2Body()
}