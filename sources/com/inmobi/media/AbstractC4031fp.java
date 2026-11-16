package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import defpackage.zs1;

/* JADX INFO: renamed from: com.inmobi.media.fp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4031fp {
    public static final boolean a(Context context, boolean z) {
        PowerManager powerManager;
        context.getClass();
        Object systemService = context.getSystemService("power");
        KeyguardManager keyguardManager = null;
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        } else {
            powerManager = null;
        }
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        if (systemService2 instanceof KeyguardManager) {
            keyguardManager = (KeyguardManager) systemService2;
        }
        if (keyguardManager == null) {
            return false;
        }
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        if (!powerManager.isInteractive() || (!z && zIsKeyguardLocked)) {
            return false;
        }
        return true;
    }

    public static final MediaPlayer a(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return zs1.m(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, C4119j2 c4119j2) {
        mediaPlayer.getClass();
        c4119j2.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(c4119j2.d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
