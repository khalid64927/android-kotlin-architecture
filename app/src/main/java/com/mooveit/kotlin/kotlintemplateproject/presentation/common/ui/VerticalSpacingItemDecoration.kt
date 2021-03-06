package com.mooveit.kotlin.kotlintemplateproject.presentation.common.ui

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class VerticalSpacingItemDecoration(private val mVerticalSpacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State?) {
        outRect.bottom = mVerticalSpacing
    }
}