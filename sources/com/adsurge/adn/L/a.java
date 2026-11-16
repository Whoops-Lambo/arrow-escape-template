package com.adsurge.adn.L;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum a {
    EXO_PLAYER("exo_player", 1),
    QUICK_JS("quick_js", 2),
    TURING("turing", 4);

    public final String a;
    public final int b;

    public String b() {
        return this.a;
    }

    a(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public int a(int i, boolean z) {
        return z ? i : this.b | i;
    }
}
