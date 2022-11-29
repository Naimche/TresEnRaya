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
import androidx.compose.ui.unit.sp

class Game {

    @Composable
    @Preview
    fun gameUI() {
        var textValue0 by remember { mutableStateOf("") }
        var textValue1 by remember { mutableStateOf("") }
        var textValue2 by remember { mutableStateOf("") }
        var textValue3 by remember { mutableStateOf("") }
        var textValue4 by remember { mutableStateOf("") }
        var textValue5 by remember { mutableStateOf("") }
        var textValue6 by remember { mutableStateOf("") }
        var textValue7 by remember { mutableStateOf("") }
        var textValue8 by remember { mutableStateOf("") }
        var textValue9 by remember { mutableStateOf("") }
        val board by remember {
            mutableStateOf(arrayOfNulls<Int>(size = 9))
        }
        var turno = 0
        if (!winChecker(board, turno - 1)) {
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
                                            textValue0 = "X"
                                            board[0] = 0
                                        } else {
                                            textValue0 = "O"
                                            board[0] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue0, fontSize = 55.sp)
                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue1 = "X"
                                            board[1] = 0
                                        } else {
                                            textValue1 = "O"
                                            board[1] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue1, fontSize = 55.sp)
                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue2 = "X"
                                            board[2] = 0
                                        } else {
                                            textValue2 = "O"
                                            board[2] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue2, fontSize = 55.sp)
                                }
                            }
                            //Segunda columna
                            Row(modifier = Modifier) {
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue3 = "X"
                                            board[3] = 0
                                        } else {
                                            textValue3 = "O"
                                            board[3] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue3, fontSize = 55.sp)
                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue4 = "X"
                                            board[4] = 0
                                        } else {
                                            textValue4 = "O"
                                            board[4] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue4, fontSize = 55.sp)
                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue5 = "X"
                                            board[5] = 0
                                        } else {
                                            textValue5 = "O"
                                            board[5] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue5, fontSize = 55.sp)
                                }
                            }
                            //Tercera linea
                            Row(modifier = Modifier) {
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue6 = "X"
                                            board[6] = 0
                                        } else {
                                            textValue6 = "O"
                                            board[6] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue6, fontSize = 55.sp)

                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue7 = "X"
                                            board[7] = 0
                                        } else {
                                            textValue7 = "O"
                                            board[7] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue7, fontSize = 55.sp)

                                }
                                Button(
                                    onClick = {
                                        if (changeTurn(turno)) {
                                            textValue8 = "X"
                                            board[8] = 0
                                        } else {
                                            textValue8 = "O"
                                            board[8] = 1
                                        }
                                        turno++
                                    },
                                    Modifier.size(80.dp, 80.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                                ) {
                                    Text(text = textValue8, fontSize = 55.sp)

                                }
                            }
                        }


                    }
                }
            }
        }else{
            Surface(modifier = Modifier.fillMaxSize()) {
                Text(text = "GG")
            }
        }
    }

    fun game(array: Array<String>) {

    }

    fun changeTurn(turno: Int): Boolean {
        return turno % 2 == 0
    }

    fun winChecker(board: Array<Int?>, player: Int): Boolean =
        if (board[0] == player && board[1] == player && board[2] == player) true
        else if (board[3] == player && board[4] == player && board[5] == player) true
        else if (board[6] == player && board[7] == player && board[8] == player) true

        //check columns
        else if (board[0] == player && board[3] == player && board[6] == player) true
        else if (board[1] == player && board[4] == player && board[7] == player) true
        else if (board[2] == player && board[5] == player && board[8] == player) true

        //check diagonals
        else if (board[2] == player && board[4] == player && board[6] == player) true
        else board[0] == player && board[4] == player && board[8] == player



}