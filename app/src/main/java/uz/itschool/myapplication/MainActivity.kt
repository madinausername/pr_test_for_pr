package uz.itschool.gallary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import uz.itschool.myapplication.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var list= mutableListOf<Int>()
    var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView_1.setOnClickListener(this)
        imageView_2.setOnClickListener(this)
        imageView_3.setOnClickListener(this)
        imageView_4.setOnClickListener(this)
        imageView_5.setOnClickListener(this)
        imageView_6.setOnClickListener(this)

        list.add(R.drawable.img_1)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img_3)
        list.add(R.drawable.img_4)
        list.add(R.drawable.img_5)
        list.add(R.drawable.img_6)

        imageView_1.setOnClickListener {
            image_full.setImageResource(list[index])
        }
        image_right.setOnClickListener {
            if(index<list.size-1){
                index++
            }
            else{
                index=0
            }
            image_full.setImageResource(list[index])
        }

        image_left.setOnClickListener {
            if(index<=list.size-1){
                index--
            }
            else{
                index=list.size-2
            }
            image_full.setImageResource(list[index])
        }

    }

    override fun onClick(p0: View?) {

        val img = findViewById<ImageView>(p0!!.id)
        image_full.setImageResource(list[img.tag.toString().toInt()])
        image_full.visibility=View.VISIBLE
        /*prev_button.setOnClickListener {
            image_full.setImageResource(list[img.tag.toString().toInt()-1])
        }

        next_button.setOnClickListener {
            image_full.setImageResource(list[img.tag.toString().toInt()+1])
        }*/

    }
}