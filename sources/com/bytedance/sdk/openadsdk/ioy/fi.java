package com.bytedance.sdk.openadsdk.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum fi {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final fi[] ct;
    private final int noq;

    static {
        fi fiVar = L;
        fi fiVar2 = M;
        fi fiVar3 = Q;
        ct = new fi[]{fiVar2, fiVar, H, fiVar3};
    }

    public int kgy() {
        return this.noq;
    }

    fi(int i) {
        this.noq = i;
    }
}
