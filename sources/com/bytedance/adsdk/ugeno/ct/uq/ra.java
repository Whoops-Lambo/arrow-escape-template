package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ra extends rz implements com.bytedance.adsdk.ugeno.fi.gf.kgy {
    private int at;
    private long ay;
    private int dg;
    private boolean fpp;
    private final List<nu> fpz;
    private boolean gm;
    private int ioy;
    private int kus;
    private boolean lqi;
    private int nu;
    private boolean sx;
    private String twf;
    private int um;
    private int vs;
    private Handler xh;

    private void ahm(int i) {
        this.xh.removeMessages(1001);
        long jMax = Math.max(0, i);
        this.ay = SystemClock.uptimeMillis() + jMax;
        this.xh.sendEmptyMessageDelayed(1001, jMax);
    }

    private void at() {
        if (this.gm) {
            this.gm = false;
            int i = this.ioy;
            this.ioy = 0;
            ahm(i);
        }
    }

    private void gf() {
        if (this.sx) {
            return;
        }
        this.sx = true;
        this.fpp = false;
        this.gm = false;
        this.ioy = 0;
        this.lqi = false;
        this.dg = 0;
        twf();
        ahm(this.at);
        ra();
    }

    private void kus() {
        if (this.fpz.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.fpz);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nu) obj).ahm(this.twf);
        }
    }

    private void nu() {
        if (this.gm) {
            return;
        }
        this.ioy = (int) Math.max(0L, this.ay - SystemClock.uptimeMillis());
        this.xh.removeMessages(1001);
        this.gm = true;
    }

    private void ra() {
        if (this.sx) {
            com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
            View viewNu = rzVar != null ? rzVar.nu() : null;
            if ((this.vs & 2) != 0 && viewNu != null && viewNu.getVisibility() != 0) {
                this.dg |= 2;
            }
            if ((this.vs & 1) != 0 && viewNu != null && !viewNu.hasWindowFocus()) {
                this.dg |= 1;
            }
            if (this.dg != 0) {
                nu();
            } else {
                at();
            }
        }
    }

    private void twf() {
        if (this.fpz.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.fpz);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nu) obj).kgy(this.twf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Map<String, Object> map = this.ct;
        if (map != null) {
            Object obj = map.get("name");
            if (obj != null) {
                this.twf = String.valueOf(obj);
            } else {
                this.twf = "";
            }
            Object obj2 = this.ct.get("condition");
            if (obj2 != null) {
                this.kus = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj2), 0);
            } else {
                this.kus = 0;
            }
            Object obj3 = this.ct.get("pauseMode");
            if (obj3 != null) {
                this.vs = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj3), 0);
            } else {
                this.vs = 0;
            }
            Object obj4 = this.ct.get("loop");
            if (obj4 != null) {
                this.nu = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj4), 1);
            } else {
                this.nu = 1;
            }
            int i = this.nu;
            if (i <= 0) {
                this.um = -1;
            } else {
                this.um = i;
            }
            Object obj5 = this.ct.get("duration");
            if (obj5 == null) {
                this.at = 0;
            } else {
                this.at = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj5), 0);
            }
        }
        int i2 = this.kus;
        if (i2 == 0) {
            gf();
        } else if (i2 == 1) {
            com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
            if (rzVar == null || rzVar.nu() == null || this.ahm.nu().getVisibility() != 0) {
                this.fpp = true;
            } else {
                gf();
            }
        } else if (i2 == 2) {
            this.fpp = true;
        } else {
            gf();
        }
        return true;
    }

    public ra(Context context) {
        super(context);
        this.at = 0;
        this.twf = "";
        this.kus = 0;
        this.vs = 0;
        this.dg = 0;
        this.xh = new com.bytedance.adsdk.ugeno.fi.gf(Looper.getMainLooper(), this);
        this.um = 0;
        this.fpp = false;
        this.sx = false;
        this.gm = false;
        this.ay = 0L;
        this.ioy = 0;
        this.lqi = false;
        this.fpz = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public void rz() {
        super.rz();
        Map<String, Object> map = this.ct;
        if (map != null) {
            Object obj = map.get("name");
            if (obj != null) {
                this.twf = String.valueOf(obj);
                return;
            } else {
                this.twf = "";
                return;
            }
        }
        this.twf = "";
    }

    public String ahm() {
        return this.twf;
    }

    public void kgy(int i) {
        if (this.kus == 1 && this.fpp && i == 0) {
            gf();
        }
        if (!this.sx || (this.vs & 2) == 0) {
            return;
        }
        int i2 = this.dg;
        if (i == 0) {
            this.dg = i2 & (-3);
        } else {
            this.dg = i2 | 2;
        }
        ra();
    }

    public void kgy() {
        if (this.kus == 2 && this.fpp) {
            gf();
        }
    }

    public void kgy(boolean z) {
        if (!this.sx || (this.vs & 1) == 0) {
            return;
        }
        int i = this.dg;
        if (z) {
            this.dg = i & (-2);
        } else {
            this.dg = i | 1;
        }
        ra();
    }

    @Override // com.bytedance.adsdk.ugeno.fi.gf.kgy
    public void kgy(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.um);
        this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
        int i3 = this.um - 1;
        this.um = i3;
        if (i3 < 0 && (i2 = this.at) != 0) {
            ahm(i2);
            return;
        }
        if (i3 > 0 && (i = this.at) != 0) {
            ahm(i);
            return;
        }
        this.xh.removeMessages(1001);
        this.ay = 0L;
        if (this.lqi) {
            return;
        }
        this.lqi = true;
        kus();
    }

    public void kgy(nu nuVar) {
        if (nuVar == null || this.fpz.contains(nuVar)) {
            return;
        }
        this.fpz.add(nuVar);
    }
}
