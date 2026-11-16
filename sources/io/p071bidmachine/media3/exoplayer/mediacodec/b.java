package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.graphics.Bitmap;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import androidx.collection.CircularIntArray;
import com.facebook.internal.v;
import com.facebook.login.p;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvu;
import com.moloco.sdk.internal.services.bidtoken.s;
import defpackage.fj4;
import defpackage.o15;
import defpackage.pa5;
import defpackage.r85;
import defpackage.r9;
import defpackage.yi4;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.e0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.video.g;
import io.p071bidmachine.rendering.c;
import io.p071bidmachine.util.e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements k, c, zzvu {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    @Override // io.p071bidmachine.rendering.c
    public void e(e eVar) {
    }

    @Override // io.p071bidmachine.util.i
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        s sVar = (s) this.f;
        try {
            View view = (View) ((WeakReference) this.e).get();
            if (view == null) {
                return;
            }
            sVar.f(view, this.a, bitmap, this.b, (Integer) this.c, (e0) this.d);
        } catch (Throwable unused) {
        }
    }

    public static void s(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        p pVar;
        LoudnessCodecController loudnessCodecController;
        e eVar = (e) bVar.d;
        MediaCodec mediaCodec = (MediaCodec) bVar.c;
        HandlerThread handlerThread = eVar.c;
        a.i(eVar.d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(eVar, handler);
        eVar.d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        d dVar = (d) bVar.e;
        HandlerThread handlerThread2 = dVar.b;
        if (!dVar.f) {
            handlerThread2.start();
            dVar.c = new r9(dVar, handlerThread2.getLooper(), 2);
            dVar.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (x.a >= 35 && (pVar = (p) bVar.f) != null && ((loudnessCodecController = (LoudnessCodecController) pVar.c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            a.i(((HashSet) pVar.a).add(mediaCodec));
        }
        bVar.b = 1;
    }

    public static String t(int i, String str) {
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

    public static String v(int i, String str) {
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

    @Override // com.google.android.gms.internal.ads.zzvu
    public void a(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public boolean b(r85 r85Var) {
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            eVar.p = r85Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public ByteBuffer c(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public int d(MediaCodec.BufferInfo bufferInfo) {
        ((pa5) this.e).zzg();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                eVar.c();
                if (eVar.k > 0 || eVar.l) {
                    return -1;
                }
                zzdo zzdoVar = (zzdo) eVar.o;
                int i = zzdoVar.b;
                int i2 = zzdoVar.c;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = zzdoVar.a[i];
                zzdoVar.b = zzdoVar.d & (i + 1);
                if (i3 >= 0) {
                    if (eVar.g == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.e.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    eVar.g = (MediaFormat) eVar.f.remove();
                    i3 = -2;
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public int dequeueInputBufferIndex() {
        ((d) this.e).c();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                IllegalStateException illegalStateException = eVar.m;
                if (illegalStateException != null) {
                    eVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.i;
                if (codecException != null) {
                    eVar.i = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.j;
                if (cryptoException != null) {
                    eVar.j = null;
                    throw cryptoException;
                }
                boolean z = true;
                int iB = -1;
                if (eVar.k > 0 || eVar.l) {
                    return -1;
                }
                CircularIntArray circularIntArray = (CircularIntArray) eVar.n;
                if (circularIntArray.b != circularIntArray.c) {
                    z = false;
                }
                if (!z) {
                    iB = circularIntArray.b();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        ((d) this.e).c();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                IllegalStateException illegalStateException = eVar.m;
                if (illegalStateException != null) {
                    eVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.i;
                if (codecException != null) {
                    eVar.i = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.j;
                if (cryptoException != null) {
                    eVar.j = null;
                    throw cryptoException;
                }
                boolean z = true;
                if (eVar.k > 0 || eVar.l) {
                    return -1;
                }
                CircularIntArray circularIntArray = (CircularIntArray) eVar.o;
                if (circularIntArray.b != circularIntArray.c) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                int iB = circularIntArray.b();
                if (iB >= 0) {
                    a.j(eVar.g);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.e.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    eVar.g = (MediaFormat) eVar.f.remove();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void detachOutputSurface() {
        ((MediaCodec) this.c).detachOutputSurface();
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void f(int i, io.p071bidmachine.media3.decoder.a aVar, long j, int i2) {
        d dVar = (d) this.e;
        dVar.c();
        c cVarB = d.b();
        cVarB.a = i;
        cVarB.b = 0;
        cVarB.d = j;
        cVarB.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = cVarB.c;
        cryptoInfo.numSubSamples = aVar.f;
        int[] iArr = aVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = aVar.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = aVar.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = aVar.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = aVar.c;
        if (x.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(aVar.g, aVar.h));
        }
        dVar.c.obtainMessage(2, cVarB).sendToTarget();
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void flush() {
        ((d) this.e).a();
        ((MediaCodec) this.c).flush();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            eVar.k++;
            Handler handler = eVar.d;
            int i = x.a;
            handler.post(new v(eVar, 25));
        }
        ((MediaCodec) this.c).start();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void g(int i) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, false);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                mediaFormat = eVar.g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void h(yi4 yi4Var) {
        fj4 fj4Var = new fj4(15, this, yi4Var);
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            eVar.c();
            fj4Var.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void i(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void j(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public boolean k(w wVar) {
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            eVar.p = wVar;
        }
        return true;
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void l(int i) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, false);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void m(int i, int i2, int i3, long j) {
        d dVar = (d) this.e;
        dVar.c();
        c cVarB = d.b();
        cVarB.a = i;
        cVarB.b = i2;
        cVarB.d = j;
        cVarB.e = i3;
        r9 r9Var = dVar.c;
        int i4 = x.a;
        r9Var.obtainMessage(1, cVarB).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void n(int i, int i2, int i3, long j) {
        ((pa5) this.e).c(i, i2, i3, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void o(int i, zziz zzizVar, long j, int i2) {
        ((pa5) this.e).a(i, zzizVar, j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void p(ArrayList arrayList) {
        ((MediaCodec) this.c).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void q(Bundle bundle) {
        ((pa5) this.e).b(bundle);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void r(g gVar, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new a(this, gVar, 0), handler);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void release() {
        p pVar;
        p pVar2;
        try {
            if (this.b == 1) {
                d dVar = (d) this.e;
                if (dVar.f) {
                    dVar.a();
                    dVar.b.quit();
                }
                dVar.f = false;
                e eVar = (e) this.d;
                synchronized (eVar.b) {
                    eVar.l = true;
                    eVar.c.quit();
                    eVar.a();
                }
            }
            this.b = 2;
            if (this.a) {
                return;
            }
            try {
                int i = x.a;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.c).stop();
                }
            } finally {
                if (x.a >= 35 && (pVar2 = (p) this.f) != null) {
                    pVar2.c0((MediaCodec) this.c);
                }
                ((MediaCodec) this.c).release();
                this.a = true;
            }
        } catch (Throwable th) {
            if (!this.a) {
                try {
                    int i2 = x.a;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.c).stop();
                    }
                } finally {
                    if (x.a >= 35 && (pVar = (p) this.f) != null) {
                        pVar.c0((MediaCodec) this.c);
                    }
                    ((MediaCodec) this.c).release();
                    this.a = true;
                }
            }
            throw th;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void releaseOutputBuffer(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void setOutputSurface(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void setParameters(Bundle bundle) {
        d dVar = (d) this.e;
        dVar.c();
        r9 r9Var = dVar.c;
        int i = x.a;
        r9Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.k
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    public void u(MediaFormat mediaFormat, Surface surface, int i) {
        zzvq zzvqVar;
        LoudnessCodecController loudnessCodecController;
        e eVar = (e) this.d;
        MediaCodec mediaCodec = (MediaCodec) this.c;
        zzgvz.f(eVar.d == null);
        HandlerThread handlerThread = eVar.c;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(eVar, handler);
        eVar.d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        ((pa5) this.e).zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzvqVar = (zzvq) this.f) != null && ((loudnessCodecController = zzvqVar.b) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            zzgvz.f(zzvqVar.a.add(mediaCodec));
        }
        this.b = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public int zze() {
        ((pa5) this.e).zzg();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                eVar.c();
                int i = -1;
                if (eVar.k > 0 || eVar.l) {
                    return -1;
                }
                zzdo zzdoVar = (zzdo) eVar.n;
                int i2 = zzdoVar.b;
                int i3 = zzdoVar.c;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = zzdoVar.a[i2];
                    zzdoVar.b = (i2 + 1) & zzdoVar.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public MediaFormat zzg() {
        MediaFormat mediaFormat;
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            try {
                mediaFormat = eVar.g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public ByteBuffer zzh(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void zzk() {
        ((pa5) this.e).zze();
        MediaCodec mediaCodec = (MediaCodec) this.c;
        mediaCodec.flush();
        e eVar = (e) this.d;
        synchronized (eVar.b) {
            eVar.k++;
            Handler handler = eVar.d;
            String str = zzfq.a;
            handler.post(new o15(eVar, 15));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void zzl() {
        zzvq zzvqVar;
        zzvq zzvqVar2;
        zzvq zzvqVar3;
        try {
            try {
                if (this.b == 1) {
                    ((pa5) this.e).zzf();
                    e eVar = (e) this.d;
                    synchronized (eVar.b) {
                        eVar.l = true;
                        eVar.c.quit();
                        eVar.b();
                    }
                }
                this.b = 2;
                if (this.a) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.c).stop();
                }
                if (i >= 35 && (zzvqVar3 = (zzvq) this.f) != null) {
                    zzvqVar3.b((MediaCodec) this.c);
                }
                ((MediaCodec) this.c).release();
                this.a = true;
            } catch (Throwable th) {
                if (!this.a) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.c).stop();
                    }
                    if (i2 >= 35 && (zzvqVar2 = (zzvq) this.f) != null) {
                        zzvqVar2.b((MediaCodec) this.c);
                    }
                    ((MediaCodec) this.c).release();
                    this.a = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzvqVar = (zzvq) this.f) != null) {
                zzvqVar.b((MediaCodec) this.c);
            }
            ((MediaCodec) this.c).release();
            this.a = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public void zzo() {
        ((MediaCodec) this.c).detachOutputSurface();
    }

    public b(s sVar, View view, boolean z, int i, Integer num, e0 e0Var) {
        view.getClass();
        this.f = sVar;
        this.a = z;
        this.b = i;
        this.c = num;
        this.d = e0Var;
        this.e = new WeakReference(view);
    }

    public /* synthetic */ b(MediaCodec mediaCodec, HandlerThread handlerThread, pa5 pa5Var, zzvq zzvqVar) {
        this.c = mediaCodec;
        this.d = new e(handlerThread, 1);
        this.e = pa5Var;
        this.f = zzvqVar;
        this.b = 0;
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, d dVar, p pVar) {
        this.c = mediaCodec;
        this.d = new e(handlerThread, 0);
        this.e = dVar;
        this.f = pVar;
        this.b = 0;
    }
}
