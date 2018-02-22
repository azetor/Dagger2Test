package com.mobilemonkeysoftware.dagger2test.ui.fragment.main

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobilemonkeysoftware.dagger2test.R
import com.mobilemonkeysoftware.dagger2test.StringHelper3
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by AR on 11/02/2018.
 */
class MainFragment : Fragment() {

    @Inject
    lateinit var stringHelper3: StringHelper3

    @Inject
    lateinit var stringHelperFragment: StringHelperFragment

    // TODO: working scope example
//    @Inject
//    lateinit var stringHelper1: StringHelper1

    // TODO: working scope example
//    @Inject
//    lateinit var stringHelperActivity: StringHelperActivity

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return View.inflate(context, R.layout.fragment_main, container)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text.text = stringHelperFragment.string() + "\n" + stringHelper3.string()  // + stringHelper1.string() // TODO: working scope example
    }

}
