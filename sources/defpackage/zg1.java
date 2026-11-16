package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zg1 {
    public volatile int a;
    public volatile int b;

    public final void a() throws t33 {
        int i;
        if (this.a == 0) {
            this.b = 1;
        }
        this.a++;
        int i2 = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            i = this.b;
            if (jCurrentTimeMillis2 >= 15000) {
                this.b = i + 1;
                throw new t33(null, 1, null);
            }
        } while (i2 != i);
    }
}
