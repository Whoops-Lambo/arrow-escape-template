package com.bytedance.sdk.openadsdk.rz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ra {
    private String at;
    private int dg;
    private ioy kus;
    private String nu;
    private String ra;
    private JSONObject twf;
    private int vs;
    private FilterWord xh;
    public static FilterWord kgy = new FilterWord("", "");
    public static int ahm = 1;
    public static int rz = 2;
    public static int uq = 3;
    public static int ct = 4;
    private final Set<rz> noq = new HashSet();
    private final Set<ahm> yo = new HashSet();
    private final Set<uq> fi = new HashSet();
    private final Set<kgy> gf = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void kgy(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(List<FilterWord> list);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface rz {
        void kgy(FilterWord filterWord);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface uq {
        void kgy(String str);
    }

    private void ra() {
        Iterator<rz> it = this.noq.iterator();
        while (it.hasNext()) {
            it.next().kgy(this.xh);
        }
    }

    public void ahm(String str) {
        this.nu = str;
    }

    public void ct() {
        Iterator<ahm> it = this.yo.iterator();
        while (it.hasNext()) {
            it.next().kgy(rz);
        }
    }

    public int fi() {
        return this.vs;
    }

    public boolean gf() {
        return this.vs < this.dg;
    }

    public void kgy(List<FilterWord> list) {
        Iterator<kgy> it = this.gf.iterator();
        while (it.hasNext()) {
            it.next().kgy(list);
        }
    }

    public void noq() {
        Iterator<ahm> it = this.yo.iterator();
        while (it.hasNext()) {
            it.next().kgy(ct);
        }
    }

    public void rz(String str) {
        this.at = str;
        Iterator<uq> it = this.fi.iterator();
        while (it.hasNext()) {
            it.next().kgy(this.at);
        }
    }

    public String yo() {
        return this.at;
    }

    public void uq() {
        ioy ioyVar;
        if (!rz() && !TextUtils.isEmpty(this.at)) {
            this.xh = new FilterWord("0:00", this.at);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.xh);
        if (!TextUtils.isEmpty(this.ra)) {
            if (TextUtils.isEmpty(this.at)) {
                com.bytedance.sdk.openadsdk.rz.ahm.kgy().kgy(this.ra, arrayList, this.nu);
            } else {
                if (this.twf == null && (ioyVar = this.kus) != null) {
                    this.twf = ioyVar.twf(true);
                }
                com.bytedance.sdk.openadsdk.rz.ahm.kgy().kgy(this.ra, arrayList, this.twf, this.at, this.nu);
            }
        }
        Iterator<ahm> it = this.yo.iterator();
        while (it.hasNext()) {
            it.next().kgy(ahm);
        }
        kgy(kgy);
        rz("");
    }

    public FilterWord ahm() {
        return this.xh;
    }

    public void kgy(String str) {
        this.ra = str;
    }

    public void kgy(FilterWord filterWord) {
        this.xh = filterWord;
        ra();
    }

    public void kgy(rz rzVar) {
        this.noq.add(rzVar);
    }

    public void kgy(ahm ahmVar) {
        this.yo.add(ahmVar);
    }

    public boolean rz() {
        FilterWord filterWord = this.xh;
        return (filterWord == null || filterWord.equals(kgy)) ? false : true;
    }

    public void kgy(uq uqVar) {
        this.fi.add(uqVar);
    }

    public void kgy(kgy kgyVar) {
        this.gf.add(kgyVar);
    }

    public void kgy() {
        this.noq.clear();
        this.yo.clear();
        this.fi.clear();
        this.gf.clear();
    }

    public void kgy(ioy ioyVar) {
        this.kus = ioyVar;
    }

    public void kgy(int i, int i2) {
        this.vs = i;
        this.dg = i2;
    }
}
