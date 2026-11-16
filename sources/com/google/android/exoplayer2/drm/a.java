package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Log;
import defpackage.g80;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Handler {
    public boolean a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Looper looper) {
        super(looper);
        this.b = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        IOException iOException;
        Object objExecuteProvisionRequest;
        g80 g80Var = (g80) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                b bVar = this.b;
                objExecuteProvisionRequest = bVar.l.executeProvisionRequest(bVar.m, (ExoMediaDrm.ProvisionRequest) g80Var.d);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                b bVar2 = this.b;
                objExecuteProvisionRequest = bVar2.l.executeKeyRequest(bVar2.m, (ExoMediaDrm.KeyRequest) g80Var.d);
            }
        } catch (MediaDrmCallbackException e) {
            g80 g80Var2 = (g80) message.obj;
            objExecuteProvisionRequest = e;
            if (g80Var2.b) {
                int i2 = g80Var2.e + 1;
                g80Var2.e = i2;
                if (i2 <= this.b.j.getMinimumLoadableRetryCount(3)) {
                    LoadEventInfo loadEventInfo = new LoadEventInfo(g80Var2.a, e.dataSpec, e.uriAfterRedirects, e.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - g80Var2.c, e.bytesLoaded);
                    MediaLoadData mediaLoadData = new MediaLoadData(3);
                    if (e.getCause() instanceof IOException) {
                        objExecuteProvisionRequest = e;
                        iOException = (IOException) e.getCause();
                    } else {
                        objExecuteProvisionRequest = e;
                        final Throwable cause = e.getCause();
                        iOException = new IOException(cause) { // from class: com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
                        };
                    }
                    long retryDelayMsFor = this.b.j.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, mediaLoadData, iOException, g80Var2.e));
                    objExecuteProvisionRequest = e;
                    if (retryDelayMsFor != -9223372036854775807L) {
                        synchronized (this) {
                            try {
                                if (!this.a) {
                                    sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                                    return;
                                }
                                objExecuteProvisionRequest = e;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Log.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objExecuteProvisionRequest = e2;
        }
        objExecuteProvisionRequest = e;
        this.b.j.onLoadTaskConcluded(g80Var.a);
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.n.obtainMessage(message.what, Pair.create(g80Var.d, objExecuteProvisionRequest)).sendToTarget();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
