package com.example.copy_instagram

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout

class CircleIndicator:LinearLayout{

    private var mContext: Context? = null
    private var mDefaultCircle: Int = 0
    private var mSelectCircle: Int = 0
    private var imageDot: MutableList<ImageView> = mutableListOf()

    private val temp=TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,4.5f, resources.displayMetrics)

    constructor(context: Context):super(context){
        mContext=context
    }

    constructor(context: Context, attributeSet: AttributeSet):super(context, attributeSet){
        mContext = context
    }

    fun createDotPanel(count: Int, defaultCircle: Int, selectCircle: Int, position: Int){
        this.removeAllViews()

        mDefaultCircle = defaultCircle
        mSelectCircle = selectCircle

        for(i in 0 until count){
            imageDot.add(ImageView(mContext).apply{setPadding(temp.toInt(),0,temp.toInt(),0) })

            this.addView(imageDot[i])
        }
    }

    fun selectDot(position: Int){
        for(i in imageDot.indices){

            if(i == position) {
                imageDot[i].setImageResource(mSelectCircle)
            }
            else{
                imageDot[i].setImageResource(mDefaultCircle)
            }
        }

    }
}