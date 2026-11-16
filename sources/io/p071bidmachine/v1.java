package io.p071bidmachine;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ f2 a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.b(sharedPreferences, str);
    }

    public v1(f2 f2Var) {
        this.a = f2Var;
    }
}
