package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener;
import com.google.android.exoplayer2.audio.d;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fb {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final AudioTrackPositionTracker$Listener a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public eb f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public final long a() {
        AudioTrack audioTrack = (AudioTrack) Assertions.checkNotNull(this.c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final void c(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new eb(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && Util.SDK_INT < 23 && (i == 5 || i == 6);
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(i);
        this.q = zIsEncodingLinearPcm;
        this.i = zIsEncodingLinearPcm ? (((long) (i3 / i2)) * 1000000) / ((long) this.g) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public fb(d dVar) {
        this.a = (AudioTrackPositionTracker$Listener) Assertions.checkNotNull(dVar);
        if (Util.SDK_INT >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final boolean b(long j) {
        if (j <= a()) {
            if (!this.h || ((AudioTrack) Assertions.checkNotNull(this.c)).getPlayState() != 2 || a() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
