package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbmo extends zzbmy {
    public static final int i;
    public static final int j;
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        i = Color.rgb(204, 204, 204);
        j = iRgb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final ArrayList zzb() {
        return this.c;
    }

    public zzbmo(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.a = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzbmr zzbmrVar = (zzbmr) list.get(i4);
            this.b.add(zzbmrVar);
            this.c.add(zzbmrVar);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = i;
        }
        this.d = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = j;
        }
        this.e = iIntValue2;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 12;
        }
        this.f = iIntValue3;
        this.g = i2;
        this.h = i3;
    }
}
