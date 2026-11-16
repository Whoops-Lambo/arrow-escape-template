package com.google.android.recaptcha.internal;

import defpackage.e32;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzpe zzpeVar = this.zza;
        return i < zzpeVar.zzb ? (zzpa) zzpeVar.zza[i] : (Map.Entry) zza().next();
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        if (i >= zzpeVar.zzb) {
            return !zzpeVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            e32.i("remove() was called before next()");
            return;
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        zzpe zzpeVar = this.zza;
        if (i >= zzpeVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzpeVar.zzm(i);
        }
    }
}
