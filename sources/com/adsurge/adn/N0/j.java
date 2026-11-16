package com.adsurge.adn.N0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class j extends e {
    public static final int h = e.a("IHDR");
    public int e;
    public int f;
    public byte[] g = new byte[5];

    @Override // com.adsurge.adn.N0.e
    public void a(com.adsurge.adn.O0.a aVar) {
        this.e = aVar.f();
        this.f = aVar.f();
        byte[] bArr = this.g;
        aVar.read(bArr, 0, bArr.length);
    }
}
