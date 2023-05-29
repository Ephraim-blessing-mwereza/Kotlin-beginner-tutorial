package com.example.beginner

import android.view.View

class ViewPagerAdapter (val images: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)


}/**/