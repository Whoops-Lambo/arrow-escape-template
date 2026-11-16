package defpackage;

import com.google.android.gms.internal.ads.zzckh;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d34 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zzckh e;

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = q63.m("event", "precacheProgress");
        mapM.put("src", this.a);
        mapM.put("cachedSrc", this.b);
        mapM.put("bytesLoaded", Integer.toString(this.c));
        mapM.put("totalBytes", Integer.toString(this.d));
        mapM.put("cacheReady", "0");
        this.e.q(mapM);
    }

    public d34(zzckh zzckhVar, String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = zzckhVar;
    }
}
