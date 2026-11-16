package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.p047o0.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class h extends a {
    public final float g;
    public final boolean h;
    public final List i;
    public List j;

    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF) {
        ArrayList arrayList = new ArrayList(20);
        this.j = arrayList;
        arrayList.add(pointF);
        return super.a(view, motionEvent, pointF);
    }

    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public Boolean b(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        List list = this.j;
        if (list != null) {
            list.add(pointF2);
        }
        return super.b(view, motionEvent, pointF, pointF2);
    }

    @Override // com.adsurge.adn.p044n0.a
    public boolean d(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        return a.a(this.i, this.j, this.h) >= this.g;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[PHI: r7
  0x002b: PHI (r7v3 double) = (r7v0 double), (r7v1 double) binds: [B:12:0x0029, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public h(c cVar) {
        int length;
        super(cVar);
        JSONObject jSONObject = cVar.c;
        if (jSONObject != null && jSONObject.length() > 0) {
            this.h = jSONObject.optInt("rtdrn", 0) == 1;
            double dOptDouble = jSONObject.optDouble("sml", 0.0d);
            double d = 1.0d;
            if (dOptDouble <= 1.0d) {
                d = -1.0d;
                dOptDouble = dOptDouble < -1.0d ? d : dOptDouble;
            }
            this.g = (float) dOptDouble;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pts");
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                this.i = new ArrayList((length + 1) / 2);
                for (int i = 0; i < length; i += 2) {
                    this.i.add(new PointF((float) jSONArrayOptJSONArray.optDouble(i, 0.0d), (float) jSONArrayOptJSONArray.optDouble(i + 1, 0.0d)));
                }
                return;
            }
            this.i = null;
            return;
        }
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = false;
        this.i = null;
    }

    @Override // com.adsurge.adn.p044n0.a, com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        List list = this.j;
        if (list != null) {
            list.add(pointF2);
        }
        return super.a(view, motionEvent, pointF, pointF2);
    }
}
