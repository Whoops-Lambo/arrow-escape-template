package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Runnable {
    public final WeakReference a;

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        dVar.b();
        if (!dVar.i.get() || (mediaPlayer = dVar.g) == null || !mediaPlayer.isPlaying() || dVar.q) {
            return;
        }
        dVar.w.postDelayed(this, 1000L);
    }

    public a(d dVar) {
        dVar.getClass();
        this.a = new WeakReference(dVar);
    }
}
