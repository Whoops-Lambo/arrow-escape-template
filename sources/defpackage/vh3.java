package defpackage;

import com.bytedance.sdk.component.gf.kgy.kgy;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai3 b;

    public /* synthetic */ vh3(ai3 ai3Var, int i) {
        this.a = i;
        this.b = ai3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ai3 ai3Var = this.b;
        switch (i) {
            case 0:
                if (ai3Var.ra == null) {
                    try {
                        ai3Var.ra = new xa3();
                    } catch (Throwable th) {
                        rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH7w==", "Sfsj", 261);
                        th.getMessage();
                    }
                    if (ai3Var.ra != null) {
                        wg3 unused = ai3Var.ra;
                        ai3Var.jpc = "0";
                        ((xa3) ai3Var.ra).a = ai3Var;
                        ((xa3) ai3Var.ra).b = ai3Var;
                        ((xa3) ai3Var.ra).f = ai3Var;
                        ((xa3) ai3Var.ra).c = ai3Var;
                        ((xa3) ai3Var.ra).d = ai3Var;
                        ((xa3) ai3Var.ra).g = ai3Var;
                        ((xa3) ai3Var.ra).e = ai3Var;
                        try {
                            ((xa3) ai3Var.ra).i.setLooping(false);
                        } catch (Throwable th2) {
                            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH7w==", "Sfsj", 278);
                        }
                        ai3Var.nu = false;
                        break;
                    }
                }
                break;
            case 1:
                if (ai3Var.yo() && ai3Var.ra != null) {
                    try {
                        ((xa3) ai3Var.ra).i.start();
                        for (WeakReference weakReference : ai3Var.rz) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((je3) weakReference.get()).ct(ai3Var);
                            }
                        }
                        ai3Var.kus = 206;
                    } catch (Throwable th3) {
                        rz.kgy(th3, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH6A==", "Sfsj", 381);
                        th3.getMessage();
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (ai3Var.dg != null) {
                    ai3Var.dg.sendEmptyMessage(101);
                }
                break;
            case 3:
                if (ai3Var.dg != null) {
                    ai3Var.dg.sendEmptyMessage(101);
                }
                break;
            case 4:
                if (ai3Var.dg != null) {
                    ai3Var.dg.sendEmptyMessage(104);
                }
                break;
            case 5:
                if (ai3Var.dg != null && ai3Var.dg.getLooper() != null) {
                    try {
                        kgy.kgy().kgy(ai3Var.dg);
                        ai3Var.dg = null;
                    } catch (Throwable th4) {
                        rz.kgy(th4, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH7T0=", "Sfsj", 967);
                    }
                    break;
                }
                break;
            default:
                try {
                    ((xa3) ai3Var.ra).i.pause();
                    ai3Var.kus = 207;
                    ai3Var.muf = false;
                } catch (Throwable th5) {
                    rz.kgy(th5, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIdH7Tw=", "Sfsj", 1194);
                    return;
                }
                break;
        }
    }
}
