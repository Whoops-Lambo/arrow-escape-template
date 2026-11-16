package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgui;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uo4 extends zzgui {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    @Override // com.google.android.gms.internal.ads.zzgui
    public final IBinder a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final float d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgui)) {
            return false;
        }
        zzgui zzguiVar = (zzgui) obj;
        if (!this.a.equals(zzguiVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (zzguiVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzguiVar.b())) {
            return false;
        }
        if (this.c != zzguiVar.c() || Float.floatToIntBits(this.d) != Float.floatToIntBits(zzguiVar.d()) || this.e != zzguiVar.e()) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null) {
            return zzguiVar.f() == null;
        }
        return str2.equals(zzguiVar.f());
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        String str2 = this.f;
        return (((this.e ^ (iHashCode2 * (-429739981))) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        float f = this.d;
        int length4 = String.valueOf(f).length();
        int i2 = this.e;
        int length5 = String.valueOf(i2).length();
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        q63.y(sb, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f);
        rl3.m(i2, ", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=", ", deeplinkUrl=null, adFieldEnifd=", str2, sb);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }

    public /* synthetic */ uo4(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = str2;
    }
}
