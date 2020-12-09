package com.example.aula_03_12_20_recyclerview


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nome: TextView?= itemView.findViewById(R.id.textView_nome)
    val email: TextView?= itemView.findViewById(R.id.textView_email)
    val contador: TextView?= itemView.findViewById(R.id.textView_id)


}