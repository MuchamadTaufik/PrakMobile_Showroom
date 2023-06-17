package com.e.tubesmobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TeamScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "OUR TEAM")
        Text(text = "ELSTORE")
        Text(text = "Muchamad Taufik Mulyadi - 203040142")
        Text(text = "Mochammad Andrie Firmansyah 203040173 ")
        Text(text = "Linggih Kusumah Dilagga 203040174")
        Text(text = "Hady Ismanto Rachmat 203040134")
        Text(text = "Akbar Maulana 203040136")
    }
}