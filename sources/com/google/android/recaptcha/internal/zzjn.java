package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzjn extends zzjl implements Queue {
    @Override // com.google.android.recaptcha.internal.zzjl
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    public abstract Queue zzd();

    @Override // java.util.Queue
    public final Object element() {
        return zzd().element();
    }

    public boolean offer(Object obj) {
        return zzd().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zzd().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zzd().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zzd().remove();
    }
}
