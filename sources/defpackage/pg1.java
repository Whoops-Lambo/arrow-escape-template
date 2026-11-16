package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pg1 {
    public int[] a;
    public int b;
    public float[] c;

    public pg1(int[] iArr) {
        this.a = iArr;
        if (iArr.length != 0) {
            int i = iArr[0];
            i71 it = new j71(1, iArr.length - 1, 1).iterator();
            while (it.d) {
                i *= iArr[it.nextInt()];
            }
            this.b = i;
            this.c = new float[i];
            return;
        }
        d.u("Empty array can't be reduced.");
        throw null;
    }
}
