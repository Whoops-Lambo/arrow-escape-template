package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import com.facebook.appevents.p;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import defpackage.ca;
import defpackage.p9;
import defpackage.r9;
import defpackage.s3;
import defpackage.s9;
import defpackage.t9;
import defpackage.u9;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements MediaCodecAdapter {
    public final MediaCodec a;
    public final u9 b;
    public final t9 c;
    public final boolean d;
    public boolean e;
    public int f = 0;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void release() {
        try {
            if (this.f == 1) {
                t9 t9Var = this.c;
                if (t9Var.f) {
                    t9Var.a();
                    t9Var.b.quit();
                }
                t9Var.f = false;
                u9 u9Var = this.b;
                synchronized (u9Var.a) {
                    u9Var.l = true;
                    u9Var.b.quit();
                    u9Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            this.a.release();
            this.e = true;
        } catch (Throwable th) {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
            throw th;
        }
    }

    public static void a(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        u9 u9Var = aVar.b;
        MediaCodec mediaCodec = aVar.a;
        HandlerThread handlerThread = u9Var.b;
        int i2 = 0;
        Assertions.checkState(u9Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(u9Var, handler);
        u9Var.c = handler;
        TraceUtil.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        TraceUtil.endSection();
        t9 t9Var = aVar.c;
        HandlerThread handlerThread2 = t9Var.b;
        if (!t9Var.f) {
            handlerThread2.start();
            t9Var.c = new r9(t9Var, handlerThread2.getLooper(), i2);
            t9Var.f = true;
        }
        TraceUtil.beginSection("startCodec");
        mediaCodec.start();
        TraceUtil.endSection();
        aVar.f = 1;
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final void c() {
        if (this.d) {
            try {
                t9 t9Var = this.c;
                ConditionVariable conditionVariable = t9Var.e;
                conditionVariable.close();
                ((Handler) Assertions.checkNotNull(t9Var.c)).obtainMessage(2).sendToTarget();
                conditionVariable.block();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                p.g(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int dequeueInputBufferIndex() {
        u9 u9Var = this.b;
        synchronized (u9Var.a) {
            try {
                boolean z = true;
                int iB = -1;
                if (u9Var.k > 0 || u9Var.l) {
                    return -1;
                }
                IllegalStateException illegalStateException = u9Var.m;
                if (illegalStateException != null) {
                    u9Var.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = u9Var.j;
                if (codecException != null) {
                    u9Var.j = null;
                    throw codecException;
                }
                ca caVar = u9Var.d;
                if (caVar.d != 0) {
                    z = false;
                }
                if (!z) {
                    iB = caVar.b();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        u9 u9Var = this.b;
        synchronized (u9Var.a) {
            try {
                boolean z = true;
                if (u9Var.k > 0 || u9Var.l) {
                    return -1;
                }
                IllegalStateException illegalStateException = u9Var.m;
                if (illegalStateException != null) {
                    u9Var.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = u9Var.j;
                if (codecException != null) {
                    u9Var.j = null;
                    throw codecException;
                }
                ca caVar = u9Var.e;
                if (caVar.d != 0) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                int iB = caVar.b();
                if (iB >= 0) {
                    Assertions.checkStateNotNull(u9Var.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) u9Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    u9Var.h = (MediaFormat) u9Var.g.remove();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.c.a();
        this.a.flush();
        u9 u9Var = this.b;
        synchronized (u9Var.a) {
            u9Var.k++;
            ((Handler) Util.castNonNull(u9Var.c)).post(new s3(u9Var, 8));
        }
        this.a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        u9 u9Var = this.b;
        synchronized (u9Var.a) {
            try {
                mediaFormat = u9Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        t9 t9Var = this.c;
        RuntimeException runtimeException = (RuntimeException) t9Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        s9 s9VarB = t9.b();
        s9VarB.a = i;
        s9VarB.b = i2;
        s9VarB.c = i3;
        s9VarB.e = j;
        s9VarB.f = i4;
        ((Handler) Util.castNonNull(t9Var.c)).obtainMessage(0, s9VarB).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        t9 t9Var = this.c;
        RuntimeException runtimeException = (RuntimeException) t9Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        s9 s9VarB = t9.b();
        s9VarB.a = i;
        s9VarB.b = i2;
        s9VarB.c = 0;
        s9VarB.e = j;
        s9VarB.f = i3;
        MediaCodec.CryptoInfo cryptoInfo2 = s9VarB.d;
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        int[] iArrCopyOf = cryptoInfo2.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo2.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cryptoInfo.numBytesOfEncryptedData;
        int[] iArrCopyOf2 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cryptoInfo.key;
        byte[] bArrCopyOf = cryptoInfo2.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        cryptoInfo2.key = (byte[]) Assertions.checkNotNull(bArrCopyOf);
        byte[] bArr2 = cryptoInfo.iv;
        byte[] bArrCopyOf2 = cryptoInfo2.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        cryptoInfo2.iv = (byte[]) Assertions.checkNotNull(bArrCopyOf2);
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
        ((Handler) Util.castNonNull(t9Var.c)).obtainMessage(1, s9VarB).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.a = mediaCodec;
        this.b = new u9(handlerThread);
        this.c = new t9(mediaCodec, handlerThread2);
        this.d = z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final PersistableBundle getMetrics() {
        c();
        return this.a.getMetrics();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        c();
        this.a.setOnFrameRenderedListener(new p9(0, this, onFrameRenderedListener), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setOutputSurface(Surface surface) {
        c();
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setParameters(Bundle bundle) {
        c();
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i) {
        c();
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }
}
