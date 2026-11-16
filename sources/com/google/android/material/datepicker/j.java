package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ecffri.arrows.R;
import defpackage.b43;
import defpackage.uf1;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends BaseAdapter {
    public static final int d = b43.c(null).getMaximum(4);
    public static final int e = (b43.c(null).getMaximum(7) + b43.c(null).getMaximum(5)) - 1;
    public final Month a;
    public uf1 b;
    public final CalendarConstraints c;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final int a() {
        int firstDayOfWeek = this.c.e;
        Month month = this.a;
        Calendar calendar = month.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.d : i2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    public j(Month month, CalendarConstraints calendarConstraints) {
        this.a = month;
        this.c = calendarConstraints;
        throw null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i >= a() && i <= c()) {
            int iA = (i - a()) + 1;
            Calendar calendarA = b43.a(this.a.a);
            calendarA.set(5, iA);
            return Long.valueOf(calendarA.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new uf1(context, 2);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i - a();
        if (iA >= 0) {
            Month month = this.a;
            if (iA < month.e) {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            } else {
                textView.setVisibility(8);
                textView.setEnabled(false);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        b43.b().getTimeInMillis();
        throw null;
    }
}
