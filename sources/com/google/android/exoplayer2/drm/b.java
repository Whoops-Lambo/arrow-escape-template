package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import defpackage.g80;
import defpackage.h80;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements DrmSession {
    public final List a;
    public final ExoMediaDrm b;
    public final DefaultDrmSession$ProvisioningManager c;
    public final DefaultDrmSession$ReferenceCountListener d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final CopyOnWriteMultiset i;
    public final LoadErrorHandlingPolicy j;
    public final PlayerId k;
    public final MediaDrmCallback l;
    public final UUID m;
    public final h80 n;
    public int o;
    public int p;
    public HandlerThread q;
    public a r;
    public CryptoConfig s;
    public DrmSession.DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public ExoMediaDrm.KeyRequest w;
    public ExoMediaDrm.ProvisionRequest x;

    public final void f(byte[] bArr, int i, boolean z) {
        try {
            this.w = this.b.getKeyRequest(bArr, this.a, i, this.h);
            a aVar = (a) Util.castNonNull(this.r);
            Object objCheckNotNull = Assertions.checkNotNull(this.w);
            aVar.getClass();
            aVar.obtainMessage(1, new g80(LoadEventInfo.getNewId(), z, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
        } catch (Exception e) {
            d(e, true);
        }
    }

    public final void a(boolean z) {
        long jMin;
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) Util.castNonNull(this.u);
        ExoMediaDrm exoMediaDrm = this.b;
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Assertions.checkNotNull(this.v);
                Assertions.checkNotNull(this.u);
                f(this.v, 3, z);
                return;
            }
            byte[] bArr2 = this.v;
            if (bArr2 != null) {
                try {
                    exoMediaDrm.restoreKeys(this.u, bArr2);
                } catch (Exception e) {
                    c(e, 1);
                    return;
                }
            }
            f(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.v;
        if (bArr3 == null) {
            f(bArr, 1, z);
            return;
        }
        if (this.o != 4) {
            try {
                exoMediaDrm.restoreKeys(this.u, bArr3);
            } catch (Exception e2) {
                c(e2, 1);
                return;
            }
        }
        if (C.WIDEVINE_UUID.equals(this.m)) {
            Pair pair = (Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(this));
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (i == 0 && jMin <= 60) {
            Log.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            f(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            c(new KeysExpiredException(), 2);
            return;
        }
        this.o = 4;
        Iterator it = this.i.elementSet().iterator();
        while (it.hasNext()) {
            ((DrmSessionEventListener.EventDispatcher) it.next()).drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        if (this.p < 0) {
            Log.e("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        CopyOnWriteMultiset copyOnWriteMultiset = this.i;
        if (eventDispatcher != null) {
            copyOnWriteMultiset.add(eventDispatcher);
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            Assertions.checkState(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new a(this, this.q.getLooper());
            if (e()) {
                a(true);
            }
        } else if (eventDispatcher != null && b() && copyOnWriteMultiset.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.o);
        }
        this.d.onReferenceCountIncremented(this, this.p);
    }

    public final boolean b() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    public final void c(Exception exc, int i) {
        this.t = new DrmSession.DrmSessionException(exc, DrmUtil.getErrorCodeForMediaDrmException(exc, i));
        Log.e("DefaultDrmSession", "DRM session error", exc);
        Iterator it = this.i.elementSet().iterator();
        while (it.hasNext()) {
            ((DrmSessionEventListener.EventDispatcher) it.next()).drmSessionManagerError(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void d(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.c.provisionRequired(this);
        } else {
            c(exc, z ? 1 : 2);
        }
    }

    public final boolean e() {
        ExoMediaDrm exoMediaDrm = this.b;
        if (b()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = exoMediaDrm.openSession();
            this.u = bArrOpenSession;
            exoMediaDrm.setPlayerIdForSession(bArrOpenSession, this.k);
            this.s = exoMediaDrm.createCryptoConfig(this.u);
            this.o = 3;
            Iterator it = this.i.elementSet().iterator();
            while (it.hasNext()) {
                ((DrmSessionEventListener.EventDispatcher) it.next()).drmSessionAcquired(3);
            }
            Assertions.checkNotNull(this.u);
            return true;
        } catch (NotProvisionedException unused) {
            this.c.provisionRequired(this);
            return false;
        } catch (Exception e) {
            c(e, 1);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final byte[] getOfflineLicenseKeySetId() {
        return this.v;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean playClearSamplesWithoutKeys() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final Map queryKeyStatus() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i = this.p;
        if (i <= 0) {
            Log.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            ((h80) Util.castNonNull(this.n)).removeCallbacksAndMessages(null);
            a aVar = (a) Util.castNonNull(this.r);
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.a = true;
            }
            this.r = null;
            ((HandlerThread) Util.castNonNull(this.q)).quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.u = null;
            }
        }
        if (eventDispatcher != null) {
            this.i.remove(eventDispatcher);
            if (this.i.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.d.onReferenceCountDecremented(this, this.p);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean requiresSecureDecoder(String str) {
        return this.b.requiresSecureDecoder((byte[]) Assertions.checkStateNotNull(this.u), str);
    }

    public b(UUID uuid, ExoMediaDrm exoMediaDrm, DefaultDrmSession$ProvisioningManager defaultDrmSession$ProvisioningManager, DefaultDrmSession$ReferenceCountListener defaultDrmSession$ReferenceCountListener, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
        if (i == 1 || i == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.m = uuid;
        this.c = defaultDrmSession$ProvisioningManager;
        this.d = defaultDrmSession$ReferenceCountListener;
        this.b = exoMediaDrm;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) Assertions.checkNotNull(list));
        }
        this.h = map;
        this.l = mediaDrmCallback;
        this.i = new CopyOnWriteMultiset();
        this.j = loadErrorHandlingPolicy;
        this.k = playerId;
        this.o = 2;
        this.n = new h80(this, looper);
    }
}
