package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zziom implements zzavl {
    public static final zziox h = zziox.b(zziom.class);
    public final String a;
    public ByteBuffer d;
    public long e;
    public zzior g;
    public long f = -1;
    public boolean c = true;
    public boolean b = true;

    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            try {
                zziox zzioxVar = h;
                String str = this.a;
                zzioxVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.d = this.g.a(this.e, this.f);
                this.c = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            a();
            zziox zzioxVar = h;
            String str = this.a;
            zzioxVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null) {
                this.b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public zziom(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void b(zzior zziorVar, ByteBuffer byteBuffer, long j, zzavh zzavhVar) {
        this.e = zziorVar.zzc();
        byteBuffer.remaining();
        this.f = j;
        this.g = zziorVar;
        zziorVar.j(zziorVar.zzc() + j);
        this.c = false;
        this.b = false;
        d();
    }
}
