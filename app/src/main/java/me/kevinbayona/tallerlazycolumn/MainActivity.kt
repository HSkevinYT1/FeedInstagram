package me.kevinbayona.tallerlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.kevinbayona.tallerlazycolumn.ui.screens.FeedScreen
import me.kevinbayona.tallerlazycolumn.ui.theme.TallerLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerLazyColumnTheme {
                FeedScreen()
            }
        }
    }
}
