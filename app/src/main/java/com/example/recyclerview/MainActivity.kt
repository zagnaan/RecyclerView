package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.preworkout,
            R.drawable.protein,
            R.drawable.amino,
            R.drawable.bcaa,
            R.drawable.gainer,
            R.drawable.magnesium,
            R.drawable.oats,
            R.drawable.test,
            R.drawable.vitaminc,
            R.drawable.creatine)

        titleList = arrayOf(
            "Pre-workout",
            "Whey",
            "Amino",
            "BCAA",
            "Gainer",
            "Magnesium",
            "Oats",
            "Testosterone",
            "Vitamin-C",
            "Creatine")

        recyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()


    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}