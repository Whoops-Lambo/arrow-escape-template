package io.p071bidmachine.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface j extends f {
    default void b(Throwable th) {
    }

    void o(h hVar);

    @Override // io.p071bidmachine.util.f
    default void a(h hVar) {
        try {
            o(hVar);
        } catch (Throwable th) {
            try {
                b(th);
            } catch (Throwable unused) {
            }
        }
    }
}
