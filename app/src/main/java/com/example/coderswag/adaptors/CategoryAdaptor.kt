package com.example.coderswag.adaptors

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryAdaptor(val context: Context, val categories: List<Category>) : BaseAdapter() {
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryimage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryname)
        // println(categoryName)
        //println(position)
        println(categories)
        val category = categories[position]
        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        //println(context.packageName)
        categoryImage.setImageResource(resourceID)
        // println(resourceID)
        categoryName.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}