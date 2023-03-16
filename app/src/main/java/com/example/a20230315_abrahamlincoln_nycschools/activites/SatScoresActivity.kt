package com.example.a20230315_abrahamlincoln_nycschools.activites

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230315_abrahamlincoln_nycschools.R
import com.example.a20230315_abrahamlincoln_nycschools.adapters.SatScoreAdapter
import com.example.a20230315_abrahamlincoln_nycschools.adapters.SchoolListAdapter
import com.example.a20230315_abrahamlincoln_nycschools.models.SatScoreList
import com.example.a20230315_abrahamlincoln_nycschools.models.SchoolList

class SatScoresActivity : AppCompatActivity() {
    private val satScoreList = listOf<SatScoreList>(
        SatScoreList("111", "444", writingScore = "333"),
        SatScoreList("255", "421", writingScore = "234"),
        SatScoreList("355", "412", writingScore = "432"),
        SatScoreList("325", "543", writingScore = "543"),
        SatScoreList("355", "234", writingScore = "435"),
        SatScoreList("455", "278", writingScore = "234"),
        SatScoreList("335", "564", writingScore = "564"),
        SatScoreList("385", "432", writingScore = "345"),
        SatScoreList("235", "433", writingScore = "453"),
        SatScoreList("535", "565", writingScore = "456"),
        SatScoreList("355", "412", writingScore = "432"),
        SatScoreList("325", "543", writingScore = "543"),
        SatScoreList("355", "234", writingScore = "435"),
        SatScoreList("455", "278", writingScore = "234"),
        SatScoreList("335", "564", writingScore = "564"),
        SatScoreList("385", "432", writingScore = "345")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sat_scores)
        val recyclerView = findViewById<RecyclerView>(R.id.satScoresRecyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SatScoreAdapter(satScoreList)
    }

}
