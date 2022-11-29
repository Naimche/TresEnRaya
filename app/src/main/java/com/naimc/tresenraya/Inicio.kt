package com.naimc.tresenraya

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Inicio() {
    @SuppressLint("NotConstructor")
    @Preview
    @Composable
    fun Inicio() {

        var ingame by remember { mutableStateOf(false) }
        if (!ingame) {
            Surface(Modifier.fillMaxSize(), color = Color.Black) {
                Image(
                    painter = painterResource(id = R.drawable.fondo),
                    contentDescription = "Background",
                    contentScale = ContentScale.FillWidth
                )
                Column(
                    Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "TRES EN RAYA", color = Color.White, fontSize = 40.sp)
                    Button(
                        onClick = { ingame = true }, Modifier.padding(
                            0.dp, 15.dp,
                            0.dp, 0.dp
                        )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.play),
                            contentDescription = "play"
                        )
                        Text(text = "Jugar")
                    }
                }
            }
        }
    }

}