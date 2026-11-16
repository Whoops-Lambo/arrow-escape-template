package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzx;
import com.ironsource.G5;
import defpackage.d;
import defpackage.i55;
import defpackage.m35;
import defpackage.m85;
import defpackage.r85;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    @NonNull
    @KeepForSdk
    public static Map<String, String> parse(@NonNull URI uri, @NonNull String str) {
        ?? map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap();
            r85 r85Var = new r85(new m35(G5.U));
            i55 i55Var = i55.b;
            zzx zzxVar = new zzx(r85Var, false, i55Var);
            zzx zzxVar2 = new zzx(new r85(new m35('&')), true, i55Var);
            m85 m85Var = new m85(zzxVar2, rawQuery, (m35) zzxVar2.b.a);
            while (m85Var.hasNext()) {
                String str2 = (String) m85Var.next();
                str2.getClass();
                m85 m85Var2 = new m85(zzxVar, str2, (m35) zzxVar.b.a);
                ArrayList arrayList = new ArrayList();
                while (m85Var2.hasNext()) {
                    arrayList.add((String) m85Var2.next());
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                String strZza = null;
                if (listUnmodifiableList.isEmpty() || listUnmodifiableList.size() > 2) {
                    d.r("bad parameter");
                    return null;
                }
                String strZza2 = zza((String) listUnmodifiableList.get(0), str);
                if (listUnmodifiableList.size() == 2) {
                    strZza = zza((String) listUnmodifiableList.get(1), str);
                }
                map.put(strZza2, strZza);
            }
        }
        return map;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            try {
                str2 = StandardCharsets.ISO_8859_1.name();
            } catch (UnsupportedEncodingException e) {
                d.n(e);
                return null;
            }
        }
        return URLDecoder.decode(str, str2);
    }

    private HttpUtils() {
    }
}
