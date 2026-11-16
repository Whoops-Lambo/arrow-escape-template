package com.bytedance.sdk.openadsdk.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum kus {
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5);

    private final int fi;
    private final int[] yo;

    kus(int[] iArr, int i) {
        this.yo = iArr;
        this.fi = i;
    }

    public int kgy(fpp fppVar) {
        char c;
        int iKgy = fppVar.kgy();
        if (iKgy <= 9) {
            c = 0;
        } else if (iKgy <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.yo[c];
    }

    public int kgy() {
        return this.fi;
    }
}
