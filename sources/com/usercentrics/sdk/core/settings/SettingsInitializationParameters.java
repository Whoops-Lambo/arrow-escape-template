package com.usercentrics.sdk.core.settings;

import defpackage.ep0;
import defpackage.h50;
import defpackage.n30;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class SettingsInitializationParameters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return SettingsInitializationParameters$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsInitializationParameters)) {
            return false;
        }
        SettingsInitializationParameters settingsInitializationParameters = (SettingsInitializationParameters) obj;
        return s71.b(this.a, settingsInitializationParameters.a) && s71.b(this.b, settingsInitializationParameters.b) && s71.b(this.c, settingsInitializationParameters.c) && s71.b(this.d, settingsInitializationParameters.d) && this.e == settingsInitializationParameters.e;
    }

    public /* synthetic */ SettingsInitializationParameters(int i, String str, String str2, String str3, String str4, boolean z) {
        if (31 != (i & 31)) {
            ep0.J(i, 31, SettingsInitializationParameters$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final int hashCode() {
        int iC = n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("SettingsInitializationParameters(settingsId=", this.a, ", jsonFileVersion=", this.b, ", jsonFileLanguage=");
        q63.y(sbR, this.c, ", controllerId=", this.d, ", languageEtagChanged=");
        return h50.n(sbR, this.e, ")");
    }

    public SettingsInitializationParameters(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }
}
