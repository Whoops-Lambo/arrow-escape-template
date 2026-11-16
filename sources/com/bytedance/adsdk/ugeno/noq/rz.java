package com.bytedance.adsdk.ugeno.noq;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz {
    int at;
    int ct;
    int dg;
    int fi;
    int gf;
    int noq;
    float nu;
    float ra;
    int twf;
    boolean um;
    int vs;
    boolean xh;
    int yo;
    int kgy = Integer.MAX_VALUE;
    int ahm = Integer.MAX_VALUE;
    int rz = Integer.MIN_VALUE;
    int uq = Integer.MIN_VALUE;
    List<Integer> kus = new ArrayList();

    public int ahm() {
        return this.fi - this.gf;
    }

    public void kgy(View view, int i, int i2, int i3, int i4) {
        ahm ahmVar = (ahm) view.getLayoutParams();
        this.kgy = Math.min(this.kgy, (view.getLeft() - ahmVar.twf()) - i);
        this.ahm = Math.min(this.ahm, (view.getTop() - ahmVar.kus()) - i2);
        this.rz = Math.max(this.rz, ahmVar.vs() + view.getRight() + i3);
        this.uq = Math.max(this.uq, ahmVar.dg() + view.getBottom() + i4);
    }

    public int kgy() {
        return this.yo;
    }
}
