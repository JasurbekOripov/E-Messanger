package uz.juo.e_messanger

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.juo.e_messanger.databinding.MessageItemBindingBinding


class RvAdapter() : ListAdapter<String, RvAdapter.RvViewHolder>(MyDiffUtil()) {
    inner class RvViewHolder(var itemBinding: MessageItemBindingBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun onBind(data: String, position: Int) {

        }
    }

    class MyDiffUtil : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        return RvViewHolder(
            MessageItemBindingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.onBind(getItem(position), position)
    }
}