package marshi.memo.app.feature.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.addCallback
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
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
    val appBarConfiguration = AppBarConfiguration(navController.graph)
    setupActionBarWithNavController(navController, appBarConfiguration)
  }

  override fun onSupportNavigateUp(): Boolean {
    if (onBackPressedDispatcher.hasEnabledCallbacks()) {
      onBackPressedDispatcher.onBackPressed()
    }
    return true
  }
}
