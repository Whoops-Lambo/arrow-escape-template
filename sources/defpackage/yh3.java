package defpackage;

import com.bytedance.sdk.openadsdk.core.kus.uq.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yh3 implements Runnable {
    public long a;
    public boolean b;
    public final /* synthetic */ rz c;

    @Override // java.lang.Runnable
    public final void run() {
        long currentPosition;
        rz rzVar = this.c;
        if (((ai3) rzVar).ra != null) {
            try {
                if (!this.b) {
                    xa3 xa3Var = (xa3) ((ai3) rzVar).ra;
                    xa3Var.getClass();
                    try {
                        currentPosition = xa3Var.i.getCurrentPosition();
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "XOs5thaue8KOXudSnxi0IVTg", 244);
                        currentPosition = 0;
                    }
                    ((ai3) rzVar).vs = Math.max(this.a, currentPosition);
                }
                long unused = ((ai3) rzVar).vs;
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdHk3n0lEvFSbgQsyM=", "Sfsj", 1524);
                th2.toString();
            }
        }
        if (((ai3) rzVar).dg != null) {
            ((ai3) rzVar).dg.sendEmptyMessageDelayed(100, 0L);
        }
    }

    public yh3(rz rzVar) {
        this.c = rzVar;
    }
}
