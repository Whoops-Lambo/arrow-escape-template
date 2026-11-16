package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import defpackage.pv1;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzin extends zzil {
    public final int c;

    public zzin(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzia zziaVar, byte[] bArr) {
        super(pv1.l(i, "Response code: ", new StringBuilder(String.valueOf(i).length() + 15)), iOException, zziaVar, 2004, 1);
        this.c = i;
    }
}
