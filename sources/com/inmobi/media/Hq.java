package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import defpackage.kx0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Hq {
    public final ArrayList a;
    public final WeakReference b;

    public Hq(View view) {
        view.getClass();
        this.a = new ArrayList();
        this.b = new WeakReference(view);
        Y5.a.getClass();
        if (Y5.w()) {
            view.setOnApplyWindowInsetsListener(new kx0(this, 0));
        }
    }

    public static final WindowInsets a(Hq hq, View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        if (!hq.a.isEmpty()) {
            ArrayList arrayList = hq.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Lq lq = (Lq) ((Gq) obj);
                lq.getClass();
                lq.a.a(windowInsets);
                lq.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.a.clear();
        Y5.a.getClass();
        if (!Y5.w() || (view = (View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
