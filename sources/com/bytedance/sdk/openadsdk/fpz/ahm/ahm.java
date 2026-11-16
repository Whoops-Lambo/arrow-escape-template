package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ahm {
    protected ioy ahm;
    private final AtomicBoolean ct;
    private final Integer fi;
    private volatile boolean gf = false;
    protected WeakReference<View> kgy;
    private final ct.kgy noq;
    protected final AtomicBoolean rz;
    private final AtomicLong uq;
    private final int yo;

    public abstract void ahm(int i);

    public void kgy(int i) {
        if (i == 4) {
            kgy();
            return;
        }
        if (i == 8) {
            twf();
        } else if (i == 9) {
            uq();
        } else {
            ahm(i);
        }
    }

    public abstract int noq();

    public void ra() {
        this.gf = true;
        yo.ahm(this);
    }

    public abstract boolean rz();

    public boolean at() {
        return this.rz.get();
    }

    public kgy ct() {
        WeakReference<View> weakReference = this.kgy;
        if (weakReference == null) {
            return new kgy(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new kgy(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new kgy(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void fi() {
        this.uq.set(-1L);
    }

    public boolean gf() {
        return this.ct.get();
    }

    public Integer nu() {
        return this.fi;
    }

    public void twf() {
        this.rz.set(false);
        fi();
    }

    public void uq() {
        if (this.ct.compareAndSet(false, true)) {
            uq.kgy(this.ahm, ct(), this.noq);
        }
    }

    public ahm(Integer num, View view, ioy ioyVar, int i, ct.kgy kgyVar) {
        this.fi = num;
        this.yo = i;
        this.ahm = ioyVar;
        this.noq = kgyVar;
        kgy(view);
        this.rz = new AtomicBoolean(false);
        this.uq = new AtomicLong(-1L);
        this.ct = new AtomicBoolean(false);
    }

    public int ahm() {
        View view;
        if (gf()) {
            return 1;
        }
        WeakReference<View> weakReference = this.kgy;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null || this.gf) {
            return 3;
        }
        if (!nu().equals(view.getTag(33554433))) {
            ra();
            ct.ahm(nu());
            return 3;
        }
        if (nu().equals(view.getTag(33554433)) && rz()) {
            return 1;
        }
        return 2;
    }

    public void yo() {
        if (!gf()) {
            if (!this.rz.get()) {
                fi();
            } else if (!this.uq.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.uq.get() >= this.yo) {
                uq();
            }
        }
    }

    public void kgy() {
        if (this.rz.compareAndSet(false, true)) {
            yo.kgy(this);
        }
    }

    public static ahm kgy(boolean z, Integer num, View view, ioy ioyVar, ct.kgy kgyVar) {
        return z ? new fi(num, view, ioyVar, kgyVar) : new rz(num, view, ioyVar, kgyVar);
    }

    public void kgy(View view) {
        if (view != null) {
            view.setTag(33554433, nu());
        }
        this.kgy = new WeakReference<>(view);
    }
}
