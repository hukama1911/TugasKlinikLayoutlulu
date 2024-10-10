package com.example.klinikapp_mi2c.Adapter

import androidx.appcompat.view.menu.ListMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.klinikapp_mi2c.Model.ModelListDoctors

class ListDoctorAdapter (
    val itemDoctorList: List<ModelListDoctors>
): RecyclerView.Adapter<ListDoctorAdapter.MyViewHolder>(){

    class MyViewHolder (itemView: ListMenuItemView)
}