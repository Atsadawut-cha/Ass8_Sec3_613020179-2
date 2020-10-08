package com.example.ass8_md

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(val item : List<Employee> , val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.emp_item_layout,parent,false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName?.text = "Name: "+item[position].emp_name
        holder.tvGender?.text ="Gender :"+item[position].emp_gender
        holder.tvEmail?.text = "Email :"+item[position].emp_email
        holder.tvSalary?.text = "Salary :"+item[position].emp_salary.toString()
    }
    override fun getItemCount(): Int {
        return item.size
    }
}