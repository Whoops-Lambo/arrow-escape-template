package com.adsurge.adn.p042m1;

import com.adsurge.adn.p045n1.a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class e implements h {
    public final a a;
    public final File b;
    public final long c;
    public String d;
    public int e;
    public a f;

    @Override // com.adsurge.adn.p042m1.h
    public int a(c cVar) {
        try {
            long length = this.c - this.b.length();
            if (length == 0 && this.c > 0) {
                cVar.a(this.b.length());
                return 0;
            }
            if (this.c <= 0) {
                this.f = new k(this.a.g(), this.b, cVar);
            } else {
                this.f = new j(this.a.g(), length, this.b, cVar);
            }
            this.e |= this.f.a();
            this.d = this.f.b();
            return this.e;
        } catch (IOException e) {
            this.e |= 4194304;
            this.d = "UnknownNetworkExceptionWhileDoMainPartitionDownloaderWork" + e.getMessage();
        } catch (IllegalStateException unused) {
            this.e |= 8388608;
            this.d = "IllegalStateExceptionWhileDoMainPartitionDownloaderWork";
        }
    }

    @Override // com.adsurge.adn.p042m1.h
    public int b() {
        return this.e;
    }

    public e(a aVar, File file, long j) {
        this.a = aVar;
        this.b = file;
        this.c = j;
    }

    @Override // com.adsurge.adn.p042m1.h
    public String a() {
        return this.d;
    }
}
