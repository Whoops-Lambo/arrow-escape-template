package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4788i2;
import defpackage.h50;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class al {
    private static volatile al a;
    private Context b;
    private List<Integer> c = new ArrayList();

    public synchronized String d() {
        if (this.c.size() <= 0) {
            return C4788i2.f;
        }
        List<Integer> list = this.c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public int b() {
        Intent intentE = h50.e("android.intent.action.BATTERY_CHANGED", this.b, null);
        if (intentE == null) {
            return 0;
        }
        return intentE.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentE = h50.e("android.intent.action.BATTERY_CHANGED", this.b, null);
        if (intentE == null) {
            return 0;
        }
        return Math.round(((intentE.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / intentE.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    private al(Context context) {
        this.b = null;
        this.b = context;
    }

    public void a() {
        int iF = f();
        if (iF != -1) {
            this.c.add(Integer.valueOf(iF));
            try {
                int size = this.c.size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(this.c.subList(size - 10, size));
                    this.c.clear();
                    this.c = arrayList;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static al a(Context context) {
        if (a == null) {
            synchronized (al.class) {
                try {
                    if (a == null) {
                        a = new al(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
