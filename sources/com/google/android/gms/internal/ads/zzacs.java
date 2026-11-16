package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import defpackage.km3;
import defpackage.sl3;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacs {
    public int d;
    public int e;
    public int f;
    public final km3[] b = new km3[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f, int i) {
        km3 km3Var;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, sl3.e);
            this.c = 1;
        }
        int i3 = this.f;
        km3[] km3VarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            km3Var = km3VarArr[i4];
        } else {
            km3Var = new km3();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        km3Var.a = i5;
        km3Var.b = i;
        km3Var.c = f;
        arrayList.add(km3Var);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 + C.PRIORITY_PROCESSING_FOREGROUND;
            km3 km3Var2 = (km3) arrayList.get(0);
            int i8 = km3Var2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    km3VarArr[i9] = km3Var2;
                }
            } else {
                km3Var2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, sl3.d);
            this.c = 0;
        }
        float f = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float f2 = 0.5f * f;
            km3 km3Var = (km3) arrayList.get(i3);
            i2 += km3Var.b;
            if (i2 >= f2) {
                return km3Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((km3) arrayList.get(arrayList.size() - 1)).c;
    }
}
