package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ct extends rz {
    private float at;
    private AtomicBoolean dg;
    private com.bytedance.adsdk.ugeno.ct.kus fpp;
    private AtomicInteger kus;
    private float nu;
    private int twf;
    private String um;
    private int vs;
    private int xh;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, Object> map = this.ct;
        if (map != null) {
            Object obj3 = map.get("direction");
            String strValueOf = TtmlNode.COMBINE_ALL;
            if (obj3 != null && !TextUtils.isEmpty(String.valueOf(obj3))) {
                strValueOf = String.valueOf(obj3);
            }
            this.um = strValueOf;
            Object obj4 = this.ct.get("distance");
            if (obj4 == null) {
                this.twf = 0;
            } else {
                this.twf = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj4), 0);
            }
            if (this.kus.get() == Integer.MAX_VALUE && (obj2 = this.ct.get("frequency")) != null) {
                this.kus.set(com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj2), Integer.MAX_VALUE));
            }
            if (this.vs == Integer.MAX_VALUE && (obj = this.ct.get("effectiveDuration")) != null) {
                this.vs = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), Integer.MAX_VALUE);
            }
            Object obj5 = this.ct.get("inView");
            if (obj5 != null) {
                this.xh = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj5), 0);
            }
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.kus + ", mEffectiveDuration: " + this.vs + ", inEffectiveDuation: " + this.dg.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        kgy();
        com.bytedance.adsdk.ugeno.ct.kus kusVar = this.fpp;
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
        return kusVar != null ? kusVar.kgy(rzVar, motionEvent, this.kgy, this, this.um, this.twf, this.kus, this.xh, this.dg.get()) : kgy(rzVar, motionEvent);
    }

    public ct(Context context) {
        super(context);
        this.twf = 0;
        this.kus = new AtomicInteger(Integer.MAX_VALUE);
        this.vs = Integer.MAX_VALUE;
        this.dg = new AtomicBoolean(true);
        this.xh = 0;
        this.um = "up";
    }

    private void kgy() {
        if (this.vs == Integer.MAX_VALUE || this.ahm == null || System.currentTimeMillis() - this.ahm.fpz() < this.vs) {
            return;
        }
        this.dg.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    private boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        float x;
        float y;
        int iAhm;
        int iAhm2;
        String str;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.nu = motionEvent.getX();
            this.at = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (this.twf != 0 && this.kgy != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return kgy(rzVar, x, y);
            }
            iAhm = com.bytedance.adsdk.ugeno.fi.fi.ahm(this.ra, x - this.nu);
            iAhm2 = com.bytedance.adsdk.ugeno.fi.fi.ahm(this.ra, y - this.at);
            str = this.um;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    } else {
                        iAhm = -iAhm2;
                    }
                    break;
                case 96673:
                    str.equals(TtmlNode.COMBINE_ALL);
                    iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    } else {
                        iAhm = iAhm2;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    } else {
                        iAhm = -iAhm;
                    }
                    break;
                case 108511772:
                    if (!str.equals("right")) {
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    }
                    break;
                default:
                    iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                    break;
            }
            if (iAhm >= this.twf) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.kgy != null) {
                    this.nu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.at = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return kgy(rzVar, x, y);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        } else if (action == 3) {
            float rawX = motionEvent.getRawX();
            if (motionEvent.getRawY() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rawX != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (this.twf != 0) {
                }
                iAhm = com.bytedance.adsdk.ugeno.fi.fi.ahm(this.ra, x - this.nu);
                iAhm2 = com.bytedance.adsdk.ugeno.fi.fi.ahm(this.ra, y - this.at);
                str = this.um;
                switch (str.hashCode()) {
                    case 3739:
                        if (str.equals("up")) {
                            iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        } else {
                            iAhm = -iAhm2;
                        }
                        break;
                    case 96673:
                        str.equals(TtmlNode.COMBINE_ALL);
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        break;
                    case 3089570:
                        if (str.equals("down")) {
                            iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        } else {
                            iAhm = iAhm2;
                        }
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        } else {
                            iAhm = -iAhm;
                        }
                        break;
                    case 108511772:
                        if (!str.equals("right")) {
                            iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        }
                        break;
                    default:
                        iAhm = (int) Math.abs(Math.sqrt(Math.pow(iAhm2, 2.0d) + Math.pow(iAhm, 2.0d)));
                        break;
                }
                if (iAhm >= this.twf) {
                    Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                    if (this.kgy != null) {
                        this.nu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        this.at = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return kgy(rzVar, x, y);
                    }
                } else {
                    Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                    return false;
                }
            }
        }
        return true;
    }

    private boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, float f, float f2) {
        if (this.kus.get() <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.dg.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.xh == 1 && !kgy(rzVar.nu(), f, f2)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.kgy.kgy(rzVar, this.noq, this.rz.ahm(), this.rz);
        if (this.kus.get() != Integer.MAX_VALUE) {
            this.kus.decrementAndGet();
        }
        return true;
    }

    private boolean kgy(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.kus kusVar) {
        this.fpp = kusVar;
    }
}
