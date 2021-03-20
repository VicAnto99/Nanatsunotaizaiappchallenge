package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_mandamiento.*
import kotlinx.android.synthetic.main.fragment_mandamiento.name
import kotlinx.android.synthetic.main.fragment_mandamiento.photo
import kotlinx.android.synthetic.main.fragment_pecado.*
import kotlinx.android.synthetic.main.pecado_renglon.*

class PecadoFragment : Fragment() {

    private val args by navArgs<PecadoFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pecado, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        photo.setImageResource(args.pecados.photo)
        name.text = args.pecados.name
        pecado.text = args.pecados.pecado
        simbolo2.text = args.pecados.simbolo
        info2.text = args.pecados.info
        Toast.makeText(context, args.pecados.name, 4000).show()
    }
}