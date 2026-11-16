package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ x31(int i, Context context, int i2) {
        this.a = i2;
        this.b = i;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                if (lz.a.contains(y31.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    y31 y31Var = y31.a;
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    y31Var.a(i2, packageName);
                    return;
                } catch (Throwable th) {
                    lz.a(y31.class, th);
                    return;
                }
            default:
                if (lz.a.contains(y31.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    y31 y31Var2 = y31.a;
                    String packageName2 = context.getPackageName();
                    packageName2.getClass();
                    y31Var2.a(i2, packageName2);
                    return;
                } catch (Throwable th2) {
                    lz.a(y31.class, th2);
                    return;
                }
        }
    }
}
