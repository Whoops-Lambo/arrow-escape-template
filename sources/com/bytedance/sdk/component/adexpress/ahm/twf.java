package com.bytedance.sdk.component.adexpress.ahm;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf {
    private ct ahm;
    private int at;
    private int ay;
    private String bmz;
    private int ct;
    private boolean dg;
    private String fi;
    private int fpp;
    private int fpz;
    private JSONObject ft;
    private boolean gf;
    private int gm;
    private int ikw;
    private String ioy;
    private boolean jpc;
    private JSONObject kgy;
    private Map<String, String> kus;
    private double lqi;
    private final String muf;
    private final boolean mw;
    private String noq;
    private long nu;
    private int ra;
    private String rz;
    private int sx;
    private String twf;
    private JSONObject uf;
    private int um;
    private gf uq;
    private final boolean uxe;
    private boolean vg;
    private final String vrj;
    private int vs;
    private JSONObject wy;
    private String xh;
    private String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private ct ahm;
        private int at;
        private int ay;
        private String bmz;
        private int ct;
        private boolean dg;
        private String fi;
        private int fpp;
        private int fpz;
        private JSONObject ft;
        private boolean gf;
        private int gm;
        private String ioy;
        private JSONObject kgy;
        private Map<String, String> kus;
        private double lqi;
        private String muf;
        private String noq;
        private long nu;
        private int ra;
        private String rz;
        private int sx;
        private String twf;
        private JSONObject uf;
        private int um;
        private gf uq;
        private String uxe;
        private boolean vg;
        private int vrj;
        private int vs;
        private JSONObject wy;
        private String xh;
        private String yo;
        private boolean jpc = true;
        private boolean ikw = true;
        private boolean mw = false;

        public twf kgy() {
            return new twf(this);
        }

        public kgy ahm(String str) {
            this.noq = str;
            return this;
        }

        public kgy ct(String str) {
            this.xh = str;
            return this;
        }

        public kgy fi(String str) {
            this.muf = str;
            return this;
        }

        public kgy noq(String str) {
            this.bmz = str;
            return this;
        }

        public kgy rz(String str) {
            this.yo = str;
            return this;
        }

        public kgy uq(String str) {
            this.fi = str;
            return this;
        }

        public kgy yo(String str) {
            this.uxe = str;
            return this;
        }

        public kgy ahm(boolean z) {
            this.gf = z;
            return this;
        }

        public kgy ct(int i) {
            this.fpz = i;
            return this;
        }

        public kgy noq(int i) {
            this.vrj = i;
            return this;
        }

        public kgy rz(boolean z) {
            this.ikw = z;
            return this;
        }

        public kgy uq(int i) {
            this.vs = i;
            return this;
        }

        public kgy ahm(int i) {
            this.ra = i;
            return this;
        }

        public kgy ct(boolean z) {
            this.vg = z;
            return this;
        }

        public kgy noq(boolean z) {
            this.mw = z;
            return this;
        }

        public kgy rz(int i) {
            this.at = i;
            return this;
        }

        public kgy uq(boolean z) {
            this.dg = z;
            return this;
        }

        public kgy kgy(ct ctVar) {
            this.ahm = ctVar;
            return this;
        }

        public kgy kgy(boolean z) {
            this.jpc = z;
            return this;
        }

        public kgy kgy(String str) {
            this.rz = str;
            return this;
        }

        public kgy kgy(gf gfVar) {
            this.uq = gfVar;
            return this;
        }

        public kgy kgy(int i) {
            this.ct = i;
            return this;
        }

        public kgy kgy(long j) {
            this.nu = j;
            return this;
        }

        public kgy kgy(Map<String, String> map) {
            this.kus = map;
            return this;
        }

        public kgy kgy(double d) {
            this.lqi = d;
            return this;
        }
    }

    public double ahm() {
        return this.lqi;
    }

    public int at() {
        return this.vs;
    }

    public int ay() {
        return this.ay;
    }

    public gf ct() {
        return this.uq;
    }

    public int dg() {
        return this.fpp;
    }

    public boolean fi() {
        return this.gf;
    }

    public JSONObject fpp() {
        return this.wy;
    }

    public int fpz() {
        return this.ikw;
    }

    public String ft() {
        return this.muf;
    }

    public long gf() {
        return this.nu;
    }

    public int gm() {
        return this.gm;
    }

    public boolean ioy() {
        return this.vg;
    }

    public boolean jpc() {
        return this.uxe;
    }

    public boolean kgy() {
        return this.jpc;
    }

    public String kus() {
        return this.xh;
    }

    public String lqi() {
        return this.bmz;
    }

    public int noq() {
        return this.ct;
    }

    public Map<String, String> nu() {
        return this.kus;
    }

    public int ra() {
        return this.at;
    }

    public JSONObject rz() {
        ct ctVar;
        if (this.kgy == null && (ctVar = this.ahm) != null) {
            this.kgy = ctVar.kgy();
        }
        return this.kgy;
    }

    public JSONObject sx() {
        return this.uf;
    }

    public boolean twf() {
        return this.dg;
    }

    public boolean uf() {
        return this.mw;
    }

    public JSONObject um() {
        return this.ft;
    }

    public String uq() {
        return this.rz;
    }

    public int vs() {
        return this.um;
    }

    public String wy() {
        return this.vrj;
    }

    public int xh() {
        return this.sx;
    }

    public int yo() {
        return this.fpz;
    }

    public twf(kgy kgyVar) {
        this.kgy = kgyVar.kgy;
        this.ahm = kgyVar.ahm;
        this.rz = kgyVar.rz;
        this.uq = kgyVar.uq;
        this.ct = kgyVar.ct;
        this.noq = kgyVar.noq;
        this.yo = kgyVar.yo;
        this.fi = kgyVar.fi;
        this.gf = kgyVar.gf;
        this.ra = kgyVar.ra;
        this.nu = kgyVar.nu;
        this.at = kgyVar.at;
        this.twf = kgyVar.twf;
        this.kus = kgyVar.kus;
        this.vs = kgyVar.vs;
        this.dg = kgyVar.dg;
        this.xh = kgyVar.xh;
        this.um = kgyVar.um;
        this.fpp = kgyVar.fpp;
        this.sx = kgyVar.sx;
        this.gm = kgyVar.gm;
        this.ay = kgyVar.ay;
        this.ioy = kgyVar.ioy;
        this.lqi = kgyVar.lqi;
        this.fpz = kgyVar.fpz;
        this.jpc = kgyVar.jpc;
        this.ft = kgyVar.ft;
        this.wy = kgyVar.wy;
        this.uf = kgyVar.uf;
        this.vg = kgyVar.vg;
        this.bmz = kgyVar.bmz;
        this.ikw = kgyVar.vrj;
        this.uxe = kgyVar.ikw;
        this.muf = kgyVar.uxe;
        this.vrj = kgyVar.muf;
        this.mw = kgyVar.mw;
    }
}
