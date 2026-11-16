package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.eu;
import defpackage.kk2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfk {

    @NotNull
    private final List zza;

    private final boolean zzd(String str) {
        List list = this.zza;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kk2.L(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final List zzf(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(eu.f(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public zzfk(boolean z) {
        this.zza = zzf(eu.z("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }

    public static final boolean zzc(@NotNull Uri uri) {
        return zze(uri);
    }

    private static final boolean zze(Uri uri) {
        if (!TextUtils.isEmpty(uri.toString()) && HttpRequest.DEFAULT_SCHEME.equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            return true;
        }
        return false;
    }

    public final boolean zza(@NotNull Uri uri) {
        if (zze(uri) && zzd(uri.toString())) {
            return true;
        }
        return false;
    }

    public final boolean zzb(@NotNull String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (zze(uri) && zzd(uri.toString())) {
            return true;
        }
        return false;
    }

    public zzfk() {
        this(true);
    }
}
