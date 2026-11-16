package com.adsurge.adn.p060u0;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends ViewGroup.MarginLayoutParams {
    public static int a(int i) {
        if (i < 0) {
            if (i == -1) {
                return -1;
            }
            if (i == -2) {
                return -2;
            }
        }
        return i;
    }

    public e(d dVar) {
        super(a(dVar.f()), a(dVar.g()));
        ((ViewGroup.MarginLayoutParams) this).topMargin = dVar.o();
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = dVar.i();
        ((ViewGroup.MarginLayoutParams) this).leftMargin = dVar.k();
        ((ViewGroup.MarginLayoutParams) this).rightMargin = dVar.a();
    }
}
