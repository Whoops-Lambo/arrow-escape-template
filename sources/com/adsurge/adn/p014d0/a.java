package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends i.a {
    public final Property b = new C0104a(Float.class, "alpha");

    /* JADX INFO: renamed from: com.adsurge.adn.d0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0104a extends Property {
        public C0104a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float alpha;
            View viewC = iVar.C();
            if (viewC == null) {
                alpha = 1.0f;
            } else {
                alpha = viewC.getAlpha();
            }
            return Float.valueOf(alpha);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.a(f.floatValue());
        }
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        if (aVar.c.length() < 2) {
            return null;
        }
        float fOptDouble = (float) aVar.c.optDouble(0, -1.0d);
        if (fOptDouble <= 1.0f && fOptDouble >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float fOptDouble2 = (float) aVar.c.optDouble(1, -1.0d);
            if (fOptDouble2 <= 1.0f && fOptDouble2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) this.b, fOptDouble, fOptDouble2)};
            }
        }
        return null;
    }
}
