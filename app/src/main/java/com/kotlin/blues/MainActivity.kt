package com.kotlin.blues

import android.os.Bundle
import com.kotlin.blues.base.activity.BluesBaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BluesBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testView.text = "Hello Kotlin！！！"
//        recyclerview.layoutManager = LinearLayoutManager(this)
//        recyclerview.adapter = BluesTestAdapter(BluesTestItems())
    }


    fun BluesTestItems(): List<String> {
       return listOf("1111","2222","33333")
    }
}
