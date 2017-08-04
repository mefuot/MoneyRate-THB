package com.pong.moneyrate.feature.exchange.list.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pong.moneyrate.R;
import com.pong.moneyrate.model.ExchangeDetail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 31/7/2560.
 */

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.ExchangeViewHolder> {

    public interface OnItemSelectedListener {
        void onSelected(int position);
    }

    private List<ExchangeDetail> list;
    private OnItemSelectedListener listener;

    public ExchangeAdapter() {
        this.list = new ArrayList<>();
    }

    public void setData(@NonNull Collection<ExchangeDetail> newList) {
        if (!newList.isEmpty()) {
            list.clear();
            list.addAll(newList);
            notifyDataSetChanged();
        }
    }

    public void setOnItemSelectedListener(@NonNull OnItemSelectedListener listener) {
        this.listener = listener;
    }

    public ExchangeDetail getItem(int position) {
        return list.get(position);
    }

    @Override
    public ExchangeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exchange_rate_row, parent, false);
        return new ExchangeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExchangeViewHolder holder, int position) {
        ExchangeDetail item = list.get(position);

        if (item != null) {
            holder.textForeignMidRate.setText(item.getCurrencyId() + " " + item.getMidRate());
            holder.setSelectedListener(listener);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ExchangeViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.icon_exchange_list_item_foreign_flag)
        ImageView iconForeignFlag;
        @BindView(R.id.text_exchange_list_item_foreign_mid_rate)
        TextView textForeignMidRate;
        @BindView(R.id.layout_exchange_list_item_row)
        LinearLayout mLayoutExchangeListItemRow;

        ExchangeViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void setSelectedListener(final OnItemSelectedListener listener) {
            mLayoutExchangeListItemRow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onSelected(getAdapterPosition());
                    }
                }
            });
        }
    }
}
