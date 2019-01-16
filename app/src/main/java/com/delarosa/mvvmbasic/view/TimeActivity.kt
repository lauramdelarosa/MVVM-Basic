package com.delarosa.mvvmbasic.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.delarosa.mvvmbasic.R
import android.support.v7.app.AppCompatActivity
import com.delarosa.mvvmbasic.databinding.ActivityTimeBinding
import com.delarosa.mvvmbasic.viewModel.TimeViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class TimeActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: TimeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityTimeBinding>(this, R.layout.activity_time)

        dataBinding.let {
            it.setLifecycleOwner(this)
            it.viewModel = viewModel
        }
    }
}
