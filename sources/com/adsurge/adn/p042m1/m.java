package com.adsurge.adn.p042m1;

import com.adsurge.adn.p045n1.a;
import com.adsurge.adn.p045n1.b;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class m implements h {
    public final String a;
    public final File b;
    public final long c;
    public final long d;
    public final b e;
    public int f;
    public String g;
    public a h;
    public AtomicBoolean i = new AtomicBoolean(false);
    public e j;

    /* JADX WARN: Code duplicated, block: B:27:0x00c3 A[PHI: r14
  0x00c3: PHI (r14v4 com.adsurge.adn.n1.a) = (r14v3 com.adsurge.adn.n1.a), (r14v13 com.adsurge.adn.n1.a) binds: [B:26:0x00c1, B:22:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adsurge.adn.p042m1.h
    public int a(c cVar) {
        a aVar;
        long length = this.b.length() + this.c;
        long length2 = this.d - this.b.length();
        if (length2 == 0) {
            cVar.a(this.b.length());
            return 0;
        }
        try {
            if (this.i.get()) {
                a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return 0;
            }
            a aVarA = this.e.a(this.a, length, length2, false);
            this.h = aVarA;
            if (!aVarA.b()) {
                this.f |= this.h.e();
                this.g = this.h.f();
            } else if (this.h.k()) {
                e eVar = new e(this.h, this.b, this.d);
                this.j = eVar;
                this.f = eVar.a(cVar) | this.f;
                this.g = this.j.a();
            } else {
                this.f |= 33554432;
                this.g = "RangeNotSupportForURL-" + this.a;
            }
            aVar = this.h;
            if (aVar != null) {
                aVar.a();
            }
            return this.f;
        } catch (Throwable th) {
            try {
                this.f |= 1;
                this.g = "UnknownExceptionWhileSubpartitionDoWork" + th.getMessage();
                th.toString();
                aVar = this.h;
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Throwable th2) {
                a aVar3 = this.h;
                if (aVar3 == null) {
                    throw th2;
                }
                aVar3.a();
                throw th2;
            }
        }
    }

    @Override // com.adsurge.adn.p042m1.h
    public int b() {
        return this.f;
    }

    public m(String str, File file, long j, long j2, b bVar) {
        this.a = str;
        this.b = file;
        this.c = j;
        this.d = j2;
        this.e = bVar;
    }

    @Override // com.adsurge.adn.p042m1.h
    public String a() {
        return this.g;
    }
}
