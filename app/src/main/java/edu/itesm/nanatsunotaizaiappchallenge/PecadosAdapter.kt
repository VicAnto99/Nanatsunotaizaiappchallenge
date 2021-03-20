package edu.itesm.nanatsunotaizaiappchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class PecadosAdapter(private val pecados: List<Pecados>) : RecyclerView.Adapter<PecadosAdapter.PecadosViewHolder>(){

    inner class PecadosViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var movie = renglon.findViewById<TextView>(R.id.movie)
        var sim = renglon.findViewById<TextView>(R.id.simbolo)
        var info = renglon.findViewById<TextView>(R.id.info)
        var photo = renglon.findViewById<ImageView>(R.id.photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PecadosAdapter.PecadosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.pecado_renglon, parent,false)
        return PecadosViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: PecadosViewHolder, position: Int) {
        val pecado = pecados[position]
        holder.photo.setImageResource(pecado.photo)
        holder.name.text = pecado.name
        holder.movie.text = pecado.pecado
        holder.sim.text = pecado.simbolo
        holder.info.text = pecado.info
        holder.itemView.setOnClickListener{
            val action = PecadosFragmentDirections.actionPecadosFragmentToPecadoFragment(pecado)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return pecados.size
    }
}