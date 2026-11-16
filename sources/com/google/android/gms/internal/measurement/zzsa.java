package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.unity3d.ads.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsa {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = zzrv.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(BuildConfig.FLAVOR, "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(FileUploadManager.i, "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
