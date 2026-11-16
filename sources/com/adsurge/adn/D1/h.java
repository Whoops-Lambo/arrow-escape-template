package com.adsurge.adn.D1;

import com.adsurge.adn.x1.s;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class h implements b.InterfaceC0070b {
    public final int a;
    public final com.adsurge.adn.u1.c b;

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void b(String str, long j, long j2, long j3) {
        long jA = s.a(j2, j3);
        long jV0 = this.b.v0();
        long j4 = this.a / 8;
        com.adsurge.adn.w1.b.a(6000906, com.adsurge.adn.Y0.c.a(this.b), (Integer) null, new com.adsurge.adn.Y0.d().a("request_bitrate", Long.valueOf(jV0)).a("download_bitrate", Long.valueOf(jA)).a("video_preload_duration", Integer.valueOf((int) ((j4 == 0 ? Long.MAX_VALUE : j2 / j4) / 1000))));
        this.b.g(2);
    }

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void a(String str, long j, long j2) {
        long j3 = this.a / 8;
        if (j3 <= 0) {
            return;
        }
        this.b.f((int) ((j / j3) / 1000));
    }

    public h(int i, com.adsurge.adn.u1.c cVar) {
        this.a = i;
        this.b = cVar;
    }

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void a(String str, long j, long j2, long j3) {
    }

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void a(String str) {
        this.b.g(1);
        com.adsurge.adn.w1.b.a(6000909, com.adsurge.adn.Y0.c.a(this.b));
    }

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void a(String str, long j) {
    }

    @Override // com.adsurge.adn.D1.b.InterfaceC0070b
    public void a(String str, Exception exc) {
        exc.getMessage();
        com.adsurge.adn.w1.b.a(6000910, com.adsurge.adn.Y0.c.a(this.b));
        this.b.g(4);
    }
}
