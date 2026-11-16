package com.bytedance.adsdk.ahm.kgy.ahm;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class kgy<K, A> {
    private final rz<K> ct;
    protected com.bytedance.adsdk.ahm.yo.ahm<A> rz;
    final List<InterfaceC0185kgy> kgy = new ArrayList(1);
    private boolean uq = false;
    protected float ahm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private A noq = null;
    private float yo = -1.0f;
    private float fi = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ahm<T> implements rz<T> {
        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy() {
            return true;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float rz() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public com.bytedance.adsdk.ahm.yo.kgy<T> ahm() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float uq() {
            return 1.0f;
        }

        private ahm() {
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean ahm(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ct<T> implements rz<T> {
        private float ahm = -1.0f;
        private final com.bytedance.adsdk.ahm.yo.kgy<T> kgy;

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean ahm(float f) {
            if (this.ahm == f) {
                return true;
            }
            this.ahm = f;
            return false;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy(float f) {
            return !this.kgy.ct();
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float rz() {
            return this.kgy.rz();
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float uq() {
            return this.kgy.uq();
        }

        public ct(List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> list) {
            this.kgy = list.get(0);
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public com.bytedance.adsdk.ahm.yo.kgy<T> ahm() {
            return this.kgy;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.kgy.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0185kgy {
        void kgy();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface rz<T> {
        com.bytedance.adsdk.ahm.yo.kgy<T> ahm();

        boolean ahm(float f);

        boolean kgy();

        boolean kgy(float f);

        float rz();

        float uq();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class uq<T> implements rz<T> {
        private final List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> kgy;
        private com.bytedance.adsdk.ahm.yo.kgy<T> rz = null;
        private float uq = -1.0f;
        private com.bytedance.adsdk.ahm.yo.kgy<T> ahm = rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        private com.bytedance.adsdk.ahm.yo.kgy<T> rz(float f) {
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar = (com.bytedance.adsdk.ahm.yo.kgy) pv1.i(1, this.kgy);
            if (f >= kgyVar.rz()) {
                return kgyVar;
            }
            int size = this.kgy.size() - 2;
            while (true) {
                List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> list = this.kgy;
                if (size <= 0) {
                    return list.get(0);
                }
                com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar2 = list.get(size);
                if (this.ahm != kgyVar2 && kgyVar2.kgy(f)) {
                    return kgyVar2;
                }
                size--;
            }
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean ahm(float f) {
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar = this.rz;
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar2 = this.ahm;
            if (kgyVar == kgyVar2 && this.uq == f) {
                return true;
            }
            this.rz = kgyVar2;
            this.uq = f;
            return false;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy(float f) {
            if (this.ahm.kgy(f)) {
                return !this.ahm.ct();
            }
            this.ahm = rz(f);
            return true;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float uq() {
            return ((com.bytedance.adsdk.ahm.yo.kgy) pv1.i(1, this.kgy)).uq();
        }

        public uq(List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> list) {
            this.kgy = list;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public com.bytedance.adsdk.ahm.yo.kgy<T> ahm() {
            return this.ahm;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public boolean kgy() {
            return false;
        }

        @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.rz
        public float rz() {
            return this.kgy.get(0).rz();
        }
    }

    public void ahm() {
        for (int i = 0; i < this.kgy.size(); i++) {
            this.kgy.get(i).kgy();
        }
    }

    public abstract A kgy(com.bytedance.adsdk.ahm.yo.kgy<K> kgyVar, float f);

    private float gf() {
        if (this.yo == -1.0f) {
            this.yo = this.ct.rz();
        }
        return this.yo;
    }

    public float fi() {
        return this.ahm;
    }

    public void kgy(float f) {
        if (this.ct.kgy()) {
            return;
        }
        if (f < gf()) {
            f = gf();
        } else if (f > noq()) {
            f = noq();
        }
        if (f == this.ahm) {
            return;
        }
        this.ahm = f;
        if (this.ct.kgy(f)) {
            ahm();
        }
    }

    public float noq() {
        if (this.fi == -1.0f) {
            this.fi = this.ct.uq();
        }
        return this.fi;
    }

    public com.bytedance.adsdk.ahm.yo.kgy<K> rz() {
        com.bytedance.adsdk.ahm.ct.kgy("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.ahm.yo.kgy<K> kgyVarAhm = this.ct.ahm();
        com.bytedance.adsdk.ahm.ct.ahm("BaseKeyframeAnimation#getCurrentKeyframe");
        return kgyVarAhm;
    }

    public float uq() {
        if (this.uq) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.bytedance.adsdk.ahm.yo.kgy<K> kgyVarRz = rz();
        return kgyVarRz.ct() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.ahm - kgyVarRz.rz()) / (kgyVarRz.uq() - kgyVarRz.rz());
    }

    public kgy(List<? extends com.bytedance.adsdk.ahm.yo.kgy<K>> list) {
        this.ct = kgy(list);
    }

    public float ct() {
        com.bytedance.adsdk.ahm.yo.kgy<K> kgyVarRz = rz();
        if (kgyVarRz != null && !kgyVarRz.ct()) {
            return kgyVarRz.rz.getInterpolation(uq());
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public A yo() {
        A aKgy;
        float fUq = uq();
        if (this.rz == null && this.ct.ahm(fUq)) {
            return this.noq;
        }
        com.bytedance.adsdk.ahm.yo.kgy<K> kgyVarRz = rz();
        Interpolator interpolator = kgyVarRz.uq;
        if (interpolator != null && kgyVarRz.ct != null) {
            aKgy = kgy(kgyVarRz, fUq, interpolator.getInterpolation(fUq), kgyVarRz.ct.getInterpolation(fUq));
        } else {
            aKgy = kgy(kgyVarRz, ct());
        }
        this.noq = aKgy;
        return aKgy;
    }

    public void kgy() {
        this.uq = true;
    }

    public void kgy(InterfaceC0185kgy interfaceC0185kgy) {
        this.kgy.add(interfaceC0185kgy);
    }

    public A kgy(com.bytedance.adsdk.ahm.yo.kgy<K> kgyVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> rz<T> kgy(List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> list) {
        if (list.isEmpty()) {
            return new ahm();
        }
        if (list.size() == 1) {
            return new ct(list);
        }
        return new uq(list);
    }
}
