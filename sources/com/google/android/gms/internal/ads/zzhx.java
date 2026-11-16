package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzhx extends IOException {
    public final int a;

    public zzhx(int i) {
        this.a = i;
    }

    public zzhx(@Nullable String str, int i) {
        super(str);
        this.a = i;
    }

    public zzhx(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public zzhx(@Nullable Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
