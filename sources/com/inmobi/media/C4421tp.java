package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.lp1;
import defpackage.oc3;
import defpackage.tb5;
import defpackage.wz2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.tp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4421tp {
    public final MediaPlayer a;
    public final cz b;
    public final long c;
    public final lp1 d;
    public final AtomicBoolean e;
    public c91 f;
    public int g;

    public final void b() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f = tb5.t(this.b, null, null, new C4393sp(this, null), 3);
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.a.setOnCompletionListener(null);
            AbstractC4097i7.a(this.f);
            this.f = null;
        }
    }

    public C4421tp(MediaPlayer mediaPlayer, cz czVar, long j, lp1 lp1Var) {
        mediaPlayer.getClass();
        czVar.getClass();
        lp1Var.getClass();
        this.a = mediaPlayer;
        this.b = czVar;
        this.c = j;
        this.d = lp1Var;
        this.e = new AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C4421tp c4421tp, fy fyVar) {
        C4365rp c4365rp;
        boolean zIsPlaying;
        int currentPosition;
        int i;
        Object objEmit;
        int i2;
        Object objEmit2;
        int i3;
        Object objEmit3;
        c4421tp.getClass();
        if (fyVar instanceof C4365rp) {
            c4365rp = (C4365rp) fyVar;
            int i4 = c4365rp.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4365rp.e = i4 - Integer.MIN_VALUE;
            } else {
                c4365rp = new C4365rp(c4421tp, fyVar);
            }
        } else {
            c4365rp = new C4365rp(c4421tp, fyVar);
        }
        Object obj = c4365rp.c;
        int i5 = c4365rp.e;
        dz dzVar = dz.a;
        az2 az2Var = az2.a;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        wz2.a0(obj);
                    } else {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    i2 = c4365rp.b;
                    i3 = c4365rp.a;
                    wz2.a0(obj);
                    c4365rp.e = 3;
                    if (c4421tp.g != 4 || (objEmit3 = c4421tp.d.emit(new C4198lp(i3, i2), c4365rp)) != dzVar) {
                        objEmit3 = az2Var;
                    }
                    if (objEmit3 == dzVar) {
                        return dzVar;
                    }
                }
            } else {
                i2 = c4365rp.b;
                int i6 = c4365rp.a;
                wz2.a0(obj);
                currentPosition = i6;
                c4365rp.a = currentPosition;
                c4365rp.b = i2;
                c4365rp.e = 2;
                if (c4421tp.a(i2, 25, 1)) {
                    c4421tp.g = 1;
                    objEmit2 = c4421tp.d.emit(Ko.a, c4365rp);
                    if (objEmit2 != dzVar) {
                        objEmit2 = az2Var;
                    }
                } else if (c4421tp.a(i2, 50, 2)) {
                    c4421tp.g = 2;
                    objEmit2 = c4421tp.d.emit(C4503wp.a, c4365rp);
                    if (objEmit2 != dzVar) {
                        objEmit2 = az2Var;
                    }
                } else if (c4421tp.a(i2, 75, 3)) {
                    objEmit2 = az2Var;
                } else {
                    c4421tp.g = 3;
                    objEmit2 = c4421tp.d.emit(Fp.a, c4365rp);
                    if (objEmit2 != dzVar) {
                        objEmit2 = az2Var;
                    }
                }
                if (objEmit2 == dzVar) {
                    i3 = currentPosition;
                    c4365rp.e = 3;
                    if (c4421tp.g != 4) {
                        objEmit3 = az2Var;
                    } else {
                        objEmit3 = az2Var;
                    }
                    if (objEmit3 == dzVar) {
                        return dzVar;
                    }
                } else {
                    return dzVar;
                }
            }
        } else {
            wz2.a0(obj);
            MediaPlayer mediaPlayer = c4421tp.a;
            mediaPlayer.getClass();
            try {
                zIsPlaying = mediaPlayer.isPlaying();
            } catch (IllegalStateException unused) {
                zIsPlaying = false;
            }
            if (zIsPlaying) {
                currentPosition = c4421tp.a.getCurrentPosition();
                int duration = c4421tp.a.getDuration();
                if (duration != -1) {
                    if (duration > 0) {
                        i = (currentPosition * 100) / duration;
                    } else {
                        i = 0;
                    }
                    if (c4421tp.g == 4 && i < 25) {
                        c4421tp.g = -1;
                    }
                    c4365rp.a = currentPosition;
                    c4365rp.b = i;
                    c4365rp.e = 1;
                    if (c4421tp.g >= 0) {
                        objEmit = az2Var;
                    } else {
                        c4421tp.g = 0;
                        objEmit = c4421tp.d.emit(new C4557yp("VideoProgressTracker", duration), c4365rp);
                        if (objEmit != dzVar) {
                            objEmit = az2Var;
                        }
                    }
                    if (objEmit != dzVar) {
                        i2 = i;
                        c4365rp.a = currentPosition;
                        c4365rp.b = i2;
                        c4365rp.e = 2;
                        if (c4421tp.a(i2, 25, 1)) {
                            c4421tp.g = 1;
                            objEmit2 = c4421tp.d.emit(Ko.a, c4365rp);
                            if (objEmit2 != dzVar) {
                                objEmit2 = az2Var;
                            }
                        } else if (c4421tp.a(i2, 50, 2)) {
                            c4421tp.g = 2;
                            objEmit2 = c4421tp.d.emit(C4503wp.a, c4365rp);
                            if (objEmit2 != dzVar) {
                                objEmit2 = az2Var;
                            }
                        } else if (c4421tp.a(i2, 75, 3)) {
                            objEmit2 = az2Var;
                        } else {
                            c4421tp.g = 3;
                            objEmit2 = c4421tp.d.emit(Fp.a, c4365rp);
                            if (objEmit2 != dzVar) {
                                objEmit2 = az2Var;
                            }
                        }
                        if (objEmit2 == dzVar) {
                            i3 = currentPosition;
                            c4365rp.e = 3;
                            if (c4421tp.g != 4) {
                                objEmit3 = az2Var;
                            } else {
                                objEmit3 = az2Var;
                            }
                            if (objEmit3 == dzVar) {
                                return dzVar;
                            }
                        } else {
                            return dzVar;
                        }
                    } else {
                        return dzVar;
                    }
                }
            }
        }
        return az2Var;
    }

    public final void a() {
        this.a.setOnCompletionListener(new oc3(this, 1));
    }

    public static final void a(C4421tp c4421tp, MediaPlayer mediaPlayer) {
        c4421tp.g = 4;
        tb5.t(c4421tp.b, null, null, new C4338qp(c4421tp, null), 3);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
