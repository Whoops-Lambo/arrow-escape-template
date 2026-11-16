package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p041m0.d;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class j implements g {
    public final c a;
    public final boolean b;
    public final boolean c;

    @Override // com.adsurge.adn.p044n0.g
    public int d() {
        return 0;
    }

    @Override // com.adsurge.adn.p044n0.g
    public void f() {
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean b(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        if (this.c) {
            a(view, motionEvent);
        }
        return Boolean.FALSE;
    }

    @Override // com.adsurge.adn.p044n0.g
    public c c() {
        return this.a;
    }

    @Override // com.adsurge.adn.p044n0.g
    public boolean e() {
        return this.b || this.c;
    }

    public j(c cVar) {
        boolean z;
        this.a = cVar;
        if (cVar.c.optInt("dm") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.c = cVar.c.optInt("tme") == 1;
    }

    public final void a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 1;
        if (action != 0) {
            if (action != 1) {
                i = 2;
                if (action != 2) {
                    if (action == 3) {
                        i = 4;
                    } else {
                        return;
                    }
                }
            } else {
                i = 3;
            }
        }
        try {
            this.a.c.put("te", i);
            this.a.c.put("tx", g.b(motionEvent.getX()));
            this.a.c.put("ty", g.b(motionEvent.getY()));
            this.a.c.put("vw", g.b(view.getWidth()));
            this.a.c.put("vh", g.b(view.getHeight()));
        } catch (JSONException unused) {
        }
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean c(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public boolean b() {
        return false;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF) {
        a(view, motionEvent);
        return Boolean.FALSE;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        a(view, motionEvent);
        return Boolean.TRUE;
    }

    @Override // com.adsurge.adn.p044n0.g
    public d a() {
        return null;
    }
}
