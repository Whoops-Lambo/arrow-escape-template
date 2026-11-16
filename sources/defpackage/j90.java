package defpackage;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 implements es1 {
    public final ds1 a;
    public final long b;
    public final long c;
    public final mj2 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    @Override // defpackage.es1
    public final SeekMap createSeekMap() {
        if (this.f != 0) {
            return new i90(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.es1
    public final long read(ExtractorInput extractorInput) throws IOException {
        long j;
        long jConstrainValue;
        int i = this.e;
        long j2 = this.c;
        ds1 ds1Var = this.a;
        if (i == 0) {
            long position = extractorInput.getPosition();
            this.g = position;
            this.e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    jConstrainValue = -1;
                } else {
                    long position2 = extractorInput.getPosition();
                    if (ds1Var.c(extractorInput, this.j)) {
                        ds1Var.a(extractorInput, false);
                        extractorInput.resetPeekPosition();
                        long j4 = this.h;
                        long j5 = ds1Var.b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = ds1Var.d + ds1Var.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.j = position2;
                                this.l = j5;
                            } else {
                                this.i = extractorInput.getPosition() + ((long) i2);
                                this.k = ds1Var.b;
                            }
                            long j7 = this.j;
                            long j8 = this.i;
                            if (j7 - j8 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.j = j8;
                                jConstrainValue = j8;
                            } else {
                                long position3 = extractorInput.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.j;
                                long j10 = this.i;
                                jConstrainValue = Util.constrainValue((((j9 - j10) * j6) / (this.l - this.k)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jConstrainValue = -1;
                        }
                    } else {
                        jConstrainValue = this.i;
                        if (jConstrainValue == position2) {
                            dr0.h("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jConstrainValue != -1) {
                        return jConstrainValue;
                    }
                    this.e = 3;
                }
                j = 2;
                if (jConstrainValue != -1) {
                    return jConstrainValue;
                }
                this.e = 3;
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
                ds1Var.c(extractorInput, -1L);
                ds1Var.a(extractorInput, false);
                if (ds1Var.b > this.h) {
                    extractorInput.resetPeekPosition();
                    this.e = 4;
                    return -(this.k + j);
                }
                extractorInput.skipFully(ds1Var.d + ds1Var.e);
                this.i = extractorInput.getPosition();
                this.k = ds1Var.b;
            }
        }
        ds1Var.a = 0;
        ds1Var.b = 0L;
        ds1Var.c = 0;
        ds1Var.d = 0;
        ds1Var.e = 0;
        if (!ds1Var.c(extractorInput, -1L)) {
            d.s();
            return 0L;
        }
        ds1Var.a(extractorInput, false);
        extractorInput.skipFully(ds1Var.d + ds1Var.e);
        long j11 = ds1Var.b;
        while ((ds1Var.a & 4) != 4 && ds1Var.c(extractorInput, -1L) && extractorInput.getPosition() < j2 && ds1Var.a(extractorInput, true) && ExtractorUtil.skipFullyQuietly(extractorInput, ds1Var.d + ds1Var.e)) {
            j11 = ds1Var.b;
        }
        this.f = j11;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.es1
    public final void startSeek(long j) {
        this.h = Util.constrainValue(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    public j90(mj2 mj2Var, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.d = mj2Var;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.a = new ds1(0);
    }
}
