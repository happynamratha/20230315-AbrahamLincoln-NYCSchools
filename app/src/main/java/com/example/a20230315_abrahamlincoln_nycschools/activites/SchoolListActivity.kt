package com.example.a20230315_abrahamlincoln_nycschools.activites

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230315_abrahamlincoln_nycschools.R
import com.example.a20230315_abrahamlincoln_nycschools.adapters.SchoolListAdapter
import com.example.a20230315_abrahamlincoln_nycschools.models.SchoolList


class SchoolListActivity : AppCompatActivity() {
    private val tag = "SchoolListActivity"
    private val schoolNameList:List<SchoolList> = listOf<SchoolList>(
        SchoolList("02M260","HENRY STREET SCHOOL FOR INTERNATIONAL STUDIES"),
        SchoolList("01K230","UNIVERSITY NEIGHBORHOOD HIGH SCHOOL"),
        SchoolList("09M360","EAST SIDE COMMUNITY SCHOOL"),
        SchoolList("22Z260","FORSYTH SATELLITE ACADEMY"),
        SchoolList("32L000","MARTA VALLE HIGH SCHOOL"),
        SchoolList("20M260","LOWER EAST SIDE PREPARATORY HIGH SCHOOL"),
        SchoolList("32K263","CASCADES HIGH SCHOOL"),
        SchoolList("09M360","EAST SIDE COMMUNITY SCHOOL"),
        SchoolList("22Z260","FORSYTH SATELLITE ACADEMY"),
        SchoolList("32L000","MARTA VALLE HIGH SCHOOL"),
        SchoolList("20M260","LOWER EAST SIDE PREPARATORY HIGH SCHOOL")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_list)
        val recyclerView = findViewById<RecyclerView>(R.id.schoolNameListRecyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        if (schoolNameList != null && schoolNameList.size > 0) {
            recyclerView.adapter = SchoolListAdapter(
                schoolNameList,
            ) { selectedItem: SchoolList ->
                listItemClicked(selectedItem)
            }
        }
    }
    private fun listItemClicked(schoolList: SchoolList){
        val myIntent = Intent(this@SchoolListActivity, SatScoresActivity::class.java)
        myIntent.putExtra("dbn_unique", schoolList.dbn_unique)
        Log.i(tag,  schoolList.dbn_unique)
        startActivity(myIntent)
    }
}

