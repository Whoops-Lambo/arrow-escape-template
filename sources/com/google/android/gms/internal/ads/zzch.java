package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import defpackage.o14;
import defpackage.ra;
import defpackage.u14;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzch {
    public final AudioManager.OnAudioFocusChangeListener a;
    public final Handler b;
    public final zzd c;
    public final Object d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        return Objects.equals(this.a, zzchVar.a) && Objects.equals(this.b, zzchVar.b) && Objects.equals(this.c, zzchVar.c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }

    public zzch(o14 o14Var, Handler handler, zzd zzdVar, boolean z) {
        AudioFocusRequest audioFocusRequestBuild;
        this.b = handler;
        this.c = zzdVar;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.a = new ra(o14Var, handler);
        } else {
            this.a = o14Var;
        }
        if (i >= 26) {
            audioFocusRequestBuild = u14.f().setAudioAttributes(zzdVar.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(o14Var, handler).setAcceptsDelayedFocusGain(z).build();
        } else {
            audioFocusRequestBuild = null;
        }
        this.d = audioFocusRequestBuild;
    }
}
