package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.TraceUtil;
import defpackage.ol2;
import defpackage.q9;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class AsynchronousMediaCodecAdapter$Factory implements MediaCodecAdapter.Factory {
    private final ol2 callbackThreadSupplier;
    private final ol2 queueingThreadSupplier;
    private final boolean synchronizeCodecInteractionsWithQueueing;

    public AsynchronousMediaCodecAdapter$Factory(int i, boolean z) {
        this(new q9(i, 0), new q9(i, 2), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HandlerThread lambda$new$0(int i) {
        return new HandlerThread(a.b(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HandlerThread lambda$new$1(int i) {
        return new HandlerThread(a.b(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    public a createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = configuration.codecInfo.name;
        a aVar = null;
        try {
            TraceUtil.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                a aVar2 = new a(mediaCodecCreateByCodecName, (HandlerThread) this.callbackThreadSupplier.get(), (HandlerThread) this.queueingThreadSupplier.get(), this.synchronizeCodecInteractionsWithQueueing);
                try {
                    TraceUtil.endSection();
                    a.a(aVar2, configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                    return aVar2;
                } catch (Exception e) {
                    e = e;
                    aVar = aVar2;
                    if (aVar != null) {
                        aVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @VisibleForTesting
    public AsynchronousMediaCodecAdapter$Factory(ol2 ol2Var, ol2 ol2Var2, boolean z) {
        this.callbackThreadSupplier = ol2Var;
        this.queueingThreadSupplier = ol2Var2;
        this.synchronizeCodecInteractionsWithQueueing = z;
    }
}
