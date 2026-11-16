package defpackage;

import com.ironsource.I2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ I2 b;

    public /* synthetic */ d11(I2 i2, int i) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        I2 i2 = this.b;
        switch (i) {
            case 0:
                I2.e(i2);
                break;
            case 1:
                I2.d(i2);
                break;
            case 2:
                I2.c(i2);
                break;
            case 3:
                I2.f(i2);
                break;
            default:
                I2.a(i2);
                break;
        }
    }
}
