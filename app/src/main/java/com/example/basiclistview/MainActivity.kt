package com.example.basiclistview

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.basiclistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList: ArrayList<User>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)
        val imageId = intArrayOf(
            R.drawable.ayame,
            R.drawable.hutao,
            R.drawable.yoi,
            R.drawable.neko,
            R.drawable.suisei,
            R.drawable.megumin,
            R.drawable.keocon,
            R.drawable.sanghiec
        )
        val name = arrayOf(
            "Nakiri Ayame",
            "Hutao",
            "Naganohara Yoimiya",
            "Angry Neko",
            "Hoshimachi Suisei",
            "Megumin",
            "Win Sweet!?",
            "Anh Sang Hiếc"
        )
        val lastMessage = arrayOf(
            "Vẫn những câu hỏi nhỏ",
            "Sau bao tháng chia ly",
            "Anh vẫn thường thắc mắc",
            "Khi anh không làm gì",
            "Em dạo này có còn xem phim một mình?",
            "Em dạo này có đồ ăn và shopping?",
            "Ngày xuân em có xuống phố không người",
            "Và tán dương cỏ cây lặng thinh?"
        )
        val lastMsgtime = arrayOf(
            "11:00 PM",
            "3:00 PM",
            "2:35 PM",
            "1:17 PM",
            "11:30 AM",
            "11:15 AM",
            "10: 00 AM",
            "6:45 AM"
        )
        val phoneNo = arrayOf(
            "1222", "1222", "1222", "1222", "1222", "1222","112233","11111"
        )
        val country = arrayOf(
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
        )
        userArrayList = ArrayList()
        for (i in name.indices) {
            val user =
                User(name[i], lastMessage[i], lastMsgtime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)
//        binding.listview.setOnItemClickListener{ parent, view, position, id ->
//            val name =name[position]
//            val phone =phoneNo[position]
//            val country = country[position]
//            val imageId = imageId[position]
//            val i = Intent(this, UserActivity::class.java)
////            i.putExtra()
//        }
    }
}