package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tk1 {
    public final PlayerId a;
    public final f e;
    public final MediaSourceEventListener.EventDispatcher f;
    public final DrmSessionEventListener.EventDispatcher g;
    public final HashMap h;
    public final HashSet i;
    public boolean k;
    public TransferListener l;
    public ShuffleOrder j = new ShuffleOrder.DefaultShuffleOrder(0);
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            sk1 sk1Var = (sk1) arrayList.remove(i3);
            this.d.remove(sk1Var.b);
            int i4 = -sk1Var.a.getTimeline().getWindowCount();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((sk1) arrayList.get(i5)).d += i4;
            }
            sk1Var.e = true;
            if (this.k) {
                d(sk1Var);
            }
        }
    }

    public final Timeline b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sk1 sk1Var = (sk1) arrayList.get(i);
            sk1Var.d = windowCount;
            windowCount += sk1Var.a.getTimeline().getWindowCount();
        }
        return new lv1(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            sk1 sk1Var = (sk1) it.next();
            if (sk1Var.c.isEmpty()) {
                rk1 rk1Var = (rk1) this.h.get(sk1Var);
                if (rk1Var != null) {
                    rk1Var.a.disable(rk1Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(sk1 sk1Var) {
        if (sk1Var.e && sk1Var.c.isEmpty()) {
            rk1 rk1Var = (rk1) Assertions.checkNotNull((rk1) this.h.remove(sk1Var));
            MediaSource mediaSource = rk1Var.a;
            qk1 qk1Var = rk1Var.c;
            mediaSource.releaseSource(rk1Var.b);
            mediaSource.removeEventListener(qk1Var);
            mediaSource.removeDrmEventListener(qk1Var);
            this.i.remove(sk1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller, pk1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(sk1 sk1Var) {
        MaskingMediaSource maskingMediaSource = sk1Var.a;
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: pk1
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.a.e.onPlaylistUpdateRequested();
            }
        };
        qk1 qk1Var = new qk1(this, sk1Var);
        this.h.put(sk1Var, new rk1(maskingMediaSource, r1, qk1Var));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), qk1Var);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), qk1Var);
        maskingMediaSource.prepareSource(r1, this.l, this.a);
    }

    public final void f(MediaPeriod mediaPeriod) {
        IdentityHashMap identityHashMap = this.c;
        sk1 sk1Var = (sk1) Assertions.checkNotNull((sk1) identityHashMap.remove(mediaPeriod));
        sk1Var.a.releasePeriod(mediaPeriod);
        sk1Var.c.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(sk1Var);
    }

    public tk1(f fVar, AnalyticsCollector analyticsCollector, Handler handler, PlayerId playerId) {
        this.a = playerId;
        this.e = fVar;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
        this.f = eventDispatcher;
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = new DrmSessionEventListener.EventDispatcher();
        this.g = eventDispatcher2;
        this.h = new HashMap();
        this.i = new HashSet();
        eventDispatcher.addEventListener(handler, analyticsCollector);
        eventDispatcher2.addEventListener(handler, analyticsCollector);
    }

    public final Timeline a(int i, ArrayList arrayList, ShuffleOrder shuffleOrder) {
        if (!arrayList.isEmpty()) {
            this.j = shuffleOrder;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                sk1 sk1Var = (sk1) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    sk1 sk1Var2 = (sk1) arrayList2.get(i2 - 1);
                    sk1Var.d = sk1Var2.a.getTimeline().getWindowCount() + sk1Var2.d;
                    sk1Var.e = false;
                    sk1Var.c.clear();
                } else {
                    sk1Var.d = 0;
                    sk1Var.e = false;
                    sk1Var.c.clear();
                }
                int windowCount = sk1Var.a.getTimeline().getWindowCount();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((sk1) arrayList2.get(i3)).d += windowCount;
                }
                arrayList2.add(i2, sk1Var);
                this.d.put(sk1Var.b, sk1Var);
                if (this.k) {
                    e(sk1Var);
                    if (this.c.isEmpty()) {
                        this.i.add(sk1Var);
                    } else {
                        rk1 rk1Var = (rk1) this.h.get(sk1Var);
                        if (rk1Var != null) {
                            rk1Var.a.disable(rk1Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }
}
