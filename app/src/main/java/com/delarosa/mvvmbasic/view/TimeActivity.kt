package com.delarosa.mvvmbasic.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.delarosa.mvvmbasic.R
import com.delarosa.mvvmbasic.viewModel.TimeViewModel
import javax.inject.Inject

class TimeActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: TimeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dataBinding = DataBindingUtil.setContentView<com.delarosa.mvvmbasic.databinding.ActivityTimeBinding>(
            this,
            R.layout.activity_time
        )

        dataBinding.let {
            it.setLifecycleOwner(this)
            it.viewModel = viewModel
        }
    }
}
