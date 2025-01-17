package com.jubayer_ahamad_tayef.column_in_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jubayer_ahamad_tayef.column_in_jetpack_compose.ui.theme.Column_In_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column_In_Jetpack_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun MyColumn(modifier: Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
            )
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .align(Alignment.End)
            )
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .align(Alignment.End)
            )
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = Modifier
                    .size(100.dp)
                    .background(MaterialTheme.colorScheme.primary)
            )
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun MyColumnPreview() {
        MyColumn(Modifier.padding(5.dp))
    }
}