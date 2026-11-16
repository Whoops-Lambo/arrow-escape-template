package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {
    public final Uri a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h b;
    public final n c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o e;
    public volatile boolean f;
    public boolean g;
    public long h;
    public long i;
    public final /* synthetic */ p j;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws Throwable {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        int iA = 0;
        while (iA == 0 && !this.f) {
            try {
                long j = this.e.a;
                long jA = this.b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.a, j, j, -1L, this.j.h, 0));
                this.i = jA;
                if (jA != -1) {
                    this.i = jA + j;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j, this.i);
                try {
                    n nVar = this.c;
                    hVar.a();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVarA = nVar.a(bVar);
                    if (this.g) {
                        iVarA.a(j, this.h);
                        this.g = false;
                    }
                    while (iA == 0 && !this.f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.d;
                        synchronized (eVar) {
                            while (!eVar.a) {
                                try {
                                    eVar.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        iA = iVarA.a(bVar, this.e);
                        long j2 = bVar.c;
                        if (j2 > 1048576 + j) {
                            this.d.a();
                            p pVar = this.j;
                            pVar.n.post(pVar.m);
                            j = j2;
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else {
                        this.e.a = bVar.c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b);
                } catch (Throwable th2) {
                    th = th2;
                    if (iA != 1 && bVar != null) {
                        this.e.a = bVar.c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
        }
    }

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.j = pVar;
        uri.getClass();
        this.a = uri;
        hVar.getClass();
        this.b = hVar;
        nVar.getClass();
        this.c = nVar;
        this.d = eVar;
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.g = true;
        this.i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f;
    }
}
