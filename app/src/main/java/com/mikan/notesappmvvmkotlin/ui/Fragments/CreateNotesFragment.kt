package com.mikan.notesappmvvmkotlin.ui.Fragments

import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mikan.notesappmvvmkotlin.R
import com.mikan.notesappmvvmkotlin.databinding.FragmentCreateNotesBinding
import java.util.*


class CreateNotesFragment : Fragment() {

    lateinit var binding: FragmentCreateNotesBinding
    lateinit var priority : String
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCreateNotesBinding.inflate(layoutInflater, container, false)


        binding.pgreen.setOnClickListener {
            binding.pgreen.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pred.setImageResource(0)
            binding.pyellow.setImageResource(0)
        }
        binding.pyellow.setOnClickListener {
            binding.pyellow.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pred.setImageResource(0)
            binding.pgreen.setImageResource(0)
        }
        binding.pred.setOnClickListener {
            binding.pred.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pgreen.setImageResource(0)
            binding.pyellow.setImageResource(0)
        }

        binding.btnSaveNotes.setOnClickListener {
            createNotes(it)
        }





        return binding.root
    }

    private fun createNotes(it: View?) {
        val title = binding.editTitle.text
        val subtitle = binding.editSubtitle.text
        val notes = binding.editNotes.text
        val d = Date()
        val notesDate: CharSequence = DateFormat.format("MMMM d, yyyy ", d.time)

/* Log.e("@@@@","createNotes: "+s) => check if the date is working or not */


    }


}