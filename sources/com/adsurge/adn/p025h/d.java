package com.adsurge.adn.p025h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum d {
    USER_ACTION_TYPE_UNKNOWN(0),
    USER_ACTION_TYPE_IMPRESSION(1),
    USER_ACTION_TYPE_CLICK(2),
    USER_ACTION_TYPE_CLOSE_AD(3),
    USER_ACTION_TYPE_STAY_DURATION(4);

    public final int a;

    public int b() {
        return this.a;
    }

    d(int i) {
        this.a = i;
    }

    public static d a(int i) {
        for (d dVar : values()) {
            if (dVar.a == i) {
                return dVar;
            }
        }
        return USER_ACTION_TYPE_UNKNOWN;
    }
}
