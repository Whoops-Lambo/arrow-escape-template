package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.J0.a;
import com.adsurge.adn.p035k0.m;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {
    public final boolean g;
    public final int[] h;
    public final int i;
    public final Boolean j;
    public final Boolean k;
    public final boolean l;
    public final int m;
    public boolean n;

    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[SYNTHETIC] */
    public final boolean a(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2, boolean z) {
        double dAtan2;
        int i;
        int i2;
        if (pointF != null && pointF2 != null) {
            Boolean bool = this.j;
            if (bool != null) {
                if (bool.booleanValue()) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || x > view.getWidth() || y > view.getHeight()) {
                        return false;
                    }
                } else {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (x2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x2 <= view.getWidth() && y2 <= view.getHeight()) {
                        return false;
                    }
                }
            }
            if (this.i <= 0) {
                return true;
            }
            float f = pointF2.x - pointF.x;
            float f2 = pointF2.y - pointF.y;
            Boolean bool2 = this.k;
            double dHypot = bool2 == null ? Math.hypot(f, f2) : bool2.booleanValue() ? Math.abs(f2) : Math.abs(f);
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                dAtan2 = Double.NaN;
            } else {
                dAtan2 = (Math.atan2(f2, f) / 3.141592653589793d) * 180.0d;
                if (dAtan2 < 0.0d) {
                    dAtan2 += 360.0d;
                }
            }
            for (int i3 = 0; i3 < this.i; i3++) {
                int i4 = i3 * 3;
                int i5 = this.h[i4];
                if (z || i5 <= -1) {
                    if (Double.isNaN(dAtan2)) {
                        return true;
                    }
                    int[] iArr = this.h;
                    i = iArr[i4 + 1];
                    i2 = iArr[i4 + 2];
                    if ((i < i2 || (dAtan2 >= i && dAtan2 <= i2)) && (i < i2 || dAtan2 >= i || dAtan2 <= i2)) {
                    }
                } else if (this.g) {
                    if (dHypot >= i5) {
                        if (Double.isNaN(dAtan2)) {
                            return true;
                        }
                        int[] iArr2 = this.h;
                        i = iArr2[i4 + 1];
                        i2 = iArr2[i4 + 2];
                        return i < i2 ? true : true;
                    }
                    continue;
                } else {
                    if (dHypot <= i5) {
                        if (Double.isNaN(dAtan2)) {
                            return true;
                        }
                        int[] iArr3 = this.h;
                        i = iArr3[i4 + 1];
                        i2 = iArr3[i4 + 2];
                        if (i < i2) {
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    @Override // com.adsurge.adn.p044n0.a
    public boolean d(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        return a(view, motionEvent, pointF, pointF2, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public Boolean b(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        b bVar;
        View view2;
        MotionEvent motionEvent2;
        PointF pointF3;
        PointF pointF4;
        if (!this.l || this.n) {
            bVar = this;
            view2 = view;
            motionEvent2 = motionEvent;
            pointF3 = pointF;
            pointF4 = pointF2;
        } else {
            float f = pointF2.y - pointF.y;
            float f2 = pointF2.x - pointF.x;
            double dHypot = Math.hypot(f, f2);
            a.a("moving process detect delta x = %.2f, delta y = %.2f, hypot = %.2f, slop = %d", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(dHypot), Integer.valueOf(this.m));
            if (dHypot > this.m) {
                bVar = this;
                view2 = view;
                motionEvent2 = motionEvent;
                pointF3 = pointF;
                pointF4 = pointF2;
                if (!bVar.a(view2, motionEvent2, pointF3, pointF4, true)) {
                    f.a(view2, false);
                }
                bVar.n = true;
            } else {
                bVar = this;
                view2 = view;
                motionEvent2 = motionEvent;
                pointF3 = pointF;
                pointF4 = pointF2;
            }
        }
        return super.b(view2, motionEvent2, pointF3, pointF4);
    }

    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public boolean e() {
        return this.l || super.e();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0103 A[SYNTHETIC] */
    public b(c cVar, i iVar) {
        boolean z;
        boolean z2;
        JSONArray jSONArrayB;
        int length;
        int iMax;
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        int length2;
        int i;
        int iF;
        int iOptInt;
        int iOptInt2;
        Object objOpt;
        Object objOpt2;
        super(cVar);
        if (cVar.a == 4) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (iVar == null) {
            this.m = 0;
            this.l = false;
            jSONArrayB = null;
        } else {
            this.m = iVar.c();
            if (iVar.a() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.l = z2;
            jSONArrayB = iVar.b();
            if (jSONArrayB != null) {
                length = jSONArrayB.length();
                if (length > 0) {
                    iMax = (length + 1) / 2;
                } else {
                    iMax = 0;
                }
            }
            jSONObject = cVar.c;
            if (jSONObject == null && jSONObject.length() > 0) {
                int iOptInt3 = jSONObject.optInt("vp");
                if (iOptInt3 == 2) {
                    this.k = Boolean.TRUE;
                } else if (iOptInt3 == 1) {
                    this.k = Boolean.FALSE;
                } else {
                    this.k = null;
                }
                int iOptInt4 = jSONObject.optInt("tp");
                if (iOptInt4 == 1) {
                    this.j = Boolean.TRUE;
                } else if (iOptInt4 == 2) {
                    this.j = Boolean.FALSE;
                } else {
                    this.j = null;
                }
                jSONArrayOptJSONArray = jSONObject.optJSONArray("ds");
                if (jSONArrayOptJSONArray == null) {
                    length2 = 0;
                } else {
                    length2 = jSONArrayOptJSONArray.length();
                }
                if (length2 <= 0 && (objOpt2 = jSONObject.opt("cr")) != null) {
                    jSONArrayOptJSONArray = new JSONArray((Collection) Collections.singletonList(objOpt2));
                    length2 = 1;
                }
                if (iMax == 0) {
                    jSONArrayB = jSONObject.optJSONArray("as");
                    if (jSONArrayB == null) {
                        length = 0;
                    } else {
                        length = jSONArrayB.length();
                    }
                    iMax = Math.max(length2, (length + 1) / 2);
                }
            } else {
                this.j = null;
                this.k = null;
                jSONArrayOptJSONArray = null;
                length2 = 0;
            }
            if (iMax == 0) {
                this.h = null;
                this.i = 0;
                return;
            }
            this.i = iMax;
            this.h = new int[iMax * 3];
            for (i = 0; i < this.i; i++) {
                int i2 = i * 3;
                int[] iArr = this.h;
                if (length2 <= 0 && (objOpt = jSONArrayOptJSONArray.opt(i)) != null) {
                    iF = m.c(objOpt).f(new JSONObject[0]);
                } else {
                    iF = -1;
                }
                iArr[i2] = iF;
                int[] iArr2 = this.h;
                int i3 = i2 + 1;
                if (length > 0) {
                    iOptInt = jSONArrayB.optInt(i * 2, 0);
                } else {
                    iOptInt = 0;
                }
                iArr2[i3] = iOptInt;
                int[] iArr3 = this.h;
                int i4 = i2 + 2;
                iOptInt2 = 360;
                if (length > 0) {
                    iOptInt2 = jSONArrayB.optInt((i * 2) + 1, 360);
                }
                iArr3[i4] = iOptInt2;
            }
        }
        length = 0;
        iMax = 0;
        jSONObject = cVar.c;
        if (jSONObject == null) {
            this.j = null;
            this.k = null;
            jSONArrayOptJSONArray = null;
            length2 = 0;
        } else {
            this.j = null;
            this.k = null;
            jSONArrayOptJSONArray = null;
            length2 = 0;
        }
        if (iMax == 0) {
            this.h = null;
            this.i = 0;
            return;
        }
        this.i = iMax;
        this.h = new int[iMax * 3];
        while (i < this.i) {
            int i5 = i * 3;
            int[] iArr4 = this.h;
            if (length2 <= 0) {
                iF = -1;
            } else {
                iF = -1;
            }
            iArr4[i5] = iF;
            int[] iArr5 = this.h;
            int i6 = i5 + 1;
            if (length > 0) {
                iOptInt = jSONArrayB.optInt(i * 2, 0);
            } else {
                iOptInt = 0;
            }
            iArr5[i6] = iOptInt;
            int[] iArr6 = this.h;
            int i7 = i5 + 2;
            iOptInt2 = 360;
            if (length > 0) {
                iOptInt2 = jSONArrayB.optInt((i * 2) + 1, 360);
            }
            iArr6[i7] = iOptInt2;
        }
    }

    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF) {
        this.n = false;
        return super.a(view, motionEvent, pointF);
    }

    public static boolean a(JSONObject jSONObject, com.adsurge.adn.p011c0.a aVar) {
        return jSONObject == null || jSONObject.length() <= 0 || jSONObject.optInt(NotificationCompat.CATEGORY_SYSTEM) != 1 || (aVar != null && aVar.k());
    }
}
