package com.mobilemonkeysoftware.dagger2test.ui.activity.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.mobilemonkeysoftware.dagger2test.R
import com.mobilemonkeysoftware.dagger2test.StringHelper1
import com.mobilemonkeysoftware.dagger2test.StringHelper2
import com.mobilemonkeysoftware.dagger2test.StringHelper3
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var stringHelper1: StringHelper1

    @Inject
    lateinit var stringHelper2: StringHelper2

    @Inject
    lateinit var stringHelper3: StringHelper3

    @Inject
    lateinit var stringHelperActivity: StringHelperActivity

    /**
     * TODO: wrong scope example
     * not working, wrong scope!!!
     * Error:com.mobilemonkeysoftware.dagger2test.ui.activity.main.MainActivityComponent (unscoped) may not reference scoped bindings:
     * Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
     * > Compilation failed; see the compiler error output for details.
     */
//    @Inject
//    lateinit var stringHelperFragment: StringHelperFragment

    @field:[Inject Named("string2")]
//    @Inject // TODO XXX nie tak named
//    @Named("string2")
    lateinit var string2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Step 4a inject/register activity in dagger
        AndroidInjection.inject(this)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        text.text = stringHelper2.string() + "\n" + string2 + "\n" + stringHelperActivity.string() + "\n" + stringHelper3.string() //+ stringHelperFragment.string() // TODO: wrong scope example
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}
