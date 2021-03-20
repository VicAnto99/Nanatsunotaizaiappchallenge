package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_arcangeles.*

class ArcangelesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arcangeles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arcangeles_recycler.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = ArcangelesAdapter(createData())
        }
    }

    fun createData(): ArrayList<Arcangeles>{
        val arcangeles = ArrayList<Arcangeles>()
        arcangeles.add(Arcangeles(R.drawable.ludociel1, "Ludociel", "Destello (閃光 (せんこう), Senkō)", "A Ludociel le fue otorgado la gracia Destello, que le permite moverse a velocidades increíbles."))
        arcangeles.add(Arcangeles(R.drawable.mael1, "Mael", "Sol (太陽 (たいよう), Taiyō)", "A Mael se le otorgó la gracia Sol, que le permitió aumentar su poder conforme se acercaba el medio día. Sunshine actualmente se encuentra en posesión de Escanor de los Siete Pecados Capitales desde el momento de su nacimiento, siendo desconocido el como lo obtuvo."))
        arcangeles.add(Arcangeles(R.drawable.sariel1, "Sariel", "Tornado (竜巻 (たつまき), Tatsumaki)", "A Sariel le fue otorgado la gracia Tornado, que le permite manipular el viento."))
        arcangeles.add(Arcangeles(R.drawable.tarmiel1, "Termiel", "Océano (大海 (たいかい), Taikai)", "A Tarmiel le fue otorgado la gracia Océano, que le permite transformarse al estado líquido, además de poder regenerarse. En el territorio divino, dimensión creada por las gracias, puede controlar el agua a voluntad."))

        return arcangeles
    }
}