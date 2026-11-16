package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.p041m0.d;
import com.adsurge.adn.p041m0.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements g {
    public final c a;
    public final boolean b;
    public final int c;
    public boolean d;
    public final d e;
    public final e f;

    public abstract boolean d(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2);

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        boolean z = this.d && d(view, motionEvent, pointF, pointF2);
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(z, view);
        }
        e eVar = this.f;
        if (eVar != null) {
            eVar.a(view, motionEvent);
        }
        if (z) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean b(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        boolean z = false;
        if (this.b && this.d && d(view, motionEvent, pointF, pointF2)) {
            z = true;
        }
        d dVar = this.e;
        if (dVar != null) {
            if (z) {
                dVar.a(true, view);
            } else {
                dVar.a(view, pointF2);
            }
        }
        e eVar = this.f;
        if (eVar != null) {
            if (z) {
                eVar.a(view, motionEvent);
            } else {
                eVar.b(view, motionEvent);
            }
        }
        if (z) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean c(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        e eVar;
        d dVar;
        boolean z = false;
        if (!this.d) {
            this.d = true;
            if (this.b && d(view, motionEvent, pointF, pointF2)) {
                z = true;
            }
        }
        if (z && (dVar = this.e) != null) {
            dVar.a(true, view);
        }
        if (z && (eVar = this.f) != null) {
            eVar.a(view, motionEvent);
        }
        if (z) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public int d() {
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @Override // com.adsurge.adn.p044n0.g
    public boolean e() {
        return (!this.b && this.e == null && this.f == null) ? false : true;
    }

    public a(c cVar) {
        boolean z;
        this.a = cVar;
        JSONObject jSONObject = cVar.c;
        if (jSONObject != null && jSONObject.length() > 0) {
            if (jSONObject.optInt("dm") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            this.c = jSONObject.optInt("imnd", 0);
            this.d = !b();
            d dVarA = d.a(jSONObject);
            this.e = dVarA;
            this.f = dVarA == null ? e.a(jSONObject) : null;
            return;
        }
        this.b = false;
        this.e = null;
        this.f = null;
        this.c = 0;
        this.d = !b();
    }

    @Override // com.adsurge.adn.p044n0.g
    public void f() {
        this.d = !b();
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(view, pointF);
        }
        e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        eVar.c(view, motionEvent);
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public d a() {
        return this.f;
    }

    @Override // com.adsurge.adn.p044n0.g
    public c c() {
        return this.a;
    }

    @Override // com.adsurge.adn.p044n0.g
    public boolean b() {
        return this.c > 0;
    }
}
