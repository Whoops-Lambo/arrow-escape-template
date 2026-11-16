package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzwq implements zzvu {
    public final MediaCodec a;
    public final zzvq b;

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void a(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final ByteBuffer c(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void g(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void n(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void o(int i, zziz zzizVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, zzizVar.i, j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void p(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void q(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zze() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final MediaFormat zzg() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final ByteBuffer zzh(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzk() {
        this.a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzl() {
        zzvq zzvqVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && zzvqVar != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && zzvqVar != null) {
                zzvqVar.b(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzo() {
        this.a.detachOutputSurface();
    }

    public zzwq(MediaCodec mediaCodec, zzvq zzvqVar) {
        this.a = mediaCodec;
        this.b = zzvqVar;
        if (Build.VERSION.SDK_INT >= 35 && zzvqVar != null) {
            LoudnessCodecController loudnessCodecController = zzvqVar.b;
            if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
                zzgvz.f(zzvqVar.a.add(mediaCodec));
            }
        }
    }
}
