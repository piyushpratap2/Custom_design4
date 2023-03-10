package com.example.custom_design4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.custom_design4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var counter = 0
        var flag = false
        var flag1 = false
        /*binding.btn2.setOnClickListener {
            if (flag1 == false) {
                if (counter == 0) {
                    binding.motionLayout.setTransition(R.id.start, R.id.mid)
                    binding.motionLayout.setTransitionDuration(300)
                    binding.motionLayout.transitionToEnd()
                    counter++
                }else if (counter == 1){
                    binding.motionLayout.setTransition(R.id.mid, R.id.full_expand)
                    binding.motionLayout.setTransitionDuration(400)
                    binding.motionLayout.transitionToEnd()
                    counter = 0
                    flag = true
                    flag1 = true
                }
            } else {
                if (flag == true) {
                    binding.motionLayout.setTransition(R.id.full_expand, R.id.mid)
                    binding.motionLayout.setTransitionDuration(400)
                    binding.motionLayout.transitionToEnd()
                    flag = false
                } else {
                    binding.motionLayout.setTransition(R.id.mid, R.id.start)
                    binding.motionLayout.setTransitionDuration(400)
                    binding.motionLayout.transitionToEnd()
                    flag1 = false
                }
            }

        }*/
        /*binding.motionLayout.setOnTouchListener(object: OnSwipeTouchListener(this){
            override fun onSwipeDown() {
                super.onSwipeDown()
                if (flag1 == false) {
                    if (counter == 0) {
                        binding.motionLayout.setTransition(R.id.start, R.id.mid)
                        binding.motionLayout.setTransitionDuration(300)
                        binding.motionLayout.transitionToEnd()
                        counter++
                    } else if (counter == 1) {
                        binding.motionLayout.setTransition(R.id.mid, R.id.full_expand)
                        binding.motionLayout.setTransitionDuration(400)
                        binding.motionLayout.transitionToEnd()
                        counter = 0
                        flag = true
                        flag1 = true
                    }
                }
            }

            override fun onSwipeUp(){
                super.onSwipeUp()
                if (flag == true) {
                    binding.motionLayout.setTransition(R.id.full_expand, R.id.mid)
                    binding.motionLayout.setTransitionDuration(400)
                    binding.motionLayout.transitionToEnd()
                    flag = false
                } else {
                    binding.motionLayout.setTransition(R.id.mid, R.id.start)
                    binding.motionLayout.setTransitionDuration(400)
                    binding.motionLayout.transitionToEnd()
                    flag1 = false
                }
            }
        })*/
        binding.motionLayout.setOnTouchListener(object: View.OnTouchListener{

            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if (flag1 == false) {
                    if (counter == 0) {
                        binding.motionLayout.setTransition(R.id.start, R.id.mid)
                        binding.motionLayout.setTransitionDuration(300)
                        binding.motionLayout.transitionToEnd()
                        counter++
                    } else if (counter == 1) {
                        binding.motionLayout.setTransition(R.id.mid, R.id.full_expand)
                        binding.motionLayout.setTransitionDuration(400)
                        binding.motionLayout.transitionToEnd()
                        counter = 0
                        flag = true
                        flag1 = true
                    }
                } else {
                    if (flag == true) {
                        binding.motionLayout.setTransition(R.id.full_expand, R.id.mid)
                        binding.motionLayout.setTransitionDuration(400)
                        binding.motionLayout.transitionToEnd()
                        flag = false
                    } else {
                        binding.motionLayout.setTransition(R.id.mid, R.id.start)
                        binding.motionLayout.setTransitionDuration(400)
                        binding.motionLayout.transitionToEnd()
                        flag1 = false
                    }
                }
                return onTouchEvent(event)
            }

        })
    }
}