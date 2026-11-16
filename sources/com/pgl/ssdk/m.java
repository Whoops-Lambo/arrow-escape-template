package com.pgl.ssdk;

import defpackage.h50;
import defpackage.jc1;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes7.dex */
public class m implements q {
    private final FileChannel a;
    private final long b;
    private final long c;

    private static void a(long j, long j2, long j3) {
        String strConcat;
        if (j < 0) {
            strConcat = "offset: ".concat(String.valueOf(j));
        } else if (j2 < 0) {
            strConcat = "size: ".concat(String.valueOf(j2));
        } else if (j <= j3) {
            long j4 = j + j2;
            if (j4 >= j) {
                if (j4 <= j3) {
                    return;
                }
                StringBuilder sbO = h50.o(j, "offset (", ") + size (");
                sbO.append(j2);
                sbO.append(") > source size (");
                sbO.append(j3);
                sbO.append(")");
                throw new IndexOutOfBoundsException(sbO.toString());
            }
            strConcat = jc1.m(j2, ") overflow", h50.o(j, "offset (", ") + size ("));
        } else {
            strConcat = jc1.m(j3, ")", h50.o(j, "offset (", ") > source size ("));
        }
        io.p071bidmachine.media3.extractor.ts.y.p(strConcat);
    }

    public m(FileChannel fileChannel, long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                this.a = fileChannel;
                this.b = j;
                this.c = j2;
                return;
            }
            io.p071bidmachine.media3.extractor.ts.y.p("size: ".concat(String.valueOf(j2)));
            throw null;
        }
        io.p071bidmachine.media3.extractor.ts.y.p("offset: ".concat(String.valueOf(j2)));
        throw null;
    }

    @Override // com.pgl.ssdk.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j, long j2) {
        long jA = a();
        a(j, j2, jA);
        if (j == 0 && j2 == jA) {
            return this;
        }
        return new m(this.a, this.b + j, j2);
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j, int i) {
        if (i < 0) {
            io.p071bidmachine.media3.extractor.ts.y.p("size: ".concat(String.valueOf(i)));
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        a(j, i, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public void a(long j, int i, ByteBuffer byteBuffer) {
        int i2;
        a(j, i, a());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.b + j;
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.a) {
                    this.a.position(j2);
                    i2 = this.a.read(byteBuffer);
                }
                j2 += (long) i2;
                i -= i2;
            }
            byteBuffer.limit(iLimit);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }
}
