package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ϯ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535 extends AbstractC1098 implements InterfaceC0648 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public String f1295;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public String f1296;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f1297;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public Map f1298;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1294 = StringFog.decrypt("76R1HnDqJzH4qlc9d/UiDfI=\n", "nMEBWAWGS2I=\n");

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1293 = StringFog.decrypt("kRlyEUEVUxOTPFEWXhBvGasPQA==\n", "+Go0ZC15AHc=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1292 = StringFog.decrypt("VajvngZLWDk=\n", "Ms2b3WoqK0o=\n");

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1291 = StringFog.decrypt("Avtj\n", "a5UX6P9VyWI=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1290 = StringFog.decrypt("6+VCww==\n", "h4ospGRO86A=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1289 = StringFog.decrypt("VnUMqJKe\n", "Mhp5yv77z4U=\n");

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1288 = StringFog.decrypt("8NHTrU0=\n", "lr28zDkPlfc=\n");

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1287 = StringFog.decrypt("oC7FXA==\n", "wkGqMJd+EWs=\n");

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1286 = StringFog.decrypt("O1/GPA==\n", "WDenTo4MXJI=\n");

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1285 = StringFog.decrypt("L5KV/A==\n", "TevhmSJ56Ng=\n");

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1284 = StringFog.decrypt("+QuJ0A==\n", "j2TgtAWsbHE=\n");

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f1283 = StringFog.decrypt("7wn4oUY=\n", "nGGX0zIFNs8=\n");

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo335();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m517() {
        try {
            if (TextUtils.isEmpty(this.f1295) || this.f1295.equals(StringFog.decrypt("OwZtdGUeug==\n", "fkgsNilb/mY=\n"))) {
                this.f1295 = mo335();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1295;
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract HashMap mo337();

    /* JADX INFO: renamed from: ﾒ */
    public abstract Class mo336(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.ironsource.adqualitysdk.sdk.i.Ϯ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ironsource.adqualitysdk.sdk.i.Ϯ] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Class] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class m518(String str, boolean z) {
        try {
            if (str.contains(StringFog.decrypt("hQ==\n", "qxDUHQ8HFdw=\n"))) {
                String str2 = AbstractC0951.f2572;
                try {
                    this = Class.forName(str);
                    return this;
                } catch (Throwable th) {
                    if (z) {
                        AbstractC0914.m680(AbstractC0951.f2572, StringFog.decrypt("0K1IQeLW\n", "k8EpMpH2C/o=\n") + str + StringFog.decrypt("ckvbtge6fMY8QQ==\n", "UiW0wifcE7M=\n"), th, null);
                    }
                    return null;
                }
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(f1289)) {
                        return Double.TYPE;
                    }
                    break;
                case 104431:
                    if (str.equals(f1291)) {
                        return Integer.TYPE;
                    }
                    break;
                case 3029738:
                    if (str.equals(f1287)) {
                        return Boolean.TYPE;
                    }
                    break;
                case 3039496:
                    if (str.equals(f1285)) {
                        return Byte.TYPE;
                    }
                    break;
                case 3052374:
                    if (str.equals(f1286)) {
                        return Character.TYPE;
                    }
                    break;
                case 3327612:
                    if (str.equals(f1290)) {
                        return Long.TYPE;
                    }
                    break;
                case 3625364:
                    if (str.equals(f1284)) {
                        return Void.TYPE;
                    }
                    break;
                case 97526364:
                    if (str.equals(f1288)) {
                        return Float.TYPE;
                    }
                    break;
                case 109413500:
                    if (str.equals(f1283)) {
                        return Short.TYPE;
                    }
                    break;
            }
            return mo336(str);
        } catch (Throwable th2) {
            if (z) {
                AbstractC0914.m680(this.f1297, AbstractC1156.m868("G0/9Bcf7D2JVRQ==\n", "OyGSceedYBc=\n", AbstractC0688.m577("8Nhvyyv6\n", "s7QOuFjaNoM=\n", new StringBuilder(), str)), th2, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    public boolean mo462() {
        return this instanceof C0426;
    }

    /* JADX INFO: renamed from: ﻐ */
    public boolean mo459() {
        return this instanceof C0460;
    }

    public AbstractC0535(String str) {
        this.f1297 = str;
    }

    /* JADX INFO: renamed from: ﾒ */
    public String mo342() {
        String str = this.f1296;
        return str != null ? str : m517();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0648
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo343(C1199 c1199, String str, ArrayList arrayList, C0752 c0752, C0890 c0890) {
        InterfaceC0536 interfaceC0536 = (InterfaceC0536) this.f1298.get(str);
        try {
            if (interfaceC0536 != null) {
                return interfaceC0536.mo334(arrayList, c0752);
            }
            new C4607c0(c1199, c0890, this.f1297, str).m614(this.f1297);
            return null;
        } catch (Exception e) {
            String str2 = this.f1297;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("ti0wywfgYA6aMyeEELhyBYYrK8oS4A==\n", "819CpHXAF2Y=\n"));
            sb.append(this.f1297);
            AbstractC0914.m680(str2, AbstractC1156.m868("Lw==\n", "CB0LBFtML5w=\n", AbstractC0688.m577("Zxc=\n", "RzCEM5NkOGU=\n", sb, str)), e, null);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m519(InterfaceC0672 interfaceC0672, C0752 c0752, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC0672);
            C1199.m874(c0752.f1993, str, true, false, arrayList);
            C1199 c1199 = c0752.f1993;
            C0790 c0790 = new C0790(c0752, str, false, arrayList);
            c1199.getClass();
            try {
                AbstractC4631n.m405(c0790);
            } catch (Throwable unused) {
            }
            C1199 c11910 = c0752.f1993;
            C0790 c0791 = new C0790(c0752, str, true, arrayList);
            c11910.getClass();
            try {
                AbstractC4631n.m403(new C0628(c0791));
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            AbstractC0914.m680(this.f1297, StringFog.decrypt("l25QlMKkzXjy\n", "0hwi+7CEpBY=\n") + this, th, null);
        }
    }
}
