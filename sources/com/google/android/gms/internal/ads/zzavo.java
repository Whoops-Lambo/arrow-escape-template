package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import defpackage.jc1;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavo extends zzioo {
    public Date j;
    public Date k;
    public long l;
    public long m;
    public double n;
    public float o;
    public zzioy p;
    public long q;

    public zzavo() {
        super("mvhd");
        this.n = 1.0d;
        this.o = 1.0f;
        this.p = zzioy.j;
    }

    @Override // com.google.android.gms.internal.ads.zziom
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.i = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.b) {
            d();
        }
        if (this.i == 1) {
            this.j = zziot.a(zzavk.b(byteBuffer));
            this.k = zziot.a(zzavk.b(byteBuffer));
            this.l = zzavk.a(byteBuffer);
            this.m = zzavk.b(byteBuffer);
        } else {
            this.j = zziot.a(zzavk.a(byteBuffer));
            this.k = zziot.a(zzavk.a(byteBuffer));
            this.l = zzavk.a(byteBuffer);
            this.m = zzavk.a(byteBuffer);
        }
        this.n = zzavk.c(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.o = ((short) ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        zzavk.a(byteBuffer);
        zzavk.a(byteBuffer);
        this.p = new zzioy(zzavk.c(byteBuffer), zzavk.c(byteBuffer), zzavk.c(byteBuffer), zzavk.c(byteBuffer), zzavk.d(byteBuffer), zzavk.d(byteBuffer), zzavk.d(byteBuffer), zzavk.c(byteBuffer), zzavk.c(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.q = zzavk.a(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.j);
        sb.append(";modificationTime=");
        sb.append(this.k);
        sb.append(";timescale=");
        sb.append(this.l);
        sb.append(";duration=");
        sb.append(this.m);
        sb.append(";rate=");
        sb.append(this.n);
        sb.append(";volume=");
        sb.append(this.o);
        sb.append(";matrix=");
        sb.append(this.p);
        sb.append(";nextTrackId=");
        return jc1.m(this.q, C4664b4.j.e, sb);
    }
}
