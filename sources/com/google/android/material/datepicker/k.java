package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ m b;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        j jVarA = materialCalendarGridView.a();
        if (i < jVarA.a() || i > jVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((DateValidatorPointForward) this.b.k.a.c.c).a) {
            throw null;
        }
    }

    public k(m mVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = mVar;
        this.a = materialCalendarGridView;
    }
}
