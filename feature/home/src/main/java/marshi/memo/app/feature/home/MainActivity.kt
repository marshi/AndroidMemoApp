package marshi.memo.app.feature.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import dagger.hilt.android.AndroidEntryPoint
import dev.marshi.feature.home.R
import dev.marshi.feature.home.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    setSupportActionBar(binding.toolbar)
    supportActionBar?.apply {
      title = "title"
      setDisplayHomeAsUpEnabled(true)
    }
  }

  override fun onStart() {
    super.onStart()
    val navController = findNavController(R.id.nav_host_fragment)
    NavigationUI.setupActionBarWithNavController(this, navController)
//    binding.toolbar.setupWithNavController(navController, appBarConfiguration)
//    binding.toolbar.setOnMenuItemClickListener { listener ->
//      println(listener)
//      true
//    }
  }

  override fun onSupportNavigateUp(): Boolean {
    if (onBackPressedDispatcher.hasEnabledCallbacks()) {
      onBackPressedDispatcher.onBackPressed()
    }
    return true
  }
}
