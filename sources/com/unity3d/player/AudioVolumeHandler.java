package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import defpackage.ce3;
import defpackage.rd3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class AudioVolumeHandler {
    public ce3 a;

    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        ce3 ce3Var = new ce3(context);
        this.a = ce3Var;
        ce3Var.c = new rd3(new Handler(Looper.getMainLooper()), ce3Var.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ce3Var.c);
    }
}
