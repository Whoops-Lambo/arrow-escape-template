package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.lp1;
import defpackage.wz2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class V6 {
    public final ExoPlayer a;
    public final cz b;
    public final lp1 c;
    public final AtomicBoolean d;
    public c91 e;
    public c91 f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final AbstractC4002eo[] j;
    public final long k;
    public final long l;

    public V6(ExoPlayer exoPlayer, AdConfig.HybridNativeConfig hybridNativeConfig, cz czVar, long j, lp1 lp1Var, TrackPercentage trackPercentage) {
        exoPlayer.getClass();
        hybridNativeConfig.getClass();
        czVar.getClass();
        lp1Var.getClass();
        trackPercentage.getClass();
        this.a = exoPlayer;
        this.b = czVar;
        this.c = lp1Var;
        this.d = new AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new AbstractC4002eo[]{Ko.a, C4503wp.a, Fp.a, Lo.a};
        this.k = 200L;
        long minProgressInterval = hybridNativeConfig.getMinProgressInterval();
        this.l = j < minProgressInterval ? minProgressInterval : j;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(V6 v6, fy fyVar) {
        S6 s6;
        int duration;
        int currentPosition;
        Object objEmit;
        v6.getClass();
        if (fyVar instanceof S6) {
            s6 = (S6) fyVar;
            int i = s6.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6.d = i - Integer.MIN_VALUE;
            } else {
                s6 = new S6(v6, fyVar);
            }
        } else {
            s6 = new S6(v6, fyVar);
        }
        Object obj = s6.b;
        int i2 = s6.d;
        Object obj2 = dz.a;
        Object obj3 = az2.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    wz2.a0(obj);
                } else {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                currentPosition = s6.a;
                wz2.a0(obj);
            }
            return obj3;
        }
        wz2.a0(obj);
        if (!v6.a.isPlaying() || (duration = (int) v6.a.getDuration()) <= 0) {
            return obj3;
        }
        currentPosition = (((int) v6.a.getCurrentPosition()) * 100) / duration;
        if (v6.g == 2 && currentPosition < v6.i[0]) {
            v6.g = -1;
            boolean[] zArr = new boolean[4];
            for (int i3 = 0; i3 < 4; i3++) {
                zArr[i3] = false;
            }
            v6.h = zArr;
        }
        s6.a = currentPosition;
        s6.d = 1;
        if (v6.g >= 0) {
            objEmit = obj3;
        } else {
            v6.g = 0;
            objEmit = v6.c.emit(new C4557yp("ExoVideoProgressTracker", duration), s6);
            if (objEmit != obj2) {
                objEmit = obj3;
            }
        }
        if (objEmit != obj2) {
        }
        return obj2;
        s6.d = 2;
        if (v6.a(currentPosition, s6) == obj2) {
            return obj2;
        }
        return obj3;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            AbstractC4097i7.a(this.e);
            AbstractC4097i7.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final Object a(V6 v6, U6 u6) {
        Object objEmit;
        boolean zIsPlaying = v6.a.isPlaying();
        az2 az2Var = az2.a;
        if (!zIsPlaying) {
            return az2Var;
        }
        long duration = v6.a.getDuration();
        if (duration <= 0) {
            return az2Var;
        }
        return (v6.g != 2 && (objEmit = v6.c.emit(new R8(v6.a.getCurrentPosition(), duration), u6)) == dz.a) ? objEmit : az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x003f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r7, defpackage.fy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.Q6
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Q6 r0 = (com.inmobi.media.Q6) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.inmobi.media.Q6 r0 = new com.inmobi.media.Q6
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            int r7 = r0.c
            int r1 = r0.b
            int r3 = r0.a
            defpackage.wz2.a0(r8)
            r8 = r3
            goto L64
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            r6 = 0
            return r6
        L33:
            defpackage.wz2.a0(r8)
            int[] r8 = r6.i
            int r8 = r8.length
            r1 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L3d:
            if (r1 >= r7) goto L66
            int[] r3 = r6.i
            r3 = r3[r1]
            if (r8 < r3) goto L64
            boolean[] r3 = r6.h
            boolean r4 = r3[r1]
            if (r4 != 0) goto L64
            r3[r1] = r2
            lp1 r3 = r6.c
            com.inmobi.media.eo[] r4 = r6.j
            r4 = r4[r1]
            r0.a = r8
            r0.b = r1
            r0.c = r7
            r0.f = r2
            java.lang.Object r3 = r3.emit(r4, r0)
            dz r4 = defpackage.dz.a
            if (r3 != r4) goto L64
            return r4
        L64:
            int r1 = r1 + r2
            goto L3d
        L66:
            az2 r6 = defpackage.az2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.V6.a(int, fy):java.lang.Object");
    }
}
