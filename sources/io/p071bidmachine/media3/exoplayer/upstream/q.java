package io.p071bidmachine.media3.exoplayer.upstream;

import androidx.media3.common.C;
import defpackage.l83;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    public static final l83 g = new l83(20);
    public static final l83 h = new l83(21);
    public int d;
    public int e;
    public int f;
    public final p[] b = new p[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(int i, float f) {
        p pVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        p[] pVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            pVar = pVarArr[i4];
        } else {
            pVar = new p();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        pVar.a = i5;
        pVar.b = i;
        pVar.c = f;
        arrayList.add(pVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 + C.PRIORITY_PROCESSING_FOREGROUND;
            p pVar2 = (p) arrayList.get(0);
            int i8 = pVar2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    pVarArr[i9] = pVar2;
                }
            } else {
                pVar2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            p pVar = (p) arrayList.get(i3);
            i2 += pVar.b;
            if (i2 >= f) {
                return pVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) nj.h(1, arrayList)).c;
    }
}
