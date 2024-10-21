package com.example.p3basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection2()
        DetailMhs("Nama", "Luthfi Angger Ramdhani")
        DetailMhs("NIM", "20220140137")
        DetailMhs("Prodi", "Teknologi Informasi")
        DetailMhs("Fakultas", "Teknik")
        DetailMhs("Universitas", "Universitas Muhammadiyah Yogyakarta")
        DetailMhs("Alamat", "Kp.Setu, Des. setu, Kec. Jasinga")
        DetailMhs("Email", "luthfiangger2510@gmail.com")
    }
}

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd,
            ) {
                Image(
                    painter = painterResource(R.drawable.umy),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).size(80.dp)
                )
                Icon(
                    Icons.Filled.Done,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp).background(Color.White, CircleShape)
                )
            }
            Column (
                modifier = Modifier.padding(16.dp)

            ){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }

    }
}

@Composable
fun DetailMhs(
    para:String, argu:String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = para,
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text= ":",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = argu,
                modifier = Modifier.weight(2f)
            )
        }
    }
}


