package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements a {
    public static final String c = IAlog.a(e.class);
    public final String a;
    public final String b;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.b;
    }

    public e(String str) {
        this.a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        this.b = sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = this.a;
        IAlog.c("%s: onCacheCommitted: %s for url: %s", c, (Uri) obj, str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.a;
    }
}
