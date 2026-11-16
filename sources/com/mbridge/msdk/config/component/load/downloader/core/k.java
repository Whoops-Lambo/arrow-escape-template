package com.mbridge.msdk.config.component.load.downloader.core;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class k implements m {
    private final com.mbridge.msdk.config.component.load.downloader.database.c a;
    private final String b;
    private final com.mbridge.msdk.config.component.load.downloader.database.b c;
    private final d d;
    private com.mbridge.msdk.config.component.load.downloader.b e;

    private void a(com.mbridge.msdk.config.component.load.downloader.c cVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.d.b(this.c.k());
        this.d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.c.f(), file.getAbsolutePath(), this.c.d(), this.c.n(), jLastModified, this.c.k(), this.c.g(), this.c.e(), this.c.c(), this.c.j(), this.c.h(), this.c.b(), this.c.a()), this.e.h());
        cVar.b(a(length));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        File file = new File(this.e.h());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.d.a(0L);
            cVar.b(false);
            return cVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        long jK = this.c.k();
        if (jK > 0 && jC != jK) {
            a(cVar, file);
            return cVar;
        }
        this.d.b(jK);
        this.d.a(jK != 0 ? jC : this.c.g());
        cVar.b(a(jC));
        return cVar;
    }

    private k(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.d = dVar;
        this.c = bVar;
        this.a = cVar;
        this.b = str;
        this.e = bVar2;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    private boolean a(long j) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.c.k(), j) >= this.e.e();
    }
}
