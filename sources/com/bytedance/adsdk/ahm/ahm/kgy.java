package com.bytedance.adsdk.ahm.ahm;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.ahm.rz;
import com.bytedance.adsdk.ahm.rz.yo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy {
    private rz ct;
    private final AssetManager uq;
    private final yo<String> kgy = new yo<>();
    private final Map<yo<String>, Typeface> ahm = new HashMap();
    private final Map<String, Typeface> rz = new HashMap();
    private String noq = ".ttf";

    public Typeface kgy(com.bytedance.adsdk.ahm.rz.rz rzVar) {
        this.kgy.kgy(rzVar.kgy(), rzVar.rz());
        Typeface typeface = this.ahm.get(this.kgy);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceKgy = kgy(ahm(rzVar), rzVar.rz());
        this.ahm.put(this.kgy, typefaceKgy);
        return typefaceKgy;
    }

    public kgy(Drawable.Callback callback, rz rzVar) {
        this.ct = rzVar;
        if (!(callback instanceof View)) {
            this.uq = null;
        } else {
            this.uq = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface ahm(com.bytedance.adsdk.ahm.rz.rz rzVar) {
        Typeface typefaceCreateFromAsset;
        String strKgy = rzVar.kgy();
        Typeface typeface = this.rz.get(strKgy);
        if (typeface != null) {
            return typeface;
        }
        String strRz = rzVar.rz();
        String strAhm = rzVar.ahm();
        rz rzVar2 = this.ct;
        if (rzVar2 != null) {
            typefaceCreateFromAsset = rzVar2.kgy(strKgy, strRz, strAhm);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.ct.kgy(strKgy);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        rz rzVar3 = this.ct;
        if (rzVar3 != null && typefaceCreateFromAsset == null) {
            String strAhm2 = rzVar3.ahm(strKgy, strRz, strAhm);
            if (strAhm2 == null) {
                strAhm2 = this.ct.ahm(strKgy);
            }
            if (strAhm2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.uq, strAhm2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (rzVar.uq() != null) {
            return rzVar.uq();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.uq, "fonts/" + strKgy + this.noq);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.rz.put(strKgy, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void kgy(String str) {
        this.noq = str;
    }

    public void kgy(rz rzVar) {
        this.ct = rzVar;
    }

    private Typeface kgy(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
