package com.adsurge.adn.Y0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class i extends b {
    public i(int i) {
        super(i);
    }

    public i b(long j) {
        a("du", Long.valueOf(j));
        if (com.adsurge.adn.J0.a.a && j > 86400000) {
            com.adsurge.adn.J0.a.b("PerformanceLog", "Performance Log duration too large, log = " + c().toString());
            com.adsurge.adn.I0.m.e("性能埋点 duration 值太大，请查看 Logcat！！！");
        }
        return this;
    }

    @Override // com.adsurge.adn.Y0.b
    public String b() {
        return "pi";
    }

    public i b(int i) {
        a("rs", Integer.valueOf(i));
        return this;
    }
}
