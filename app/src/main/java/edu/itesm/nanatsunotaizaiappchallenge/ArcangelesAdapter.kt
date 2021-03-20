package edu.itesm.nanatsunotaizaiappchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ArcangelesAdapter(private val arcangeles: List<Arcangeles>) : RecyclerView.Adapter<ArcangelesAdapter.ArcangelViewHolder>() {

    inner class ArcangelViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var movie = renglon.findViewById<TextView>(R.id.movie)
        var info = renglon.findViewById<TextView>(R.id.info)
        var photo = renglon.findViewById<ImageView>(R.id.photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArcangelViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.arcangel_renglon,parent, false)
        return ArcangelViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: ArcangelViewHolder, position: Int) {
        val arcangel = arcangeles[position]
        holder.photo.setImageResource(arcangel.photo)
        holder.name.text = arcangel.name
        holder.movie.text = arcangel.gracia
        holder.info.text = arcangel.info
        holder.itemView.setOnClickListener{
            val action = ArcangelesFragmentDirections.actionArcangelesFragmentToArcangelFragment(arcangel)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return arcangeles.size
    }
}