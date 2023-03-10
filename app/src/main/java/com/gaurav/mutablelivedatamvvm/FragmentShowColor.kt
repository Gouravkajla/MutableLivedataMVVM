package com.gaurav.mutablelivedatamvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.gaurav.mutablelivedatamvvm.databinding.FragmentShowColorBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentShowColor.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentShowColor : Fragment() {
    lateinit var binding: FragmentShowColorBinding
    lateinit var mainActivity:MainActivity
    lateinit var userModleActivity: UserModleActivity
    var j=0
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity= activity as MainActivity
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
        userModleActivity=ViewModelProvider(mainActivity).get(UserModleActivity::class.java)
        userModleActivity.text.observe(mainActivity){
            binding.tvHelloText.setText(it)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentShowColorBinding.inflate(layoutInflater)
         binding?.btnReset?.setOnClickListener {
         mainActivity.i=j
         mainActivity.binding.tvgetcount.text=j.toString()



         }



        return binding?.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentShowColor.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentShowColor().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}