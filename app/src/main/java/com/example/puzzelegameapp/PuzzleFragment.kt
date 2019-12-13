package com.example.puzzelegameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_puzzle_fragment.*

class PuzzleFragment : Fragment() {



    private val logTag = "PuzzleFragment"



    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(logTag, "onCreate")

        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.activity_puzzle_fragment, container, false)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val mainActivity: MainActivity = activity as MainActivity
        val puzzleBoardView = context { PuzzleBoardView(it, mainActivity.n) }
        puzzle_container.addView(puzzleBoardView)

        button_new_game.setOnClickListener {
            puzzleBoardView.initGame()
            puzzleBoardView.invalidate()
        }
    }
}