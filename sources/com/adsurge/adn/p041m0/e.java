package com.adsurge.adn.p041m0;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p035k0.o;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class e implements d {
    public final int a;
    public final int b;
    public final Path c = new Path();
    public final Paint d;

    public static e a(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("tvt", 0);
        if (iOptInt == 0) {
            return null;
        }
        return new e(iOptInt, jSONObject);
    }

    public void b(View view, MotionEvent motionEvent) {
        if (this.a == 1) {
            this.c.lineTo(motionEvent.getX(), motionEvent.getY());
            view.invalidate();
        }
    }

    public void c(View view, MotionEvent motionEvent) {
        if (this.a == 1) {
            this.c.moveTo(motionEvent.getX(), motionEvent.getY());
        }
    }

    public e(int i, JSONObject jSONObject) {
        this.a = i;
        this.b = jSONObject.optInt("tvfo", 0);
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tvd");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int length = length % 2 != 0 ? length + 1 : length;
            float[] fArr = new float[length];
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = m.c(jSONArrayOptJSONArray.opt(i2)).f(new JSONObject[0]);
            }
            this.d.setPathEffect(new DashPathEffect(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        } else {
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        Object objOpt = jSONObject.opt("tvs");
        if (objOpt != null) {
            this.d.setStrokeWidth(m.c(objOpt).f(new JSONObject[0]));
        }
        String strOptString = jSONObject.optString("tvc");
        if (!TextUtils.isEmpty(strOptString)) {
            this.d.setColor(o.b(m.c((Object) strOptString)));
        }
    }

    public void a(View view, MotionEvent motionEvent) {
        if (-1 == this.b) {
            return;
        }
        this.c.reset();
        view.invalidate();
    }

    @Override // com.adsurge.adn.p041m0.d
    public void a(Canvas canvas, int i, int i2) {
    }

    @Override // com.adsurge.adn.p041m0.d
    public void b(Canvas canvas, int i, int i2) {
        if (this.a == 1) {
            canvas.drawPath(this.c, this.d);
        }
    }
}
