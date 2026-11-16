package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import defpackage.b43;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends RecyclerView.Adapter {
    public final CalendarConstraints j;
    public final d k;
    public final int l;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar calendarA = b43.a(this.j.a.a);
        calendarA.add(2, i);
        return new Month(calendarA).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        l lVar = (l) viewHolder;
        CalendarConstraints calendarConstraints = this.j;
        Calendar calendarA = b43.a(calendarConstraints.a.a);
        calendarA.add(2, i);
        Month month = new Month(calendarA);
        lVar.e.setText(month.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) lVar.f.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().a)) {
            new j(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public m(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, d dVar) {
        int dimensionPixelSize;
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.a.compareTo(month3.a) <= 0) {
            if (month3.a.compareTo(month2.a) <= 0) {
                int dimensionPixelSize2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * j.d;
                if (h.f(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    dimensionPixelSize = 0;
                }
                this.l = dimensionPixelSize2 + dimensionPixelSize;
                this.j = calendarConstraints;
                this.k = dVar;
                setHasStableIds(true);
                return;
            }
            defpackage.d.r("currentPage cannot be after lastPage");
            throw null;
        }
        defpackage.d.r("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (h.f(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.l));
            return new l(linearLayout, true);
        }
        return new l(linearLayout, false);
    }
}
