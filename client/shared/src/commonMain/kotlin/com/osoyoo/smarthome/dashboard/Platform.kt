package com.osoyoo.smarthome.dashboard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
