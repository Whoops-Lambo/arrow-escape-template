package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭻ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0773 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final Map f2036;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ExecutorService f2037;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List f2038;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0822 f2039;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0939 f2040;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Context f2041;

    static {
        HashMap map = new HashMap();
        map.put(StringFog.decrypt("gT4k3rkqbrmGNTfMpCh3loEv\n", "71tQqdZYBf8=\n"), 1);
        map.put(StringFog.decrypt("UPL99o2Bi+1Q8v/MnI+L7lDu\n", "NZyLn//u5YA=\n"), 2);
        map.put(StringFog.decrypt("E1GjcRXOKnc6RaV9B8EsexhZpWw=\n", "ezDRFWKvWBI=\n"), 1);
        map.put(StringFog.decrypt("oVTvSbq0HRuiXdRNoq4dGw==\n", "wzGHKMzdcmk=\n"), 2);
        f2036 = Collections.unmodifiableMap(map);
    }

    public C0773(Context context, List list) {
        C0939 c0939 = new C0939();
        C0822 c0822 = new C0822();
        this.f2041 = context;
        this.f2040 = c0939;
        this.f2039 = c0822;
        this.f2038 = Collections.unmodifiableList(new ArrayList(list));
        this.f2037 = Executors.newSingleThreadExecutor();
    }
}
