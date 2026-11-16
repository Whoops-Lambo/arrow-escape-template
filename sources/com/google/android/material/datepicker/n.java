package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import defpackage.b43;
import defpackage.g93;
import defpackage.uf1;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.Adapter {
    public final g j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.c.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        g93 g93Var = (g93) viewHolder;
        g gVar = this.j;
        int i2 = gVar.c.a.c + i;
        g93Var.e.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = g93Var.e;
        Context context = textView.getContext();
        textView.setContentDescription(b43.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        uf1 uf1Var = gVar.f;
        if (b43.b().get(1) == i2) {
            Object obj = uf1Var.c;
        } else {
            Object obj2 = uf1Var.b;
        }
        throw null;
    }

    public n(g gVar) {
        this.j = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new g93((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
