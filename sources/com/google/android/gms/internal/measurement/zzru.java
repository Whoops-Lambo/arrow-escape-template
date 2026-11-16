package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.d31;
import defpackage.n30;
import defpackage.nw4;
import defpackage.pv1;
import defpackage.vt;
import defpackage.xq;
import defpackage.y21;
import defpackage.y32;
import defpackage.yh2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzru {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public zzru(ArrayList arrayList) {
        List<zztc> list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar = (zzsx) it.next();
            if (TextUtils.isEmpty(zzsxVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                zzsx zzsxVar2 = (zzsx) this.a.put(zzsxVar.zzc(), zzsxVar);
                if (zzsxVar2 != null) {
                    String canonicalName = zzsxVar2.getClass().getCanonicalName();
                    String canonicalName2 = zzsxVar.getClass().getCanonicalName();
                    defpackage.d.r(pv1.p(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        for (zztc zztcVar : list) {
            if (TextUtils.isEmpty(zztcVar.zza())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                zztc zztcVar2 = (zztc) this.b.put(zztcVar.zza(), zztcVar);
                if (zztcVar2 != null) {
                    String canonicalName3 = zztcVar2.getClass().getCanonicalName();
                    String canonicalName4 = zztcVar.getClass().getCanonicalName();
                    defpackage.d.r(pv1.p(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
                    throw null;
                }
            }
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, zzrt zzrtVar) {
        return zzrtVar.a(b(uri));
    }

    public final zzrs b(Uri uri) throws zzsk {
        List listZ;
        y21 y21VarX = d31.x();
        y21 y21VarX2 = d31.x();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            listZ = d31.z(new nw4(new yh2(yh2.a(UserDetailsUtils.UserDetailsLiterals.PLUS.charAt(0)).c, true, xq.a, Integer.MAX_VALUE), encodedFragment.substring(10)));
        } else {
            listZ = y32.e;
        }
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listZ.get(i);
            Matcher matcher = zzsp.a.matcher(str);
            if (matcher.matches()) {
                y21VarX2.a(matcher.group(1));
            } else {
                defpackage.d.r("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
        }
        y32 y32VarG = y21VarX2.g();
        int i2 = y32VarG.d;
        for (int i3 = 0; i3 < i2; i3++) {
            String str2 = (String) y32VarG.get(i3);
            zztc zztcVar = (zztc) this.b.get(str2);
            if (zztcVar != null) {
                y21VarX.a(zztcVar);
            } else {
                String strValueOf = String.valueOf(uri);
                throw new zzsk(pv1.p(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
            }
        }
        d31 d31VarI = y21VarX.g().I();
        vt vtVar = new vt(19);
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.a.get(scheme);
        if (zzsxVar != null) {
            vtVar.b = zzsxVar;
            vtVar.d = this.c;
            vtVar.c = d31VarI;
            vtVar.e = uri;
            if (!d31VarI.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str3 = (String) arrayList.get(arrayList.size() - 1);
                    ListIterator listIterator = d31VarI.listIterator(d31VarI.size());
                    while (listIterator.hasPrevious()) {
                    }
                    arrayList.set(arrayList.size() - 1, str3);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            vtVar.f = uri;
            return new zzrs(vtVar);
        }
        throw new zzsk(n30.y("Requested backend isn't registered: ", scheme));
    }
}
