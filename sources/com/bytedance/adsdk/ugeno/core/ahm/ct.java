package com.bytedance.adsdk.ugeno.core.ahm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.core.vs;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    private Context at;
    private kgy dg;
    private twf gf;
    private boolean kus;
    private String nu;
    private twf ra;
    private boolean twf;
    private boolean vs;
    private int kgy = 0;
    private int ahm = Integer.MAX_VALUE;
    private int rz = Integer.MAX_VALUE;
    private AtomicBoolean uq = new AtomicBoolean(true);
    private float ct = Float.MIN_VALUE;
    private float noq = Float.MIN_VALUE;
    private Map<Integer, Float> yo = new HashMap();
    private Map<Integer, Float> fi = new HashMap();

    private void kgy(vs vsVar, twf twfVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (this.ahm <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            kgy(rzVar);
        } else {
            if (!this.uq.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                kgy(rzVar);
                return;
            }
            vsVar.kgy(twfVar, rzVar, rzVar);
            int i = this.ahm;
            if (i != Integer.MAX_VALUE) {
                this.ahm = i - 1;
            }
        }
    }

    public ct(Context context, twf twfVar, twf twfVar2, boolean z, boolean z2, boolean z3) {
        this.at = context;
        this.gf = twfVar;
        this.ra = twfVar2;
        this.twf = z;
        this.kus = z2;
        this.vs = z3;
        rz();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01a3, please report this as an issue */
    private boolean ahm(vs vsVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            if (!this.yo.containsKey(Integer.valueOf(pointerId))) {
                            }
                            Log.d("GesThrough_UGSREvent", "No DOWN event for pointer " + pointerId + ", don't handle");
                            return false;
                        }
                    } else {
                        this.yo.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getX(actionIndex)));
                        this.fi.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
                        Log.d("GesThrough_UGSREvent", "ACTION_DOWN/POINTER_DOWN for pointer " + pointerId + " at (" + this.yo.get(Integer.valueOf(pointerId)) + ", " + this.fi.get(Integer.valueOf(pointerId)) + ")");
                    }
                } else {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (this.yo.containsKey(Integer.valueOf(pointerId2)) && this.fi.containsKey(Integer.valueOf(pointerId2))) {
                            Log.d("GesThrough_UGSREvent", "ACTION_CANCEL for pointer ".concat(String.valueOf(pointerId2)));
                            kgy(pointerId2);
                        }
                    }
                    return false;
                }
            } else if (!this.yo.containsKey(Integer.valueOf(pointerId)) && this.fi.containsKey(Integer.valueOf(pointerId))) {
                float fFloatValue = this.yo.get(Integer.valueOf(pointerId)).floatValue();
                float fFloatValue2 = this.fi.get(Integer.valueOf(pointerId)).floatValue();
                float x = motionEvent.getX(actionIndex);
                float y = motionEvent.getY(actionIndex);
                Log.d("GesThrough_UGSREvent", "ACTION_UP/POINTER_UP for pointer " + pointerId + " from (" + fFloatValue + ", " + fFloatValue2 + ") to (" + x + ", " + y + ")");
                if (this.twf && Math.abs(x - fFloatValue) <= 10.0f && Math.abs(y - fFloatValue2) <= 10.0f && vsVar != null) {
                    kgy(pointerId);
                    vsVar.kgy(this.ra, rzVar, rzVar);
                    return true;
                }
                if (this.kgy == 0 && vsVar != null) {
                    kgy(pointerId);
                    kgy(vsVar, this.gf, rzVar);
                    return true;
                }
                int iAhm = fi.ahm(this.at, x - fFloatValue);
                int iAhm2 = fi.ahm(this.at, y - fFloatValue2);
                if (TextUtils.equals(this.nu, "up")) {
                    iAhm = -iAhm2;
                } else if (!TextUtils.equals(this.nu, "down")) {
                    if (TextUtils.equals(this.nu, "left")) {
                        iAhm = -iAhm;
                    } else if (!TextUtils.equals(this.nu, "right")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    }
                } else {
                    iAhm = iAhm2;
                }
                if (iAhm >= this.kgy) {
                    Log.d("GesThrough_UGSREvent", "Slide event for pointer " + pointerId + ", direct handling");
                    if (vsVar != null) {
                        kgy(pointerId);
                        kgy(vsVar, this.gf, rzVar);
                        return true;
                    }
                } else {
                    kgy(pointerId);
                    Log.d("GesThrough_UGSREvent", "Non-slide event for pointer ".concat(String.valueOf(pointerId)));
                    kgy(rzVar);
                    return false;
                }
            } else {
                Log.d("GesThrough_UGSREvent", "No DOWN event for pointer " + pointerId + ", don't handle");
                return false;
            }
        } else {
            this.yo.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getX(actionIndex)));
            this.fi.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
            Log.d("GesThrough_UGSREvent", "ACTION_DOWN/POINTER_DOWN for pointer " + pointerId + " at (" + this.yo.get(Integer.valueOf(pointerId)) + ", " + this.fi.get(Integer.valueOf(pointerId)) + ")");
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    private boolean rz(vs vsVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent, boolean z) {
        float x;
        float y;
        int iAhm;
        int iAhm2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    if (this.ct != Float.MIN_VALUE && this.noq != Float.MIN_VALUE) {
                        Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
                        float rawX = motionEvent.getRawX();
                        if (motionEvent.getRawY() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rawX != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            if (!this.twf) {
                            }
                            if (this.kgy != 0) {
                            }
                            iAhm = fi.ahm(this.at, x - this.ct);
                            iAhm2 = fi.ahm(this.at, y - this.noq);
                            if (TextUtils.equals(this.nu, "up")) {
                                iAhm = -iAhm2;
                            } else if (!TextUtils.equals(this.nu, "down")) {
                                if (TextUtils.equals(this.nu, "left")) {
                                    iAhm = -iAhm;
                                } else if (!TextUtils.equals(this.nu, "right")) {
                                    iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                                }
                            } else {
                                iAhm = iAhm2;
                            }
                            if (iAhm >= this.kgy) {
                                Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                                if (vsVar != null) {
                                    ahm();
                                    kgy(vsVar, this.gf, rzVar);
                                    return true;
                                }
                                ahm();
                            } else {
                                ahm();
                                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                                kgy(rzVar);
                                return false;
                            }
                        }
                    } else {
                        Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                        return false;
                    }
                }
            } else {
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (!this.twf && Math.abs(x - this.ct) <= 10.0f && Math.abs(y - this.noq) <= 10.0f && vsVar != null) {
                    ahm();
                    vsVar.kgy(this.ra, rzVar, rzVar);
                    return true;
                }
                if (this.kgy != 0 && vsVar != null) {
                    ahm();
                    kgy(vsVar, this.gf, rzVar);
                    return true;
                }
                iAhm = fi.ahm(this.at, x - this.ct);
                iAhm2 = fi.ahm(this.at, y - this.noq);
                if (TextUtils.equals(this.nu, "up")) {
                    iAhm = -iAhm2;
                } else if (!TextUtils.equals(this.nu, "down")) {
                    if (TextUtils.equals(this.nu, "left")) {
                        iAhm = -iAhm;
                    } else if (!TextUtils.equals(this.nu, "right")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    }
                } else {
                    iAhm = iAhm2;
                }
                if (iAhm >= this.kgy) {
                    Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                    if (vsVar != null) {
                        ahm();
                        kgy(vsVar, this.gf, rzVar);
                        return true;
                    }
                    ahm();
                } else {
                    ahm();
                    Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                    kgy(rzVar);
                    return false;
                }
            }
        } else {
            this.ct = motionEvent.getX();
            this.noq = motionEvent.getY();
        }
        return true;
    }

    public void kgy() {
        if (this.rz == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ahm.ct.1
            @Override // java.lang.Runnable
            public void run() {
                ct.this.uq.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.rz);
    }

    private void kgy(int i) {
        this.yo.remove(Integer.valueOf(i));
        this.fi.remove(Integer.valueOf(i));
    }

    public boolean kgy(vs vsVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent, boolean z) {
        kgy kgyVar = this.dg;
        if (kgyVar != null) {
            if (kgyVar.kgy(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.dg.kgy(rzVar, motionEvent);
        }
        if (this.vs) {
            return ahm(vsVar, rzVar, motionEvent, z);
        }
        return rz(vsVar, rzVar, motionEvent, z);
    }

    public ct(Context context, twf twfVar, boolean z, boolean z2, boolean z3) {
        this.at = context;
        this.gf = twfVar;
        this.twf = z;
        this.kus = z2;
        this.vs = z3;
        rz();
    }

    private void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (this.dg != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.dg.kgy(rzVar);
        }
    }

    private void rz() {
        if (this.kus) {
            this.dg = new kgy();
        }
        twf twfVar = this.gf;
        if (twfVar == null) {
            return;
        }
        this.kgy = twfVar.rz().optInt("slideThreshold");
        this.nu = this.gf.rz().optString("slideDirection");
        this.ahm = this.gf.rz().optInt("frequency", Integer.MAX_VALUE);
        this.rz = this.gf.rz().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.ahm + ", mEffectiveDuration: " + this.rz + ", inEffectiveDuation: " + this.uq.get());
    }

    public void ahm() {
        this.ct = Float.MIN_VALUE;
        this.noq = Float.MIN_VALUE;
        this.yo.clear();
        this.fi.clear();
    }
}
