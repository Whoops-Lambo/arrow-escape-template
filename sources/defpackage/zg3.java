package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zg3 implements Serializable {
    public String ahm;
    private final int at;
    private boolean ay;
    private String dg;
    private String fi;
    private String fpp;
    private boolean gf;
    private boolean gm;
    private int ioy;
    private int lqi;
    private bb3 noq;
    private boolean nu;
    private boolean ra;
    public int rz;
    private long sx;
    private int uf;
    private int um;
    private int xh;
    private bb3 yo;
    private int twf = 204800;
    private int kus = 0;
    private int vs = 0;
    protected float kgy = -1.0f;
    public final HashMap<String, Object> uq = new HashMap<>();
    private int fpz = 10000;
    private int jpc = 10000;
    private int ft = 10000;
    private int wy = 0;
    public int ct = 1;
    private JSONObject vg = new JSONObject();

    public synchronized Object ct(String str) {
        return this.uq.get(str);
    }

    public boolean ahm() {
        return this.uf == 2;
    }

    public int ay() {
        return this.wy;
    }

    public int fi() {
        return this.xh;
    }

    public int fpp() {
        return this.fpz;
    }

    public boolean fpz() {
        return this.gf;
    }

    public int gf() {
        return this.um;
    }

    public int gm() {
        return this.ft;
    }

    public bb3 ioy() {
        return this.noq;
    }

    public boolean jpc() {
        return this.ra;
    }

    public boolean kgy() {
        int i = this.uf;
        return i == 1 || i == 2;
    }

    public boolean kus() {
        bb3 bb3Var;
        return this.lqi == 1 && (bb3Var = this.yo) != null && !TextUtils.isEmpty(bb3Var.g) && Build.VERSION.SDK_INT >= 26;
    }

    public bb3 lqi() {
        return this.yo;
    }

    public boolean nu() {
        return this.gm;
    }

    public long ra() {
        return this.sx;
    }

    public JSONObject rz() {
        return this.vg;
    }

    public int sx() {
        return this.jpc;
    }

    public int uf() {
        return this.at;
    }

    public int um() {
        return this.ioy;
    }

    public int uq() {
        return this.vg.optInt("pitaya_cache_size", 0);
    }

    public float vs() {
        float f = this.kgy;
        if (f != -1.0f) {
            return f;
        }
        if (kus()) {
            this.yo.getClass();
            return -1.0f;
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null) {
            bb3Var.getClass();
        }
        return -1.0f;
    }

    public boolean wy() {
        return this.nu;
    }

    public boolean yo() {
        return this.ay;
    }

    public zg3(String str, bb3 bb3Var, bb3 bb3Var2, int i, int i2, int i3) {
        this.ioy = 0;
        this.lqi = 0;
        this.fi = str;
        this.noq = bb3Var;
        this.yo = bb3Var2;
        this.ioy = i;
        this.lqi = i2;
        this.at = i3;
    }

    public long at() {
        if (kus()) {
            return this.yo.c;
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null) {
            return bb3Var.c;
        }
        return 0L;
    }

    public String dg() {
        if (kus()) {
            return this.yo.g;
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null) {
            return bb3Var.g;
        }
        return null;
    }

    public File ft() {
        String strXh = xh();
        if (this.fi != null && strXh != null) {
            return new File(this.fi, strXh);
        }
        return null;
    }

    public int noq() {
        if (kus()) {
            return this.yo.c();
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null) {
            return bb3Var.c();
        }
        return 0;
    }

    public boolean twf() {
        if (kus()) {
            if (this.yo.o != 0) {
                return false;
            }
            return true;
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null && bb3Var.o != 0) {
            return false;
        }
        return true;
    }

    public String xh() {
        if (kus()) {
            return this.yo.a();
        }
        bb3 bb3Var = this.noq;
        if (bb3Var != null) {
            return bb3Var.a();
        }
        return null;
    }

    public void fi(int i) {
        this.wy = i;
    }

    public void rz(int i) {
        this.um = i;
    }

    public void yo(int i) {
        this.ft = i;
    }

    public void rz(String str) {
        this.fpp = str;
    }

    public void rz(boolean z) {
        this.ra = z;
    }

    public void ahm(String str) {
        this.dg = str;
    }

    public void ahm(int i) {
        this.xh = i;
    }

    public void uq(String str) {
        this.ahm = str;
    }

    public void ahm(boolean z) {
        this.gf = z;
    }

    public void uq(int i) {
        this.rz = i;
    }

    public String ct() {
        return this.fi;
    }

    public void kgy(int i) {
        this.uf = i;
    }

    public void uq(boolean z) {
        this.nu = z;
    }

    public void ct(int i) {
        this.fpz = i;
    }

    public void kgy(String str) {
        this.fi = str;
    }

    public void kgy(long j) {
        this.sx = j;
    }

    public void kgy(boolean z) {
        this.gm = z;
    }

    public synchronized void kgy(String str, Object obj) {
        this.uq.put(str, obj);
    }

    public void noq(int i) {
        this.jpc = i;
    }
}
