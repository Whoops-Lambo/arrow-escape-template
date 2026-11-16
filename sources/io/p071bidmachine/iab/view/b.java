package io.p071bidmachine.iab.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import defpackage.d31;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.common.t0;
import io.p071bidmachine.media3.common.x0;
import io.p071bidmachine.media3.ui.TrackSelectionView;
import io.p071bidmachine.media3.ui.m0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ b(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                a aVar = ((d) viewGroup).e;
                if (aVar != null) {
                    aVar.b();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) viewGroup;
                HashMap map = trackSelectionView.g;
                boolean z = true;
                if (view == trackSelectionView.c) {
                    trackSelectionView.l = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    map.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    m0 m0Var = (m0) tag;
                    x0 x0Var = m0Var.a;
                    s0 s0Var = x0Var.b;
                    int i2 = m0Var.b;
                    t0 t0Var = (t0) map.get(s0Var);
                    if (t0Var == null) {
                        if (!trackSelectionView.i && map.size() > 0) {
                            map.clear();
                        }
                        map.put(s0Var, new t0(s0Var, d31.E(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(t0Var.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.h && x0Var.c;
                        if (!z2 && (!trackSelectionView.i || trackSelectionView.f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(s0Var);
                            } else {
                                map.put(s0Var, new t0(s0Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(s0Var, new t0(s0Var, arrayList));
                            } else {
                                map.put(s0Var, new t0(s0Var, d31.E(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
