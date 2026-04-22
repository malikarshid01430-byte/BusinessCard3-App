package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE3F2FD) // light gray background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        ProfileSection(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        )

        ContactSection()
    }
}

@Composable
fun ProfileSection(modifier: Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.baseline_android_24),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Arshid Malik",
            fontSize = 28.sp
        )

        Text(
            text = "Android Developer",
            fontSize = 18.sp,
            color = Color(0xFF3DDC84)
        )
    }
}

@Composable
fun ContactSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        ContactRow(Icons.Default.Phone, "+91 9682397579")
        ContactRow(Icons.Default.Email, "malikarshid01430@gmail.com")
        ContactRow(Icons.Default.LocationOn, "India")
    }
}

@Composable
fun ContactRow(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF2196F3)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(text = text)
    }
}