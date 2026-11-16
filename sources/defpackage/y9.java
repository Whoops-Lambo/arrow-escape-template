package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y9 {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ y9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public void a(int i) {
        this.b = i | this.b;
    }

    public boolean d(int i) {
        return (this.b & i) == i;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return b(this.b);
            case 1:
                return c(this.b);
            default:
                return super.toString();
        }
    }
}
