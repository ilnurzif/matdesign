package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MyFabBehavior : FloatingActionButton.Behavior {
    constructor(context: Context?, attrs: AttributeSet?) : super() {}
    constructor() : super() {}

    override fun onStartNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: FloatingActionButton,
        directTargetChild: View,
        target: View,
        nestedScrollAxes: Int
    ): Boolean {
        return true
    }

    override fun onNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: FloatingActionButton,
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int
    ) {
        if (dyConsumed > 0) {
            val layoutParams = child.layoutParams as CoordinatorLayout.LayoutParams
            val fab_marginEnd = layoutParams.marginEnd
             child.animate().translationX((child.height + fab_marginEnd).toFloat())
                 .setInterpolator(LinearInterpolator()).start()
        } else if (dyConsumed < 0) {
            child.animate().translationX(0F).setInterpolator(LinearInterpolator()).start()
        }
    }
}
