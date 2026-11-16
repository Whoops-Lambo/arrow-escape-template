package io.p071bidmachine.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public final String a;

    public final String toString() {
        return this.a;
    }

    public e(Throwable th) {
        th.getClass();
        String message = th.getMessage();
        this.a = message == null ? "Empty throwable" : message;
    }

    public e(String str) {
        this.a = str;
    }
}
