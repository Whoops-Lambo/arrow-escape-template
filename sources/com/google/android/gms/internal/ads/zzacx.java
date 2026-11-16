package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import defpackage.bf3;
import defpackage.na0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzacx {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final na0 d;

    public zzacx(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerA;
        if (context == null) {
            audioManagerA = null;
        } else {
            audioManagerA = zzcj.a(context);
        }
        if (audioManagerA != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerA.getSpatializer();
            this.a = spatializer;
            this.b = spatializer.getImmersiveAudioLevel() != 0;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            Handler handler = new Handler(looperMyLooper);
            this.c = handler;
            na0 na0Var = new na0(this, runnable);
            this.d = na0Var;
            spatializer.addOnSpatializerStateChangedListener(new bf3(handler, 1), na0Var);
            return;
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
