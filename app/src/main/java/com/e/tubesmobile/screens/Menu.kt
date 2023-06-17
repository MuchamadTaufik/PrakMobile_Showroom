package com.e.tubesmobile.screens

import androidx.annotation.StringRes
import com.e.tubesmobile.R

enum class Menu(
    @StringRes val title: Int,
    val icon: Int,
    val route: String
) {
    HOME(R.string.home, R.drawable.home, "home"),
    PENGELOLAAN_KOMPUTER(R.string.pengelolaan_komputer, R.drawable.komputer_home, "pengelolaan-komputer"),
    PENGELOLAAN_PERIFERAL(R.string.pengelolaan_periferal, R.drawable.periferal_home, "pengelolaan-periferal"),
    PENGELOLAAN_SMARTHPHONE(R.string.pengelolaan_smarthphone, R.drawable.smartphone_home, "pengelolaan-smarthphone"),
    TEAM(R.string.team, R.drawable.team_home, "team");
    companion object {
        fun getTabFromResource(@StringRes resource: Int) : Menu
        {
            return when (resource) {
                R.string.home -> HOME
                R.string.pengelolaan_komputer -> PENGELOLAAN_KOMPUTER
                R.string.pengelolaan_periferal -> PENGELOLAAN_PERIFERAL
                R.string.pengelolaan_smarthphone -> PENGELOLAAN_SMARTHPHONE
                R.string.team -> TEAM
                else -> TEAM
            }
        }
    }
}