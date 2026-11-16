package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzgim {
    ListenableFuture a(Context context, String str, View view);

    void b(InputEvent inputEvent);

    ListenableFuture c(Context context, View view, Activity activity);

    ListenableFuture d(Context context);

    String zza();

    ListenableFuture zzb();

    int zzg();
}
