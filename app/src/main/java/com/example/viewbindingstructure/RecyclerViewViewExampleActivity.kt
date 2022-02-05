package com.example.viewbindingstructure

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindingstructure.databinding.ActivityRecyclerViewViewExampleBinding
import kotlinx.android.synthetic.main.activity_recycler_view_view_example.*

class RecyclerViewViewExampleActivity : AppCompatActivity() {

    private lateinit var liveAdapter : LiveAdapter

    private lateinit var binding : ActivityRecyclerViewViewExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityRecyclerViewViewExampleBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
    }

    override fun onStart() {
        super.onStart()

        initRecyclerView()
        addDataSource()

    }

    private fun initRecyclerView() {

        this.liveAdapter = LiveAdapter { live ->
            openLink(live.link)

        }

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewViewExampleActivity)
            adapter = liveAdapter
        }

    }

    private fun openLink(url: String) {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        liveAdapter.setDataSet(dataSource)
    }
}
