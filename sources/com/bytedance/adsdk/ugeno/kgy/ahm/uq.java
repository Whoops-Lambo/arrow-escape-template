package com.bytedance.adsdk.ugeno.kgy.ahm;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.bytedance.adsdk.ugeno.kgy.ct;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq extends kgy {
    private List<Keyframe> fi;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kgy.ahm.uq$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ct.values().length];
            kgy = iArr;
            try {
                iArr[ct.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[ct.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void ahm() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i = AnonymousClass1.kgy[this.uq.ordinal()];
        if (i == 1) {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.vs());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.dg());
        } else if (i != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.xh());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.um());
        }
        if (keyframeOfFloat != null) {
            this.ct.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.fi.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public List<PropertyValuesHolder> ct() {
        String strAhm = this.uq.ahm();
        uq();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strAhm + "X", (Keyframe[]) this.ct.toArray(new Keyframe[0]));
        this.noq.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strAhm + "Y", (Keyframe[]) this.fi.toArray(new Keyframe[0]));
        this.noq.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorNoq = noq();
        if (typeEvaluatorNoq != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorNoq);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorNoq);
        }
        return this.noq;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public TypeEvaluator noq() {
        return new FloatEvaluator();
    }

    public uq(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, Map<Float, String> map) {
        super(context, rzVar, str, map);
        this.fi = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void kgy(float f, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 2) {
                    float fOptDouble = (float) jSONArray.optDouble(0);
                    float fOptDouble2 = (float) jSONArray.optDouble(1);
                    if (this.uq == ct.TRANSLATE) {
                        fOptDouble = fi.kgy(this.kgy, fOptDouble);
                        fOptDouble2 = fi.kgy(this.kgy, fOptDouble2);
                    }
                    this.ct.add(Keyframe.ofFloat(f, fOptDouble));
                    this.fi.add(Keyframe.ofFloat(f, fOptDouble2));
                }
            } catch (JSONException unused) {
            }
        }
    }
}
