package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.media3.common.PlaybackException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Durian extends Thread {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Fig g;

    public Durian(Fig fig, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, Context context, AtomicReference atomicReference4, Object obj) {
        this.g = fig;
        this.a = atomicReference;
        this.b = atomicReference2;
        this.c = atomicReference3;
        this.d = context;
        this.e = atomicReference4;
        this.f = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String strA = "";
        try {
            strA = this.g.a((IBinder) this.a.get());
        } catch (Throwable unused) {
            this.b.set(Integer.valueOf(PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED));
        }
        this.c.set(strA);
        try {
            this.d.unbindService((ServiceConnection) this.e.get());
        } catch (Throwable unused2) {
            this.b.set(Integer.valueOf(PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED));
        }
        synchronized (this.f) {
            try {
                this.f.notifyAll();
            } catch (Throwable unused3) {
            }
        }
    }
}
