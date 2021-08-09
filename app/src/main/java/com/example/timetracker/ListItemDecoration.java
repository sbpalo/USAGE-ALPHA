package com.example.timetracker;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;


public class ListItemDecoration extends RecyclerView.ItemDecoration {
    private int space;
    public ListItemDecoration(int space) {
        this.space = space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
    }
}
