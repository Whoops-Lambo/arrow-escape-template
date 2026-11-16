package com.adsurge.adn.p069z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    static int a(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i != 3) {
            return i != 4 ? 3 : 7;
        }
        return 6;
    }
}
