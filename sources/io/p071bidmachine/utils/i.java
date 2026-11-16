package io.p071bidmachine.utils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public final String a;
    public String b;

    public final String toString() {
        if (this.b == null) {
            this.b = this.a + " @" + Integer.toHexString(hashCode());
        }
        return this.b;
    }

    public i(String str) {
        this.a = str;
    }
}
