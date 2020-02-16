package com.nbcc.rickmortyquiz


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.nbcc.rickmortyquiz.databinding.FragmentCheatBinding
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class CheatFragment : Fragment() {


    private lateinit var binding: FragmentCheatBinding;

    private lateinit var args: CheatFragmentArgs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        args = CheatFragmentArgs.fromBundle(arguments!!)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_cheat,
            container, false
        )


        binding.apply {
            //set fields
            answerLabel.visibility = View.INVISIBLE;
            answerLabel.text = args.answer.toString()

            questionLabel.setText(args.question)

            btnCheat.setOnClickListener{ answerLabel.visibility = View.VISIBLE}

            cancelButton.setOnClickListener{
                activity!!.onBackPressed()

            }
        }



        return binding.root
    }








}
