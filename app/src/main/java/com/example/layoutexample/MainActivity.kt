package com.example.layoutexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutexample.adapter.CategoryAdapter
import com.example.layoutexample.adapter.MenuAdapter
import com.example.layoutexample.databinding.ActivityMainBinding
import com.example.layoutexample.model.Category
import com.example.layoutexample.model.Menu

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adapterCategory = CategoryAdapter()
    private val adapterMenu = MenuAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        setAction()
        changeProfileIcon()
        setListCategory()
        setListMenu()
    }

    private fun setListMenu() {
        val data = listOf(
            Menu(image = R.drawable.img_university, name = "Menu 1", price = 5000.0),
            Menu(image = R.drawable.img_university, name = "Menu 2", price = 10000.0),
            Menu(image = R.drawable.img_university, name = "Menu 3", price = 20000.0),
            Menu(image = R.drawable.img_university, name = "Menu 4", price = 2000.0),
            Menu(image = R.drawable.img_university, name = "Menu 5", price = 100000.0),
            Menu(image = R.drawable.img_university, name = "Menu 6", price = 20000.0),
            Menu(image = R.drawable.img_university, name = "Menu 7", price = 20000.0),
            Menu(image = R.drawable.img_university, name = "Menu 8", price = 20000.0),
            Menu(image = R.drawable.img_university, name = "Menu 9", price = 20000.0)
        )
        binding.rvMenu.apply {
            adapter = this@MainActivity.adapterMenu
        }
        adapterMenu.submitData(data)
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.img_university, name = "Kategori 1"),
            Category(image = R.drawable.img_university, name = "Kategori 2"),
            Category(image = R.drawable.img_university, name = "Kategori 3"),
            Category(image = R.drawable.img_university, name = "Kategori 4"),
            Category(image = R.drawable.img_university, name = "Kategori 5"),
            Category(image = R.drawable.img_university, name = "Kategori 6"),
            Category(image = R.drawable.img_university, name = "Kategori 7"),
            Category(image = R.drawable.img_university, name = "Kategori 8")

        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.adapterCategory
        }
        adapterCategory.submitData(data)
    }

    private fun changeProfileIcon() {
        binding.layoutHeader.ivProfileMenu.setImageResource(R.drawable.img_university)
    }

    private fun setAction() {
        binding.layoutHeader.ivProfileMenu.setOnClickListener{
            Toast.makeText(this@MainActivity, "Profile di tekan", Toast.LENGTH_SHORT).show()
        }
    }
}

//class MainActivity : AppCompatActivity() {
//    private var ivProfile: ImageView? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
////            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
////            insets
////        }
//        bind()
//        setAction()
//        changeProfileIcon()
//    }
//
//    private fun changeProfileIcon() {
//        ivProfile?.setImageResource(R.drawable.img_university)
//    }
//
//    private fun setAction() {
//        ivProfile?.setOnClickListener{
//            Toast.makeText(this@MainActivity, "Profile di tekan", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    private fun bind() {
//        ivProfile = findViewById(R.id.iv_profile_menu)
//    }
//}