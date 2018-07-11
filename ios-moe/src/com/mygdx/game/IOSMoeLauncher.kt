package com.mygdx.game

import com.badlogic.gdx.backends.iosmoe.IOSApplication
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration
import org.moe.natj.general.Pointer
import com.mygdx.game.MyGdxGame

import apple.uikit.c.UIKit

class IOSMoeLauncher constructor(peer: Pointer) : IOSApplication.Delegate(peer) {
    companion object {
        @JvmStatic
        fun main(argv: Array<String>) {
            UIKit.UIApplicationMain(0, null, null, IOSMoeLauncher::class.java.name)
        }
    }

    override fun createApplication(): IOSApplication {
        val config = IOSApplicationConfiguration()
        config.useAccelerometer = false
        return IOSApplication(MyGdxGame(), config)
    }
}
