package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import com.facebook.appevents.p;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zziz;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ea5 implements pa5 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public r9 c;
    public final AtomicReference d = new AtomicReference();
    public final zzdt e;
    public boolean f;

    public static da5 d() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new da5();
                }
                return (da5) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pa5
    public final void zza() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new r9(this, handlerThread.getLooper(), 3);
        this.f = true;
    }

    @Override // defpackage.pa5
    public final void zze() {
        if (this.f) {
            try {
                r9 r9Var = this.c;
                if (r9Var == null) {
                    throw null;
                }
                r9Var.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.e;
                synchronized (zzdtVar) {
                    zzdtVar.a = false;
                }
                r9 r9Var2 = this.c;
                if (r9Var2 == null) {
                    throw null;
                }
                r9Var2.obtainMessage(3).sendToTarget();
                synchronized (zzdtVar) {
                    while (!zzdtVar.a) {
                        zzdtVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                p.g(e);
            }
        }
    }

    @Override // defpackage.pa5
    public final void zzf() {
        if (this.f) {
            zze();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.pa5
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public ea5(MediaCodec mediaCodec, HandlerThread handlerThread, zzdt zzdtVar) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = zzdtVar;
    }

    @Override // defpackage.pa5
    public final void a(int i, zziz zzizVar, long j, int i2) {
        int length;
        int length2;
        int length3;
        int length4;
        zzg();
        da5 da5VarD = d();
        da5VarD.a = i;
        da5VarD.b = 0;
        da5VarD.d = j;
        da5VarD.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = da5VarD.c;
        cryptoInfo.numSubSamples = zzizVar.f;
        int[] iArr = zzizVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf != null && iArrCopyOf.length >= (length4 = iArr.length)) {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = zzizVar.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 != null && iArrCopyOf2.length >= (length3 = iArr2.length)) {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            } else {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = zzizVar.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf != null && bArrCopyOf.length >= (length2 = bArr.length)) {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            } else {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = zzizVar.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 != null && bArrCopyOf2.length >= (length = bArr2.length)) {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            } else {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = zzizVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzizVar.g, zzizVar.h));
        r9 r9Var = this.c;
        String str = zzfq.a;
        r9Var.obtainMessage(2, da5VarD).sendToTarget();
    }

    @Override // defpackage.pa5
    public final void b(Bundle bundle) {
        zzg();
        r9 r9Var = this.c;
        String str = zzfq.a;
        r9Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.pa5
    public final void c(int i, int i2, int i3, long j) {
        zzg();
        da5 da5VarD = d();
        da5VarD.a = i;
        da5VarD.b = i2;
        da5VarD.d = j;
        da5VarD.e = i3;
        r9 r9Var = this.c;
        String str = zzfq.a;
        r9Var.obtainMessage(1, da5VarD).sendToTarget();
    }
}
