package com.bytedance.adsdk.ugeno.kgy.ahm;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.bytedance.adsdk.ugeno.kgy.ct;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm extends kgy {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kgy.ahm.ahm$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ct.values().length];
            kgy = iArr;
            try {
                iArr[ct.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[ct.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[ct.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[ct.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[ct.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[ct.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kgy[ct.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kgy[ct.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kgy[ct.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void ahm() {
        float fVs;
        switch (AnonymousClass1.kgy[this.uq.ordinal()]) {
            case 1:
                fVs = this.yo.vs();
                break;
            case 2:
                fVs = this.yo.dg();
                break;
            case 3:
                fVs = this.yo.xh();
                break;
            case 4:
                fVs = this.yo.um();
                break;
            case 5:
                fVs = this.yo.fpp();
                if (this.yo.nu() != null) {
                    this.yo.nu().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fVs = this.yo.sx();
                if (this.yo.nu() != null) {
                    this.yo.nu().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fVs = this.yo.gm();
                break;
            case 8:
                fVs = this.yo.ay();
                break;
            case 9:
                fVs = this.yo.ioy();
                break;
            default:
                fVs = 0.0f;
                break;
        }
        this.ct.add(Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVs));
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public void kgy(float f, String str) {
        this.ct.add(Keyframe.ofFloat(f, (this.ahm.startsWith(ct.TRANSLATE.kgy()) || this.uq == ct.BORDER_RADIUS) ? fi.kgy(this.kgy, com.bytedance.adsdk.ugeno.fi.rz.kgy(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : com.bytedance.adsdk.ugeno.fi.rz.kgy(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm.kgy
    public TypeEvaluator noq() {
        return new FloatEvaluator();
    }

    public ahm(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, TreeMap<Float, String> treeMap) {
        super(context, rzVar, str, treeMap);
    }
}
