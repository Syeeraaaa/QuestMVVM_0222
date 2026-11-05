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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.pertemuan8_pam.R
import com.example.pertemuan8_pam.model.Siswa

@OptIn(ExperimentalMaterial3Api)
@Composable
fun TampilSiswa(
    //edit 1: parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked:()-> Unit
){
    //edit 2 : items Pair
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat)
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = { Text(stringResource(R.string.detail),
                    colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.purple_500)),
                    )
                }){ isiRuang ->
                Column(modifier = Modifier.padding(isiRuang),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
                    ) { }
                }
            }
        }) { }
}