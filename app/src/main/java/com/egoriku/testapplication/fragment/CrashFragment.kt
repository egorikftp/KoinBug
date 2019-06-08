package com.egoriku.testapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.egoriku.testapplication.R
import com.egoriku.testapplication.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.fragment_crash.*
import org.koin.androidx.scope.currentScope
import org.koin.androidx.viewmodel.ext.android.viewModel

class CrashFragment : Fragment() {

    private val model: TestViewModel by currentScope.viewModel(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_crash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.liveData.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
    }
}
