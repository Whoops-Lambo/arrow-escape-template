package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzjj {
    public final String a;
    public final zzv b;
    public final zzv c;
    public final int d;
    public final int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjj.class == obj.getClass()) {
            zzjj zzjjVar = (zzjj) obj;
            if (this.d == zzjjVar.d && this.e == zzjjVar.e && this.a.equals(zzjjVar.a) && this.b.equals(zzjjVar.b) && this.c.equals(zzjjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + ((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31)) * 31)) * 31);
    }

    public zzjj(String str, zzv zzvVar, zzv zzvVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            if (i2 == 0) {
                i2 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        zzgvz.a(z);
        zzgvz.a(true ^ TextUtils.isEmpty(str));
        this.a = str;
        this.b = zzvVar;
        zzvVar2.getClass();
        this.c = zzvVar2;
        this.d = i;
        this.e = i2;
    }
}
