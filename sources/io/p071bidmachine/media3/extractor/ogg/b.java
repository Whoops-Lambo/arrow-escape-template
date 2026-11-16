package io.p071bidmachine.media3.extractor.ogg;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import defpackage.d;
import defpackage.dr0;
import defpackage.ds1;
import defpackage.et3;
import defpackage.lt3;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.ts.y;
import io.p071bidmachine.media3.extractor.z;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements e, lt3 {
    public final long a;
    public final long b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public final Object k;
    public final Object l;

    @Override // defpackage.lt3
    public void a(long j) {
        long j2 = this.d - 1;
        String str = zzfq.a;
        this.f = Math.max(0L, Math.min(j, j2));
        this.c = 2;
        this.g = this.a;
        this.h = this.b;
        this.i = 0L;
        this.j = this.d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.lt3
    public long b(zzagp zzagpVar) throws IOException {
        long j;
        ?? r3;
        long j2;
        long j3;
        long jMax;
        long j4;
        ds1 ds1Var = (ds1) this.k;
        int i = this.c;
        long j5 = this.b;
        if (i == 0) {
            j = 0;
            long jZzn = zzagpVar.zzn();
            this.e = jZzn;
            this.c = 1;
            long j6 = (-65307) + j5;
            if (j6 > jZzn) {
                return j6;
            }
            r3 = 0;
        } else if (i != 1) {
            if (i == 2) {
                long j7 = this.g;
                long j8 = this.h;
                if (j7 == j8) {
                    jMax = -1;
                    j3 = -1;
                } else {
                    long jZzn2 = zzagpVar.zzn();
                    if (ds1Var.e(zzagpVar, j8)) {
                        ds1Var.f(zzagpVar, false);
                        zzagpVar.zzl();
                        long j9 = this.f;
                        long j10 = ds1Var.b;
                        long j11 = j9 - j10;
                        j2 = 2;
                        int i2 = ds1Var.d + ds1Var.e;
                        if (j11 < 0 || j11 >= 72000) {
                            if (j11 < 0) {
                                this.h = jZzn2;
                                this.j = j10;
                            } else {
                                this.g = zzagpVar.zzn() + ((long) i2);
                                this.i = j10;
                            }
                            long j12 = this.h;
                            long j13 = this.g;
                            long j14 = j12 - j13;
                            if (j14 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.h = j13;
                                j3 = -1;
                                jMax = j13;
                            } else {
                                long jZzn3 = zzagpVar.zzn() - (((long) i2) * (j11 <= 0 ? 2L : 1L));
                                j3 = -1;
                                String str = zzfq.a;
                                jMax = Math.max(j13, Math.min(((j11 * j14) / (this.j - this.i)) + jZzn3, j12 - 1));
                            }
                        } else {
                            jMax = -1;
                            j3 = -1;
                        }
                    } else {
                        jMax = this.g;
                        if (jMax == jZzn2) {
                            dr0.h("No ogg page can be found.");
                            return 0L;
                        }
                        j3 = -1;
                    }
                    if (jMax != j3) {
                        return jMax;
                    }
                    this.c = 3;
                    j4 = j3;
                }
                j2 = 2;
                if (jMax != j3) {
                    return jMax;
                }
                this.c = 3;
                j4 = j3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j4 = -1;
                j2 = 2;
            }
            while (true) {
                ds1Var.e(zzagpVar, j4);
                ds1Var.f(zzagpVar, false);
                if (ds1Var.b > this.f) {
                    zzagpVar.zzl();
                    this.c = 4;
                    return -(this.i + j2);
                }
                zzagpVar.zzf(ds1Var.d + ds1Var.e);
                this.g = zzagpVar.zzn();
                this.i = ds1Var.b;
                j4 = -1;
            }
        } else {
            j = 0;
            r3 = 0;
        }
        ds1Var.a = r3;
        ds1Var.b = j;
        ds1Var.c = r3;
        ds1Var.d = r3;
        ds1Var.e = r3;
        if (!ds1Var.e(zzagpVar, -1L)) {
            d.s();
            return 0L;
        }
        ds1Var.f(zzagpVar, r3);
        zzagpVar.zzf(ds1Var.d + ds1Var.e);
        long j15 = ds1Var.b;
        while ((ds1Var.a & 4) != 4 && ds1Var.e(zzagpVar, -1L) && zzagpVar.zzn() < j5 && ds1Var.f(zzagpVar, true)) {
            try {
                zzagpVar.zzf(ds1Var.d + ds1Var.e);
                j15 = ds1Var.b;
            } catch (EOFException unused) {
            }
        }
        this.d = j15;
        this.c = 4;
        return this.e;
    }

    @Override // io.p071bidmachine.media3.extractor.ogg.e
    public z createSeekMap() {
        if (this.d != 0) {
            return new a(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    @Override // io.p071bidmachine.media3.extractor.ogg.e
    public long k(n nVar) throws IOException {
        long j;
        long jI;
        ds1 ds1Var = (ds1) this.k;
        int i = this.c;
        long j2 = this.b;
        if (i == 0) {
            long position = nVar.getPosition();
            this.e = position;
            this.c = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.g == this.h) {
                    jI = -1;
                } else {
                    long position2 = nVar.getPosition();
                    if (ds1Var.d(nVar, this.h)) {
                        ds1Var.b(nVar, false);
                        nVar.resetPeekPosition();
                        long j4 = this.f;
                        long j5 = ds1Var.b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = ds1Var.d + ds1Var.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.h = position2;
                                this.j = j5;
                            } else {
                                this.g = nVar.getPosition() + ((long) i2);
                                this.i = ds1Var.b;
                            }
                            long j7 = this.h;
                            long j8 = this.g;
                            if (j7 - j8 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.h = j8;
                                jI = j8;
                            } else {
                                long position3 = nVar.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.h;
                                long j10 = this.g;
                                jI = x.i((((j9 - j10) * j6) / (this.j - this.i)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jI = -1;
                        }
                    } else {
                        jI = this.g;
                        if (jI == position2) {
                            dr0.h("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jI != -1) {
                        return jI;
                    }
                    this.c = 3;
                }
                j = 2;
                if (jI != -1) {
                    return jI;
                }
                this.c = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    y.b();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                ds1Var.d(nVar, -1L);
                ds1Var.b(nVar, false);
                if (ds1Var.b > this.f) {
                    nVar.resetPeekPosition();
                    this.c = 4;
                    return -(this.i + j);
                }
                nVar.skipFully(ds1Var.d + ds1Var.e);
                this.g = nVar.getPosition();
                this.i = ds1Var.b;
            }
        }
        ds1Var.a = 0;
        ds1Var.b = 0L;
        ds1Var.c = 0;
        ds1Var.d = 0;
        ds1Var.e = 0;
        if (!ds1Var.d(nVar, -1L)) {
            d.s();
            return 0L;
        }
        ds1Var.b(nVar, false);
        nVar.skipFully(ds1Var.d + ds1Var.e);
        long j11 = ds1Var.b;
        while ((ds1Var.a & 4) != 4 && ds1Var.d(nVar, -1L) && nVar.getPosition() < j2 && ds1Var.b(nVar, true)) {
            try {
                nVar.skipFully(ds1Var.d + ds1Var.e);
                j11 = ds1Var.b;
            } catch (EOFException unused) {
            }
        }
        this.d = j11;
        this.c = 4;
        return this.e;
    }

    @Override // io.p071bidmachine.media3.extractor.ogg.e
    public void startSeek(long j) {
        this.f = x.i(j, 0L, this.d - 1);
        this.c = 2;
        this.g = this.a;
        this.h = this.b;
        this.i = 0L;
        this.j = this.d;
    }

    @Override // defpackage.lt3
    public /* bridge */ /* synthetic */ zzahr zzc() {
        if (this.d != 0) {
            return new et3(this);
        }
        return null;
    }

    public b(g gVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        boolean z3;
        if (j >= 0 && j2 > j) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzgvz.a(z3);
        this.l = gVar;
        this.a = j;
        this.b = j2;
        if (j3 != j2 - j && !z) {
            this.c = 0;
        } else {
            this.d = j4;
            this.c = 4;
        }
        this.k = new ds1(2);
    }

    public b(g gVar, long j, long j2, long j3, long j4, boolean z) {
        a.c(j >= 0 && j2 > j);
        this.l = gVar;
        this.a = j;
        this.b = j2;
        if (j3 != j2 - j && !z) {
            this.c = 0;
        } else {
            this.d = j4;
            this.c = 4;
        }
        this.k = new ds1(1);
    }
}
