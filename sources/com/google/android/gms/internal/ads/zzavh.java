package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import defpackage.dr0;
import defpackage.gl0;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzavh implements zzavi {
    public static final Logger b = Logger.getLogger(zzavh.class.getName());
    public final gl0 a = new gl0(3);

    public abstract zzavl b(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzavi
    public final zzavl a(zzior zziorVar, zzioq zzioqVar) throws EOFException {
        int iP0;
        long jZzb;
        long jZzc = zziorVar.zzc();
        gl0 gl0Var = this.a;
        ((ByteBuffer) gl0Var.get()).rewind().limit(8);
        do {
            iP0 = zziorVar.p0((ByteBuffer) gl0Var.get());
            if (iP0 == 8) {
                ((ByteBuffer) gl0Var.get()).rewind();
                long jA = zzavk.a((ByteBuffer) gl0Var.get());
                if (jA < 8 && jA > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jA);
                    sb.append("). Stop parsing!");
                    b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) gl0Var.get()).get(bArr);
                try {
                    String str = new String(bArr, C.ISO88591_NAME);
                    if (jA == 1) {
                        ((ByteBuffer) gl0Var.get()).limit(16);
                        zziorVar.p0((ByteBuffer) gl0Var.get());
                        ((ByteBuffer) gl0Var.get()).position(8);
                        jZzb = zzavk.b((ByteBuffer) gl0Var.get()) - 16;
                    } else if (jA == 0) {
                        jZzb = zziorVar.zzb() - zziorVar.zzc();
                    } else {
                        jZzb = jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) gl0Var.get()).limit(((ByteBuffer) gl0Var.get()).limit() + 16);
                        zziorVar.p0((ByteBuffer) gl0Var.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) gl0Var.get()).position() - 16; iPosition < ((ByteBuffer) gl0Var.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) gl0Var.get()).position() - 16)] = ((ByteBuffer) gl0Var.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j = jZzb;
                    if (zzioqVar instanceof zzavl) {
                    }
                    zzavl zzavlVarB = b(str);
                    ((ByteBuffer) gl0Var.get()).rewind();
                    zzavlVarB.b(zziorVar, (ByteBuffer) gl0Var.get(), j, this);
                    return zzavlVarB;
                } catch (UnsupportedEncodingException e) {
                    dr0.m(e);
                    return null;
                }
            }
        } while (iP0 >= 0);
        zziorVar.j(jZzc);
        defpackage.d.s();
        return null;
    }
}
