package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pecados.*

class PecadosFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pecados, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pecados_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = PecadosAdapter(createData())
        }
    }

    fun createData(): ArrayList<Pecados>{
        val pecados = ArrayList<Pecados>()
        pecados.add(Pecados(R.drawable.meliodas, "Meliodas", "Ira", "Gragón", "Meliodas (メリオダス, Meriodasu) es el líder de los Siete Pecados Capitales. Él es el protagonista masculino de la historia, su pecado es la Ira y su símbolo el Dragón, también es el propietario del Boar Hat. Su tesoro sagrado es la Espada Demoníaca Lostvayne y su poder inherente es Full Counter. Hace tres mil años, Meliodas fue el líder de los Diez Mandamientos, un ex miembro de Stigma, y el hijo mayor del Rey Demonio. Es  el Rey de Liones en la actualidad."))
        pecados.add(Pecados(R.drawable.ban, "Ban", "Codicia", "Zorra", "Ban ( バ ン) es un miembro de los Siete Pecados Capitales, precisamente quien representa el pecado de la Codicia y además posee la marca del Zorro. Después de la disolución del grupo, Ban fue inicialmente encarcelado en Baste Dungeon, pero escapó cuando descubrió que Meliodas seguía vivo. Su tesoro sagrado es Courechouse. Además de ser inmortal, es conocido por su habilidad, Snatch."))
        pecados.add(Pecados(R.drawable.diane, "Diane", "Envidia", "Serpiente", "Diane (ディアンヌ, Diannu, en Hispanoamérica Diana) es una integrante de los Siete Pecados Capitales, representada por el pecado de la Envidia y además porta la marca de la Serpiente. Su tesoro sagrado es el Martillo de guerra Gideon."))
        pecados.add(Pecados(R.drawable.king, "King", "Pereza", "Grizzly", "Diane (ディアンヌ, Diannu, en Hispanoamérica Diana) es una integrante de los Siete Pecados Capitales, representada por el pecado de la Envidia y además porta la marca de la Serpiente. Su tesoro sagrado es el Martillo de guerra Gideon."))
        pecados.add(Pecados(R.drawable.gowtherbueno, "Gowther", "Lujuria", "Cabra", "Gowther (ゴウセル, Gouseru) es una marioneta creada por un gran mago que actuaba para él como una forma para comunicarse y servir como antiguo miembro de los Diez Mandamientos siendo el Desinterés, sin embargo, perdió todos sus recuerdos y sentimientos debido al efecto de su propio mandamiento. Actualmente es miembro de los Siete Pecados Capitales. Su Pecado es de la Lujuria y su marca es de la Cabra."))
        pecados.add(Pecados(R.drawable.merlin, "Merlin", "Gula", "Jabalí", "Merlin (マーリン, Mārin) Es una de los miembros de los Siete Pecados Capitales originaria de Belialuin, representada por el pecado de la gula y su marca es la del Jabalí. Es conocida por ser la maga más grande de toda Britannia. El nombre Merlin es realmente un alias, su nombre real es desconocido y no puede ser pronunciado por humanos."))
        pecados.add(Pecados(R.drawable.escanor, "Escanor", "Soberbia", "León", "Escanor (エスカノール, Esukanōru) Fué miembro de los Siete Pecados Capitales. Su Pecado es la Soberbia junto al símbolo del León . Además era el príncipe del Reino de Castellio ."))
        pecados.add(Pecados(R.drawable.elizabeth, "Elizabeth Liones", "NA", "NA", "Elizabeth Liones (エリザベス·リオネス, Erizabesu · Rionesu ) es la tercera princesa del Reino de Liones y la reencarnación actual de la Diosa Elizabeth. Es la protagonista femenina de la serie y trabaja de camarera en el bar de Meliodas, el Sombrero de Jabalí cuando se une a Meliodas en su viaje para encontrar a los Siete Pecados Capitales. Zaneri  menciona que Elizabeth es, de hecho, la reencarnación de la amante pasada de Meliodas, Liz, que murió 16 años antes del comienzo de la historia; y más tarde revelado por Zeldris, es la actual de muchas reencarnaciones de la Diosa Elizabeth, la amante de Meliodas hace 3.000 años. Actualmente es la reina del Reino de Liones."))

        return pecados
    }
}