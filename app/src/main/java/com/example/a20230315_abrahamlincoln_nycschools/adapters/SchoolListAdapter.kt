package com.example.a20230315_abrahamlincoln_nycschools.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230315_abrahamlincoln_nycschools.R
import com.example.a20230315_abrahamlincoln_nycschools.models.SchoolList

class SchoolListAdapter(
    private val schoolList:List<SchoolList>,
    private val clickListener:(SchoolList)->Unit
):RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)

    }

    override fun getItemCount(): Int {
        return schoolList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val school = schoolList[position]
        if (school != null) {
            holder.bind(school, clickListener)
        }


    }
}
class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
    fun bind(school:SchoolList, clickListener:(SchoolList)->Unit) {
        val myTextView = view.findViewById<TextView>(R.id.tv_name)
        myTextView.text = school.schoolName

        view.setOnClickListener{
            clickListener(school)
        }
    }

}