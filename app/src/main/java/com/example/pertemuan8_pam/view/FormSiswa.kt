package com.example.pertemuan8_pam.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.pertemuan8_pam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier
){
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember {mutableStateOf("")}
    var txtGender by remember {mutableStateOf("")}
    val listData: MutableList<String> = mutableListOf(txtNama,txtGender, txtAlamat)

    Scaffold(modifier = Modifier,
        { TopAppBar(title = { Text (stringResource(id = R.string.app_name), color = color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500))
        )
        }) { isiRuang ->

        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }
}