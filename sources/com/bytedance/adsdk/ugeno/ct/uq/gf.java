package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ct.vs;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class gf extends rz {
    private float at;
    private vs kus;
    private float nu;
    private boolean twf;

    public gf(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    public boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.twf = false;
                        float rawX2 = motionEvent.getRawX();
                        if (motionEvent.getRawY() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rawX2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (this.twf) {
                                this.twf = false;
                                this.nu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                this.at = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                                return false;
                            }
                            rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (Math.abs(rawX - this.nu) >= 15.0f) {
                            }
                            this.twf = false;
                            Log.d("GesThrough_UGTapEvent", "Non-tap event");
                            return false;
                        }
                    }
                } else {
                    float rawX3 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    if (Math.abs(rawX3 - this.nu) >= 15.0f || Math.abs(rawY2 - this.at) >= 15.0f) {
                        this.twf = true;
                    }
                }
            } else {
                if (this.twf) {
                    this.twf = false;
                    this.nu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.at = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    Log.d("GesThrough_UGTapEvent", "Non-tap event");
                    return false;
                }
                rawX = motionEvent.getRawX();
                float rawY3 = motionEvent.getRawY();
                if (Math.abs(rawX - this.nu) >= 15.0f && Math.abs(rawY3 - this.at) < 15.0f) {
                    Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
                    com.bytedance.adsdk.ugeno.ct.at atVar = this.kgy;
                    if (atVar != null) {
                        atVar.kgy(rzVar, this.noq, this.rz.ahm(), this.rz);
                        this.nu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        this.at = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return true;
                    }
                } else {
                    this.twf = false;
                    Log.d("GesThrough_UGTapEvent", "Non-tap event");
                    return false;
                }
            }
        } else {
            this.nu = motionEvent.getRawX();
            this.at = motionEvent.getRawY();
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        vs vsVar = this.kus;
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
        if (vsVar != null) {
            return vsVar.kgy(rzVar, motionEvent, this.kgy, this);
        }
        return kgy(rzVar, motionEvent);
    }

    public void kgy(vs vsVar) {
        this.kus = vsVar;
    }
}
