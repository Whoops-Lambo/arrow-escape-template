package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.hg4;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgso extends BroadcastReceiver implements zzgrr, zzghy {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void c(HashMap map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.c = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        return zzheh.c(this.b, new hg4(this, 10));
    }

    public zzgso(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }
}
