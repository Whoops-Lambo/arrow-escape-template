package com.google.android.recaptcha.internal;

import defpackage.gg0;
import defpackage.s71;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzga extends zzfx {

    @NotNull
    private final zzfz zza;

    @NotNull
    private final String zzb;

    public zzga(@NotNull zzfz zzfzVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        List listAsList;
        if (s71.b(method.getName(), this.zzb)) {
            zzfz zzfzVar = this.zza;
            if (objArr != null) {
                listAsList = Arrays.asList(objArr);
                listAsList.getClass();
            } else {
                listAsList = gg0.a;
            }
            zzfzVar.zzb(listAsList);
            return true;
        }
        return false;
    }
}
