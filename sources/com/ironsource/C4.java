package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4 implements F4 {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    @Override // com.ironsource.F4
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.a.getAll();
        all.getClass();
        return all;
    }

    public C4(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // com.ironsource.F4
    public void a(@NotNull String str) {
        str.getClass();
        this.b.remove(str).apply();
    }

    @Override // com.ironsource.F4
    public void b(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.b.putString(str, str2).apply();
    }

    @Override // com.ironsource.F4
    @Nullable
    public String a(@NotNull String str, @Nullable String str2) {
        str.getClass();
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }
}
