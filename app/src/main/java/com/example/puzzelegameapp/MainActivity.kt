package com.example.puzzelegameapp

import android.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logTag = "MainFragment"
        val fragmentManager: androidx.fragment.app.FragmentManager = supportFragmentManager


        var n = 3 // size of the puzzle


        fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)

            Log.d(logTag, "onCreate")

            setContentView(R.layout.activity_main)

            showMainFragment()

        }
    }



        fun showMainFragment() {

            val transaction = fragmentManager.beginTransaction()
            val fragment = MainFragment()
            transaction.replace(R.id.fragment_holder, fragment)
            transaction.commit()
        }




        fun showPuzzleFragment(newN: Int) {
          var  n = newN
            val transaction = fragmentManager.beginTransaction()
            val fragment = PuzzleFragment()
            transaction.replace(R.id.fragment_holder, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

private fun Any.replace(fragmentHolder: Int, fragment: MainFragment) {

}

private fun Any.replace(fragmentHolder: Int, fragment: PuzzleFragment) {
}
