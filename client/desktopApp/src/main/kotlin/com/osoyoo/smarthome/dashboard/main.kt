package com.osoyoo.smarthome.dashboard

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "OSOYOO Smart Home Dashboard",
    ) {
        App()
    }
}
