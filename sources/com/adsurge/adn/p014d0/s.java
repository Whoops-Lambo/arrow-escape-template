package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p035k0.j;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class s extends i.a {
    public final int b;
    public final Property c = new a(Float.class, "translationX");
    public final Property d = new b(Float.class, "translationY");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float translationX;
            View viewC = iVar.C();
            if (viewC == null) {
                translationX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                translationX = viewC.getTranslationX();
            }
            return Float.valueOf(translationX);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.b(f, (Float) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float translationY;
            View viewC = iVar.C();
            if (viewC == null) {
                translationY = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                translationY = viewC.getTranslationY();
            }
            return Float.valueOf(translationY);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.b((Float) null, f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends Property {
        public final boolean a;
        public final boolean b;
        public final d.InterfaceC0105d c;
        public int d;

        public c(boolean z, boolean z2, d.InterfaceC0105d interfaceC0105d) {
            super(Float.class, "translation");
            this.b = z;
            this.a = z2;
            this.c = interfaceC0105d;
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            if (this.d <= 0) {
                int iA = this.c.a(iVar, this.a);
                this.d = iA;
                if (iA <= 0) {
                    return;
                }
            }
            float fFloatValue = f.floatValue() * this.d;
            if (this.b) {
                iVar.b(Float.valueOf(fFloatValue), (Float) null);
            } else {
                iVar.b((Float) null, Float.valueOf(fFloatValue));
            }
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            return null;
        }
    }

    public s(int i) {
        this.b = i;
    }

    public final PropertyValuesHolder a(boolean z, j jVar, j jVar2) {
        Property property;
        d.c cVarA = d.a(jVar);
        d.c cVarA2 = d.a(jVar2);
        if (cVarA == null && cVarA2 == null) {
            if (z) {
                property = this.c;
            } else {
                property = this.d;
            }
            return PropertyValuesHolder.ofFloat((Property<?, Float>) property, jVar.e(), jVar2.e());
        }
        if (cVarA == null) {
            if (jVar.b() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return null;
            }
            cVarA = cVarA2;
        } else if (cVarA2 == null) {
            if (jVar2.b() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return null;
            }
        } else if (!cVarA.a(cVarA2)) {
            if (com.adsurge.adn.J0.a.a) {
                com.adsurge.adn.J0.a.a("TranslateAnimator", "动画依赖父容器/根容器宽高的起始截止单位不一致,需要调整一致");
            }
            return null;
        }
        return PropertyValuesHolder.ofFloat(new c(z, cVarA.a, d.a(cVarA)), jVar.b() / 100.0f, jVar2.b() / 100.0f);
    }

    public final PropertyValuesHolder[] a(JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return null;
        }
        return a(a(true, m.c(jSONArray.opt(0)).b(new JSONObject[0]), m.c(jSONArray.opt(1)).b(new JSONObject[0])), a(false, m.c(jSONArray.opt(2)).b(new JSONObject[0]), m.c(jSONArray.opt(3)).b(new JSONObject[0])));
    }

    public final PropertyValuesHolder[] a(JSONArray jSONArray, boolean z) {
        PropertyValuesHolder propertyValuesHolderA;
        if (jSONArray.length() >= 2 && (propertyValuesHolderA = a(z, m.c(jSONArray.opt(0)).b(new JSONObject[0]), m.c(jSONArray.opt(1)).b(new JSONObject[0]))) != null) {
            return new PropertyValuesHolder[]{propertyValuesHolderA};
        }
        return null;
    }

    public final PropertyValuesHolder[] a(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2) {
        if (propertyValuesHolder == null && propertyValuesHolder2 == null) {
            return null;
        }
        if (propertyValuesHolder != null && propertyValuesHolder2 != null) {
            return new PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2};
        }
        if (propertyValuesHolder != null) {
            return new PropertyValuesHolder[]{propertyValuesHolder};
        }
        return new PropertyValuesHolder[]{propertyValuesHolder2};
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        JSONArray jSONArray = aVar.c;
        if (jSONArray == null) {
            return null;
        }
        int i = this.b;
        if (i == 0) {
            return a(jSONArray);
        }
        if (i == 1) {
            return a(jSONArray, true);
        }
        if (i != 2) {
            return null;
        }
        return a(jSONArray, false);
    }
}
