package edu.itesm.nanatsunotaizaiappchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class MandamientosAdapter(private val mandamientos: List<Mandamientos>) : RecyclerView.Adapter<MandamientosAdapter.MandamientoViewHolder>() {

    inner class MandamientoViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var movie = renglon.findViewById<TextView>(R.id.movie)
        var info = renglon.findViewById<TextView>(R.id.info)
        var photo = renglon.findViewById<ImageView>(R.id.photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MandamientoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.mandamiento_renglon,parent, false)
        return MandamientoViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: MandamientoViewHolder, position: Int) {
        val mandamiento = mandamientos[position]
        holder.photo.setImageResource(mandamiento.photo)
        holder.name.text = mandamiento.name
        holder.movie.text = mandamiento.mandamiento
        holder.info.text = mandamiento.info
        holder.itemView.setOnClickListener{
            val action = MandamientosFragmentDirections.actionMandamientosFragmentToMandamientoFragment(mandamiento)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return mandamientos.size
    }
}