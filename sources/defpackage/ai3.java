package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.gf.kgy.kgy;
import com.bytedance.sdk.component.utils.ft;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ai3 implements mg3, ng3, pg3, qg3, sg3, ug3, vg3, qe3, ft.kgy {
    private static final SparseIntArray kgy = new SparseIntArray();
    private boolean at;
    private SurfaceTexture ct;
    private ft dg;
    private int fpz;
    private boolean ft;
    private final Runnable ftg;
    private volatile boolean gbb;
    private boolean ioy;
    private ArrayList<Runnable> lqi;
    private boolean mca;
    private volatile boolean muf;
    private SurfaceHolder noq;
    private boolean twf;
    private final yh3 uq;
    private boolean wl;
    private final boolean ahm = false;
    private final List<WeakReference<je3>> rz = new CopyOnWriteArrayList();
    private int yo = 0;
    private int fi = 3;
    private boolean gf = false;
    private volatile wg3 ra = null;
    private boolean nu = false;
    private volatile int kus = 201;
    private long vs = -1;
    private boolean xh = false;
    private long um = 0;
    private long fpp = Long.MIN_VALUE;
    private long sx = 0;
    private long gm = 0;
    private long ay = 0;
    private String jpc = "0";
    private zg3 wy = null;
    private boolean uf = false;
    private CountDownLatch vg = new CountDownLatch(1);
    private volatile int bmz = 200;
    private AtomicBoolean ikw = new AtomicBoolean(false);
    private Surface uxe = null;
    private long vrj = 0;
    private long mw = 0;

    public final void e() {
        this.gbb = true;
        this.gf = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ay;
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kgy(this, jElapsedRealtime);
            }
        }
    }

    public final void a(int i) {
        if (i == 701) {
            this.vrj = SystemClock.elapsedRealtime();
            this.yo++;
            for (WeakReference<je3> weakReference : this.rz) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().kgy(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i != 702) {
            if (this.mca && i == 3) {
                k();
                e();
                ahm(this.uf);
                return;
            } else {
                if (i == 805) {
                    this.wl = true;
                    return;
                }
                return;
            }
        }
        if (this.vrj > 0) {
            this.mw = (SystemClock.elapsedRealtime() - this.vrj) + this.mw;
            this.vrj = 0L;
        }
        for (WeakReference<je3> weakReference2 : this.rz) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().kgy((qe3) this, Integer.MAX_VALUE);
            }
        }
    }

    public final void b(long j) {
        yh3 yh3Var = this.uq;
        yh3Var.a = j;
        if (this.ft) {
            c(yh3Var);
            return;
        }
        zg3 zg3Var = this.wy;
        boolean z = zg3Var != null && zg3Var.yo();
        Runnable runnable = this.uq;
        if (z) {
            c(runnable);
        } else {
            h(runnable);
        }
    }

    public final void c(Runnable runnable) {
        if (runnable == null || fi()) {
            return;
        }
        if (this.twf) {
            h(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.qe3
    public int ct() {
        MediaPlayer mediaPlayer;
        if (this.ra == null || fi() || (mediaPlayer = ((xa3) this.ra).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    public final void d() {
        ft ftVar = this.dg;
        if (ftVar == null || ftVar.getLooper() == null) {
            return;
        }
        try {
            this.dg.post(new vh3(this, 5));
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "VOAJkBCoe8iZ", 973);
        }
    }

    public int dg() {
        return this.yo;
    }

    public SurfaceHolder fpp() {
        return this.noq;
    }

    public final void h(Runnable runnable) {
        try {
            if (this.lqi == null) {
                this.lqi = new ArrayList<>();
            }
            this.lqi.add(runnable);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "XuA8gAapbOaDXt5Sgg==", 1218);
            th.getMessage();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r7 = this;
            wg3 r0 = r7.ra
            if (r0 != 0) goto L6
            goto L7b
        L6:
            wg3 r0 = r7.ra     // Catch: java.lang.Throwable -> Le
            xa3 r0 = (defpackage.xa3) r0     // Catch: java.lang.Throwable -> Le
            r0.d()     // Catch: java.lang.Throwable -> Le
            goto L1a
        Le:
            r0 = move-exception
            java.lang.String r1 = "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw=="
            java.lang.String r2 = "aN0AkAe1aPeMS85YniayKUv+KIc="
            java.lang.String r3 = "SeshkAKvbOqFTt5cvB2hMV78"
            r4 = 937(0x3a9, float:1.313E-42)
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(r0, r1, r2, r3, r4)
        L1a:
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r1 = 0
            r0.b = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.e = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.c = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.g = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.f = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.a = r1
            wg3 r0 = r7.ra
            xa3 r0 = (defpackage.xa3) r0
            r0.d = r1
            wg3 r7 = r7.ra     // Catch: java.lang.Throwable -> L7e
            xa3 r7 = (defpackage.xa3) r7     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r7.m     // Catch: java.lang.Throwable -> L7e
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r7.n     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L7a
            android.media.MediaPlayer r2 = r7.i     // Catch: java.lang.Throwable -> L78
            r2.release()     // Catch: java.lang.Throwable -> L78
            r2 = 1
            r7.n = r2     // Catch: java.lang.Throwable -> L78
            r7.e()     // Catch: java.lang.Throwable -> L78
            ne3 r2 = r7.k     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r2 = move-exception
            java.lang.String r3 = "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw=="
            java.lang.String r4 = "euAphwy1beqFTt5cvB2hMV78"
            java.lang.String r5 = "SeshkAKvbOqFTt5cqBC0KWjhOIcAuQ=="
            r6 = 180(0xb4, float:2.52E-43)
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L78
        L6f:
            r7.k = r1     // Catch: java.lang.Throwable -> L78
        L71:
            r7.c()     // Catch: java.lang.Throwable -> L78
            r7.f()     // Catch: java.lang.Throwable -> L78
            goto L7a
        L78:
            r7 = move-exception
            goto L7c
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
        L7b:
            return
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L7e:
            r7 = move-exception
            java.lang.String r0 = "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw=="
            java.lang.String r1 = "aN0AkAe1aPeMS85YniayKUv+KIc="
            java.lang.String r2 = "SeshkAKvbOqFTt5cvB2hMV78"
            r3 = 949(0x3b5, float:1.33E-42)
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(r7, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai3.i():void");
    }

    public final void k() {
        ArrayList<Runnable> arrayList = this.lqi;
        if (arrayList == null || arrayList.isEmpty() || this.at) {
            return;
        }
        this.at = true;
        ArrayList arrayList2 = new ArrayList(this.lqi);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((Runnable) obj).run();
        }
        this.lqi.clear();
        this.at = false;
    }

    @Override // com.bytedance.sdk.component.utils.ft.kgy
    public void kgy(Message message) {
        int i = this.kus;
        int i2 = message.what;
        if (this.ra != null) {
            switch (message.what) {
                case 100:
                    if (this.kus == 205 || this.kus == 207 || this.kus == 209) {
                        try {
                            ((xa3) this.ra).i.start();
                            this.ay = SystemClock.elapsedRealtime();
                            this.kus = 206;
                            if (this.vs > 0) {
                                ((xa3) this.ra).a(this.vs, this.fi);
                                this.vs = -1L;
                            }
                            if (this.wy != null) {
                                ahm(this.uf);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 653);
                            return;
                        }
                    }
                    break;
                case 101:
                    if (this.xh) {
                        this.um += this.sx;
                    }
                    this.xh = false;
                    this.sx = 0L;
                    this.fpp = Long.MIN_VALUE;
                    if (this.kus == 206 || this.kus == 207 || this.kus == 209) {
                        try {
                            ((xa3) this.ra).i.pause();
                            this.kus = 207;
                            this.muf = false;
                            for (WeakReference<je3> weakReference : this.rz) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().uq(this);
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 686);
                            return;
                        }
                    }
                    break;
                case 102:
                    try {
                        ((xa3) this.ra).d();
                        this.kus = 201;
                        return;
                    } catch (Throwable th3) {
                        rz.kgy(th3, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 736);
                        return;
                    }
                case 103:
                    try {
                        i();
                        break;
                    } catch (Throwable th4) {
                        rz.kgy(th4, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 713);
                    }
                    for (WeakReference<je3> weakReference2 : this.rz) {
                        if (weakReference2 != null && weakReference2.get() != null) {
                            weakReference2.get().rz(this);
                        }
                    }
                    this.kus = 203;
                    return;
                case 104:
                    if (this.kus == 202 || this.kus == 208) {
                        try {
                            MediaPlayer mediaPlayer = ((xa3) this.ra).i;
                            if (mediaPlayer != null) {
                                mediaPlayer.prepareAsync();
                                return;
                            }
                            return;
                        } catch (Throwable th5) {
                            rz.kgy(th5, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 700);
                            return;
                        }
                    }
                    break;
                case 105:
                    if (this.kus == 205 || this.kus == 206 || this.kus == 208 || this.kus == 207 || this.kus == 209) {
                        try {
                            ((xa3) this.ra).i.stop();
                            this.kus = 208;
                            return;
                        } catch (Throwable th6) {
                            rz.kgy(th6, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 827);
                            return;
                        }
                    }
                    break;
                case 106:
                    if (this.kus == 206 || this.kus == 207 || this.kus == 209) {
                        try {
                            ((xa3) this.ra).a(((Long) message.obj).longValue(), this.fi);
                            return;
                        } catch (Throwable th7) {
                            rz.kgy(th7, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 747);
                            return;
                        }
                    }
                    break;
                case 107:
                    this.um = 0L;
                    this.yo = 0;
                    this.sx = 0L;
                    this.xh = false;
                    this.fpp = Long.MIN_VALUE;
                    if (this.kus == 201 || this.kus == 203) {
                        try {
                            zg3 zg3Var = (zg3) message.obj;
                            if (TextUtils.isEmpty(zg3Var.ct())) {
                                zg3Var.kgy(xg3.a());
                            }
                            if (zg3Var.fpz()) {
                                ((xa3) this.ra).b(zg3Var.dg());
                                zg3Var.dg();
                            } else {
                                File file = new File(zg3Var.ct(), zg3Var.xh());
                                if (file.exists()) {
                                    g(zg3Var, file);
                                } else {
                                    j(zg3Var);
                                }
                            }
                            this.kus = 202;
                            return;
                        } catch (Throwable th8) {
                            rz.kgy(th8, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 779);
                            return;
                        }
                    }
                    break;
                case 108:
                case 109:
                default:
                    return;
                case 110:
                    try {
                        SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                        xa3 xa3Var = (xa3) this.ra;
                        synchronized (xa3Var.m) {
                            try {
                                if (!xa3Var.n && surfaceHolder != null && surfaceHolder.getSurface() != null && xa3Var.h) {
                                    xa3Var.i.setDisplay(surfaceHolder);
                                }
                            } catch (Throwable th9) {
                                rz.kgy(th9, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "SOs5sQqvecuBUw==", 112);
                            }
                            break;
                        }
                        ((xa3) this.ra).i.setScreenOnWhilePlaying(true);
                        this.vg.await(1L, TimeUnit.SECONDS);
                        k();
                        return;
                    } catch (Throwable th10) {
                        rz.kgy(th10, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 814);
                        return;
                    }
                case 111:
                    try {
                        this.uxe = new Surface((SurfaceTexture) message.obj);
                        wg3 wg3Var = this.ra;
                        Surface surface = this.uxe;
                        xa3 xa3Var2 = (xa3) wg3Var;
                        xa3Var2.e();
                        xa3Var2.l = surface;
                        xa3Var2.i.setSurface(surface);
                        ((xa3) this.ra).i.setScreenOnWhilePlaying(true);
                        this.vg.await(1L, TimeUnit.SECONDS);
                        k();
                        return;
                    } catch (Throwable th11) {
                        rz.kgy(th11, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "U+8jkQ+5RNSH", 799);
                        return;
                    }
            }
            this.kus = 200;
            if (this.nu) {
                return;
            }
            le3 le3Var = new le3(308, i2);
            le3Var.c = i + "," + i2;
            for (WeakReference<je3> weakReference3 : this.rz) {
                if (weakReference3 != null && weakReference3.get() != null) {
                    weakReference3.get().kgy(this, le3Var);
                }
            }
            this.nu = true;
        }
    }

    public boolean kus() {
        return this.wl;
    }

    @Override // defpackage.qe3
    public boolean noq() {
        ft ftVar;
        return (this.kus == 206 || ((ftVar = this.dg) != null && ftVar.hasMessages(100))) && !this.muf;
    }

    @Override // defpackage.qg3
    public void rz(wg3 wg3Var) {
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kgy((qe3) this, true);
            }
        }
    }

    public SurfaceTexture sx() {
        return this.ct;
    }

    public boolean twf() {
        return this.kus == 205;
    }

    public long um() {
        if (fi() || (this.kus != 206 && this.kus != 207)) {
            return 0L;
        }
        try {
            xa3 xa3Var = (xa3) this.ra;
            xa3Var.getClass();
            try {
                return xa3Var.i.getCurrentPosition();
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "XOs5thaue8KOXudSnxi0IVTg", 244);
                return 0L;
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "XOs5thaue8KOXudSnxi0IVTg", 1376);
            return 0L;
        }
    }

    @Override // defpackage.qe3
    public int uq() {
        MediaPlayer mediaPlayer;
        if (this.ra == null || fi() || (mediaPlayer = ((xa3) this.ra).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    public long vs() {
        if (this.xh) {
            long j = this.sx;
            if (j > 0) {
                return this.um + j;
            }
        }
        return this.um;
    }

    public long xh() {
        long j = this.gm;
        long duration = 0;
        if (j != 0) {
            return j;
        }
        if (this.kus == 206 || this.kus == 207) {
            try {
                xa3 xa3Var = (xa3) this.ra;
                xa3Var.getClass();
                try {
                    duration = xa3Var.i.getDuration();
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78", "XOs5sRauaNOJRdk=", 254);
                }
                this.gm = duration;
            } catch (Throwable th2) {
                rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "XOs5owq4bMikX8VcmBivJg==", 1362);
            }
        }
        return this.gm;
    }

    @Override // defpackage.qe3
    public boolean yo() {
        ft ftVar;
        return ((this.kus != 207 && !this.muf) || (ftVar = this.dg) == null || ftVar.hasMessages(100)) ? false : true;
    }

    public ai3() {
        int i = 0;
        com.bytedance.sdk.openadsdk.core.kus.uq.rz rzVar = (com.bytedance.sdk.openadsdk.core.kus.uq.rz) this;
        this.uq = new yh3(rzVar);
        this.fpz = 0;
        this.mca = false;
        this.ftg = new l24(rzVar, 8);
        this.fpz = 0;
        ft ftVarKgy = kgy.kgy().kgy(this, "csj_".concat("SSMediaPlayerWrapper"));
        this.dg = ftVarKgy;
        this.mca = true;
        if (ftVarKgy != null) {
            ftVarKgy.post(new vh3(this, i));
        }
    }

    @Override // defpackage.ng3
    public void ahm(wg3 wg3Var) {
        if (!fi()) {
            this.kus = 205;
            try {
                zg3 zg3Var = this.wy;
                if (zg3Var != null) {
                    float fVs = zg3Var.vs();
                    if (fVs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        MediaPlayer mediaPlayer = ((xa3) this.ra).i;
                        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(fVs));
                    }
                }
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "VOAdhwasaNWFTg==", 1147);
            }
            if (this.dg != null) {
                boolean z = this.muf;
                ft ftVar = this.dg;
                if (z) {
                    if (ftVar != null) {
                        ftVar.post(new vh3(this, 6));
                    }
                } else {
                    ftVar.sendMessage(ftVar.obtainMessage(100, -1, -1));
                }
            }
            kgy.delete(this.fpz);
            boolean z2 = this.mca;
            boolean z3 = this.ioy;
            if (!z2 && !z3) {
                e();
                this.ioy = true;
            }
            for (WeakReference<je3> weakReference : this.rz) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ahm(this);
                }
            }
        }
    }

    public void at() {
        if (!fi()) {
            this.twf = true;
            ArrayList<Runnable> arrayList = this.lqi;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.lqi.clear();
            }
            ft ftVar = this.dg;
            if (ftVar != null) {
                try {
                    ftVar.removeCallbacksAndMessages(null);
                    if (this.ra != null) {
                        this.dg.sendEmptyMessage(103);
                    }
                    d();
                } catch (Throwable th) {
                    try {
                        rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "SeshkAKvbA==", 467);
                    } finally {
                        d();
                    }
                }
            }
        }
    }

    public final void f(File file) {
        file.getAbsolutePath();
        try {
            if (gm.kgy(xg3.a)) {
                ((xa3) this.ra).b(file.getAbsolutePath());
            } else {
                FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
                wg3 wg3Var = this.ra;
                ((xa3) wg3Var).i.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "S+IsjC+zasaMfN5ZiR4=", 875);
        }
    }

    public final void g(zg3 zg3Var, File file) {
        if (zg3Var.kgy()) {
            try {
                String strB = fs1.B(file);
                if (zg3Var.xh().equals(strB)) {
                    f(file);
                    return;
                }
                JSONObject jSONObjectRz = zg3Var.rz();
                boolean zAhm = zg3Var.ahm();
                if (jSONObjectRz != null) {
                    jSONObjectRz.put("file_hash", zg3Var.xh());
                    jSONObjectRz.put("file_real_hash", strB);
                    jSONObjectRz.put("is_change_play_type", zAhm ? 1 : 0);
                    jSONObjectRz.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                    jSONObjectRz.put("error_real_msg", "md5_not_match");
                }
                if (zAhm) {
                    boolean zDelete = file.delete();
                    if (jSONObjectRz != null) {
                        jSONObjectRz.put("delete_cache_file", zDelete ? 1 : 0);
                    }
                    if (zDelete) {
                        j(zg3Var);
                        return;
                    }
                }
                f(file);
                return;
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "Tes/nAWlT86MT/5TmBSnOlL6NA==", EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
                return;
            }
        }
        f(file);
    }

    public void gf() {
        if (fi() || this.ra == null) {
            return;
        }
        this.ikw.set(true);
        if (this.kus != 206) {
            this.um = 0L;
            this.yo = 0;
            this.sx = 0L;
            this.xh = false;
            this.fpp = Long.MIN_VALUE;
            this.muf = false;
            this.uq.b = true;
            b(0L);
            ft ftVar = this.dg;
            if (ftVar != null) {
                ftVar.removeCallbacks(this.ftg);
                this.dg.postDelayed(this.ftg, this.bmz);
            }
        }
        this.vg.countDown();
    }

    public final void j(zg3 zg3Var) {
        zg3Var.dg();
        xa3 xa3Var = (xa3) this.ra;
        synchronized (xa3Var) {
            ne3 ne3Var = new ne3(xg3.a, zg3Var);
            ne3.e.put(zg3Var.xh(), ne3Var);
            xa3Var.k = ne3Var;
            bh3.a(zg3Var);
            xa3Var.i.setDataSource(xa3Var.k);
        }
        zg3Var.dg();
    }

    public void nu() {
        ft ftVar;
        zg3 zg3Var;
        zg3 zg3Var2;
        if (!fi() && (ftVar = this.dg) != null) {
            ftVar.removeMessages(100);
            this.muf = true;
            if (!this.mca) {
                if (!this.ioy && ((zg3Var2 = this.wy) == null || !zg3Var2.yo())) {
                    h(new vh3(this, 2));
                    return;
                }
                ft ftVar2 = this.dg;
                if (ftVar2 != null) {
                    ftVar2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            if (!this.gf && ((zg3Var = this.wy) == null || !zg3Var.yo())) {
                h(new vh3(this, 3));
                return;
            }
            ft ftVar3 = this.dg;
            if (ftVar3 != null) {
                ftVar3.sendEmptyMessage(101);
            }
        }
    }

    public void ra() {
        if (!fi() && this.dg != null) {
            this.ikw.set(true);
            this.dg.post(new vh3(this, 1));
        }
    }

    @Override // defpackage.qe3
    public boolean fi() {
        return this.twf;
    }

    public static void ra(ai3 ai3Var) {
        ft ftVar = ai3Var.dg;
        if (ftVar != null) {
            ftVar.post(new vh3(ai3Var, 0));
        }
    }

    @Override // defpackage.qe3
    public boolean rz() {
        return twf() || noq() || yo();
    }

    @Override // defpackage.qe3
    public boolean ahm() {
        return this.kus == 209;
    }

    @Override // defpackage.ug3
    public boolean ahm(wg3 wg3Var, int i, int i2) {
        if (this.ra != wg3Var) {
            return false;
        }
        if (i2 == -1004) {
            le3 le3Var = new le3(i, i2);
            for (WeakReference<je3> weakReference : this.rz) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().kgy(this, le3Var);
                }
            }
        }
        a(i);
        return false;
    }

    public void ahm(boolean z) {
        ft ftVar;
        if (fi() || (ftVar = this.dg) == null) {
            return;
        }
        ftVar.post(new xh3(this, z, 0));
    }

    public void ahm(int i) {
        this.fi = i;
    }

    public static void kgy(ai3 ai3Var, long j, long j2) {
        ai3 ai3Var2;
        long j3;
        long j4;
        if (!ai3Var.gbb) {
            ai3Var.e();
        }
        for (WeakReference<je3> weakReference : ai3Var.rz) {
            if (weakReference == null || weakReference.get() == null) {
                ai3Var2 = ai3Var;
                j3 = j;
                j4 = j2;
            } else {
                ai3Var2 = ai3Var;
                j3 = j;
                j4 = j2;
                weakReference.get().kgy(ai3Var2, j3, j4);
            }
            ai3Var = ai3Var2;
            j = j3;
            j2 = j4;
        }
    }

    public void kgy(boolean z) {
        if (fi()) {
            return;
        }
        this.ft = z;
        if (this.ra != null) {
            ((xa3) this.ra).h = z;
            return;
        }
        ft ftVar = this.dg;
        if (ftVar != null) {
            ftVar.post(new xh3(this, z, 1));
        }
    }

    public void kgy(boolean z, long j, boolean z2) {
        if (fi()) {
            return;
        }
        ft ftVar = this.dg;
        int i = 0;
        if (ftVar != null) {
            ftVar.post(new vh3(this, i));
        }
        this.uf = z2;
        this.ikw.set(true);
        this.muf = false;
        ahm(z2);
        if (z) {
            this.vs = j;
            c(new vh3(this, 4));
        } else {
            b(j);
        }
        ft ftVar2 = this.dg;
        if (ftVar2 != null) {
            ftVar2.removeCallbacks(this.ftg);
            this.dg.postDelayed(this.ftg, this.bmz);
        }
        this.vg.countDown();
    }

    public void kgy(long j) {
        if (fi()) {
            return;
        }
        if (this.kus == 207 || this.kus == 206 || this.kus == 209) {
            c(new wh3(this, j, 0));
        }
    }

    @Override // defpackage.qe3
    public boolean kgy() {
        return this.gf;
    }

    public void kgy(SurfaceTexture surfaceTexture) {
        if (fi()) {
            return;
        }
        this.ct = surfaceTexture;
        kgy(true);
        c(new o64(this, surfaceTexture, false, 3));
    }

    public void kgy(SurfaceHolder surfaceHolder) {
        if (fi()) {
            return;
        }
        this.noq = surfaceHolder;
        kgy(true);
        c(new ku4(this, surfaceHolder, false, 3));
    }

    public void kgy(zg3 zg3Var) {
        if (fi()) {
            return;
        }
        this.wy = zg3Var;
        boolean z = false;
        if (zg3Var != null) {
            this.mca = this.mca && !zg3Var.yo();
        }
        c(new os0(this, zg3Var, z, 4));
    }

    @Override // defpackage.pg3
    public void kgy(wg3 wg3Var, int i) {
        if (this.ra != wg3Var) {
            return;
        }
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ahm(this, i);
            }
        }
    }

    @Override // defpackage.sg3
    public boolean kgy(wg3 wg3Var, int i, int i2) {
        SparseIntArray sparseIntArray = kgy;
        sparseIntArray.put(this.fpz, sparseIntArray.get(this.fpz) + 1);
        this.kus = 200;
        ft ftVar = this.dg;
        if (ftVar != null) {
            ftVar.removeCallbacks(this.ftg);
        }
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            z = true;
        }
        if (z) {
            d();
        }
        if (!this.ikw.get()) {
            return true;
        }
        this.ikw.set(false);
        le3 le3Var = new le3(i, i2);
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kgy(this, le3Var);
            }
        }
        return true;
    }

    @Override // defpackage.mg3
    public void kgy(wg3 wg3Var) {
        this.kus = 209;
        kgy.delete(this.fpz);
        ft ftVar = this.dg;
        if (ftVar != null) {
            ftVar.removeCallbacks(this.ftg);
        }
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kgy(this);
            }
        }
    }

    @Override // defpackage.vg3
    public void kgy(wg3 wg3Var, int i, int i2, int i3, int i4) {
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kgy((qe3) this, i, i2);
            }
        }
    }

    public void kgy(je3 je3Var) {
        if (je3Var == null) {
            return;
        }
        for (WeakReference<je3> weakReference : this.rz) {
            if (weakReference != null && weakReference.get() == je3Var) {
                return;
            }
        }
        this.rz.add(new WeakReference<>(je3Var));
    }

    public void kgy(int i) {
        if (fi()) {
            return;
        }
        this.bmz = i;
    }

    public boolean kgy(float f) {
        PlaybackParams playbackParams;
        float speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        try {
            if (this.ra == null || !rz()) {
                return false;
            }
            try {
                playbackParams = ((xa3) this.ra).i.getPlaybackParams();
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "SOs5pQ+9cPSQT9JZvhC0IVQ=", 1482);
                sx.rz("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if (playbackParams != null) {
                speed = playbackParams.getSpeed();
            }
            if (speed == f) {
                return true;
            }
            MediaPlayer mediaPlayer = ((xa3) this.ra).i;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
            return true;
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "aN0AkAe1aPeMS85YniayKUv+KIc=", "SOs5pQ+9cPSQT9JZvhC0IVQ=", 1495);
            sx.kgy("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
