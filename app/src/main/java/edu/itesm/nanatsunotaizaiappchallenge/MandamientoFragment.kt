package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_mandamiento.*

class MandamientoFragment : Fragment() {

    private val args by navArgs<MandamientoFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mandamiento, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       photo.setImageResource(args.mandamientos.photo)
        name.text = args.mandamientos.name
        mandamiento.text = args.mandamientos.mandamiento
        info.text = args.mandamientos.info
        Toast.makeText(context, args.mandamientos.name, 4000).show()
    }
}