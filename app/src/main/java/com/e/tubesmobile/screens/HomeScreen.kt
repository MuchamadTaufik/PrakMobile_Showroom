package com.e.tubesmobile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.e.tubesmobile.R

@Composable
fun HomeScreen(navController: NavHostController, snackbarHostState: SnackbarHostState, modifier: Modifier = Modifier) {
    val menus = listOf(
        Menu.HOME,
        Menu.PENGELOLAAN_KOMPUTER,
        Menu.PENGELOLAAN_PERIFERAL,
        Menu.PENGELOLAAN_SMARTHPHONE,
        Menu.TEAM)
    val listState = rememberLazyListState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(modifier = Modifier
            .size(300.dp),
            painter = painterResource(
                id = R.drawable.logo),
            contentDescription = "Halaman Home"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "WELCOME ",
            fontSize = 50.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            modifier = Modifier.padding(end = 80.dp, start = 80.dp),
            text = "Store Elektronik terlengkap",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}
