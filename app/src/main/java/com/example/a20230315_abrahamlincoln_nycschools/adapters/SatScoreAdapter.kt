package com.example.a20230315_abrahamlincoln_nycschools.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230315_abrahamlincoln_nycschools.R
import com.example.a20230315_abrahamlincoln_nycschools.models.SatScoreList

class SatScoreAdapter(
        private val satScoreList:List<SatScoreList>
    ):RecyclerView.Adapter<SatScoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SatScoreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val satScorelistItem = layoutInflater.inflate(R.layout.sat_score_item, parent, false)
        return SatScoreViewHolder(satScorelistItem)
    }

    override fun getItemCount(): Int {
        return satScoreList.size
    }

    override fun onBindViewHolder(holder: SatScoreViewHolder, position: Int) {
        val satScore = satScoreList[position]
        holder.bind(satScore)
    }
}
class SatScoreViewHolder(private val view: View): RecyclerView.ViewHolder(view){
    fun bind(satScore: SatScoreList){
        val readingScoreTextView = view.findViewById<TextView>(R.id.readingScoreTextView)
        val mathScoreTextView = view.findViewById<TextView>(R.id.mathScoreTextView)
        val writingScoreTextView = view.findViewById<TextView>(R.id.writingScoreTextView)
        readingScoreTextView.text = satScore.readingScore
        mathScoreTextView.text = satScore.mathScore
        writingScoreTextView.text = satScore.writingScore
    }
}