package com.bytedance.adsdk.ugeno.kgy.ahm;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.kgy.ct;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz extends kgy {
    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void ahm() {
        if (this.uq == ct.BACKGROUND_COLOR) {
            this.ct.add(Keyframe.ofInt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.wl()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void kgy(float f, String str) {
        this.ct.add(this.uq == ct.BACKGROUND_COLOR ? Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.fi.kgy.kgy(str)) : Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.fi.rz.kgy(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public TypeEvaluator noq() {
        return this.uq == ct.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    public rz(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, TreeMap<Float, String> treeMap) {
        super(context, rzVar, str, treeMap);
    }
}
