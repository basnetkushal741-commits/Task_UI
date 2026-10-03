package com.example.C39A

import android.R
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
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.C39A.ui.theme.LightBlue
import com.example.C39A.ui.theme.MyApplicationTheme
import com.example.C39A.ui.theme.Purple40
import org.intellij.lang.annotations.JdkConstants
import java.nio.file.WatchEvent

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,

        ) {
            Icon(
                modifier = Modifier .size(40.dp),
                painter = painterResource(com.example.C39A.R.drawable.outline_arrow_back_24),
                contentDescription = null
            )
            Text("me only", style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green,
                fontStyle = FontStyle.Italic
            ))
            Icon(
                modifier = Modifier .size(40.dp),
                painter = painterResource(com.example.C39A.R.drawable.baseline_more_horiz_24),
                contentDescription = null
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(com.example.C39A.R.drawable.boss),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .height(80.dp)
                    .width(88.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("714",)
                Text("Posts")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("1M")
                Text("Followers")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("500k")
                Text("Following")
            }
        }
        Row(
            modifier = Modifier
                .padding(10.dp, 1.dp)
        ) {
            Text("Rei Suwa", style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            ))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, vertical = 1.dp)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Red, fontSize = 16.sp)) {
                        append("Rei ")
                    }
                    append("is a man of few words who doesn't mind that  ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                        append("Kazuki ")
                    }
                    append("crashing at his his apartment. He is physically ")
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("strong, ")
                    }
                    append(" and his ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                        append("fighting abilities ")
                    }
                    append(" and  ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                        append(" marksmanship ")
                    }
                    append("are among the best in the industry. \n")
                    append("Followed by ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("haha ")
                    }
                    append("and ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("hehe ")
                    }
                }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            ElevatedButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Unspecified,
                    containerColor = Purple40,
                ),
                onClick = {}) {
                Icon(
                    modifier = Modifier .size(20.dp) .padding(1.dp),
                    painter = painterResource(com.example.C39A.R.drawable.baseline_person_add_24),
                    contentDescription = null
                )
                Text("Follow")
            }
            ElevatedButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),

                shape = RoundedCornerShape(12.dp),colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Unspecified,
                    containerColor = LightBlue,
                ),

                onClick = {}) {
                Icon(
                    modifier = Modifier .size(20.dp) .padding(1.dp),
                    painter = painterResource(com.example.C39A.R.drawable.baseline_message_24),
                    contentDescription = null
                )
                Text("Message")
            }
            ElevatedButton(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(4.dp),
                shape = RoundedCornerShape(12.dp),colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Unspecified,
                    containerColor = LightBlue,
                ),
                onClick = {}) {
                Icon(
                    modifier = Modifier .size(20.dp),
                    painter = painterResource(com.example.C39A.R.drawable.baseline_share_24),
                    contentDescription = null
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(10.dp, 6.dp)
        ) {
            Text("Highlights", fontSize = 19.sp, fontWeight = FontWeight.Bold)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.family),
                    contentDescription = "Family",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Family")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.miri),
                    contentDescription = "Miri",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Miri")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.kazuki),
                    contentDescription = "Kazuki",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Kazuki")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(com.example.C39A.R.drawable.parties),
                    contentDescription = "parties",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .height(75.dp)
                        .width(75.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Parties")
            }
        }
    }
}



@Preview
@Composable
fun ProfileReview(){
    ProfileBody()
}
