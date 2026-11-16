package defpackage;

import com.applovin.shadow.okhttp3.internal.Util;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e43 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e43(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        boolean z = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Util.threadFactory$lambda$1(str, z, runnable);
            default:
                return okhttp3.internal.Util.m1368threadFactory$lambda1(str, z, runnable);
        }
    }
}
