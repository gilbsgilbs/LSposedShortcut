package org.gilbsgilbs.lspshrt

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Runtime.getRuntime().exec("su -c am start-activity -n com.android.shell/.BugreportWarningActivity -c org.lsposed.manager.LAUNCH_MANAGER")
        finish()
    }
}
