package com.naimc.tresenraya

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Game {

    @Composable
    @Preview
    fun gameUI() {
        var textValue by remember{ mutableStateOf("") }
        val board = arrayOfNulls<String>(size = 9)
        var turno = 0
        Surface(Modifier.fillMaxSize()) {
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier) {
                    Image(
                        painter = painterResource(id = R.drawable.grid),
                        contentDescription = "Grid"
                    )
                    Column() {
                        Row(modifier = Modifier) {
                            Button(
                                onClick = {
                                    if (changeTurn(turno)) {
                                        textValue= "X"
                                    }
                                },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {
                                Text(text = textValue)
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                        }
                        //Segunda columna
                        Row(modifier = Modifier) {
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                        }
                        //Tercera linea
                        Row(modifier = Modifier) {
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier.size(80.dp, 80.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                            ) {

                            }
                        }
                    }


                }
            }
        }
    }

    fun game(array: Array<String>) {

    }

    fun changeTurn(turno: Int): Boolean {
        return turno % 2 == 0
    }
}