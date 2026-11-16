package com.bytedance.adsdk.ugeno.kgy.ahm;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.kgy.ct;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class kgy {
    protected String ahm;
    protected Context kgy;
    protected Map<Float, String> rz;
    protected ct uq;
    protected com.bytedance.adsdk.ugeno.ahm.rz yo;
    protected List<PropertyValuesHolder> noq = new ArrayList();
    protected List<Keyframe> ct = new ArrayList();

    public abstract void ahm();

    public abstract void kgy(float f, String str);

    public abstract TypeEvaluator noq();

    public List<PropertyValuesHolder> ct() {
        String strAhm = this.uq.ahm();
        uq();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strAhm, (Keyframe[]) this.ct.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorNoq = noq();
        if (typeEvaluatorNoq != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorNoq);
        }
        this.noq.add(propertyValuesHolderOfKeyframe);
        return this.noq;
    }

    public boolean kgy() {
        Map<Float, String> map = this.rz;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.rz.containsKey(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public void rz() {
        Map<Float, String> map = this.rz;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.rz;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                kgy(100.0f, this.rz.get(f));
            }
        }
    }

    public void uq() {
        Map<Float, String> map = this.rz;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!kgy()) {
            ahm();
        }
        for (Map.Entry<Float, String> entry : this.rz.entrySet()) {
            if (entry != null) {
                kgy(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        rz();
    }

    public kgy(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, Map<Float, String> map) {
        this.kgy = context;
        this.ahm = str;
        this.rz = map;
        this.uq = ct.kgy(this.ahm);
        this.yo = rzVar;
    }
}
