package com.mala.grad_project.presentation.screens

import android.annotation.SuppressLint

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.R
import com.mala.grad_project.composables.LetGoButton
import com.mala.grad_project.composables.LetGoSubTitle
import com.mala.grad_project.composables.Spacer30

import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.composables.TextLetGo
import com.mala.grad_project.composables.circle
import com.mala.grad_project.ui.theme.BackGroundLetgo


@SuppressLint("SuspiciousIndentation")
@Composable
fun LetsGo(){
    Surface ( modifier = Modifier
        .fillMaxSize(),
        color = BackGroundLetgo
        ){

        val uiColor=if(isSystemInDarkTheme()) Color.White else Black
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 20.dp,end=20.dp)
                ,  
                verticalArrangement = Arrangement.Center
            ) {
                Spacer50()
                // cycle
                Box(
                    modifier = Modifier.fillMaxWidth().height(300.dp), contentAlignment = Alignment.TopCenter
                ) {
                    circle()
                }

                TextLetGo(
                    text = stringResource(id = R.string.get_started), modifier = Modifier.fillMaxWidth()
                        .height(52.dp)
                )
                TextLetGo(text = stringResource(id = R.string.get_started2), modifier = Modifier .fillMaxWidth()
                    .height(52.dp))
                LetGoSubTitle(text = stringResource(id = R.string.subtitle_LetGo))
                Spacer50()


                    LetGoButton(text = stringResource(id = R.string.Log_in)) {
                    }

                Spacer30()

                    LetGoButton(text = stringResource(id = R.string.Sign_up)) {
                    }


            }
        }

    }


@Preview
@Composable
fun test(){
    LetsGo()
}