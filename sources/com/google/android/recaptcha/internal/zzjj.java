package com.google.android.recaptcha.internal;

import defpackage.d;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    public static zzjj zza(int i) {
        return new zzjj(i);
    }

    @Override // com.google.android.recaptcha.internal.zzjl, com.google.android.recaptcha.internal.zzjm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjl
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    public final Queue zzd() {
        return this.zzb;
    }

    private zzjj(int i) {
        if (i >= 0) {
            this.zzb = new ArrayDeque(i);
            this.zza = i;
        } else {
            d.r(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
            throw null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i = size - this.zza;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            zzjf.zzb(z, "number to skip cannot be negative");
            return zzjq.zza(this, new zzjp(collection, i).iterator());
        }
        return zzjq.zza(this, collection.iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
