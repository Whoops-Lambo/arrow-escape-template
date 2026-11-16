package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class sz4 extends Exception {
    public sz4(int i, int i2) {
        super(pv1.j(i, i2, "Unpaired surrogate at index ", " of ", new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i2).length())));
    }
}
