package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_mandamientos.*

class MandamientosFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mandamientos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mandamiento_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MandamientosAdapter(createData())
        }
    }

    fun createData(): ArrayList<Mandamientos>{
        val mandamientos = ArrayList<Mandamientos>()
        mandamientos.add(Mandamientos(R.drawable.meliodas, "Meliodas", "Ira", "Meliodas (メリオダス, Meriodasu) es el líder de los Siete Pecados Capitales. Él es el protagonista masculino de la historia, su pecado es la Ira y su símbolo el Dragón, también es el propietario del Boar Hat. Su tesoro sagrado es la Espada Demoníaca Lostvayne y su poder inherente es Full Counter. Hace tres mil años, Meliodas fue el líder de los Diez Mandamientos, un ex miembro de Stigma, y el hijo mayor del Rey Demonio. Es  el Rey de Liones en la actualidad."))
        mandamientos.add(Mandamientos(R.drawable.zeldris, "Zeldris", "Piedad", "Zeldris (ゼルドリス, Zerudorisu) es un demonio  ex-miembro de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. También fue el representante del Rey Demonio, así como su hijo menor. Fue uno de los antagonistas principales de la serie hasta que decide traicionar a su padre y luchar  contra él junto con los Siete Pecados Capitales."))
        mandamientos.add(Mandamientos(R.drawable.estarossa, "Estarossa", "Amor", "Mael (マエル, Maeru) es uno de los Cuatro Arcángeles del Clan de las Diosas. Hace 3000 años, cierta persona modificó las memorias de todas las demás personas, haciendo que se creyera que el arcángel era el segundo hijo del Rey Demonio, bajo el nombre de Estarossa (エスタロッサ, Esutarossa)."))
        mandamientos.add(Mandamientos(R.drawable.calmadios, "Calmadios", "Piedad", "Calmadios (カルマディオス, Karumadiosu) era un demonio que hace tres mil años formó parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Calmadios poseía seis brazos y era aproximadamente del mismo tamaño de Drole. En sus brazos superiores y correctamente posicionados poseía un brazalete en cada uno. Llevaba una máscara con cuernos sobre su cara y un taparrabos oscuro sostenido por una hebilla de metal."))
        mandamientos.add(Mandamientos(R.drawable.derrierie, "Derieri", "Pureza", "Derieri (デリエリ, Derieri) es una miembro del Clan de los Demonios que forma parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Derieri es una mujer alta y entonada con el pelo largo de punta de color naranja. No posee ropa, en su lugar cubre su pecho y partes personales con la materia oscura. Posee la marca del Clan de los Demonios en su mejilla izquierda, que se asemeja a una boca abierta con un círculo en medio. Después de su batalla contra Nerobasta, el cabello de Derieri se vuelve significativamente más corto y chistoso. Posteriormente Monspeet lo arreglaría para ella."))
        mandamientos.add(Mandamientos(R.drawable.drole, "Drole", "Paciencia", "Drole (ドロール, Dorōru) quien era conocido por los humanos como Balor (バロール, Barōru) era un miembro del Clan de los Gigantes que formó parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. De acuerdo con las leyendas del Clan de los Gigantes, Drole era su ancestro siendo reconocido como un dios por algunos, además de ser el creador de la danza que sacudió la tierra."))
        mandamientos.add(Mandamientos(R.drawable.fraudrin, "Fraidrin", "Desinterés", "Fraudrin (フラウドリン, Furaudorin) era un demonio que había estado usando el cuerpo de Dreyfus como recipiente en los últimos 10 años. También era el miembro sustituto de Gowther en los Diez Mandamientos. Su verdadera forma era monstruosa y de color púrpura con una gran estatura, además de estar repleto de escamas. Poseía varias protuberancias puntiagudas en su espalda y brazos cónicos que se asemejaban a unas agujas. Su boca se encuentraba en su pecho en lugar de su rostro, en el cual poseía su marca oscura."))
        mandamientos.add(Mandamientos(R.drawable.galan, "Galan", "Verdad", "Galand (ガラン, Garan) era un demonio miembro de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Galand era un humanoide bastante alto y delgado. A diferencia del resto de los Diez Mandamientos, el cuerpo de Galand parece ser completamente una armadura de un color verde antiguo (rojo en el anime), cuya cabeza tiene varias similitudes con el de Golgius, es decir con ojos claros (verdes en el anime) rasgados similares a los de un gato, dos filosos cuernos a los lados de su cabeza y uno extra que le sirve como barbilla, además de que posee unos dientes afilados y en su pecho tiene una especie de esfera de color rojo oscuro (morado en el anime)."))
        mandamientos.add(Mandamientos(R.drawable.gloxinia, "Gloxinia", "Reposo", "Gloxinia (グロキシニア, Gurokishinia) fue el Primer Rey Hada del Bosque del Rey Hada, sin embargo, abandonó el título. Formó parte de los Diez Mandamientos del Clan de los Demonios como el Reposo. Gloxinia poseía ojos claros (negros con la marca del Clan de los Demonios) y un cabello largo de color rojo, así como unas orejas puntiagudas, generalmente era visto rodeado por Basquias en su forma de tentáculos de pulpo verdes. Cuando no estaba rodeado por su arma, se podían observar dos grandes alas de distintos colores similares a las de las mariposas, anteriormente poseía el símbolo del Clan de los Demonios en el pecho izquierdo y una banda de flores en la muñeca. Llevaba también pantalones anchos con diseño de alas de mariposa en los bordes inferiores."))
        mandamientos.add(Mandamientos(R.drawable.gowther, "Gowther", "Desinterés", "Gowther (ゴウセル, Gouseru) era un demonio que formó parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio, quien forzosamente le entregó el Mandamiento del Desinterés y fue atrapado en una prisión demoníaca por quinientos años. Mientras se encontraba aprisionado, su único contacto con el mundo exterior era a través de Gowther, un muñeco que él creó."))
        mandamientos.add(Mandamientos(R.drawable.grayroad, "Grayroad", "Pacifismo", "Grayroad (グレイロード, Gureirōdo) es una miembro del Clan de los Demonios que forma parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Grayroad es un Demonio Gris mutado. Aunque Fraudrin señala que los demonios inferiores no son masculinos ni femeninos, se refiere a Grayroad como femenina, debido a su nivel único de poder y habilidades. Se muestra como una criatura amorfa cuyo cuerpo está cubierto de su Materia Oscura y sus múltiples caras son todas capaces de hablar. Debajo de la oscuridad que oculta su forma, Grayroad se compone de numerosos demonios grises de pequeño tamaño, cada uno de los cuales son capaces de hablar y moverse libremente."))
        mandamientos.add(Mandamientos(R.drawable.melascula, "Melascula", "Fe", "Melascula (メラスキュラ, Merasukyura) es una miembro del Clan de los Demonios que forma parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Melascula tiene el aspecto de una joven mujer. Posee un largo cabello color rosado que le llega a los muslos y su vestimenta consta de una especie de leotardo blanco con un lazo rosado en el cuello, éste deja al descubierto sus piernas, las cuales cubre con unas medias largas color rosado que le llegan un poco más arriba de las rodillas."))
        mandamientos.add(Mandamientos(R.drawable.monspeet, "Monspeet", "Reticencia", "Monspeet (モンスピート, Monsupīto) era un miembro del Clan de los Demonios que formó parte de los Diez Mandamientos, guerreros de élite del Clan de los Demonios elegidos personalmente por el Rey Demonio. Monspeet era un hombre con el cabello color púrpura un pequeño bigote y la marca del Clan de los Demonios en la mejilla derecha. Llevaba una capa que cubría la mayor parte de su cuerpo y por debajo de esta no llevaba ningún tipo de camisa, puesto que su brazo y torso estaban cubiertos por la materia oscura. También poseía un cinturón que sostenía su pantalón de color verde. Además poseía musculatura en su cuerpo, llevaba unas botas doradas con tacón que le cubrían un poco más arriba de la rodilla."))

        return mandamientos
    }
}