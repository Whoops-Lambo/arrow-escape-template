package defpackage;

import com.google.android.gms.internal.ads.zzckk;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h34 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ zzckk j;

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = q63.m("event", "precacheProgress");
        mapM.put("src", this.a);
        mapM.put("cachedSrc", this.b);
        mapM.put("bytesLoaded", Integer.toString(this.c));
        mapM.put("totalBytes", Integer.toString(this.d));
        mapM.put("bufferedDuration", Long.toString(this.e));
        mapM.put("totalDuration", Long.toString(this.f));
        mapM.put("cacheReady", true != this.g ? "0" : "1");
        mapM.put("playerCount", Integer.toString(this.h));
        mapM.put("playerPreparedCount", Integer.toString(this.i));
        this.j.q(mapM);
    }

    public h34(zzckk zzckkVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = zzckkVar;
    }
}
