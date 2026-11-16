package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.internal.measurement.zztr;
import com.google.android.gms.internal.measurement.zzuj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x85 extends zztr {
    public final Uri a;
    public final zzafc b;
    public final os1 c;
    public final d31 d;
    public final zzuj e;
    public final boolean f;

    @Override // com.google.android.gms.internal.measurement.zztr
    public final Uri a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzafc b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final os1 c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final d31 d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzuj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztr)) {
            return false;
        }
        zztr zztrVar = (zztr) obj;
        return this.a.equals(zztrVar.a()) && this.b.equals(zztrVar.b()) && this.c.equals(zztrVar.c()) && this.d.equals(zztrVar.d()) && this.e.equals(zztrVar.e()) && this.f == zztrVar.f();
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return (((true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        int length2 = string2.length();
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String string3 = this.e.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        int length5 = string3.length();
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + length5 + 32 + String.valueOf(z).length() + 22);
        q63.y(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        q63.y(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        sb.append(", variantConfig=");
        sb.append(string3);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", enableTracing=false}");
        return sb.toString();
    }

    public /* synthetic */ x85(Uri uri, zzafc zzafcVar, os1 os1Var, d31 d31Var, zzuj zzujVar, boolean z) {
        this.a = uri;
        this.b = zzafcVar;
        this.c = os1Var;
        this.d = d31Var;
        this.e = zzujVar;
        this.f = z;
    }
}
