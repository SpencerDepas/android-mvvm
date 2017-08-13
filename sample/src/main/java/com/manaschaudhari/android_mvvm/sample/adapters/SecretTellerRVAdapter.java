package com.manaschaudhari.android_mvvm.sample.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;
import com.manaschaudhari.android_mvvm.sample.R;
import com.manaschaudhari.android_mvvm.sample.model.SecretTeller;

import java.util.List;

/**
 * Created by SpencerDepas on 8/13/17.
 */

public class SecretTellerRVAdapter extends RecyclerView.Adapter<SecretTellerRVAdapter.CustomViewHolder> {


    private final @NonNull List<SecretTeller> secretTellers;


    public SecretTellerRVAdapter(@NonNull List<SecretTeller> secretTellers) {
        this.secretTellers = secretTellers;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       // ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.my_text_layout, viewGroup, false);

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.secretteller_rv_item, parent, false);
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        SecretTeller obj = secretTellers.get(position);
        holder.bind(obj);
    }


    @Override
    public int getItemCount() {
        return secretTellers.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        public CustomViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(SecretTeller item) {
            binding.setVariable(BR.secretTellers, item);
            binding.setVariable(BR.name, item.getName());
            binding.executePendingBindings();
        }
    }
}
