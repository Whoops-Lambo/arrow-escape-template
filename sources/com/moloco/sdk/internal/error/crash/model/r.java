package com.moloco.sdk.internal.error.crash.model;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@z92
public final class r {

    @NotNull
    public static final j.b Companion = new j.b();
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return d0.a;
        }
    }

    public /* synthetic */ r(int i, String str, String str2, String str3, Integer num) {
        this.a = (i & 1) == 0 ? "Android" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public r(String str, Integer num) {
        String str2 = Build.VERSION.RELEASE;
        this.a = "Android";
        this.b = str2;
        this.c = str;
        this.d = num;
    }
}
