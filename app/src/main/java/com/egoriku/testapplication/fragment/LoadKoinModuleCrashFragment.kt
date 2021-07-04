package com.egoriku.testapplication.fragment

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.egoriku.testapplication.R
import com.egoriku.testapplication.databinding.FragmentCrashBinding
import com.egoriku.testapplication.fragment.test.TestViewModel
import org.koin.androidx.scope.ScopeFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class LoadKoinModuleCrashFragment : ScopeFragment(R.layout.fragment_crash) {

    init {
        loadKoinModules(testModule)
    }

    private val model: TestViewModel by viewModel()
    private val binding by viewBinding(FragmentCrashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.liveData.observe(viewLifecycleOwner) {
            binding.textView.text = it
        }
    }

    override fun onDestroy() {
        unloadKoinModules(testModule)
        super.onDestroy()
    }
}
