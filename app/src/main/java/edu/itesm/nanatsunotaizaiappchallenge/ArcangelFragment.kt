package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_arcangel.*

class ArcangelFragment : Fragment() {

    private val args by navArgs<ArcangelFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arcangel, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        photo.setImageResource(args.arcangel.photo)
        name.text = args.arcangel.name
        gracia.text = args.arcangel.gracia
        info.text = args.arcangel.info
        Toast.makeText(context, args.arcangel.name, 4000).show()
    }

}