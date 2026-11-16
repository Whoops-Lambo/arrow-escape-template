package com.adsurge.adn.T;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.G5;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements com.adsurge.adn.H0.a {
    public int c;
    public int d;
    public String e;
    public com.adsurge.adn.H0.a.EnumC0076a j;
    public byte[] m;
    public boolean a = true;
    public boolean b = true;
    public Map f = new HashMap();
    public Map g = new HashMap();
    public Map h = Collections.unmodifiableMap(this.f);
    public Map i = Collections.unmodifiableMap(this.g);
    public boolean k = false;
    public boolean l = true;

    @Override // com.adsurge.adn.H0.a
    public byte[] b() {
        return this.m;
    }

    @Override // com.adsurge.adn.H0.a
    public boolean c() {
        return this.l;
    }

    @Override // com.adsurge.adn.H0.a
    public String d() {
        return this.e;
    }

    @Override // com.adsurge.adn.H0.a
    public int e() {
        return this.c;
    }

    @Override // com.adsurge.adn.H0.a
    public boolean g() {
        return this.b;
    }

    @Override // com.adsurge.adn.H0.a
    public boolean h() {
        return this.a;
    }

    @Override // com.adsurge.adn.H0.a
    public com.adsurge.adn.H0.a.EnumC0076a i() {
        return this.j;
    }

    @Override // com.adsurge.adn.H0.a
    public Map j() {
        return this.h;
    }

    public Map k() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((i() == com.adsurge.adn.H0.a.EnumC0076a.GET ? "get " : "post ").concat("url, "));
        sb.append(f());
        if (i() == com.adsurge.adn.H0.a.EnumC0076a.POST) {
            try {
                sb.append(" , " + URLDecoder.decode(new String(this.m, com.adsurge.adn.B0.a.a)));
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return sb.toString();
    }

    public a(String str, com.adsurge.adn.H0.a.EnumC0076a enumC0076a, byte[] bArr) {
        this.e = str;
        this.j = enumC0076a;
        if (bArr == null) {
            this.m = null;
        } else {
            this.m = (byte[]) bArr.clone();
        }
        a("Content-Type", G5.M);
    }

    @Override // com.adsurge.adn.H0.a
    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f.put(str, str2);
        }
    }

    @Override // com.adsurge.adn.H0.a
    public String f() {
        if (k().isEmpty()) {
            return d();
        }
        Uri.Builder builderBuildUpon = Uri.parse(d()).buildUpon();
        for (Map.Entry entry : k().entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // com.adsurge.adn.H0.a
    public void b(boolean z) {
        this.b = z;
    }

    @Override // com.adsurge.adn.H0.a
    public int a() {
        return this.d;
    }

    @Override // com.adsurge.adn.H0.a
    public void a(boolean z) {
        this.a = z;
    }
}
