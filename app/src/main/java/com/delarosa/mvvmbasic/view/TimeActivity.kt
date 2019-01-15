package com.delarosa.mvvmbasic.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.delarosa.mvvmbasic.R

class TimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dataBinding = DataBindingUtil.setContentView<ActivityTimeBinding>(this, R.layout.activity_time)

        dataBinding.let {
            it.setLifecycleOwner(this)
            it.viewModel = viewModel
        }
    }
}
