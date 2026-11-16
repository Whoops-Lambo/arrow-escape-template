package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbbo {
    public static final String[] c = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String[] a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final zzbbj b;

    public static Uri d(Uri uri, String str) throws zzbbp {
        try {
            if (uri == null) {
                throw null;
            }
            int i = 0;
            try {
                if (uri.getHost().equals("ad.doubleclick.net") && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzbbp("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(35);
                    String strSubstring = iIndexOf == -1 ? string : string.substring(0, iIndexOf);
                    String strSubstring2 = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                    String[] strArrSplit = strSubstring.split(";", -1);
                    int i2 = 1;
                    if (strArrSplit.length <= 1) {
                        StringBuilder sb = new StringBuilder(strSubstring.length() + 7 + String.valueOf(str).length() + 1 + strSubstring2.length());
                        sb.append(strSubstring);
                        sb.append(";dc_ms=");
                        sb.append(str);
                        sb.append(";");
                        sb.append(strSubstring2);
                        return Uri.parse(sb.toString());
                    }
                    int i3 = 1;
                    while (true) {
                        if (i3 >= strArrSplit.length) {
                            i3 = -1;
                            break;
                        }
                        if (strArrSplit[i3].startsWith("adurl=") || strArrSplit[i3].equals("adurl")) {
                            break;
                            break;
                        }
                        i3++;
                    }
                    StringBuilder sb2 = new StringBuilder(strArrSplit[0]);
                    if (i3 != -1) {
                        while (i2 < strArrSplit.length) {
                            sb2.append(";");
                            if (i2 == i3) {
                                sb2.append("dc_ms");
                                sb2.append("=");
                                sb2.append(str);
                                sb2.append(";");
                            }
                            sb2.append(strArrSplit[i2]);
                            i2++;
                        }
                    } else {
                        while (i2 < strArrSplit.length) {
                            sb2.append(";");
                            sb2.append(strArrSplit[i2]);
                            i2++;
                        }
                        sb2.append(";");
                        sb2.append("dc_ms");
                        sb2.append("=");
                        sb2.append(str);
                        sb2.append(";");
                    }
                    sb2.append(strSubstring2);
                    return Uri.parse(sb2.toString());
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzbbp("Query parameter already exists: ms");
            }
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null && !encodedQuery.isEmpty()) {
                String[] strArrSplit2 = encodedQuery.split(C4664b4.j.c, -1);
                int i4 = 0;
                while (true) {
                    if (i4 >= strArrSplit2.length) {
                        i4 = -1;
                        break;
                    }
                    if (strArrSplit2[i4].startsWith("adurl=") || strArrSplit2[i4].equals("adurl")) {
                        break;
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    int length = strArrSplit2.length;
                    if (i >= length) {
                        return uri.buildUpon().encodedQuery(sb3.toString()).build();
                    }
                    if (i == i4) {
                        sb3.append("ms");
                        sb3.append("=");
                        sb3.append(str);
                        sb3.append(C4664b4.j.c);
                    }
                    sb3.append(strArrSplit2[i]);
                    if (i < length - 1) {
                        sb3.append(C4664b4.j.c);
                    }
                    i++;
                }
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        } catch (UnsupportedOperationException unused2) {
            throw new zzbbp("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context, View view, Activity activity) throws zzbbp {
        try {
            return d(uri, this.b.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzbbp("Provided Uri is not in a valid state");
        }
    }

    public zzbbo(zzbbj zzbbjVar) {
        this.b = zzbbjVar;
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.a;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean c(Uri uri) {
        if (a(uri)) {
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(c[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
