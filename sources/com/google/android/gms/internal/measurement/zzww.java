package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import defpackage.d31;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzww {
    public abstract d31 a();

    public abstract d31 b();

    public abstract UUID c();

    public abstract long d();

    public final String toString() {
        return TextUtils.join(" -> ", a());
    }
}
