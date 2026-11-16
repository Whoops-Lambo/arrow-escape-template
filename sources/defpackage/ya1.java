package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ya1 extends ha1 {
    public final ne1 a = new ne1();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ya1) && ((ya1) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
