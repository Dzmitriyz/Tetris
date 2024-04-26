package com.example.tetrisnoactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tetrisnoactivity.storage.AppReferences

class GameActiviy : AppCompatActivity() {
    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appReferences: AppReferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_activiy)
        appReferences = AppReferences(this)

        val btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHighScore = findViewById(R.id.tv_high_score)
        tvCurrentScore = findViewById(R.id.tv_current_score)
        updateHighScore()
        updateCurrentScore()
    }
    private fun updateHighScore(){
        tvHighScore?.text = "${appReferences?.getHighScore()}"
    }
    private fun updateCurrentScore(){
        tvCurrentScore?.text = "0"
    }
}