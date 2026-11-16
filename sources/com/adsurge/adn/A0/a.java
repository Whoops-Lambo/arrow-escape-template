package com.adsurge.adn.A0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static Class a;
    public static Class b;

    static {
        try {
            int i = RecyclerView.HORIZONTAL;
            a = RecyclerView.class;
            int i2 = RecyclerView.LayoutParams.e;
        } catch (ClassNotFoundException unused) {
            a = null;
        }
        try {
            b = Class.forName("android.support.v7.widget.RecyclerView");
        } catch (ClassNotFoundException unused2) {
            b = null;
        }
    }

    public static boolean a() {
        return a != null;
    }
}
