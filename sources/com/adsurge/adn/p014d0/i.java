package com.adsurge.adn.p014d0;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class i {
    public static final boolean e = false;
    public final com.adsurge.adn.p026h0.a a;
    public final ValueAnimator b;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean d = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class a {
        public String a = "DL-Animation-Builder";

        public i a(com.adsurge.adn.p026h0.a aVar, com.adsurge.adn.p038l0.i iVar) {
            PropertyValuesHolder[] propertyValuesHolderArrA;
            if (aVar == null || iVar == null || (propertyValuesHolderArrA = a(aVar)) == null || propertyValuesHolderArrA.length <= 0) {
                return null;
            }
            if (h.c) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setValues(propertyValuesHolderArrA);
                objectAnimator.setTarget(iVar);
                objectAnimator.setDuration(aVar.e);
                objectAnimator.setRepeatCount(aVar.g);
                objectAnimator.setRepeatMode(aVar.h);
                objectAnimator.setInterpolator(r.a(aVar));
                return new i(aVar, objectAnimator);
            }
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            objectAnimator2.setValues(propertyValuesHolderArrA);
            objectAnimator2.setTarget(iVar);
            objectAnimator2.setStartDelay(aVar.d);
            objectAnimator2.setDuration(aVar.e);
            objectAnimator2.setInterpolator(r.a(aVar));
            if (aVar.f <= 0 || aVar.g <= 0) {
                int i = aVar.g;
                if (i < 0) {
                    i = -1;
                }
                objectAnimator2.setRepeatCount(i);
                if (aVar.e()) {
                    objectAnimator2.setRepeatMode(2);
                }
            } else {
                objectAnimator2.addListener(new o(aVar));
            }
            return new i(aVar, objectAnimator2);
        }

        public abstract PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar);
    }

    public void a(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        if (e && f > 1.0f) {
            int i = (int) f;
            if (f == i && (this.a.d() || i % 2 == 1)) {
                f = 1.0f;
            }
        }
        this.b.setCurrentFraction(f);
    }

    public i(com.adsurge.adn.p026h0.a aVar, ValueAnimator valueAnimator) {
        this.a = aVar;
        this.b = valueAnimator;
    }
}
