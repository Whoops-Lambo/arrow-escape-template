package io.p071bidmachine.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends RuntimeException {
    public final int a;

    private static String a(int i) {
        if (i == 1) {
            return "Player release timed out.";
        }
        if (i != 2) {
            return i != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }

    public e0(int i) {
        super(a(i));
        this.a = i;
    }
}
