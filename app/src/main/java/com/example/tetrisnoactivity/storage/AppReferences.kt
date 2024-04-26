package com.example.tetrisnoactivity.storage

import android.content.Context
import android.content.SharedPreferences
import com.google.android.material.color.utilities.Score

class AppReferences(ctx: Context) {
    var data: SharedPreferences = ctx.getSharedPreferences("APP_REFERENCES", Context.MODE_PRIVATE)
    fun saveHighScore(highScore: Int){
        data.edit().putInt("HIGH_SCORE",highScore).apply()
    }
    fun getHighScore():Int{
        return data.getInt("HIGH_SCORE",0)
    }
    fun clearHighScore(){
        data.edit().putInt("HIGH_SCORE", 0).apply()
    }
}