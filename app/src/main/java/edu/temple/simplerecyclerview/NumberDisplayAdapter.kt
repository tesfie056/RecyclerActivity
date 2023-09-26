package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_number: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {


    private val number = _number
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        val numberView = textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
      return NumberViewHolder(
          TextView(
              parent.context
          ).apply {
              layoutParams
          }
      )
    }

    override fun getItemCount(): Int {
        return number.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
holder.numberView
    }

    //Step 3b: Complete function definitions for adapter

}