package me.kevinbayona.tallerlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.kevinbayona.tallerlazycolumn.model.Post
import me.kevinbayona.tallerlazycolumn.ui.theme.TallerLazyColumnTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val post = Post(
            id = 1,
            username = "Kevin",
            profileImageUrl = "profile.jpg",
            imageUrl = "post.jpg",
            likes = 100,
            caption = "Mi primera publicación"
        )

        println(post)

        setContent {
        }
    }
}