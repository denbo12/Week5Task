 package com.denbofa.week5task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.denbofa.week5task.databinding.ProfileItemBinding

class ProfileAdapter(val users: List<ProfileModel>, private val listener: OnItemClickListener): RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    inner class ProfileViewHolder(val binding: ProfileItemBinding): RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        fun bind(user: ProfileModel) {
            binding.userSurname.text = user.userLastName
            binding.userOtherNames.text = user.userOtherNames
            binding.profilePic.setImageResource(user.UserPic)
        }

        init {
            binding.userSurname.setOnClickListener(this)
            binding.userOtherNames.setOnClickListener(this)
            binding.profilePic.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition

            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding: ProfileItemBinding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val user = users.get(position)
        holder.bind(user)
    }

}