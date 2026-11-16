package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;

/* JADX INFO: renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3965de implements Fq {
    public final C3913bi a;
    public final C4191li b;
    public final Hd c;
    public final Gd d;
    public C3938cf e;

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        return this.d.a(d);
    }

    public C3965de(InMobiNative inMobiNative, Context context, long j) {
        inMobiNative.getClass();
        context.getClass();
        C3913bi c3913bi = new C3913bi();
        c3913bi.a = j;
        this.a = c3913bi;
        C3937ce c3937ce = new C3937ce(this);
        C4191li c4191li = new C4191li();
        this.b = c4191li;
        Hd hd = new Hd(inMobiNative, c4191li, c3937ce);
        this.c = hd;
        this.d = new Gd(context, c3913bi, hd);
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        return this.d.a(i, d);
    }
}
