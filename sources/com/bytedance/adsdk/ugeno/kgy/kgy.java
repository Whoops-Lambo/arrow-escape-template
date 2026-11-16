package com.bytedance.adsdk.ugeno.kgy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.ct.dg;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy extends AnimatorListenerAdapter {
    private rz ahm;
    private int ct;
    private String fi;
    private com.bytedance.adsdk.ugeno.ahm.rz kgy;
    private ValueAnimator rz;
    private Context uq;
    private com.bytedance.adsdk.ugeno.kgy.kgy.kgy yo;
    private int noq = 1;
    private List<ahm> gf = new CopyOnWriteArrayList();

    private void kgy(String str) {
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.kgy;
        if (rzVar == null || rzVar.mca() == null || this.kgy.mca().rz() == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("name", this.fi);
        map.put("state", str);
        this.kgy.mca().uq();
    }

    public void ahm(ahm ahmVar) {
        if (ahmVar != null) {
            this.gf.remove(ahmVar);
        }
    }

    public String ct() {
        return this.fi;
    }

    public void rz() {
        ValueAnimator valueAnimator = this.rz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ValueAnimator uq() {
        com.bytedance.adsdk.ugeno.kgy.ahm.kgy rzVar;
        rz rzVar2 = this.ahm;
        if (rzVar2 == null || this.kgy == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapAhm = rzVar2.ahm();
        ArrayList arrayList = new ArrayList();
        if (mapAhm != null && !mapAhm.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapAhm.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strRz = ct.kgy(key).rz();
                    strRz.getClass();
                    switch (strRz) {
                        case "int":
                            rzVar = new com.bytedance.adsdk.ugeno.kgy.ahm.rz(this.uq, this.kgy, key, entry.getValue());
                            break;
                        case "float":
                            rzVar = new com.bytedance.adsdk.ugeno.kgy.ahm.ahm(this.uq, this.kgy, key, entry.getValue());
                            break;
                        case "point":
                            rzVar = new com.bytedance.adsdk.ugeno.kgy.ahm.uq(this.uq, this.kgy, key, entry.getValue());
                            break;
                        default:
                            rzVar = null;
                            break;
                    }
                    if (rzVar != null) {
                        arrayList.addAll(rzVar.ct());
                    }
                }
            }
        }
        JSONObject jSONObjectKgy = this.ahm.kgy();
        if (jSONObjectKgy != null) {
            com.bytedance.adsdk.ugeno.kgy.kgy.kgy kgyVarKgy = com.bytedance.adsdk.ugeno.kgy.kgy.kgy.C0194kgy.kgy(this.kgy, jSONObjectKgy);
            this.yo = kgyVarKgy;
            if (kgyVarKgy != null) {
                arrayList.addAll(kgyVarKgy.rz());
            }
        }
        final View viewNu = this.kgy.nu();
        if (viewNu == null) {
            return null;
        }
        final rz.kgy kgyVarYo = this.ahm.yo();
        if (kgyVarYo != null) {
            viewNu.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.kgy.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewNu.getWidth();
                    int height = viewNu.getHeight();
                    viewNu.setPivotX(uq.kgy(kgyVarYo.kgy, width));
                    viewNu.setPivotY(uq.kgy(kgyVarYo.ahm, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewNu, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.ct = uq.kgy(this.ahm.uq());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.ahm.rz());
        int i = this.ct;
        if (i != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        }
        this.noq = this.ahm.ra();
        this.fi = this.ahm.gf();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.ahm.noq());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(uq.kgy(this.ahm.ct()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(uq.ahm(this.ahm.fi()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.rz = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public kgy(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, rz rzVar2) {
        this.kgy = rzVar;
        this.ahm = rzVar2;
        this.uq = context;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        dg dgVarRz;
        super.onAnimationEnd(animator);
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.kgy;
        if (rzVar != null && rzVar.mca() != null) {
            dgVarRz = this.kgy.mca().rz();
        } else {
            dgVarRz = null;
        }
        if (dgVarRz != null && dgVarRz.kgy("animateState", "")) {
            kgy(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
        }
        for (ahm ahmVar : this.gf) {
            if (ahmVar != null) {
                ahmVar.ahm();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        dg dgVarRz;
        super.onAnimationStart(animator);
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.kgy;
        if (rzVar != null && rzVar.mca() != null) {
            dgVarRz = this.kgy.mca().rz();
        } else {
            dgVarRz = null;
        }
        if (dgVarRz != null && dgVarRz.kgy("animateState", "")) {
            kgy("start");
        }
        for (ahm ahmVar : this.gf) {
            if (ahmVar != null) {
                ahmVar.kgy();
            }
        }
    }

    public void ahm() {
        ValueAnimator valueAnimator = this.rz;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void ahm(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kgy.kgy.kgy kgyVar = this.yo;
        if (kgyVar != null) {
            kgyVar.ahm(canvas);
        }
    }

    public void kgy(ahm ahmVar) {
        if (ahmVar == null || this.gf.contains(ahmVar)) {
            return;
        }
        this.gf.add(ahmVar);
    }

    public void kgy(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kgy.kgy.kgy kgyVar = this.yo;
        if (kgyVar != null) {
            kgyVar.kgy(canvas);
        }
    }

    public void kgy(int i, int i2) {
        com.bytedance.adsdk.ugeno.kgy.kgy.kgy kgyVar = this.yo;
        if (kgyVar != null) {
            kgyVar.kgy(i, i2);
        }
    }

    public void kgy() {
        ValueAnimator valueAnimator = this.rz;
        if (valueAnimator == null || this.noq == 0 || this.ct == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }
}
