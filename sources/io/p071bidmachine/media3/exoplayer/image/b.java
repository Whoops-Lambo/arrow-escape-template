package io.p071bidmachine.media3.exoplayer.image;

import defpackage.hg2;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.decoder.c;
import io.p071bidmachine.media3.decoder.f;
import io.p071bidmachine.media3.exoplayer.analytics.d;
import io.p071bidmachine.media3.extractor.text.e;
import io.p071bidmachine.media3.extractor.text.i;
import io.p071bidmachine.media3.extractor.text.m;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements e, io.p071bidmachine.media3.decoder.b {
    public final hg2 a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final io.p071bidmachine.media3.decoder.e[] e;
    public final f[] f;
    public int g;
    public int h;
    public io.p071bidmachine.media3.decoder.e i;
    public c j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    @Override // io.p071bidmachine.media3.extractor.text.e
    public void setPositionUs(long j) {
    }

    public final c b(Throwable th) {
        switch (this.n) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new io.p071bidmachine.media3.extractor.text.f("Unexpected decode error", th);
        }
    }

    public final c c(io.p071bidmachine.media3.decoder.e eVar, f fVar, boolean z) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                a aVar = (a) fVar;
                try {
                    ByteBuffer byteBuffer = eVar.e;
                    byteBuffer.getClass();
                    a.i(byteBuffer.hasArray());
                    a.c(byteBuffer.arrayOffset() == 0);
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    ((d) obj).getClass();
                    aVar.e = d.a(bArrArray, iRemaining);
                    aVar.c = eVar.g;
                    return null;
                } catch (d e) {
                    return e;
                }
            default:
                i iVar = (i) eVar;
                io.p071bidmachine.media3.extractor.text.c cVar = (io.p071bidmachine.media3.extractor.text.c) fVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    m mVar = (m) obj;
                    if (z) {
                        mVar.reset();
                    }
                    io.p071bidmachine.media3.extractor.text.d dVarG = mVar.g(0, iLimit, bArrArray2);
                    long j = iVar.g;
                    long j2 = iVar.j;
                    cVar.c = j;
                    cVar.e = dVarG;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    cVar.f = j;
                    cVar.d = false;
                    return null;
                } catch (io.p071bidmachine.media3.extractor.text.f e2) {
                    return e2;
                }
        }
    }

    public final boolean d() {
        boolean z;
        c cVarB;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            io.p071bidmachine.media3.decoder.e eVar = (io.p071bidmachine.media3.decoder.e) this.c.removeFirst();
            f[] fVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            f fVar = fVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (eVar.d(4)) {
                fVar.a(4);
            } else {
                fVar.c = eVar.g;
                if (eVar.d(134217728)) {
                    fVar.a(134217728);
                }
                long j = eVar.g;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    fVar.d = true;
                }
                try {
                    cVarB = c(eVar, fVar, z2);
                } catch (OutOfMemoryError e) {
                    cVarB = b(e);
                } catch (RuntimeException e2) {
                    cVarB = b(e2);
                }
                if (cVarB != null) {
                    synchronized (this.b) {
                        this.j = cVarB;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || fVar.d) {
                        fVar.g();
                    } else {
                        this.d.addLast(fVar);
                    }
                    eVar.f();
                    io.p071bidmachine.media3.decoder.e[] eVarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    eVarArr[i2] = eVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // io.p071bidmachine.media3.decoder.b
    public final Object dequeueInputBuffer() {
        io.p071bidmachine.media3.decoder.e eVar;
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                a.i(this.i == null);
                int i = this.g;
                if (i == 0) {
                    eVar = null;
                } else {
                    io.p071bidmachine.media3.decoder.e[] eVarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    eVar = eVarArr[i2];
                }
                this.i = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // io.p071bidmachine.media3.decoder.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f dequeueOutputBuffer() {
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (f) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.p071bidmachine.media3.decoder.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void a(io.p071bidmachine.media3.decoder.e eVar) {
        synchronized (this.b) {
            try {
                c cVar = this.j;
                if (cVar != null) {
                    throw cVar;
                }
                a.c(eVar == this.i);
                this.c.addLast(eVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.p071bidmachine.media3.decoder.b
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                io.p071bidmachine.media3.decoder.e eVar = this.i;
                if (eVar != null) {
                    eVar.f();
                    io.p071bidmachine.media3.decoder.e[] eVarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    eVarArr[i] = eVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    io.p071bidmachine.media3.decoder.e eVar2 = (io.p071bidmachine.media3.decoder.e) this.c.removeFirst();
                    eVar2.f();
                    io.p071bidmachine.media3.decoder.e[] eVarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    eVarArr2[i2] = eVar2;
                }
                while (!this.d.isEmpty()) {
                    ((f) this.d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(f fVar) {
        synchronized (this.b) {
            fVar.f();
            f[] fVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            fVarArr[i] = fVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // io.p071bidmachine.media3.decoder.b
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.p071bidmachine.media3.decoder.b
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.b) {
            try {
                a.i(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(io.p071bidmachine.media3.decoder.e[] eVarArr, f[] fVarArr) {
        f aVar;
        io.p071bidmachine.media3.decoder.e eVar;
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = eVarArr;
        this.g = eVarArr.length;
        for (int i = 0; i < this.g; i++) {
            io.p071bidmachine.media3.decoder.e[] eVarArr2 = this.e;
            switch (this.n) {
                case 0:
                    eVar = new io.p071bidmachine.media3.decoder.e(1);
                    break;
                default:
                    eVar = new i(1);
                    break;
            }
            eVarArr2[i] = eVar;
        }
        this.f = fVarArr;
        this.h = fVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            f[] fVarArr2 = this.f;
            switch (this.n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new io.p071bidmachine.media3.extractor.text.c(this);
                    break;
            }
            fVarArr2[i2] = aVar;
        }
        hg2 hg2Var = new hg2(this, 2);
        this.a = hg2Var;
        hg2Var.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(m mVar) {
        this(new i[2], new io.p071bidmachine.media3.extractor.text.c[2]);
        this.n = 1;
        int i = this.g;
        io.p071bidmachine.media3.decoder.e[] eVarArr = this.e;
        a.i(i == eVarArr.length);
        for (io.p071bidmachine.media3.decoder.e eVar : eVarArr) {
            eVar.h(1024);
        }
        this.o = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        this(new io.p071bidmachine.media3.decoder.e[1], new a[1]);
        this.n = 0;
        this.o = dVar;
    }
}
